package com.assignment4;

/**
 * @author Sam Lawson
 * 2/22/19
 * Dr. Yu
 * COMP 2150 Assignment 4
 */
public class Movie {
    private String name;
    private String oneLiner;
    private String starringActor;

    /**
     * Movie
     * @param name the movie's name
     * @param oneLiner a one-liner from the movie
     * @param starringActor the starring actor in the movie
     */
    public Movie(String name, String oneLiner, String starringActor){
        this.name = name;
        this.oneLiner = oneLiner;
        this.starringActor = starringActor;
    }

    /**
     * displayMovieInfo displays the given movie's info
     * @param movie the movie
     * @param number the movie's number
     */
    public static void displayMovieInfo(Movie movie, int number){
        System.out.println("Movie #" + number + ": " + movie.name);
        System.out.println("A One-Liner: " + movie.oneLiner);
        System.out.println("Actor: " + movie.starringActor);
        System.out.println();
    }
}
