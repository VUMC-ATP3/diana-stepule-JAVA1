package classHomework;

public class Tristuris {

    int sideOne;
    int sideTwo;
    int sideThree;
    double area;
    double p;

    public Tristuris() {
        System.out.println("Veidojam trīsstūri");
    }

    public Tristuris(int sideOne, int sideTwo, int sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }


    public double foundArea() {
        p = (sideOne + sideTwo + sideThree) / 2;
        area = Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
        return area;
    }


    public boolean vaiIrVienadMalu() {
        if ((sideOne == sideTwo) && (sideOne == sideThree))
            return true;
        else return false;
        }

        public boolean vaiIrVienadSanu () {
            if ((sideOne == sideTwo) || (sideOne == sideThree) || (sideTwo == sideThree))
                return true;
             else return false;

        }

    }

