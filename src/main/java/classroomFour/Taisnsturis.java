package classroomFour;

public class Taisnsturis {
    double malaViens;
    double malaDivi;

//konstruktori
//    Taisnsturis(){
//        System.out.println("Taisu taiststuri");
//    }
//
//    Taisnsturis(double malaViens, double malaDivi){
//        this.malaViens = malaViens;
//        this.malaDivi = malaDivi;
//    }


    public Taisnsturis(double malaViens, double malaDivi) {  //ar labo pogu uz ekrana - generate - constructor
        this.malaViens = malaViens;
        this.malaDivi = malaDivi;
    }

    public double aprekinatLaukumu(){
        return malaViens * malaDivi;
    }

}
