// Generated by data binding compiler. Do not edit!
package com.flashbox.balitrip2019.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.flashbox.balitrip2019.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CustomDialogLayoutBinding extends ViewDataBinding {
  @NonNull
  public final Button addButton;

  @NonNull
  public final Spinner addSpent;

  @NonNull
  public final TextInputLayout amount;

  @NonNull
  public final TextInputEditText amountEt;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final Spinner cashCard;

  @NonNull
  public final TextInputLayout purpose;

  @NonNull
  public final TextInputEditText purposeEt;

  protected CustomDialogLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button addButton, Spinner addSpent, TextInputLayout amount, TextInputEditText amountEt,
      Button cancelButton, Spinner cashCard, TextInputLayout purpose, TextInputEditText purposeEt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addButton = addButton;
    this.addSpent = addSpent;
    this.amount = amount;
    this.amountEt = amountEt;
    this.cancelButton = cancelButton;
    this.cashCard = cashCard;
    this.purpose = purpose;
    this.purposeEt = purposeEt;
  }

  @NonNull
  public static CustomDialogLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.custom_dialog_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CustomDialogLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CustomDialogLayoutBinding>inflateInternal(inflater, R.layout.custom_dialog_layout, root, attachToRoot, component);
  }

  @NonNull
  public static CustomDialogLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.custom_dialog_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CustomDialogLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CustomDialogLayoutBinding>inflateInternal(inflater, R.layout.custom_dialog_layout, null, false, component);
  }

  public static CustomDialogLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static CustomDialogLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (CustomDialogLayoutBinding)bind(component, view, R.layout.custom_dialog_layout);
  }
}
