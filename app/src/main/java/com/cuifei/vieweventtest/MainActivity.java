package com.cuifei.vieweventtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {

  public static final String TAG  = "MainActivity";
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Logger.init(TAG);
  }

  @Override public boolean dispatchTouchEvent(MotionEvent ev) {
    switch (ev.getAction()){
      case MotionEvent.ACTION_DOWN:
        Log.i(TAG,"=====dispatchTouchEvent===ACTION_DOWN===");
        break;
      case MotionEvent.ACTION_MOVE:
        Log.i(TAG,"=====dispatchTouchEvent===ACTION_MOVE===");
        break;
      case MotionEvent.ACTION_UP:
        Log.i(TAG,"=====dispatchTouchEvent===ACTION_UP===");
        break;
    }
    return super.dispatchTouchEvent(ev);
    //return false;
  }

  @Override public boolean onTouchEvent(MotionEvent event) {
    switch (event.getAction()){
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
