package com.udacity.displayjokeonmobile;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity implements DisplayActivityFragment.OnFragmentInteractionListener {
    public static final String JOKE_KEY = "Joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
