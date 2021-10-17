package com.josepfayos.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.core.view.MotionEventCompat;
import androidx.navigation.ui.AppBarConfiguration;

import com.josepfayos.myapplication.databinding.ActivityMainBinding;
public class ej2 extends Activity {
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private static final String TAG = "MyActivity";
    public boolean onTouchEvent(MotionEvent event) {
        int action = MotionEventCompat.getActionMasked(event);
        switch (action) {
            case (MotionEvent.ACTION_DOWN):
                Log.d(TAG, "Action was DOWN");
                return true;
            case (MotionEvent.ACTION_MOVE):
                Log.d(TAG, "Action was MOVE");
                return true;
            case (MotionEvent.ACTION_UP):
                Log.d(TAG, "Action was UP");
                return true;
            case (MotionEvent.ACTION_CANCEL):
                Log.d(TAG, "Action was CANCEL");
                return true;
            case (MotionEvent.ACTION_OUTSIDE):
                Log.d(TAG, "Movement occurred outside bounds " +
                        "of current screen element");
                return true;
            default:
                return super.onTouchEvent(event);
        }
    }
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View myView = findViewById(R.id.button);
        myView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case (MotionEvent.ACTION_DOWN):
                        Log.d(TAG, "Action was DOWN");
                        return true;
                    case (MotionEvent.ACTION_MOVE):
                        Log.d(TAG, "Action was MOVE");
                        return true;
                    case (MotionEvent.ACTION_UP):
                        Log.d(TAG, "Action was UP");
                        return true;
                    case (MotionEvent.ACTION_CANCEL):
                        Log.d(TAG, "Action was CANCEL");
                        return true;
                    case (MotionEvent.ACTION_OUTSIDE):
                        Log.d(TAG, "Movement occurred outside bounds " +
                                "of current screen element");
                        return true;
                    default:
                        return true;
                }
            }
        });
    }
}

