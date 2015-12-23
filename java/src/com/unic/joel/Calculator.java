package com.unic.joel;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Administrator on 23.12.2015.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer zahl = null;
        List<String> gültigeOperationen = Arrays.asList("+", "-", "*", ":");


        while (true) {
            System.out.println("Operationen auswählen oder mit stop beenden. Gültige Operationen sind +, -, * oder :");
            String operation = scanner.next();

            if ("stop".equals(operation.toLowerCase())) {
                System.exit(0);
            }

            if (!gültigeOperationen.contains(operation)) {
                System.out.println("Das ist kein Operator");
                continue;
            }

            if (zahl == null) {
                System.out.println("Erste Zahl:");
                zahl  = scanner.nextInt();
            }
            else {
                System.out.println("Erste Zahl ist " + zahl);
            }


            System.out.println("Zweite Zahl");
            int zahl2 = scanner.nextInt();

            if (operation.equals("-")) {
                zahl = zahl - zahl2;
            } else if (operation.equals("+")) {
                zahl = zahl + zahl2;
            } else if (operation.equals("*")) {
                zahl = zahl * zahl2;
            } else if (operation.equals(":")) {
                if (zahl2 == 0) {
                    System.out.println("Eine Zahl durch 0 geht nicht");
                    zahl = null;
                } else {
                    zahl = zahl / zahl2;
                }

            }

            if (zahl != null)  {
                System.out.println("Letzes Resultat: " + zahl);
            }

        }


    }
}