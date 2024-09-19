// Generated by view binder compiler. Do not edit!
package com.example.residency_management.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.residency_management.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CheckBox checkBox;

  @NonNull
  public final TextInputEditText edemail;

  @NonNull
  public final TextInputEditText editmobile;

  @NonNull
  public final TextInputEditText edpass;

  @NonNull
  public final TextInputEditText edpassword;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final Button registerbtn;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tvlogin;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull CheckBox checkBox,
      @NonNull TextInputEditText edemail, @NonNull TextInputEditText editmobile,
      @NonNull TextInputEditText edpass, @NonNull TextInputEditText edpassword,
      @NonNull ImageView imageView, @NonNull LinearLayout linearLayout,
      @NonNull ConstraintLayout main, @NonNull Button registerbtn, @NonNull TextView textView,
      @NonNull TextView tvlogin) {
    this.rootView = rootView;
    this.checkBox = checkBox;
    this.edemail = edemail;
    this.editmobile = editmobile;
    this.edpass = edpass;
    this.edpassword = edpassword;
    this.imageView = imageView;
    this.linearLayout = linearLayout;
    this.main = main;
    this.registerbtn = registerbtn;
    this.textView = textView;
    this.tvlogin = tvlogin;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkBox;
      CheckBox checkBox = ViewBindings.findChildViewById(rootView, id);
      if (checkBox == null) {
        break missingId;
      }

      id = R.id.edemail;
      TextInputEditText edemail = ViewBindings.findChildViewById(rootView, id);
      if (edemail == null) {
        break missingId;
      }

      id = R.id.editmobile;
      TextInputEditText editmobile = ViewBindings.findChildViewById(rootView, id);
      if (editmobile == null) {
        break missingId;
      }

      id = R.id.edpass;
      TextInputEditText edpass = ViewBindings.findChildViewById(rootView, id);
      if (edpass == null) {
        break missingId;
      }

      id = R.id.edpassword;
      TextInputEditText edpassword = ViewBindings.findChildViewById(rootView, id);
      if (edpassword == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.registerbtn;
      Button registerbtn = ViewBindings.findChildViewById(rootView, id);
      if (registerbtn == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tvlogin;
      TextView tvlogin = ViewBindings.findChildViewById(rootView, id);
      if (tvlogin == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, checkBox, edemail, editmobile,
          edpass, edpassword, imageView, linearLayout, main, registerbtn, textView, tvlogin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
