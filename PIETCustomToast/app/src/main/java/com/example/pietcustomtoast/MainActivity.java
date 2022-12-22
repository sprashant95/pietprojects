package com.example.pietcustomtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.toast_layout));

                TextView name = layout.findViewById(R.id.toast_text);
                ImageView image = layout.findViewById(R.id.toast_image);

                Toast toast = new Toast(MainActivity.this);
                //toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_LONG);

                toast.setView(layout);

                toast.show();

            }
        });
    }
}