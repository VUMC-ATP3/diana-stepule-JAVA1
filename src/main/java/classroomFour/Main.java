package classroomFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       House majaViens = new House();
       majaViens.stavuSkaits = 4;
       majaViens.majasNumurs = 33;
       majaViens.ielasNosaukums = "Brīvības iela";
       majaViens.irLifts = false;
       majaViens.irAutoStavvieta = true;
       majaViens.krasa = "zaļā";
       majaViens.printHouse();

       House majaDivi = new House();
       majaDivi.stavuSkaits = 20;
       majaDivi.majasNumurs = 100;
       majaDivi.ielasNosaukums = "Stirnu iela";
       majaDivi.irLifts = true;
       majaDivi.irAutoStavvieta = true;
       majaDivi.krasa = "baltā";
       majaDivi.printHouse();
       majaDivi.stavuSkaits = 55;
       majaDivi.printHouse();


       Velosipeds zzk = new Velosipeds();
        zzk.bremzuTips = 'D';
        zzk.printetAtrumu();//System.out.println(zzk.atrums);
        System.out.println("Cilvēk uzkāpj uz velosipēda un min pedaļus");
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.printetAtrumu();//System.out.println("Velo ātrums ir " + zzk.atrums);
        System.out.println("Priekšā izlec kaķis, vajag bremzēt");
        zzk.bremzet();
        zzk.bremzet();
        zzk.printetAtrumu();//System.out.println("Velo ātrums ir " + zzk.atrums);
        Velosipeds merida = new Velosipeds();
        merida.bremzuTips = 'V';
        merida.printetAtrumu();//System.out.println("Velo ātrums ir " + merida.atrums);


        Zivs fish = new Zivs();
        fish.name = "rauda";
        fish.color = "sudraba";
        fish.howOld = 2;
        fish.lakeFish = true;
        fish.printFish();



        Rinkis mansRinkis = new Rinkis();
        System.out.println(mansRinkis.PI);
        mansRinkis.radiuss = 5;
        System.out.println(mansRinkis.radiuss);
        System.out.println(mansRinkis.aprekinatLaukumu());

        Rinkis mansRinkis2 = new Rinkis(5);
        System.out.println(mansRinkis2.PI);
        mansRinkis2.radiuss = 50;
        System.out.println(mansRinkis2.radiuss);
        System.out.println(mansRinkis2.aprekinatLaukumu());
        System.out.println(mansRinkis2.aprekinatRinkaLinijasGarumu());

        mansRinkis.printCreatedTime();
        mansRinkis2.printCreatedTime();

        Rinkis mansRinkis3 = new Rinkis(12.3);
        System.out.println(mansRinkis3.laukums);
        System.out.println(mansRinkis3.rinkaLinijasGarums);

        Taisnsturis taisnsturisViens = new Taisnsturis(12.4, 34.32);
        System.out.println("Taisnstura laukums ir " + taisnsturisViens.aprekinatLaukumu());



        Animal dzivnieki = new Animal();
        dzivnieki.izdotSkanu();

        Suns reksis = new Suns();
        reksis.vaiRej = false;
        reksis.name = "Reksis";
        System.out.println(reksis.vaiRej);
        System.out.println(reksis.astesGarums = 10);
        System.out.println(reksis.name);
        reksis.printName();
        reksis.name = "Bingo";
        reksis.printName();
        reksis.izdotSkanu();



        Kakis murka = new Kakis();
        murka.name = "Murka";
        murka.printName();
        murka.izdotSkanu();
    }
}
