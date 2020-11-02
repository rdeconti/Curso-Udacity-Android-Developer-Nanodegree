package com.rosemeire.deconti.quickjokes;

/* ********************************************************************************************** */
/* UDACITY Android Developer NanoDegree Program
/* Created by Rosemeire Deconti on 21/11/2018
/* Based on "Final Project" from Udacity Repository and adjusted to attend Rubric Review
/* https://github.com/udacity/ud867/tree/master/FinalProject
/* ********************************************************************************************** */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/* TODO RUBRIC POINT: Project contains an Android library with an activity that displays */
/* jokes passed to it as intent extras.*/

/* ************************************************************************************************/
/* **** Display jokes to user using GCE
/* ************************************************************************************************/
public class JokeDisplayerActivity extends AppCompatActivity {
    private static final String KEY_JOKE = "***PUT YOUR KEY HERE***";

    public static Intent newIntent(@NonNull Context context, @NonNull String joke) {

        final Intent intent = new Intent(context, JokeDisplayerActivity.class);
        intent.putExtra(KEY_JOKE, joke);
        return intent;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_joke_displayer);

        final TextView textViewJoke = findViewById(R.id.textViewJoke);

        final Bundle extras = Preconditions.checkNotNull(getIntent().getExtras(),
                getString(R.string.message_20));

        final String joke = extras.getString(KEY_JOKE);

        textViewJoke.setText(joke);
    }
}
