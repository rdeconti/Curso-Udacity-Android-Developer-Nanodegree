package com.rosemeire.deconti.quickjokes;

/* ********************************************************************************************** */
/* UDACITY Android Developer NanoDegree Program
/* Created by Rosemeire Deconti on 21/11/2018
/* Based on "Final Project" from Udacity Repository and adjusted to attend Rubric Review
/* https://github.com/udacity/ud867/tree/master/FinalProject
/* ********************************************************************************************** */

import android.support.annotation.Nullable;

/* ************************************************************************************************/
/* **** Verification about joke not null
/* ************************************************************************************************/
public class Preconditions {

    private Preconditions() {
        throw new AssertionError("No instances for you!");
    }

    public static <T> T checkNotNull(T reference) {

        if (reference == null) {
            throw new NullPointerException();
        }

        return reference;
    }

    public static <T> T checkNotNull(T reference, @Nullable Object errorMessage) {

        if (reference == null) {
            throw new NullPointerException(String.valueOf(errorMessage));
        }

        return reference;
    }

}
