package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d("ALC2","onCreate2");
    }

    public void back2(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC2","onStart2");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC2","onResume2");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC2","onPause2");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC2","onStop2");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC2","onDestroy2");
    }

    public void Move3(View view) {
        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);
    }
}