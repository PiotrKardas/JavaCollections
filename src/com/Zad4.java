package com;


import java.util.Scanner;
import java.util.Stack;

public class Zad4 {


    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int n = scanner.nextInt();
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        while (!stack.isEmpty())
        {
            System.out.print(+stack.peek());
            stack.pop();
    }

    }

}
