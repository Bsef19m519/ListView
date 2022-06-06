package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView2, textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        Intent intent=getIntent();
        int index = intent.getIntExtra("position",0);
        String position=String.valueOf(index);
        String value=intent.getStringExtra("value");
        textView2.setText(position);
        textView3.setText(value);
    }
}