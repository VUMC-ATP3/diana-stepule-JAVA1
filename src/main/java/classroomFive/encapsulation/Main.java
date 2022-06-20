package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Wheather wheather = new Wheather();
        wheather.printWheather();
        //wheather.metodeDivi(); - nevar izsaukt, jo privata metode
        wheather.metodeTris();
        wheather.isRaining = true;
        wheather.temperatureAtNight = 13.4;

        Human cilveks = new Human();
        Human cilveks2 = new Human();
        Human cilveks3 = new Human(12, 154.3, "Pēteris");

        System.out.println(cilveks3.toString());
        cilveks3.setAge(-3);
        System.out.println(cilveks3.toString());
        cilveks3.setAge(18);
        System.out.println(cilveks3.toString());

        System.out.println(cilveks3.getAge());

        System.out.println(cilveks3.getName());


        Rinkis rinkis = new Rinkis();
        System.out.println(rinkis);
        rinkis.setRadiuss(6);
        System.out.println(rinkis);

        Rinkis rinkis1 = new Rinkis(34, "Red");
        System.out.println(rinkis1);
        rinkis1.setColor("yellow");
        System.out.println(rinkis1);
        System.out.println(rinkis.calculateAreaOfRinkis());

    }
}
