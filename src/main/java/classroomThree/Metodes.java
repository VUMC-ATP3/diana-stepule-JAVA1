package classroomThree;

import java.util.Scanner;

public class Metodes {

    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);
        // kvadrataLaukums(3);
       int a = kvadrataLaukums(3);
       float c = taisnturaLaukums(3.4F,5.3F);

        System.out.println("Kvadrata Laukums " + a);
        System.out.println("Taisnstura Laukums " + c);

        //3
        printetTekstu(a,c);
        printetTekstu(a,c);

        System.out.println("fdsgdgdf");
    }

    //metode, kas apreekina kvadraa laukumu
    //int -tips ko atgriezh
    //kvadrataLaukums - metodes nosaukums
    //int mala - arguments/parametrs ko pienem
    static int kvadrataLaukums(int mala){
        int laukums = mala * mala;
        return laukums;
    }

    //metode, kas apreekina taisnstuura laukums

    static float taisnturaLaukums (float a, float b) {
        float s = a * b;
        return s;
    }

    //3
    static void printetTekstu(int a, float c){
        System.out.println("Kvadrata Laukums " + a);
        System.out.println("Taisnstura Laukums " + c);
    }

    static String prettyPrint(String a){
            return "aahah" + a + "Ajjdjjd";

        }

}
