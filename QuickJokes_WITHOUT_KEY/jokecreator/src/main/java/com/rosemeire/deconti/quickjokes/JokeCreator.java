package com.rosemeire.deconti.quickjokes;

/* ********************************************************************************************** */
/* UDACITY Android Developer NanoDegree Program
/* Created by Rosemeire Deconti on 21/11/2018
/* Based on "Final Project" from Udacity Repository and adjusted to attend Rubric Review
/* https://github.com/udacity/ud867/tree/master/FinalProject
/* ********************************************************************************************** */

import java.util.concurrent.ThreadLocalRandom;

/* TODO RUBRIC POINT: Project contains a Java library for supplying jokes. */

/* ************************************************************************************************/
/* **** Create joke to be displayed in a random way to user
/* ************************************************************************************************/
public class JokeCreator {
    private static final String[] JOKES = new String[]{
            "QUESTION - What do you get when you throw a lot of books into the ocean? ANSWER: A title wave.",
            "QUESTION - What has four wheels and flies? ANSWER: A trash truck.",
            "QUESTION - Why could not the bicycle stand up? ANSWER: Because it was two tired.",
            "QUESTION - What do you call a boomerang that doesn’t come back? ANSWER: A stick.",
            "QUESTION - Why did the man take his clock to the vet? ANSWER: Because it had ticks.",
            "QUESTION - What did the mouse say to the other mouse when he tried to steal his cheese? ANSWER: That’s nacho cheese.",
            "QUESTION - Which is faster, heat or cold? ANSWER: Heat, because you can catch a cold.",
            "QUESTION - Why did the chicken go to jail? ANSWER: Because he was using fowl language.",
            "QUESTION - What has two legs but can not walk? ANSWER: A pair of pants.",
            "QUESTION - Why was the math book always worried? ANSWER: Because it had so many problems.",
            "QUESTION - Which school supply is king of the classroom? ANSWER: The ruler.",
            "QUESTION - Which vegetable should you never invite on a boat trip? ANSWER: A leek.",
            "QUESTION - How did Benjamin Franklin feel when he discovered electricity? ANSWER: He was shocked.",
            "QUESTION - Why did the horse chew with his mouth open? ANSWER: Because he had bad stable manners.",
            "QUESTION - What is a tornado favorite game to play? ANSWER: Twister.",
            "QUESTION - What do you give a sick lemon? ANSWER: Lemon-aid",
            "QUESTION - Why could not the pirate play cards? ANSWER: Because he was always on the deck.",
            "QUESTION - Where do polar bears vote? ANSWER: At the North Pole.",
            "QUESTION - What is a ghost favorite fruit? ANSWER: Boo-berries.",
            "QUESTION - Why did the robber take a shower? ANSWER: Because he wanted to make a clean getaway.",
            "QUESTION - What did the mayonnaise say when the refrigerator was opened? ANSWER: Close the door! I am dressing!",
            "QUESTION - What do you call a shoe made from a banana? ANSWER: A slipper.",
            "QUESTION - What did the apple tree say to the farmer? ANSWER: Stop picking on me!",
            "QUESTION - Why are there fences around cemeteries? ANSWER: Because people are dying to get in.",
            "QUESTION - Where do cows go on the weekend? ANSWER: To the moo-vies.",
            "QUESTION - Why did the pony get detention? ANSWER: Because he was horsing around.",
            "QUESTION - What lights up a stadium? ANSWER: A soccer match.",
            "QUESTION - What is bigger than an elephant, but does not weigh anything? ANSWER: His shadow.",
            "QUESTION - Why did the teacher have to wear sunglasses? ANSWER: Because her students were so bright.",
            "QUESTION - Which bus crossed the ocean? ANSWER: Columbus.",
            "QUESTION - What do you call a pig that does karate? ANSWER: A pork chop.",
            "QUESTION - Why was six afraid of seven? ANSWER: Because seven eight nine.",
            "QUESTION - What do you call a fish with no eye? ANSWER: A fsh.",
            "QUESTION - What do gymnasts, acrobats, and bananas all have in common? ANSWER: They can all do splits.",
            "QUESTION - What is a frog favorite game? ANSWER: Hopscotch.",
            "QUESTION - What dies but never lives? ANSWER: A battery.",
            "QUESTION - What day of the week does the potato look forward to the least? ANSWER: Fry-day.",
            "QUESTION - What do you call a seagull that flies over the bay? ANSWER: A bagel.",
            "QUESTION - What is Dracula favorite fruit? ANSWER: Neck-tarines.",
            "QUESTION - What does a skeleton order for dinner? ANSWER: Spare ribs.",
            "QUESTION - What is a ghost favorite dessert? ANSWER: Ice Scream.",
            "QUESTION - How do monsters tell their fortunes? ANSWER: They read their horror-scopes.",
            "QUESTION - Where does the witch park her vehicle? ANSWER: In the broom closet.",
            "QUESTION - What is a witch favorite subject in school? ANSWER: Spelling.",
            "QUESTION - Why could not the ghost see his parents? ANSWER: Because they were trans-parents.",
            "QUESTION - What do you do if you are a fan of Dracula? ANSWER: You join his fang club.",
            "QUESTION - Where do ghosts go for a swim? ANSWER: The Dead Sea.",
            "QUESTION - Whom did the monster ask to kiss his boo-boos after he fell? ANSWER: His mummy.",
            "QUESTION - What makes a skeleton laugh? ANSWER: When something tickles his funny bone.",
};

    public String createJoke() {

        final int randomNum = ThreadLocalRandom.current().nextInt(0, JOKES.length);
        return JOKES[randomNum];

    }
}
