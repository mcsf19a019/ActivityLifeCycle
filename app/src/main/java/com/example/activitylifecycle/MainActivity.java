package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textViewCounter);
        Log.d("ALC","onCreate");
        if(savedInstanceState != null)
        {
            count  = savedInstanceState.getInt("value");
            textView.setText(String.valueOf(count));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value",count);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC","onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC","onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC","onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC","onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC","onDestroy");
    }

    public void Inc(View view) {
       // count = Integer.parseInt(textView.getText().toString());
        count++;
        textView.setText(String.valueOf(count));
    }

    public void GotoAct2(View view) {
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }

    public void GotoAct3(View view) {
        Intent intent =  new Intent(this,Activity3.class);
        startActivity(intent);
    }
}