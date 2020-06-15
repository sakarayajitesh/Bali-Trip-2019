package com.flashbox.balitrip2019;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.flashbox.balitrip2019.databinding.ActivityItemLayoutBindingImpl;
import com.flashbox.balitrip2019.databinding.ActivityMainBindingImpl;
import com.flashbox.balitrip2019.databinding.ChecklistFragmentBindingImpl;
import com.flashbox.balitrip2019.databinding.ChecklistItemLayoutBindingImpl;
import com.flashbox.balitrip2019.databinding.CustomActionBarBindingImpl;
import com.flashbox.balitrip2019.databinding.CustomDialogLayoutBindingImpl;
import com.flashbox.balitrip2019.databinding.DashItemLayoutBindingImpl;
import com.flashbox.balitrip2019.databinding.DashboardFragmentBindingImpl;
import com.flashbox.balitrip2019.databinding.FlightItemLayoutBindingImpl;
import com.flashbox.balitrip2019.databinding.FragmentDetailBindingImpl;
import com.flashbox.balitrip2019.databinding.FragmentHomeBindingImpl;
import com.flashbox.balitrip2019.databinding.HomeItemLayoutBindingImpl;
import com.flashbox.balitrip2019.databinding.HotelItemLayoutBindingImpl;
import com.flashbox.balitrip2019.databinding.LayoverItemLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYITEMLAYOUT = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_CHECKLISTFRAGMENT = 3;

  private static final int LAYOUT_CHECKLISTITEMLAYOUT = 4;

  private static final int LAYOUT_CUSTOMACTIONBAR = 5;

  private static final int LAYOUT_CUSTOMDIALOGLAYOUT = 6;

  private static final int LAYOUT_DASHITEMLAYOUT = 7;

  private static final int LAYOUT_DASHBOARDFRAGMENT = 8;

  private static final int LAYOUT_FLIGHTITEMLAYOUT = 9;

  private static final int LAYOUT_FRAGMENTDETAIL = 10;

  private static final int LAYOUT_FRAGMENTHOME = 11;

  private static final int LAYOUT_HOMEITEMLAYOUT = 12;

  private static final int LAYOUT_HOTELITEMLAYOUT = 13;

  private static final int LAYOUT_LAYOVERITEMLAYOUT = 14;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(14);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.activity_item_layout, LAYOUT_ACTIVITYITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.checklist_fragment, LAYOUT_CHECKLISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.checklist_item_layout, LAYOUT_CHECKLISTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.custom_action_bar, LAYOUT_CUSTOMACTIONBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.custom_dialog_layout, LAYOUT_CUSTOMDIALOGLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.dash_item_layout, LAYOUT_DASHITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.dashboard_fragment, LAYOUT_DASHBOARDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.flight_item_layout, LAYOUT_FLIGHTITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.home_item_layout, LAYOUT_HOMEITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.hotel_item_layout, LAYOUT_HOTELITEMLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.flashbox.balitrip2019.R.layout.layover_item_layout, LAYOUT_LAYOVERITEMLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYITEMLAYOUT: {
          if ("layout/activity_item_layout_0".equals(tag)) {
            return new ActivityItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CHECKLISTFRAGMENT: {
          if ("layout/checklist_fragment_0".equals(tag)) {
            return new ChecklistFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for checklist_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_CHECKLISTITEMLAYOUT: {
          if ("layout/checklist_item_layout_0".equals(tag)) {
            return new ChecklistItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for checklist_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_CUSTOMACTIONBAR: {
          if ("layout/custom_action_bar_0".equals(tag)) {
            return new CustomActionBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for custom_action_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_CUSTOMDIALOGLAYOUT: {
          if ("layout/custom_dialog_layout_0".equals(tag)) {
            return new CustomDialogLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for custom_dialog_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_DASHITEMLAYOUT: {
          if ("layout/dash_item_layout_0".equals(tag)) {
            return new DashItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dash_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_DASHBOARDFRAGMENT: {
          if ("layout/dashboard_fragment_0".equals(tag)) {
            return new DashboardFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dashboard_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_FLIGHTITEMLAYOUT: {
          if ("layout/flight_item_layout_0".equals(tag)) {
            return new FlightItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for flight_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEITEMLAYOUT: {
          if ("layout/home_item_layout_0".equals(tag)) {
            return new HomeItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_HOTELITEMLAYOUT: {
          if ("layout/hotel_item_layout_0".equals(tag)) {
            return new HotelItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for hotel_item_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOVERITEMLAYOUT: {
          if ("layout/layover_item_layout_0".equals(tag)) {
            return new LayoverItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layover_item_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
      sKeys.put(2, "check");
      sKeys.put(3, "dash");
      sKeys.put(4, "flight");
      sKeys.put(5, "home");
      sKeys.put(6, "hotel");
      sKeys.put(7, "layover");
      sKeys.put(8, "title");
      sKeys.put(9, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(14);

    static {
      sKeys.put("layout/activity_item_layout_0", com.flashbox.balitrip2019.R.layout.activity_item_layout);
      sKeys.put("layout/activity_main_0", com.flashbox.balitrip2019.R.layout.activity_main);
      sKeys.put("layout/checklist_fragment_0", com.flashbox.balitrip2019.R.layout.checklist_fragment);
      sKeys.put("layout/checklist_item_layout_0", com.flashbox.balitrip2019.R.layout.checklist_item_layout);
      sKeys.put("layout/custom_action_bar_0", com.flashbox.balitrip2019.R.layout.custom_action_bar);
      sKeys.put("layout/custom_dialog_layout_0", com.flashbox.balitrip2019.R.layout.custom_dialog_layout);
      sKeys.put("layout/dash_item_layout_0", com.flashbox.balitrip2019.R.layout.dash_item_layout);
      sKeys.put("layout/dashboard_fragment_0", com.flashbox.balitrip2019.R.layout.dashboard_fragment);
      sKeys.put("layout/flight_item_layout_0", com.flashbox.balitrip2019.R.layout.flight_item_layout);
      sKeys.put("layout/fragment_detail_0", com.flashbox.balitrip2019.R.layout.fragment_detail);
      sKeys.put("layout/fragment_home_0", com.flashbox.balitrip2019.R.layout.fragment_home);
      sKeys.put("layout/home_item_layout_0", com.flashbox.balitrip2019.R.layout.home_item_layout);
      sKeys.put("layout/hotel_item_layout_0", com.flashbox.balitrip2019.R.layout.hotel_item_layout);
      sKeys.put("layout/layover_item_layout_0", com.flashbox.balitrip2019.R.layout.layover_item_layout);
    }
  }
}
