package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(listView)findViewById(R.id.listview);
        String[] values = new String[]{
        "ICT602",
        "MOBILE",
        "TECH",
        "ANDROID",
        "WELCOME"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1, values );
        listView.setAdapter(adapter);
    }
}