package com.example.a20230303gesturedetector;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private LinearLayout mLinearLayout;
    private GestureDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        mLinearLayout.setOnTouchListener(this);

        mGestureDetector = new GestureDetector(this,new MySimpleOnGestureListener());
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return true;
    }
    class MySimpleOnGestureListener extends GestureDetector.SimpleOnGestureListener{

        //找Override，用搜索功能就可以了。
        public MySimpleOnGestureListener() {
            super();
        }

        @Override
        public boolean onSingleTapUp(@NonNull MotionEvent e) {
            Log.i("SimpleOnGestureListener", "SimpleOnGestureListener -> onSingleTapUp");
            return super.onSingleTapUp(e);
        }

        @Override
        public void onLongPress(@NonNull MotionEvent e) {
            Log.i("SimpleOnGestureListener", "SimpleOnGestureListener -> onLongPress");
            super.onLongPress(e);
        }

        @Override
        public boolean onScroll(@NonNull MotionEvent e1, @NonNull MotionEvent e2, float distanceX, float distanceY) {
            Log.i("SimpleOnGestureListener", "SimpleOnGestureListener -> onScroll");
            return super.onScroll(e1, e2, distanceX, distanceY);
        }

        @Override
        public boolean onFling(@NonNull MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {
            Log.i("SimpleOnGestureListener", "SimpleOnGestureListener -> onFling");
            return super.onFling(e1, e2, velocityX, velocityY);
        }

        @Override
        public void onShowPress(@NonNull MotionEvent e) {
            Log.i("SimpleOnGestureListener", "SimpleOnGestureListener -> onShowPress");
            super.onShowPress(e);
        }

        @Override
        public boolean onDown(@NonNull MotionEvent e) {
            Log.i("SimpleOnGestureListener", "SimpleOnGestureListener -> onDown");
            return super.onDown(e);
        }

        @Override
        public boolean onDoubleTap(@NonNull MotionEvent e) {
            Log.i("SimpleOnGestureListener", "SimpleOnGestureListener -> onDoubleTap");
            return super.onDoubleTap(e);
        }

        @Override
        public boolean onDoubleTapEvent(@NonNull MotionEvent e) {
            Log.i("SimpleOnGestureListener", "SimpleOnGestureListener -> onDoubleTapEvent");
            return super.onDoubleTapEvent(e);
        }

        @Override
        public boolean onSingleTapConfirmed(@NonNull MotionEvent e) {
            Log.i("SimpleOnGestureListener", "SimpleOnGestureListener -> onSingleTapConfirmed");
            return super.onSingleTapConfirmed(e);
        }

        @Override
        public boolean onContextClick(@NonNull MotionEvent e) {
            Log.i("SimpleOnGestureListener", "SimpleOnGestureListener -> onContextClick");
            return super.onContextClick(e);
        }
    }
}