package com.udacity.gradle.builditbigger;

/* ********************************************************************************************** */
/* UDACITY Android Developer NanoDegree Program
/* Created by Rosemeire Deconti on 21/11/2018
/* Based on "Final Project" from Udacity Repository and adjusted to attend Rubric Review
/* https://github.com/udacity/ud867/tree/master/FinalProject
/* ********************************************************************************************** */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.rosemeire.deconti.quickjokes.JokeDisplayerActivity;

/* ************************************************************************************************/
/* **** Display Joke to User
/* ************************************************************************************************/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void tellJoke(View view) {

        final BaseMainActivityFragment fragment = (BaseMainActivityFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment);

        fragment.setJokeButtonLoading(true);

        new JokerAsyncTask(new JokerAsyncTask.Callback() {
            @Override
            public void onResult(String joke) {
                fragment.setJokeButtonLoading(false);
                final Intent displayerIntent = JokeDisplayerActivity.newIntent(MainActivity.this, joke);
                startActivity(displayerIntent);
            }

            @Override
            public void onFailed() {
                fragment.setJokeButtonLoading(false);
                Toast.makeText(MainActivity.this, R.string.message_10, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled() {
                fragment.setJokeButtonLoading(false);
                Toast.makeText(MainActivity.this, R.string.message_11, Toast.LENGTH_LONG).show();
            }
        }).execute();
    }
}
