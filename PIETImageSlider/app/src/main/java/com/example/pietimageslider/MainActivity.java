package com.example.pietimageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    ImageButton next, previous;
    ImageSwitcher imgSw;
    int position = 0;

    int[] images = {R.drawable.first,R.drawable.seconf,
    R.drawable.third,R.drawable.fourth};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);
        imgSw = findViewById(R.id.imgSw);

        imgSw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(images[position]);
                return imageView;
            }
        });

        imgSw.setInAnimation(this, android.R.anim.slide_in_left);
        imgSw.setOutAnimation(this, android.R.anim.slide_out_right);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (position < images.length){
                        position++;
                    }
                    if (position>= images.length){
                        position = images.length-1;
                    }
                    imgSw.setImageResource(images[position]);
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (position>0){
                        position--;
                    }
                    else if (position<0){
                        position = 0;
                    }
                    imgSw.setImageResource(images[position]);
            }
        });
    }
}