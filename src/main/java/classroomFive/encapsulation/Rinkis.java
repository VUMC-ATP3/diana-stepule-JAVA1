package classroomFive.encapsulation;

public class Rinkis {
    private double radiuss;
    private String color;


    Rinkis() {
        this.radiuss = 1.0;
        this.color = "sarakana";
    }

    public Rinkis(double radiuss, String color) {
        this.radiuss = radiuss;
        this.color = color;
    }


    public double getRadiuss() {
        return radiuss;
    }

    public void setRadiuss(double radiuss) {
        this.radiuss = radiuss;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rinkis{" +
                "radiuss=" + radiuss +
                ", color='" + color + '\'' +
                '}';
    }

    double calculateAreaOfRinkis(){
        return Math.pow(radiuss,2) * Math.PI;
    }
}



