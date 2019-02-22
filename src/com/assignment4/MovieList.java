package com.assignment4;
import com.assignment4.Movies.*;

import java.util.Random;


/**
 * @author Sam Lawson
 * 2/22/19
 * Dr. Yu
 * COMP 2150 Assignment 4
 */
public class MovieList {
    public static void main(String[] args){
        //create an array of movies
        Movie[] movies = new Movie[5];
        //add movies to array
        movies[0] = new BourneIdentity();
        movies[1] = new IndependenceDay();
        movies[2] = new Jaws();
        movies[3] = new StarWars();
        movies[4] = new TwelveAngryMen();

        System.out.println("--- run 1");
        printRandom(movies);
        System.out.println("--- run 2");
        printRandom(movies);
    }

    /**
     * Prints the movies in array movies in random order
     * @param movies an array of movies
     */
    private static void printRandom(Movie[] movies){
        //gets length of movies array
        int[] indexes = new int[movies.length];
        int i = 1;
        Random index = new Random();

        while(i <= movies.length){
            int randomIndex = index.nextInt(movies.length) + 1;
            if(isUnique(indexes, randomIndex)){
                Movie randomMovie = movies[randomIndex - 1];
                indexes[i-1] = randomIndex;
                System.out.println("Random number generated: " + (randomIndex - 1));
                Movie.displayMovieInfo(randomMovie, i);
                i++;
            }
        }
    }

    /**
     * Checks to see if an array value is unique in the array
     * @param arr an array of integers
     * @param n element to check if value exists
     * @return true if n does not exist, false otherwise
     */
    private static boolean isUnique(final int[] arr, final int n){
        boolean toReturn = true;

        for(int i : arr){
            if(i==n){
                toReturn = false;
            }
        }
        return toReturn;
    }
}
