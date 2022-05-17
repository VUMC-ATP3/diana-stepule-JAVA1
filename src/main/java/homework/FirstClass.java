package homework;

public class FirstClass {
    public static void main(String[] args) {


        String country = "Spānija";
        double population = 47.35;
        int area = 51;
        String capital = "Madride";
        String nationalLanguage = "Spāņu valoda";
        boolean isEuMember = true;
        char currency = '€';


        System.out.println("Valsts nosaukums: " + country);
        System.out.println("Spānijas iedzīvotāju skaits ir " + population + " miljoni");
        System.out.println("Spānijas platība ir " + area + " kvadrātmetrs");
        System.out.println("Spānijas galvaspilsēta ir " + capital);
        System.out.println("Spānijas oficiāla valoda ir " + nationalLanguage);
        System.out.println("Vai Spānija ir ES dalībvalsts?");
        System.out.println(isEuMember);
        System.out.println("Spānijas valūta ir " + currency);



        int summa1;
        int summa2;
        int summa3;
        int starpiba1;
        int starpiba2;
        int starpiba3;
        int reizinajums1;
        int reizinajums2;
        int reizinajums3;
        double dalijums1;
        double dalijums2;
        double dalijums3;
        int atlikums1;
        int atlikums2;
        int atlikums3;

        int x = 2;
        int y = 7;
        int w = 5;
        double z= 5;
        double q = 8;

        summa1 = x + y;
        summa2 = x + y + w;
        summa3 = y + y + x + w;
        starpiba1 = x - y;
        starpiba2 = y - x;
        starpiba3 = y - w;
        reizinajums1 = x * y;
        reizinajums2 = x * x;
        reizinajums3 = w * w;
        dalijums1 = z / q;
        dalijums2 = q / z;
        dalijums3 = w / z;
        atlikums1 = w%x;
        atlikums2 = 5%5;
        atlikums3 = x%y;


        System.out.println("Summa " + summa1);
        System.out.println(summa1 + summa2);
        System.out.println("Summa kopā: " + (summa1 + summa3));
        System.out.println("Starpība " + starpiba1);
        System.out.println(starpiba1 - starpiba2);
        System.out.println(starpiba2 + starpiba3);
        System.out.println("Reizinājums " + reizinajums1);
        System.out.println("Reizinājums " + (reizinajums2 + reizinajums3));
        System.out.println("Reizinājums " + ((reizinajums1 - reizinajums2) * reizinajums3));
        System.out.println("Dalījums " + dalijums1);
        System.out.println((dalijums1 + dalijums2) / dalijums3);
        System.out.println(dalijums3 + summa1);
        System.out.println("Atikums " + atlikums1);
        System.out.println(atlikums2);
        System.out.println(atlikums3 / starpiba3);
    }
}
