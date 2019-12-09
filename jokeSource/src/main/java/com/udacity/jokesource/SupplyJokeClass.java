package com.udacity.jokesource;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SupplyJokeClass {
    List<String> jokes = Arrays.
            asList("Programming is 10% science, 20% ingenuity, and 70% getting the ingenuity to work with the science.",
                    "There are three kinds of lies: Lies, damned lies, and benchmarks.",
                    "All programmers are playwrights, and all computers are lousy actors.",
                    "The generation of random numbers is too important to be left to chance.",
                    "Debugging: Removing the needles from the haystack.",
                    "There are 10 types of people in the world: those who understand binary, and those who don’t.",
                    "An SQL statement walks into a bar and sees two tables. It approaches, and asks may I join you?",
                    "The programmer got stuck in the shower because the instructions on the shampoo bottle said: Lather, Rinse, Repeat.",
                    "A programmer’s wife tells him, “While you’re at the grocery store, buy some eggs.” He never comes back.",
                    "Why shouldn't you marry a tennis player? Because Love means nothing to them.",
                    "Why are eggs not very much into jokes? Because they could crack up.",
                    "Losing a wife can be very tough. Some may even say impossible.",
                    "Here, I bought you a calendar. Your days are numbered now.",
                    "Talk is cheap, yeah? Have you ever talked to a lawyer?!",
                    "If we shouldn't eat at night, why do they put a light in the fridge?",
                    "I don’t have a girlfriend, but I know a girl that would get really mad if she heard me say that"
            );

    public String getJoke() {
        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size()));
//        return "This is a joke from a Java Library";
    }
}
