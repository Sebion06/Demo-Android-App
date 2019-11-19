package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner mySpinner = findViewById(R.id.spinner);
        ArrayList<String> myDataSource= new ArrayList<String>();
        myDataSource.add("item 1");
        myDataSource.add("item 2");
        myDataSource.add("item 3");
        myDataSource.add("item 4");
        myDataSource.add("item 5");
        ArrayAdapter myAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,myDataSource);
        mySpinner.setAdapter(myAdapter);
    }
}
