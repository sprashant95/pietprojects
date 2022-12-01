package com.example.pietalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
                 AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                 builder.setTitle("DELETE ALERT?")
                         .setMessage("Are you sure you want to delete?")
                         .setPositiveButton("PROCEED", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialogInterface, int i) {
                                 Toast.makeText(getApplicationContext(), "You selected Proceed", Toast.LENGTH_LONG).show();
                             }
                         })
                         .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialogInterface, int i) {
                                 Toast.makeText(getApplicationContext(), "You selected Cancel", Toast.LENGTH_LONG).show();
                             }
                         })
                         .setNeutralButton("ASK ME LATER", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialogInterface, int i) {
                                 Toast.makeText(getApplicationContext(), "You selected Ask me Later", Toast.LENGTH_LONG).show();
                             }
                         });

                 AlertDialog dialog = builder.create();
                 dialog.show();
             }
         });
    }
}