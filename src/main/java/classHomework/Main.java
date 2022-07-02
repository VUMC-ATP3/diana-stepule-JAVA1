package classHomework;

public class Main {
    public static void main(String[] args) {
        Tristuris triangleOne = new Tristuris();
        triangleOne.sideOne = 2;
        triangleOne.sideTwo = 2;
        triangleOne.sideThree = 2;
        System.out.println("Trīsstūra laukums ir: " + triangleOne.foundArea());
        System.out.println("Vai trīsstūris ir vienādmalu? " + triangleOne.vaiIrVienadMalu());
        System.out.println("Vai trīsstūris ir vienādsānu? " + triangleOne.vaiIrVienadSanu());


       Tristuris triangleTwo = new Tristuris(5,7,8);
        System.out.println("Trīsstūra laukums ir: " + triangleTwo.foundArea());
        System.out.println("Vai trīsstūris ir vienādmalu? " + triangleTwo.vaiIrVienadMalu());
        System.out.println("Vai trīsstūris ir vienādsānu? " + triangleTwo.vaiIrVienadSanu());
    }
}
