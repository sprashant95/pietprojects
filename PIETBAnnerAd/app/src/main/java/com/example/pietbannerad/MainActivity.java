package com.example.pietbannerad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity extends AppCompatActivity {

    AdView adView;
    Button btn;
    InterstitialAd minterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });

        adView = findViewById(R.id.adView);
        btn = findViewById(R.id.button);

        //This is BANNER Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        //This is INTERSTITIAL Ad
        setAds();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (minterstitialAd != null){

                    minterstitialAd.show(MainActivity.this);
                    minterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            startActivity(new Intent(MainActivity.this, LoginActivity.class));
                            minterstitialAd = null;
                        }
                    });

                }
                else{
                    startActivity(new Intent(MainActivity.this,LoginActivity.class));
                }
            }
        });
    }

    private void setAds() {
        AdRequest adRequest1 = new AdRequest.Builder().build();
        InterstitialAd.load(MainActivity.this, "ca-app-pub-3940256099942544/1033173712", adRequest1, new InterstitialAdLoadCallback() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                minterstitialAd = null;
            }

            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                minterstitialAd = interstitialAd;

            }
        });
    }
}