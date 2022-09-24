package ru.mirea.lab5;


import java.util.Scanner;

import static java.lang.Math.sqrt;

public class TestIsPrime {
    public static boolean isPrime(int digit, int divider) {
        if (divider < sqrt(digit) + 1) {
            if (digit % divider != 0) {
                return isPrime(digit, ++divider);
            }
            else{
                return false;
            }
        } else {
            return true;
        }
    }

    public static void exec(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int digit = scanner.nextInt();
        System.out.println("Число простое? " + (isPrime(digit, 2) ?  "YES" : "NO"));
        scanner.close();
    }
}
