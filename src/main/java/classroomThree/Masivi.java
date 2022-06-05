package classroomThree;

import java.util.Random;
import java.util.Scanner;

public class Masivi {

    public static void main(String[] args) {

        Random skaitluGenerators = new Random();
        int nejaushSkaitis = skaitluGenerators.nextInt();
        System.out.println(nejaushSkaitis);

        majuParbaude(1, 50, 13);
        majuParbaude(1990, 2000, 1996);


        String pietur = "Centrala stacija";
        //saraksts/arrey/masiivs
        String[] pieturas = {"Centrala stacija", "Marijas iela", "Bernu pasaule", "Ziedonjdarzs"};

        printetTekstaMasivu(pieturas);

        int[] majuNumuri = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //cikls
        //printetIntegerMasivu(majuNumuri);
        int e = 0;
        while (e < majuNumuri.length) {
            System.out.println("Majas numuri: " + majuNumuri[e]);
            e = e + 1;
        }

        char[] patskani = {'a', 'e', 'u', 'i'};

        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
        pieturas[3] = "Zemitanu STACIJA";
        System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);

        System.out.println("Cik pieturas ir masivaa? " + pieturas.length);
        System.out.println("Cik majas ir uz ielas? " + majuNumuri.length);

        //savadak definetie masivi

        String[] hokejaCempioniTopTris = new String[3];
        System.out.println("Cik vietas ir chempionataa? " + hokejaCempioniTopTris.length);
        System.out.println(hokejaCempioniTopTris[0]);
        String pirmaVieta = "Somija";
        String otraVieta = "Kanada";
        String treshaVieta = "Cehija";
        hokejaCempioniTopTris[2] = pirmaVieta;
        hokejaCempioniTopTris[0] = otraVieta;
        hokejaCempioniTopTris[1] = treshaVieta;
        System.out.println(hokejaCempioniTopTris[0] + "\n" + hokejaCempioniTopTris[1] + "\n" + hokejaCempioniTopTris[2]);


        //index = 3 (sakas no 0 un rakstas []) length=4 (skaita no 1)


        //////////////////////////CIKLI////////////////////////////////

        //WHILE cikls


        System.out.println("Cikls sakas");
        int i = 0;
        //while(nosacijums){
        //kods kas izpildas, ja nosacijum ir true)
        while (i < 5) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("Cikls beidzas");


        int sakotnejs = 1;
        while (sakotnejs <= 1000) {
            System.out.println(sakotnejs);
            sakotnejs++; //sakotnejs = sakotnejs + 1;
        }

        //jaizvada visus para skaitljus lidz 1000
        int sakotnejs1 = 0;
        while (sakotnejs1 <= 1000) {
            System.out.println(sakotnejs1);
            sakotnejs1 = sakotnejs1 + 2;
        }


        //DO WHILE cikls

        int y = 0;
        do {
            System.out.println("DO WHILE" + y);
            y = y + 1;
        } while (y < 10);

        ////////////

        Scanner scanner = new Scanner(System.in);
        String parole = "Parole123";
        String lietotajaIevaditaParole;

        do {
            System.out.println("Ievadi paroli");
            lietotajaIevaditaParole = scanner.nextLine();
            System.out.println("Notiek paroles parbaude");
        } while (!lietotajaIevaditaParole.equals(parole));
        System.out.println("Pareiza parole");

        /////////

        //likt cilvekam ievadit pozitivu skaitli, ja ievada 0 vai negativs, likt ievadit atkal. Ja ir pozitivs, beigt darbu
        int number;
        do {
            System.out.println("Ievadi pozitivu skaitli");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Derigs skaitlis" + number);


        //////

        //FOR CIKLS
        for (int j = 0; j < 5; j++) {
            System.out.println("FOR CILKS" + j);
        }

        for (int j = 5; j < 11; j++) {
            System.out.println("FOR CILKS" + j);
        }

        for (int j = 0; j <= 10; j = j + 2) {
            System.out.println(j);
        }

        String[] mansMasivs = {"Juris", "Anna", "Peteris", "Alberts"};
        for (int j = 0; j < mansMasivs.length; j++) {
            System.out.println(mansMasivs[j]);

        }
        System.out.println("Cikla sakums");
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("j=5, lauzham ciku");
                break;
            }
            System.out.println("Print BREAK EXAMPlE: " + j);

        }
        System.out.println("Cikla beigas");

        int[] skaitluMasivs = {3, 4, 6, 7, 2, 1, 5, -4, 2, 6, 4, 3, 3};
        //atrast masiva pirmo negativo skaitli un izvadit to un ta indeksu(poziciju) uz ekrana

        for (int j = 0; j < skaitluMasivs.length; j++) {
            System.out.println("Viss masivs: " + skaitluMasivs[j]);
            if (skaitluMasivs[j] < 0) {
                System.out.println("pirmais negativais skaitlis: " + skaitluMasivs[j]);
                System.out.println("negativa skaitla indeks ir " + j);
                break;

            }

            int[] skaitluMasivs2 = {3, 4, 6, 7, 2, 1, 5, -4, 2, 6, 4, 3, 3};
            for (int v = 0; v < skaitluMasivs2.length; v++) {
                continue;
               // System.out.println("Vertiba no masiva: " + skaitluMasivs2[v]);
            }

        }

        //FOR EACH CIKLS

        String[] mansMasivs1 = {"Juris1", "Anna1", "Peteris1", "Alberts1"};
        for (String randomString : mansMasivs1) {
            System.out.println(randomString);
            System.out.println("Lekcija masivi");
        }
    }
        ////////

    static void printetTekstaMasivu(String[] randomMasivs){
        int skaititajs = 0;
        while (skaititajs < randomMasivs.length) {
            System.out.println(randomMasivs[skaititajs]);
            skaititajs = skaititajs + 1;
    }
    }
    //printetIntegerMasivu(majuNumuri);
    static void printetIntegerMasivu(int[] kautKo) {
        int i = 0;
        while(i<kautKo.length){
            System.out.println(kautKo[i]);
            i++; //i = i + 1;
        }



    }//piemers
   static void majuParbaude(int sakums, int beigas, int iznemums){
        int majuNumuri = sakums;
        while(majuNumuri<=beigas){
            if(majuNumuri%3==0 || majuNumuri%5==0 || majuNumuri ==iznemums) {
                System.out.println("Sie maju numuri neder " + majuNumuri);
            }
            else{
                System.out.println("Sie maju numuri DER " + majuNumuri);
            }
            majuNumuri++;
        }



   }

}
