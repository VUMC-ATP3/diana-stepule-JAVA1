package classroomFour;

public class Zivs {
    String name;
    String color;
    int howOld;
    boolean lakeFish = true;



    public void printFish() {
        System.out.println("Zivs nosaukums ir " + type());
        System.out.println("Zivs ir nodzīvojusi " + howOld + " gadus");
        System.out.println("Vai zivs ir no ezera? " + lakeFish);
    }

    public String type() {
        return color + " " + name;

    }


}
