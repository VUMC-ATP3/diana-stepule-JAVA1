package classroom2;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        System.out.println("Sakas koda izpilde");
        checkPeronAge();
        checkPeronAge();
        checkPeronAge();
        checkPension();
        checkPensionTwo(65, 'S');
        checkPensionTwo(45, 'v');
        int manaKvadrataLaukums = aprekinatKvadrataLaukumu (5);
        System.out.println("Beidzas koda izpilde");

    }

    static void checkPensionTwo(int vecums,char dzimums) {
        boolean drikstDotiesPensija = false;

        if ((vecums >= 65) && (dzimums == 'V')) {
            drikstDotiesPensija = true;
        } else if ((vecums >= 60) && (dzimums == 'S')) {
            drikstDotiesPensija = true;
        }

        if (drikstDotiesPensija) {
            System.out.println(String.format("Dzimums: %s, Vecums: $s, dimums, vecums"));
            System.out.println("Cilveks var iet pensija");
        }
        else {
                System.out.println(String.format("Dzimums: %s, Vecums: $s, dimums, vecums"));
                System.out.println("Cilveks nevar iet pensija");
        }
    }


    static void checkPeronAge() {
        System.out.println("Sakas metodes izpilde");
        System.out.println("Ievadi vecumu...");
        Scanner scanner = new Scanner(System.in);
        int vecumsTris = scanner.nextInt();
        if (vecumsTris >= 18) {
            System.out.println("Cilveks drikst balsot");
        } else {
            System.out.println("Cilveks nedrikst balsot");
        }
        System.out.println("Beidzas metodes izpilde");
    }

        static void checkPension() {

            int age = 65;
            char dzimums = 'M';

            if ((age >= 65) && (dzimums == 'M')) {
                System.out.println("Cilveks var doties pensija");
            } else if ((age >= 60) && (dzimums == 'S')) {
                System.out.println("Cilveks nevar doties pensija");
            }


        }


    static int aprekinatKvadrataLaukumu(int mala) {
        int laukums = mala * mala;
        return laukums;

    }

    }


