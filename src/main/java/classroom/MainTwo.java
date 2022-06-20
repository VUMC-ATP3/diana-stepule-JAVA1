package classroom;

public class MainTwo {
    public static void main(String[] args) {
        String vards = "Diana";
        String uzvards = "Stepule";
        int vecums = 36;
        boolean isPresent = true;

        System.out.println("Vards: " + vards + "\n" + "Uzvārds: " + uzvards + "\n"
        + "Vecums: " + vecums + "\n" + "Vai bija nodarbībā? " + isPresent);

       // String teikums = String.format("Vārds: %s", vards);

        String teikums = String.format("Vārds: %s \n Uzvārds: %s \n Vecums: %s \n isPresent: %s",vards,uzvards, vecums, isPresent);
        System.out.println(teikums);

        System.out.println((2*(2+2))/2);


        double lowestTemperature = -20.4;
        float highestTemperature = 40.65512312F;
        System.out.println("Augstaka temp ir " + highestTemperature + "zemaka temp ir " + lowestTemperature);
        String teikums1 = String.format("Augstākā temperatūra ir %.2f Zemākā temperatūra ir %s",highestTemperature,lowestTemperature);
        System.out.println(teikums1);

        String teikums2 = String.format("Augstākā temperatūra ir %.2f Zemākā temperatūra ir %2Ss. Zemāka temp %2$s. Augstaka Temo %1$.4f",highestTemperature,lowestTemperature);
        System.out.println(teikums2);

    }
}
