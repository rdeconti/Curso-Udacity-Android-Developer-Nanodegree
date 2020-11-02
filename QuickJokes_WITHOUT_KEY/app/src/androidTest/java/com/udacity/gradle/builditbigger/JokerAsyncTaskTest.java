package com.udacity.gradle.builditbigger;

/* ********************************************************************************************** */
/* UDACITY Android Developer NanoDegree Program
/* Created by Rosemeire Deconti on 21/11/2018
/* Based on "Final Project" from Udacity Repository and adjusted to attend Rubric Review
/* https://github.com/udacity/ud867/tree/master/FinalProject
/* ********************************************************************************************** */

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;

/* TODO RUBRIC POINT: Project contains connected tests to verify that the AsyncTask is indeed */
/* loading jokes. */

/* ************************************************************************************************/
/* **** Test async test to get Joke
/* ************************************************************************************************/
public class JokerAsyncTaskTest {

    private JokerAsyncTask jokerAsyncTask;

    @Mock
    private JokerAsyncTask.Callback callback;

    @Before
    public void setUp() {

        MockitoAnnotations.initMocks(this);

        jokerAsyncTask = new JokerAsyncTask(callback);
    }

    @Test
    public void fetchesJokesCorrectly() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);

        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) {
                latch.countDown();
                return null;

            }
        }).when(callback).onResult(anyString());

        jokerAsyncTask.execute();

        latch.await(5, TimeUnit.SECONDS);

        verify(callback).onResult(Mockito.anyString());
    }
}