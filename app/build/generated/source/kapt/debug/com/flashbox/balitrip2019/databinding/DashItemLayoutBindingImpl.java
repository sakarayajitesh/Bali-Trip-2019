package com.flashbox.balitrip2019.databinding;
import com.flashbox.balitrip2019.R;
import com.flashbox.balitrip2019.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DashItemLayoutBindingImpl extends DashItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.paid_with_tv, 4);
        sViewsWithIds.put(R.id.time_stamp, 5);
        sViewsWithIds.put(R.id.view4, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DashItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DashItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[6]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.value.setTag(null);
        this.where.setTag(null);
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
        if (BR.dash == variableId) {
            setDash((com.flashbox.balitrip2019.dashboard.Dash) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDash(@Nullable com.flashbox.balitrip2019.dashboard.Dash Dash) {
        this.mDash = Dash;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dash);
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
        java.lang.String dashWhere = null;
        com.flashbox.balitrip2019.dashboard.Dash dash = mDash;
        java.lang.String dashCashCard = null;
        java.lang.String dashValue = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (dash != null) {
                    // read dash.where
                    dashWhere = dash.getWhere();
                    // read dash.cashCard()
                    dashCashCard = dash.cashCard();
                    // read dash.value
                    dashValue = dash.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dashCashCard);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.value, dashValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.where, dashWhere);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dash
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}