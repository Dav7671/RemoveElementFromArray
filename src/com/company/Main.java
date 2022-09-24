package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(0, 100);
            System.out.print(arr[i] + " ");
        }

        System.out.println("Element = ");
        double element = scanner.nextDouble();
        boolean found = false;

        double[] copyArr = new double[10];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                found = true;
            }
            else{
                copyArr[j] = arr[i];
                j++;
            }
        }

        if (found) {
            System.out.println(" After Removing " + element);
            for (int i = 0; i < copyArr.length; i++) {
                System.out.print(copyArr[i] + " ");
            }
        }
        else{
            System.out.println("Element not found");
        }
    }
}
