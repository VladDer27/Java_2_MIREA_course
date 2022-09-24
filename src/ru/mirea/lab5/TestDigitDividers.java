package ru.mirea.lab5;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TestDigitDividers {
    public static void digitDividers(int digit, int divider){
       if(divider > digit / 2){
           System.out.println(digit);
           return;
       }
       if(digit % divider == 0){
           System.out.println(divider);
           digitDividers(digit / divider, divider);
       }
       else{
           digitDividers(digit, ++divider);
       }
    }
    public static void exec(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int digit = scanner.nextInt();

        digitDividers(digit,2);
        scanner.close();
    }
}
