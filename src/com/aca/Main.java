package com.aca;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//  Method for coffee choice

        System.out.println("What kind of coffee do you want?");
        System.out.println("Size: (ml)  50      100");
        System.out.println("Americano:  1$      2$");
        System.out.println("Latte:      2$      3$");
        System.out.println("Espresso:   3$      5$");
        System.out.println("Capuchino:  4$      8$ \n");

        System.out.print("Coffee Type: ");
        String coffee = scanner.next();
        System.out.print("Size: ");
        String size=scanner.next();
        System.out.print("How Many: ");
        int howMany = scanner.nextInt();
        System.out.print("\n");

        coffeeType(coffee, size, howMany);
    }

    public static void coffeeType(String type, String size, int piece) {
        if (type.equals("Americano") && size.equals("50ml")) {
            System.out.print("Pay: ");
            System.out.println(piece+"$");
        }
        else if(type.equals("Americano") && size.equals("100ml")){
            System.out.print("Pay: ");
            System.out.println(piece*2+"$");
        }
        else if(type.equals("Latte") && size.equals("50ml")){
            System.out.print("Pay: ");
            System.out.println(piece*3+"$");
        }
        else if(type.equals("Latte") && size.equals("100ml")){
            System.out.print("Pay: ");
            System.out.println(piece*6+"$");
        }
        else if(type.equals("Espresso") && size.equals("50ml")){
            System.out.print("Pay: ");
            double piece1=piece;
            System.out.println(piece1*0.5+"$");
        }
        else if(type.equals("Espresso") && size.equals("100ml")){
            System.out.print("Pay: ");
            System.out.println(piece+"$");
        }
        else if(type.equals("Capuchino") && size.equals("50ml")){
            System.out.print("Pay: ");
            System.out.println(piece*4+"$");
        }
        else if(type.equals("Capuchino") && size.equals("100ml")){
            System.out.print("Pay: ");
            System.out.println(piece*8+"$");
        }
        else{
            System.out.println("We do not have");
        }
    }
}
//  Sum(1-n).
//
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum+=i;
//        }
//        System.out.println(sum);
//        }

//   Anagram
//
//        String anagram = scanner.next();
//        String oppositeAnagram = "";
//        boolean a = true;
//        for (int i = anagram.length() - 1; i >= 0; i--){
//            char letter = anagram.charAt(i);
//            oppositeAnagram += letter;
//        }
//        for (int i = 0; i < anagram.length(); i++) {
//            char letterAnagram = anagram.charAt(i);
//            char letterOppositeAnagram = oppositeAnagram.charAt(i);
//            if (letterOppositeAnagram!=letterAnagram){
//                a = false;
//                break;
//            }
//        }
//        System.out.println(a);
//        }


