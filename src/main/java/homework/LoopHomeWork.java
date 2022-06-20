package homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {


        System.out.println("1.uzdevums");
        int summa = 0;
        int ievadCipars;
        Scanner scanner = new Scanner(System.in);
        while (summa <= 100) {
            System.out.println("Ievadiet veselu skaitli");
            ievadCipars = scanner.nextInt();
            summa = summa + ievadCipars;
        }
        System.out.println("Summa ir " + summa);
        System.out.println("Gatavs");

        System.out.println("\n");
        System.out.println("2.uzdevums");

        int num = 7;
        boolean primeNumber = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                primeNumber = true;
                break;
            }


            if (!primeNumber)
                System.out.println(num + " ir pirmskaitlis!");
            else
                System.out.println(num + " is not a prime number.");


            System.out.println("\n");
            System.out.println("3.uzdevums");

            int[] numbers = {3, 6, 7, 9, 24, 89};
            String[] animals = {"kaķis", "suns", "zilonis", "pērtiķis", "stirna", "pele"};
            char[] letter = {'a', 'e', 'k', 'o', 's'};

            System.out.println("\n");
            System.out.println("WHILE ciks");
            int n = 0;
            while (n < numbers.length) {
                System.out.println("Cipars :" + numbers[n]);
                n = n + 1;
            }

            System.out.println("\n");
            int a = 0;
            while (a < animals.length) {
                System.out.println("Dzīvnieks :" + animals[a]);
                a = a + 1;
            }

            System.out.println("\n");
            int l = 0;
            while (l < letter.length) {
                System.out.println("Burts :" + letter[l]);
                l = l + 1;
            }

            System.out.println("\n");
            System.out.println("DO WHILE ciks");

            int nu = 0;
            do {
                System.out.println("Cipars :" + numbers[nu]);
                nu = nu + 1;
            } while (nu < (numbers.length));

            int an = 0;
            do {
                System.out.println("Dzīvnieks :" + animals[an]);
                an = an + 1;
            } while (an < (animals.length));

            int le = 0;
            do {
                System.out.println("Burts :" + letter[le]);
                le = le + 1;
            } while (le < (letter.length));

            System.out.println("\n");
            System.out.println("FOR ciks");

            for (int j = 0; j < numbers.length; j++) {
                System.out.println("Cipars " + numbers[j]);
            }

            for (int j = 0; j < animals.length; j++) {
                System.out.println("Dzīvnieks " + animals[j]);
            }

            for (int j = 0; j < letter.length; j++) {
                System.out.println("Burts " + letter[j]);
            }

            System.out.println("\n");
            System.out.println("FOR EACH ciks");

            for (int number : numbers) {
                System.out.println("Cipars " + number);
            }

            for (String animal : animals) {
                System.out.println("Dzīvnieks " + animal);
            }

            for (char letterName : letter) {
                System.out.println("Burts " + letterName);
            }

            System.out.println("\n");
            System.out.println("4.uzdevums");


            int[] skaitluMasivs = new int[100];
            int paraSkaitlis = 2;
            for (int j = 0; j < skaitluMasivs.length; j = j + 2) {
                skaitluMasivs[j] = paraSkaitlis;
                System.out.println(paraSkaitlis + "");
                paraSkaitlis = paraSkaitlis + 2;
            }


            System.out.println("\n");
            System.out.println("5.uzdevums");

            System.out.println(factorialFromNumber(8));


            System.out.println("\n");
            System.out.println("6.uzdevums");


            final int PIN = 6758;
            int password;
            System.out.println("Ievadi PIN!");
            for (int j = 0; j < 3; j++) {
                password = scanner.nextInt();
                if (password == PIN) {
                    System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                } else if (password != PIN && j<2) {
                    System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
                } else {
                    System.out.println("Atvainojiet, bet jūs esat bloķēt");
                }
            }


        }
    }


    public static int factorialFromNumber(int number) {
        int factorial = 1;
        for (int n = 1; n < number; n++) {
            factorial = factorial * n;
        }
        return factorial;
    }
}



















