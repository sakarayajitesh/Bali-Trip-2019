package com.flashbox.balitrip2019.databinding;
import com.flashbox.balitrip2019.R;
import com.flashbox.balitrip2019.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HotelItemLayoutBindingImpl extends HotelItemLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image, 10);
        sViewsWithIds.put(R.id.linearLayout, 11);
        sViewsWithIds.put(R.id.check_in_tv, 12);
        sViewsWithIds.put(R.id.check_out_tv, 13);
        sViewsWithIds.put(R.id.view, 14);
        sViewsWithIds.put(R.id.host_tv, 15);
        sViewsWithIds.put(R.id.host_phone_tv, 16);
        sViewsWithIds.put(R.id.address_tv, 17);
        sViewsWithIds.put(R.id.guideline, 18);
        sViewsWithIds.put(R.id.guideline1, 19);
        sViewsWithIds.put(R.id.call, 20);
        sViewsWithIds.put(R.id.completed, 21);
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HotelItemLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private HotelItemLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[17]
            , (android.widget.ImageButton) bindings[20]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.Guideline) bindings[18]
            , (androidx.constraintlayout.widget.Guideline) bindings[19]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[14]
            );
        this.cardview.setTag(null);
        this.checkInDate.setTag(null);
        this.checkInTime.setTag(null);
        this.checkOutDate.setTag(null);
        this.checkOutTime.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.name.setTag(null);
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
        if (BR.hotel == variableId) {
            setHotel((com.flashbox.balitrip2019.detail.classes.Hotel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHotel(@Nullable com.flashbox.balitrip2019.detail.classes.Hotel Hotel) {
        this.mHotel = Hotel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.hotel);
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
        java.lang.String hotelHostNumber = null;
        java.lang.String hotelEndDate = null;
        java.lang.String hotelConfirmationCode = null;
        java.lang.String hotelStartDate = null;
        java.lang.String hotelEndTime = null;
        java.lang.String hotelHost = null;
        java.lang.String hotelName = null;
        com.flashbox.balitrip2019.detail.classes.Hotel hotel = mHotel;
        java.lang.String hotelAddress = null;
        java.lang.String hotelStartTime = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (hotel != null) {
                    // read hotel.hostNumber
                    hotelHostNumber = hotel.getHostNumber();
                    // read hotel.end_date
                    hotelEndDate = hotel.getEnd_date();
                    // read hotel.confirmationCode
                    hotelConfirmationCode = hotel.getConfirmationCode();
                    // read hotel.start_date
                    hotelStartDate = hotel.getStart_date();
                    // read hotel.end_time
                    hotelEndTime = hotel.getEnd_time();
                    // read hotel.host
                    hotelHost = hotel.getHost();
                    // read hotel.name
                    hotelName = hotel.getName();
                    // read hotel.address
                    hotelAddress = hotel.getAddress();
                    // read hotel.start_time
                    hotelStartTime = hotel.getStart_time();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checkInDate, hotelStartDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checkInTime, hotelStartTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checkOutDate, hotelEndDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checkOutTime, hotelEndTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, hotelConfirmationCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, hotelHost);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, hotelHostNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, hotelAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, hotelName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): hotel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}