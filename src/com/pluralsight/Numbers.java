package com.pluralsight;

import java.util.ArrayList;
import java.util.Random;

public class Numbers {

    //Create an array to store integers
    private ArrayList<Integer> numbers = new ArrayList<>();

    public void getNumbers() {
        //Initialize a random number generator
        Random r = new Random();

        //Fill the array list with 10 random numbers up to 100 and print them out
        System.out.print("Array: ");
        for (int index = 0; index < 10; index++) {
            int number = r.nextInt(100);
            numbers.add(number);
            System.out.print(number);
            System.out.print("  ");
        }
    }

    public void locateLargest() {
        int tempNum = 0;
        int tempIndex = 0;
        for (int index = 0; index < numbers.size(); index++) {
            if (numbers.get(index) > tempNum) {
                tempNum = numbers.get(index);
                tempIndex = index;
            }
        }
        System.out.println();
        System.out.println("The largest number is " + tempNum + " and it is located in slot " + tempIndex);
    }
}
