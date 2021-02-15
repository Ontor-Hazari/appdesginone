package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView firstdicount,seconddiscount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstdicount = (TextView)findViewById(R.id.firstdicount);
        seconddiscount = (TextView)findViewById(R.id.seconddiscount);

        firstdicount.setPaintFlags(firstdicount.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        seconddiscount.setPaintFlags(seconddiscount.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }
}