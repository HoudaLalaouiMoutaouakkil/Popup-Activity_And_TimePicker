package com.example.popupactivity_and_time_picker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction manager=getSupportFragmentManager().beginTransaction();
        popActivity pop=new popActivity();
        pop.show(manager,null);
    }
    void  SetDate(String data){
        TextView tv=findViewById(R.id.tv);
        tv.setText(data);
    }
}