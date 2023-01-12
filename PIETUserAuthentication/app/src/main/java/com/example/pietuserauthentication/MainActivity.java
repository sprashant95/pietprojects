package com.example.pietuserauthentication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ProgressBar bar;
    TextInputLayout t1, t2;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bar = findViewById(R.id.progressBar);
        t1 = findViewById(R.id.email);
        t2 = findViewById(R.id.pwd);

    }

    public void gotosignin(View view) {
        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
    }

    public void signuphere(View view) {

        String email = t1.getEditText().getText().toString();
        String password = t2.getEditText().getText().toString();

        mAuth = FirebaseAuth.getInstance();

        if (email.isEmpty() == false && password.length()>=8){

                mAuth.createUserWithEmailAndPassword(email,password)
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                         if (task.isSuccessful()){
                                             bar.setVisibility(View.INVISIBLE);
                                             t1.getEditText().setText("");
                                             t2.getEditText().setText("");
                                             Toast.makeText(getApplicationContext(), "User Created", Toast.LENGTH_SHORT).show();
                                         }
                                         else {
                                             bar.setVisibility(View.INVISIBLE);
                                             t1.getEditText().setText("");
                                             t2.getEditText().setText("");
                                             Toast.makeText(getApplicationContext(), "User Not Created", Toast.LENGTH_SHORT).show();
                                         }
                            }
                        });

        }
        else {
            Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_SHORT).show();
        }
    }
}