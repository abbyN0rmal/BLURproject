package com.abby.android.blurproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openAlbumsAndSingles(View view) {
        Intent i = new Intent(this, AlbumsAndSinglesActivity.class);
        startActivity(i);
    }

    public void openBandMembers (View view) {
        Intent i = new Intent (this, BandMembers.class);
        startActivity(i);
    }

    public void openMainActivity (View view) {
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }



}

