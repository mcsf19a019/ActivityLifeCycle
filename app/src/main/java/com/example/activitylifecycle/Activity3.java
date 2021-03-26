package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Log.d("ALC3","onCreate3");
    }

    public void back3(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC3","onStart3");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC3","onResume3");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC3","onPause3");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC3","onStop3");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC3","onDestroy3");
    }

    public void Move2(View view) {
        Intent intent = new Intent(this,Activity2.class);
    }
}