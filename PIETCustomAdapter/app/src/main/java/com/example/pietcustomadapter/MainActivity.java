package com.example.pietcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] pname = {"Nike","Sneakers","Puma","Adidas",
            "Nike","Sneakers","Puma","Adidas",
            "Nike","Sneakers","Puma","Adidas","Nike","Sneakers","Puma","Adidas"};

    String[] pprice = {"7500 INR","4500 INR","3500 INR","7800 INR",
            "7500 INR","4500 INR","3500 INR","7800 INR",
            "7500 INR","4500 INR","3500 INR","7800 INR",
            "7500 INR","4500 INR","3500 INR","7800 INR"};

    Integer[] pimage = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.one,
            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.one,
            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.one,
            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.one,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        MyCustomListAdapter myCustomListAdapter = new MyCustomListAdapter(this,pname,pprice,pimage);
        listView.setAdapter(myCustomListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this,DetailedActivity.class);
                intent.putExtra("image",pimage[i]);
                intent.putExtra("name",pname[i]);
                intent.putExtra("price",pprice[i]);
                startActivity(intent);

            }
        });


    }
}