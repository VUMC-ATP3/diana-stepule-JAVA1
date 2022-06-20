package classroomFive.polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(4,5));
        System.out.println(calc.sum(4.4, 7.8));
        System.out.println(calc.sum(5,6,7));
        System.out.println(calc.sum(4,4,3,2.0));

        Car car = new Car();
        Motocycle motocycle = new Motocycle();
        car.move();
        motocycle.move();
        car.stop();
        motocycle.stop();
    }
}
