package com.example.recyclerviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<DataItems> desclist=new ArrayList<>();
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview_main);
        adapter=new Adapter(desclist);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        Handler handler=new Handler();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                input();
            }
        };
        handler.postDelayed(runnable,6000);


    }

    private void input() {

                adapter.notifyDataSetChanged();

                DataItems dataItems = new DataItems("Users", R.drawable.user);
                DataItems dt1 = new DataItems("Java", R.drawable.java);
                DataItems dt2 = new DataItems("C", R.drawable.c);
                DataItems dt3 = new DataItems("C++", R.drawable.cplus);
                DataItems dt5 = new DataItems("Go", R.drawable.go);
                DataItems dt6 = new DataItems("JavaScript", R.drawable.javascript);
                DataItems dt7 = new DataItems("Julia", R.drawable.julia);
                DataItems dt8 = new DataItems("Dart", R.drawable.dart);
                desclist.add(dt1);
                desclist.add(dt2);
                desclist.add(dt3);
                desclist.add(dt5);
                desclist.add(dt6);
                desclist.add(dt7);
                desclist.add(dt8);
                desclist.add(dataItems);




    }

}