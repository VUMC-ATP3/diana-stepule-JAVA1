package classroom;

public class Main {

    public static void main(String[] args) {
        //lai palaistu JAVA programmu, klasē ir jāuzraksta main metode(psvm)
        //(mainīgā tips) (mainīgā nosaukums) = (vērtība);

        int dogAge = 3;    //Vesels skaitlis
        String dogName = "Reksis"; //Teksts
        String dogNameTwo = "Lesija"; //Teksts
        double dogWight = 15.8; //Daļskaitlis
        float dogHeight = 60.2F;
        boolean isHangry=false; //tikai true or false (true = 1 ; false = 0)
        boolean isBreedDog = false;
        char dzimums = 'V'; //viens simbols tikai
        char dzimumsDivi = 'S';

        boolean isStringsTheSame = dogName.equals(dogNameTwo);
        System.out.println("Vai abi vārdi ir vienādi?"+ " " +isStringsTheSame);

        System.out.println("Mans suns");
        System.out.println("Vecums");
        System.out.println(dogAge);
        System.out.println("Vārds");
        System.out.println(dogName);
        System.out.println("Suņa svars");
        System.out.println(dogWight+ " " + "kg");
        System.out.println(); //tukša rinda
        System.out.println("Suņa augstums");
        System.out.println(dogHeight+" cm");
        System.out.println("Vai mans suns ir izsacis?");
        System.out.println(isHangry);
        System.out.println("Vai mans suns ir šķirnes suns?");
        System.out.println(isBreedDog);


        int vecumsKakene = 1;
        String vardsKakene = "Mila";

        System.out.println("Mana kaķene");
        System.out.println("Vecums nav pilnais");
        System.out.println(vecumsKakene);
        System.out.println("Vārds");
        System.out.println(vardsKakene);



        System.out.println("Kaķa un suņa kopējais vecums");
        System.out.println(dogAge + vecumsKakene);
        System.out.println(dogName+" "+vardsKakene);

        System.out.println("");

        byte vecums = 28;   //strada lidz 127, aizņem mazāk atmiņas
        byte monthInYear = 12;
        short autoPrice = 6000;
        long netIncome = 2847447477478L;

        System.out.println(monthInYear+ "\n" +autoPrice+ "\n" +netIncome);

        int summa; //mainigais bez vertibas
        int starpiba;
        int reizinajums;
        double dalijums;
        int atlikums;
        int x = 5;
        int y = 10;
        double z= 5;
        double q = 10;
        double w = 12;

        summa = x + y; //mainiga vertiba
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = z / q;
        atlikums = 12%5;


        System.out.println("Summa " + summa);
        System.out.println("Starpiba " + starpiba);
        System.out.println("Reizinjums " + reizinajums);
        System.out.println("Dalijums " + dalijums);
        System.out.println(12%5);
        System.out.println("Atlikums " + atlikums);

        int skaitlis = 6;
        System.out.println("Ja atbilde ir 0, šis ir pāra skaitlis " + skaitlis%2);
    }







    public void izprintetSavuVardu() {


    }
}
