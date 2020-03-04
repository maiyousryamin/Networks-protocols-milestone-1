package com.example.theapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    String items[] = new String[] {"Android","Iphone","Windows","Blackberry","Linux"};
    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView= (ListView) findViewById(R.id.listView);
        ArrayAdapter arrayAdapter;
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Intent intent;
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(ListViewActivity.this, DeviceDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
    /*public void openDeviceActivity(){
        Intent intent;
        intent = new Intent(this, DeviceDetailsActivity.class);
        startActivity(intent);
    }
*/
}