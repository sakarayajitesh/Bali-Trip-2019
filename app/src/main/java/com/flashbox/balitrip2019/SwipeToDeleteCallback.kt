package com.flashbox.balitrip2019

import android.content.Context
import android.graphics.*
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView

abstract class SwipeToDeleteCallback(context: Context) :
    ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {

    private val deleteIcon = ContextCompat.getDrawable(context, R.drawable.ic_check_black_24dp)
    private val intrinsicWidthDelete = (deleteIcon?.intrinsicWidth)?.div(3)
    private val intrinsicHeightDelete = (deleteIcon?.intrinsicHeight)?.div(3)

    private val likeIcon = ContextCompat.getDrawable(context, R.drawable.ic_restore_black_24dp)
    private val intrinsicWidthLike = (likeIcon?.intrinsicWidth)?.div(3)
    private val intrinsicHeightLike = (likeIcon?.intrinsicHeight)?.div(3)


    private val clearPaint = Paint().apply { xfermode = PorterDuffXfermode(PorterDuff.Mode.CLEAR) }


    override fun getMovementFlags(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder): Int {
        /**
         * To disable "swipe" for specific item return 0 here.
         * For example:
         * if (viewHolder?.itemViewType == YourAdapter.SOME_TYPE) return 0
         * if (viewHolder?.adapterPosition == 0) return 0
         */
        if (viewHolder.adapterPosition == 10) return 0
        return super.getMovementFlags(recyclerView, viewHolder)
    }


    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        return false
    }

    override fun onChildDraw(
        c: Canvas,
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        dX: Float,
        dY: Float,
        actionState: Int,
        isCurrentlyActive: Boolean
    ) {
//        onClickListener.onClick(true)
        val itemView = viewHolder.itemView
        val itemHeight = itemView.bottom - itemView.top
        val isCanceled = dX == 0f && !isCurrentlyActive


        if (isCanceled) {
            if (dX < 0) {

                clearCanvas(
                    c,
                    itemView.right + dX,
                    itemView.top.toFloat(),
                    itemView.right.toFloat(),
                    itemView.bottom.toFloat()
                )
            }
            else
                clearCanvas(
                    c,
                    itemView.left.toFloat(),
                    itemView.top.toFloat(),
                    itemView.left  + dX ,
                    itemView.bottom.toFloat()
                )
            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
            return
        }

        if (dX < 0) {
            // Calculate position of delete icon
            val deleteIconTop = itemView.top + (itemHeight - intrinsicHeightDelete!!) / 2
            val deleteIconMargin = (itemHeight - intrinsicHeightDelete) / 2
            val deleteIconLeft = itemView.right - deleteIconMargin - intrinsicWidthDelete!!
            val deleteIconRight = itemView.right - deleteIconMargin
            val deleteIconBottom = deleteIconTop + intrinsicHeightDelete

            // Draw the delete icon
            deleteIcon?.setBounds(deleteIconLeft, deleteIconTop, deleteIconRight, deleteIconBottom)
            deleteIcon?.draw(c)
        } else {

            // Calculate position of delete icon
            val deleteIconTop = itemView.top + (itemHeight - intrinsicHeightLike!!) / 2
            val deleteIconMargin = (itemHeight - intrinsicHeightLike) / 2
            val deleteIconRight = itemView.left + deleteIconMargin + intrinsicWidthLike!!
            val deleteIconLeft = itemView.left + deleteIconMargin
            val deleteIconBottom = deleteIconTop + intrinsicHeightLike


            // Draw the delete icon
            likeIcon?.setBounds(deleteIconLeft, deleteIconTop, deleteIconRight, deleteIconBottom)
            likeIcon?.draw(c)

        }

        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
    }

    private fun clearCanvas(c: Canvas?, left: Float, top: Float, right: Float, bottom: Float) {
//        onClickListener.onClick(false)
        c?.drawRect(left, top, right, bottom, clearPaint)
    }
}