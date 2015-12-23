package com.unic.joel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Erste Zahl:");
        int zahl = scanner.nextInt();

        if (zahl < 100) {
            System.out.println("Zahl ist kleiner als 100");
        } else if (zahl > 100) {
            System.out.println("Zahl ist grösser als 100");
        } else {
            System.out.println("Zahl ist genau 100");
        }

    }
}
