package com.example.recyclerviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        title=findViewById(R.id.tv_title);
      Intent intent= getIntent();
      String t= intent.getStringExtra("titile");
      title.setText(t);


    }
}