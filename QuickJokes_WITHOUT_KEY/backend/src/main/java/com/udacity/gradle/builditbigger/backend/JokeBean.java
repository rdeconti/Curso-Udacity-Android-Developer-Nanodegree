package com.udacity.gradle.builditbigger.backend;

/* ********************************************************************************************** */
/* UDACITY Android Developer NanoDegree Program
/* Created by Rosemeire Deconti on 21/11/2018
/* Based on "Final Project" from Udacity Repository and adjusted to attend Rubric Review
/* https://github.com/udacity/ud867/tree/master/FinalProject
/* ********************************************************************************************** */

/* ************************************************************************************************/
/* **** Transfer Joke
/* ************************************************************************************************/
public class JokeBean {

    private String joke;

    public JokeBean(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }
}
