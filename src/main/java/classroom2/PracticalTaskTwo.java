package classroom2;


import java.util.Scanner;

public class PracticalTaskTwo {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi savu vārdu!");
//        String name = scanner.nextLine();
        //       System.out.println("Ievadi savu vecumu!");
//        int age = scanner.nextInt();
        //       System.out.println("Esi sveicināts: " + name + "!");
//        System.out.println(String.format("Esi sveicināts: %s !",name));
//        System.out.println("Jūsu vecums ir: " + age);

        //       System.out.println("Ievadi 1. ciparu");
        //       int number1 = scanner.nextInt();
        //       System.out.println("Ievadi 2. ciparu!");
        //      int number2 = scanner.nextInt();
        //      int summa = number1 + number2;
        //      System.out.println("Summa= " + (number1 + number2));

        //System.out.println("Summa= " + (number1 + number2));

        int a = 5;
        int b = 10;
        int c = 5;
        int d = 11;
        //Leilāks >
        System.out.println(b > a); //true
        System.out.println(a > b); //false
        //Mazāks <
        System.out.println(a < b); //true
        System.out.println(b < a); //false
        //Vienāds ==
        System.out.println(a == c); //true
        System.out.println(a == b); //false
        System.out.println(b == c); //false
        //Nav vienāds !=
        System.out.println(a != b); //true
        System.out.println(a != c); //false
        //Mazāks vienāds <=
        System.out.println(a <= c); //true
        //Lielāks vienāds >=
        System.out.println(d >= b); //true


        int vecums = 18;
        boolean vaiDrikstBalsot = (vecums >= 18);
        System.out.println("Vai cilvēks drīkst balsot? " + vaiDrikstBalsot);

        String name = "Jūris";
        String secondName = "Jānis";

        boolean vaiVardsSakrit = (name.equals(secondName));
        System.out.println("Vai vārdi sakrīt? " + vaiVardsSakrit);

        System.out.println(true == false);

        int e = 4;

        // $$ - operator UN
        boolean vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        // || - operators UN

        vaiIrPatiess = ((e < 5) || (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = ((e < 5));
        System.out.println(vaiIrPatiess);
        //! - vai nepatiesiba/nepatiess?
        vaiIrPatiess = (!(e < 5));
        System.out.println(vaiIrPatiess);
        System.out.println(!(true == false));

        // SAMPLE

        int vecumsDivi = 17;
        if (vecumsDivi >= 18) {
            System.out.println("Cilveks drikst balsot");
        }

        System.out.println("Koda turpinajums");


        System.out.println("Ievadi savu vecumu..");
        int vecumsTris = scanner.nextInt();
        if (vecumsTris >= 18) {
            System.out.println("Cilveks drikst balsot");
        }
        System.out.println("Koda turpinajums");

        if (100 > 50) {
            System.out.println("100>50");
        }

        if (vecumsDivi >= 18) {
            System.out.println("Cilveks drikst balsot");
        } else {
            System.out.println("Cilveks nedrikst balsot");
        }


        System.out.println("Ievadi skaitli...");
        int skaitlisViens = scanner.nextInt();
        if (skaitlisViens == 10) {
            System.out.println("Printejam skaitlis 10");
        } else if (skaitlisViens == 15) {
            System.out.println("Printejam skaitlis 15");
        } else if (skaitlisViens == 20) {
            System.out.println("Printejam skaitlis 20");
        } else {
            System.out.println("Skaitlis ir nezinams");
        }

        System.out.println("Koda turpinajums");


        //Janodefine cilveks

        String nameOfMan = "Arnis";
        int age = 65;
        char dzimums = 'M';

        if ((age >= 65) && (dzimums == 'M')) {
            System.out.println("Cilveks var doties pensija");
        } else if ((age >= 60) && (dzimums == 'S')) {
            System.out.println("Cilveks nevar doties pensija");
        }


        int cilvekaVecums = 67;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;

        if ((cilvekaVecums >= 65) && (cilvekaDzimums == 'V')) {
            drikstDotiesPensija = true;
        } else if ((cilvekaVecums >= 60) && (cilvekaDzimums == 'S')) {
            drikstDotiesPensija = true;
        }

        if (drikstDotiesPensija) {
            System.out.println("Cilveks tiesham var iet pensija");
        }


        int diena = 1;
        String dienasVards;

        switch (diena) {
            case 1:
                dienasVards = "Pirmdiena";
                break;
            case 2:
                dienasVards = "Otrdiena";
                break;
            case 3:
                dienasVards = "Tresdiena";
                break;
            case 4:
                dienasVards = "Ceturtdiena";
                break;
            case 5:
                dienasVards = "Piektdiena";
                break;
            case 6:
                dienasVards = "Sestdiena";
                break;
            case 7:
                dienasVards = "Svetdiena";
            default:
                dienasVards = "Nezinama diena";
        }

        System.out.println(dienasVards);


        System.out.println("Ievadi veselu skaitli..");
        int veselsSkaitlis = scanner.nextInt();

        if (veselsSkaitlis>0) {
            System.out.println("cipars lielaks par 0");
        }

        else if (veselsSkaitlis<0) {
            System.out.println("cipars mazaks par 0");
        }
        else{
            System.out.println("Skaitis ir nulle");
        }


        int skaitlis = 4;
         if(skaitlis%2==0){
             System.out.println("Skaitlis ir para skaitlis");
         }
         else{
             System.out.println("Skaitlis ir nepara skaitlis");
         }

    }
}
