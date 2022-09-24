package ru.mirea.lab5;

import java.util.Scanner;

public class TestSumOfDigits {

    public static int sumOfDigits(int digit){
        if(digit < 9){
            return digit;
        }
        return digit%10 + sumOfDigits(digit/10);
    }

    public static void exec(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int digit = scanner.nextInt();
        System.out.println("Сумма цифр данного числа: " + sumOfDigits(digit));
        scanner.close();
    }
}
