package com.cuifei.vieweventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.orhanobut.logger.Logger;

/**
 * Created by cuifei on 2016/2/19.
 */
public class CustomLinearLayout extends LinearLayout {

  public static final String TAG = "CustomLinearLayout";
  public CustomLinearLayout(Context context) {
    super(context);
  }

  public CustomLinearLayout(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override public boolean dispatchTouchEvent(MotionEvent ev) {
    switch (ev.getAction()){
      case MotionEvent.ACTION_DOWN:
        Log.i(TAG, "=====dispatchTouchEvent===ACTION_DOWN===");
        break;
      case MotionEvent.ACTION_MOVE:
        Log.i(TAG,"=====dispatchTouchEvent===ACTION_MOVE===");
        break;
      case MotionEvent.ACTION_UP:
        Log.i(TAG,"=====dispatchTouchEvent===ACTION_UP===");
        break;
    }
    return super.dispatchTouchEvent(ev);
  }

  @Override public boolean onInterceptTouchEvent(MotionEvent ev) {
    switch (ev.getAction()){
      case MotionEvent.ACTION_DOWN:
        Log.i(TAG,"=====onInterceptTouchEvent===ACTION_DOWN===");
        break;
      case MotionEvent.ACTION_MOVE:
        Log.i(TAG,"=====onInterceptTouchEvent===ACTION_MOVE===");
        break;
      case MotionEvent.ACTION_UP:
        Log.i(TAG,"=====onInterceptTouchEvent===ACTION_UP===");
        break;
    }
    return super.onInterceptTouchEvent(ev);
  }

  @Override public boolean onTouchEvent(MotionEvent event) {
    switch (event.getAction()) {
      case MotionEvent.ACTION_DOWN:
        Log.i(TAG,"=====onTouchEvent===ACTION_DOWN===");
        break;
      case MotionEvent.ACTION_MOVE:
        Log.i(TAG,"=====onTouchEvent===ACTION_MOVE===");
        break;
      case MotionEvent.ACTION_UP:
        Log.i(TAG,"=====onTouchEvent===ACTION_UP===");
        break;
    }
    return super.onTouchEvent(event);
  }
}
