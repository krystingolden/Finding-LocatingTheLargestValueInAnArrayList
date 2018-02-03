package com.pluralsight;

public class Main {

    /*
    https://programmingbydoing.com/
    Finding-Locating the largest value in an array list - Assignment #185/186
     */

    public static void main(String[] args) {

        //Create a new instance of numbers
        Numbers numbers = new Numbers();

        //Fill an array list with random numbers
        numbers.getNumbers();

        //Locate the largest number in the array list and display it
        numbers.locateLargest();

    }
}
