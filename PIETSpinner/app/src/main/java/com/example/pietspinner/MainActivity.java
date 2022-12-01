package com.example.pietspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String[] city = {"Ahmedabad","Vadodara","Rajkot","Jamnagar","Bhavnagar","Gandhinagar",
            "Ahmedabad","Vadodara","Rajkot","Jamnagar","Bhavnagar","Gandhinagar",
            "Ahmedabad","Vadodara","Rajkot","Jamnagar","Bhavnagar","Gandhinagar",
            "Ahmedabad","Vadodara","Rajkot","Jamnagar","Bhavnagar","Gandhinagar",
            "Ahmedabad","Vadodara","Rajkot","Jamnagar","Bhavnagar","Gandhinagar"};
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,city);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

    }
}