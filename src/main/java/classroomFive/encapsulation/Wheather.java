package classroomFive.encapsulation;

 public class Wheather {

     boolean isRaining; //defaut  - varam pieklut klase un pakotnes limenii
     public boolean isSunShining; // - varam pieklut visur
     private boolean isSnowing; // - varam pieklut tikai klases ietvaros
     private double temperature;
     public double temperatureAtNight;

     public void printWheather() {
         System.out.println("Šī ir publiska metode");
         System.out.println("Ārā līst lietus visu dienu");
         metodeDivi();
     }

     private void metodeDivi(){
         System.out.println("Šī ir privata metode");
     }

     void metodeTris(){
         System.out.println("Šī ir default metode");
     }
}
