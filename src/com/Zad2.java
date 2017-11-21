package com;

import java.util.*;


public class Zad2 {



    public static void main(String[] args) {

        System.out.println("Podaj liczbe elementow: ");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println("Podaj elementy: ");

        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for(int i = 0; i<n ; i++ )
        {
            int a = scanner.nextInt();
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else
                map.put(a,1);

    }
    for(Map.Entry<Integer, Integer> pair : map.entrySet())
    {
        if(pair.getValue()!=1)
            System.out.println(pair.getKey()+ " wystepuje "+ pair.getValue()+" razy.");
        else
            System.out.println(pair.getKey()+ " wystepuje "+ pair.getValue()+" raz.");
    }




}
}
