package com.flashbox.balitrip2019.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\r\u001a\u00020\u0012H\u0002J\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\n0&j\b\u0012\u0004\u0012\u00020\n`\'H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/flashbox/balitrip2019/detail/DetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "home", "Lcom/flashbox/balitrip2019/home/Home;", "(Landroid/app/Application;Lcom/flashbox/balitrip2019/home/Home;)V", "_data", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/flashbox/balitrip2019/detail/classes/BaseItem;", "data", "Landroidx/lifecycle/LiveData;", "getData", "()Landroidx/lifecycle/LiveData;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "addCompleted", "", "document", "", "value", "", "onSwiped", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "direction", "", "parse", "result", "Lcom/google/firebase/firestore/QuerySnapshot;", "parseActivity", "parseData", "str", "parseFlights", "parseHotels", "sortList", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_release"})
public final class DetailViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.flashbox.balitrip2019.detail.classes.BaseItem>> _data = null;
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final com.flashbox.balitrip2019.home.Home home = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.flashbox.balitrip2019.detail.classes.BaseItem>> getData() {
        return null;
    }
    
    private final void getData() {
    }
    
    private final void parseData(java.lang.String str, com.google.firebase.firestore.QuerySnapshot result) {
    }
    
    private final void parse(com.google.firebase.firestore.QuerySnapshot result) {
    }
    
    private final void addCompleted(java.lang.String document, boolean value) {
    }
    
    private final void parseActivity(com.google.firebase.firestore.QuerySnapshot result) {
    }
    
    private final java.util.List<com.flashbox.balitrip2019.detail.classes.BaseItem> sortList(java.util.ArrayList<com.flashbox.balitrip2019.detail.classes.BaseItem> list) {
        return null;
    }
    
    private final void parseHotels(com.google.firebase.firestore.QuerySnapshot result) {
    }
    
    private final void parseFlights(com.google.firebase.firestore.QuerySnapshot result) {
    }
    
    public final void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.flashbox.balitrip2019.home.Home home) {
        super(null);
    }
}