package com.example.pietbannerad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.interstitial.InterstitialAd;

public class LoginActivity extends AppCompatActivity {

    InterstitialAd minterstitalAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}