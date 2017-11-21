package com;


import java.util.Collections;
import java.util.*;
import java.util.Random;


public class Zad1 {

    public static void main(String[] args) {
        Random random = new Random();

        int number = 0;
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        while (numbers.size() != 6) {
            number = random.nextInt(49);
                if(number == 0 )
                    continue;

            numbers.add(number);

        }

System.out.println("Wyniki lotto: ");
    for( int numberOfLottery : numbers)
        System.out.print(numberOfLottery+", ");


    }
}
