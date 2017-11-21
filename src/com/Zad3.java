package com;

import java.util.Scanner;
import java.util.*;


public class Zad3 {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("mama", "mother");
        dictionary.put("tata", "father");
        dictionary.put("dom", "house");
        dictionary.put("zona", "wife");


        System.out.println("Podaj slowo po polsku: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (dictionary.containsKey(word))
            System.out.println("Slowo po angielsku to : "+dictionary.get(word));

        else
            System.out.println("Wyraz nie wystepuje w slowniku.");
    }
}

