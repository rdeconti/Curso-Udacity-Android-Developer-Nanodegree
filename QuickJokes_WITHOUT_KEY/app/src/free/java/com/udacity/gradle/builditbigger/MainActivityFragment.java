package com.udacity.gradle.builditbigger;

/* ********************************************************************************************** */
/* UDACITY Android Developer NanoDegree Program
/* Created by Rosemeire Deconti on 21/11/2018
/* Based on "Final Project" from Udacity Repository and adjusted to attend Rubric Review
/* https://github.com/udacity/ud867/tree/master/FinalProject
/* ********************************************************************************************** */

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/* TODO RUBRIC POINT: Project contains paid/free flavors. The paid flavor has no ads and no */
/* unnecessary dependencies. */

/* ************************************************************************************************/
/* **** Treat main activity with fragment activity
/* ************************************************************************************************/
public class MainActivityFragment extends BaseMainActivityFragment {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        configureAd(view);

    }

    /* TODO RUBRIC POINT: Ads are required in the free version. */

    private void configureAd(View root) {

        AdView adView = root.findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        adView.loadAd(adRequest);
    }
}
