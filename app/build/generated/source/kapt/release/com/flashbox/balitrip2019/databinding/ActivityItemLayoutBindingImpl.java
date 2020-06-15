package com.flashbox.balitrip2019.databinding;
import com.flashbox.balitrip2019.R;
import com.flashbox.balitrip2019.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityItemLayoutBindingImpl extends ActivityItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_card, 8);
        sViewsWithIds.put(R.id.image, 9);
        sViewsWithIds.put(R.id.entry_fee_tv, 10);
        sViewsWithIds.put(R.id.dress_code_tv, 11);
        sViewsWithIds.put(R.id.timings_tv, 12);
        sViewsWithIds.put(R.id.guideline2, 13);
        sViewsWithIds.put(R.id.completed, 14);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[13]
            , (android.widget.ImageView) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[1]
            );
        this.cardview.setTag(null);
        this.dD.setTag(null);
        this.dressCode.setTag(null);
        this.endTime.setTag(null);
        this.entryFee.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.startTime.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.activity == variableId) {
            setActivity((com.flashbox.balitrip2019.detail.classes.Activity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setActivity(@Nullable com.flashbox.balitrip2019.detail.classes.Activity Activity) {
        this.mActivity = Activity;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.activity);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String activityStartTime = null;
        java.lang.String activityName = null;
        java.lang.String activityDressCode = null;
        java.lang.String activityEndTime = null;
        java.lang.String activityDD = null;
        java.lang.String activityEntryFee = null;
        com.flashbox.balitrip2019.detail.classes.Activity activity = mActivity;
        java.lang.String activityTimings = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (activity != null) {
                    // read activity.startTime
                    activityStartTime = activity.getStartTime();
                    // read activity.name
                    activityName = activity.getName();
                    // read activity.dressCode
                    activityDressCode = activity.getDressCode();
                    // read activity.endTime
                    activityEndTime = activity.getEndTime();
                    // read activity.dD
                    activityDD = activity.getDD();
                    // read activity.entryFee
                    activityEntryFee = activity.getEntryFee();
                    // read activity.timings
                    activityTimings = activity.getTimings();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dD, activityDD);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dressCode, activityDressCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.endTime, activityEndTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entryFee, activityEntryFee);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, activityTimings);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.startTime, activityStartTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, activityName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): activity
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}