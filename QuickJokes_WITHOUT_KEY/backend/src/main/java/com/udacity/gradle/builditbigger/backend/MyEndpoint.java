package com.udacity.gradle.builditbigger.backend;

/* ********************************************************************************************** */
/* UDACITY Android Developer NanoDegree Program
/* Created by Rosemeire Deconti on 21/11/2018
/* Based on "Final Project" from Udacity Repository and adjusted to attend Rubric Review
/* https://github.com/udacity/ud867/tree/master/FinalProject
/* ********************************************************************************************** */

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.rosemeire.deconti.quickjokes.JokeCreator;

/* ************************************************************************************************/
/* **** TODO MISSING DESCRIPTION
/* ************************************************************************************************/
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com"
        )
)

/* TODO RUBRIC POINT: App retrieves jokes from Google Cloud Endpoints module and displays them via
/* an Activity from the Android Library. Note that the GCE module need only be deployed locally. */

public class MyEndpoint {

    @ApiMethod(name = "getJoke")
    public JokeBean getJoke() {
        final String joke = new JokeCreator().createJoke();
        return new JokeBean(joke);
    }

}
