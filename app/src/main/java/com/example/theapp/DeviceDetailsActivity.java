package com.example.theapp;

import android.os.Bundle;

import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DeviceDetailsActivity extends AppCompatActivity{

    private EditText sentence;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_details);
        sentence = (EditText) findViewById(R.id.edtText);

    }
}

