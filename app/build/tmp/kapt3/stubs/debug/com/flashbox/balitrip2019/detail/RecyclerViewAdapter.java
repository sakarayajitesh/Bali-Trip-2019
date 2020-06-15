package com.flashbox.balitrip2019.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/flashbox/balitrip2019/detail/RecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "list", "", "Lcom/flashbox/balitrip2019/detail/classes/BaseItem;", "(Ljava/util/List;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ActivityViewHolder", "Companion", "FlightViewHolder", "HotelViewHolder", "LayoverViewHolder", "app_debug"})
public final class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.List<com.flashbox.balitrip2019.detail.classes.BaseItem> list = null;
    public static final int Flight = 0;
    public static final int Layover = 1;
    public static final int Hotel = 2;
    public static final int Activity = 3;
    public static final com.flashbox.balitrip2019.detail.RecyclerViewAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public RecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.flashbox.balitrip2019.detail.classes.BaseItem> list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/flashbox/balitrip2019/detail/RecyclerViewAdapter$FlightViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/flashbox/balitrip2019/databinding/FlightItemLayoutBinding;", "(Lcom/flashbox/balitrip2019/databinding/FlightItemLayoutBinding;)V", "bind", "", "flight", "Lcom/flashbox/balitrip2019/detail/classes/Flight;", "app_debug"})
    public static final class FlightViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.flashbox.balitrip2019.databinding.FlightItemLayoutBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.flashbox.balitrip2019.detail.classes.Flight flight) {
        }
        
        public FlightViewHolder(@org.jetbrains.annotations.NotNull()
        com.flashbox.balitrip2019.databinding.FlightItemLayoutBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/flashbox/balitrip2019/detail/RecyclerViewAdapter$LayoverViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/flashbox/balitrip2019/databinding/LayoverItemLayoutBinding;", "(Lcom/flashbox/balitrip2019/databinding/LayoverItemLayoutBinding;)V", "bind", "", "flight", "Lcom/flashbox/balitrip2019/detail/classes/Layover;", "app_debug"})
    public static final class LayoverViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.flashbox.balitrip2019.databinding.LayoverItemLayoutBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.flashbox.balitrip2019.detail.classes.Layover flight) {
        }
        
        public LayoverViewHolder(@org.jetbrains.annotations.NotNull()
        com.flashbox.balitrip2019.databinding.LayoverItemLayoutBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/flashbox/balitrip2019/detail/RecyclerViewAdapter$HotelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/flashbox/balitrip2019/databinding/HotelItemLayoutBinding;", "(Lcom/flashbox/balitrip2019/databinding/HotelItemLayoutBinding;)V", "bind", "", "flight", "Lcom/flashbox/balitrip2019/detail/classes/Hotel;", "app_debug"})
    public static final class HotelViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.flashbox.balitrip2019.databinding.HotelItemLayoutBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.flashbox.balitrip2019.detail.classes.Hotel flight) {
        }
        
        public HotelViewHolder(@org.jetbrains.annotations.NotNull()
        com.flashbox.balitrip2019.databinding.HotelItemLayoutBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/flashbox/balitrip2019/detail/RecyclerViewAdapter$ActivityViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/flashbox/balitrip2019/databinding/ActivityItemLayoutBinding;", "(Lcom/flashbox/balitrip2019/databinding/ActivityItemLayoutBinding;)V", "bind", "", "flight", "Lcom/flashbox/balitrip2019/detail/classes/Activity;", "app_debug"})
    public static final class ActivityViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.flashbox.balitrip2019.databinding.ActivityItemLayoutBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.flashbox.balitrip2019.detail.classes.Activity flight) {
        }
        
        public ActivityViewHolder(@org.jetbrains.annotations.NotNull()
        com.flashbox.balitrip2019.databinding.ActivityItemLayoutBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/flashbox/balitrip2019/detail/RecyclerViewAdapter$Companion;", "", "()V", "Activity", "", "Flight", "Hotel", "Layover", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}