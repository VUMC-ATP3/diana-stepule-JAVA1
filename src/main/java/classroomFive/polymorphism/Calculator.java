package classroomFive.polymorphism;

public class Calculator {
    public int sum(int a, int b) {
        System.out.println("saskaitam veselus skaitlus");
        return a + b;
    }

    public double sum(double a, double b) {
        System.out.println("saskaitam dalskaitlus");
        return a + b;
    }

    public int sum(int a, int b, int c) {
        System.out.println("saskaitam tris skaitlus");
        return a + b + c;
    }
    public double sum (int i, int i1, int i2, double i3) {
        return i + i1 + i2 + i3;
    }
}
