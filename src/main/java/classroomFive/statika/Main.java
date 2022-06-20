package classroomFive.statika;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cik auto objekti uztaisiti " + Auto.totalCarsCreated);
        Auto masina = new Auto("BMV");
        Auto masinaDivi = new Auto("Mercedes");
        System.out.println("Cik auto objekti uztaisiti " + Auto.totalCarsCreated);
        Auto masina3 = new Auto("Opel");
        Auto masina4 = new Auto("Fiat");
        System.out.println("Cik auto objekti uztaisiti " + Auto.totalCarsCreated);

        Auto.printText();
        Auto.increaseTotalCarCreates();
        System.out.println(Auto.increaseTotalCarCreates());

    }
}
