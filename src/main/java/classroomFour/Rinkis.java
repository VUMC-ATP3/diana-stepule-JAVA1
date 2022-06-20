package classroomFour;

import java.sql.Timestamp;

public class Rinkis {
    final double PI = 3.14;
    double radiuss;
    double laukums;
    double rinkaLinijasGarums;
    Timestamp timestamp;

    //Konstruktors
    Rinkis(){
        System.out.println("Mēs veidojam Rinki..");
        Long datetime = System.currentTimeMillis();
        timestamp = new Timestamp(datetime);

    }

    Rinkis(double padotaisRadiuss){
        radiuss = padotaisRadiuss;
        laukums = aprekinatLaukumu();
        rinkaLinijasGarums = aprekinatRinkaLinijasGarumu();
    }


    public void printCreatedTime(){
        System.out.println(timestamp);
    }

    public double aprekinatLaukumu(){
        System.out.println("Aprekinu rinka laukumu");
        return Math.pow(radiuss, 2) * PI; // radiuss, 2 - kadā pakāpē vajag//return (radiuss * radiuss) * PI; // Math.PI - PI cipars
    }

    public double aprekinatRinkaLinijasGarumu(){
        System.out.println("Aprekinu rinka linijs garumu");
        return 2 * Math.PI * radiuss;
    }

}
