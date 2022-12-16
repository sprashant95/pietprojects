package com.example.pietgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {

    GridView gridView;

    Integer[] image = {R.drawable.download, R.drawable.download, R.drawable.download,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid);

        myAdapter myAdapter = new myAdapter(this,image);
        gridView.setAdapter(myAdapter);

    }
}