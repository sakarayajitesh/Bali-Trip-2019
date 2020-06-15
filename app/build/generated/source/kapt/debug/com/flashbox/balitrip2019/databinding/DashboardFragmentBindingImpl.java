package com.flashbox.balitrip2019.databinding;
import com.flashbox.balitrip2019.R;
import com.flashbox.balitrip2019.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DashboardFragmentBindingImpl extends DashboardFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.dashboard, 4);
        sViewsWithIds.put(R.id.spent_tv, 5);
        sViewsWithIds.put(R.id.view2, 6);
        sViewsWithIds.put(R.id.view3, 7);
        sViewsWithIds.put(R.id.remaining_tv, 8);
        sViewsWithIds.put(R.id.total_tv, 9);
        sViewsWithIds.put(R.id.recycler_view, 10);
        sViewsWithIds.put(R.id.fab, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DashboardFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private DashboardFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[7]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.remaining.setTag(null);
        this.spent.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.flashbox.balitrip2019.dashboard.DashboardViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.flashbox.balitrip2019.dashboard.DashboardViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDashboard((androidx.lifecycle.LiveData<com.flashbox.balitrip2019.dashboard.Dashboard>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDashboard(androidx.lifecycle.LiveData<com.flashbox.balitrip2019.dashboard.Dashboard> ViewModelDashboard, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String viewModelDashboardTotal = null;
        com.flashbox.balitrip2019.dashboard.Dashboard viewModelDashboardGetValue = null;
        java.lang.String viewModelDashboardRemaining = null;
        androidx.lifecycle.LiveData<com.flashbox.balitrip2019.dashboard.Dashboard> viewModelDashboard = null;
        java.lang.String viewModelDashboardSpent = null;
        com.flashbox.balitrip2019.dashboard.DashboardViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.dashboard
                    viewModelDashboard = viewModel.getDashboard();
                }
                updateLiveDataRegistration(0, viewModelDashboard);


                if (viewModelDashboard != null) {
                    // read viewModel.dashboard.getValue()
                    viewModelDashboardGetValue = viewModelDashboard.getValue();
                }


                if (viewModelDashboardGetValue != null) {
                    // read viewModel.dashboard.getValue().total
                    viewModelDashboardTotal = viewModelDashboardGetValue.getTotal();
                    // read viewModel.dashboard.getValue().remaining
                    viewModelDashboardRemaining = viewModelDashboardGetValue.getRemaining();
                    // read viewModel.dashboard.getValue().spent
                    viewModelDashboardSpent = viewModelDashboardGetValue.getSpent();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.remaining, viewModelDashboardRemaining);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.spent, viewModelDashboardSpent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, viewModelDashboardTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.dashboard
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}