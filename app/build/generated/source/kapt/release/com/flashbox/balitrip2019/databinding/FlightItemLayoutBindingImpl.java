package com.flashbox.balitrip2019.databinding;
import com.flashbox.balitrip2019.R;
import com.flashbox.balitrip2019.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FlightItemLayoutBindingImpl extends FlightItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 11);
        sViewsWithIds.put(R.id.booking_tv, 12);
        sViewsWithIds.put(R.id.completed, 13);
        sViewsWithIds.put(R.id.completed_tv, 14);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FlightItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FlightItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[11]
            );
        this.booking.setTag(null);
        this.cardview.setTag(null);
        this.end.setTag(null);
        this.endDate.setTag(null);
        this.endName.setTag(null);
        this.endTime.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.start.setTag(null);
        this.startDate.setTag(null);
        this.startName.setTag(null);
        this.startTime.setTag(null);
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
        if (BR.flight == variableId) {
            setFlight((com.flashbox.balitrip2019.detail.classes.Flight) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFlight(@Nullable com.flashbox.balitrip2019.detail.classes.Flight Flight) {
        this.mFlight = Flight;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.flight);
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
        java.lang.String flightEndDate = null;
        java.lang.String flightEndName = null;
        java.lang.String flightStartTime = null;
        java.lang.String flightBookingNumber = null;
        java.lang.String flightStart = null;
        java.lang.String flightStartDate = null;
        java.lang.String flightEnd = null;
        java.lang.String flightNumber = null;
        com.flashbox.balitrip2019.detail.classes.Flight flight = mFlight;
        java.lang.String flightStartName = null;
        java.lang.String flightEndTime = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (flight != null) {
                    // read flight.endDate
                    flightEndDate = flight.getEndDate();
                    // read flight.endName
                    flightEndName = flight.getEndName();
                    // read flight.startTime
                    flightStartTime = flight.getStartTime();
                    // read flight.bookingNumber
                    flightBookingNumber = flight.getBookingNumber();
                    // read flight.start
                    flightStart = flight.getStart();
                    // read flight.startDate
                    flightStartDate = flight.getStartDate();
                    // read flight.end
                    flightEnd = flight.getEnd();
                    // read flight.number
                    flightNumber = flight.getNumber();
                    // read flight.startName
                    flightStartName = flight.getStartName();
                    // read flight.endTime
                    flightEndTime = flight.getEndTime();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.booking, flightBookingNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.end, flightEnd);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.endDate, flightEndDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.endName, flightEndName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.endTime, flightEndTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, flightNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.start, flightStart);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.startDate, flightStartDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.startName, flightStartName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.startTime, flightStartTime);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): flight
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}