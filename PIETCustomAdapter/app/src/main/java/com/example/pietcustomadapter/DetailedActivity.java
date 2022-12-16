package com.example.pietcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    ImageView dimage;
    TextView dname, dprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        dimage = findViewById(R.id.dimage);
        dname = findViewById(R.id.dname);
        dprice = findViewById(R.id.dprice);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");
        Integer image = intent.getIntExtra("image",R.drawable.one);

        dname.setText(name);
        dprice.setText(price);
        dimage.setImageResource(image);
    }
}