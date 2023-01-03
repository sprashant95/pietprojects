package com.example.pietsinglefbdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText name,drid,years,education;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        drid = findViewById(R.id.drid);
        years = findViewById(R.id.years);
        education = findViewById(R.id.education);

        btn = findViewById(R.id.signin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = name.getText().toString();
                String pid = drid.getText().toString();
                String pyears = years.getText().toString();
                String peducation = education.getText().toString();

                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference node = db.getReference("/doctors");


                DBHolder dbHolder = new DBHolder(pname,pyears,peducation);

                node.child(pid).setValue(dbHolder);
                
                name.setText("");
                drid.setText("");
                years.setText("");
                education.setText("");
                Toast.makeText(getApplicationContext(), "Data Inserted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}