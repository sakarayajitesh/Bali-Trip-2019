package com.flashbox.balitrip2019.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\b\u0010\u000b\u001a\u00020\u0016H\u0002J\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\fH\u0002J \u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001aH\u0002J\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\bH\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\u0016\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/flashbox/balitrip2019/dashboard/DashboardViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_dash", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/flashbox/balitrip2019/dashboard/Dash;", "_dashboard", "Lcom/flashbox/balitrip2019/dashboard/Dashboard;", "addDashListener", "", "dash", "Landroidx/lifecycle/LiveData;", "getDash", "()Landroidx/lifecycle/LiveData;", "dashboard", "getDashboard", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "addDash", "", "context", "Landroid/content/Context;", "purpose", "", "value", "addSpent", "cashCard", "addDashboard", "spent", "changeDashboard", "remaining", "total", "clearList", "doAfterDelete", "getData", "onSwiped", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "direction", "", "app_release"})
public final class DashboardViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.google.firebase.firestore.FirebaseFirestore firebaseFirestore = null;
    private boolean addDashListener = false;
    private final androidx.lifecycle.MutableLiveData<com.flashbox.balitrip2019.dashboard.Dashboard> _dashboard = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.flashbox.balitrip2019.dashboard.Dash>> _dash = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.flashbox.balitrip2019.dashboard.Dashboard> getDashboard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.flashbox.balitrip2019.dashboard.Dash>> getDash() {
        return null;
    }
    
    private final void getData() {
    }
    
    private final void addDashListener() {
    }
    
    private final void addDashboard(java.lang.String value, boolean spent) {
    }
    
    public final void addDash(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String purpose, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    java.lang.String addSpent, @org.jetbrains.annotations.NotNull()
    java.lang.String cashCard) {
    }
    
    public final void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    private final void changeDashboard(java.lang.String spent, java.lang.String remaining, java.lang.String total) {
    }
    
    private final void doAfterDelete(com.flashbox.balitrip2019.dashboard.Dash dash) {
    }
    
    public final void clearList() {
    }
    
    public DashboardViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}