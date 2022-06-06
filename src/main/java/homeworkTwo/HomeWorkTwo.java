package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {

        public static void main(String[] args) {

                System.out.println("1. uzdevums");

                int x = 10;
                System.out.println(x > 0);
                System.out.println(x < 0);
                System.out.println(x > 5 && x <= 10);
                System.out.println(!(x <= 5 && x < 10));
                System.out.println(x == 0 && x == 10);
                System.out.println(x * x > 10);

                System.out.println("\n");
                System.out.println("2. uzdevums");

                int diena = 6;
                String monthNumber;

                switch (diena) {
                        case 1:
                                monthNumber = "Janvāris";
                                break;
                        case 2:
                                monthNumber = "Februāris";
                                break;
                        case 3:
                                monthNumber = "Marts";
                                break;
                        case 4:
                                monthNumber = "Aprīlis";
                                break;
                        case 5:
                                monthNumber = "Maijs";
                                break;
                        case 6:
                                monthNumber = "Jūnijs";
                                break;
                        case 7:
                                monthNumber = "Jūlijs";
                                break;
                        case 8:
                                monthNumber = "Augusts";
                                break;
                        case 9:
                                monthNumber = "Sepembris";
                                break;
                        case 10:
                                monthNumber = "Oktobris";
                                break;
                        case 11:
                                monthNumber = "Novembris";
                                break;
                        case 12:
                                monthNumber = "Decembris";
                                break;
                        default:
                                monthNumber = "Nezinamais mēnesis";
                }

                System.out.println(monthNumber);

                System.out.println("\n");
                System.out.println("3. uzdevums");


        Scanner scanner = new Scanner(System.in);
         System.out.println("Ievadiet 1. skaitli");
         int number1 = scanner.nextInt();
         System.out.println("Ievadiet 2. skaitli");
         int number2 = scanner.nextInt();
         System.out.println("Ievadiet 3. skaitli");
         int number3 = scanner.nextInt();

         if ((number1 > number2) && (number1 > number3)) {
               System.out.println("Lielākais skaitlis ir " + number1);
         } else if ((number2 > number1) && (number2 > number3)) {
               System.out.println("Lielākais skaitlis ir " + number2);
         } else if ((number3 > number1) && (number3 > number2)) {
                System.out.println("Lielākais skaitlis ir " + number3);
         }

                System.out.println("\n");
                System.out.println("4. uzdevums");

                String color = "zaļā";
                System.out.println("Tagad pie luksofora deg " + color + " krāsa un tas nozīmē:");
                if (color.equals("sarkanā")) {
                        System.out.println("Nevar iet");
                } else if (color.equals("dzeltenā")) {
                        System.out.println("Jāgaida zaļā krāsa");
                } else if (color.equals("zaļā")) {
                        System.out.println("Var iet");
                }
                System.out.println("\n");
                System.out.println("5. uzdevums");

                printBusinessCard();
                printBusinessCard();
                printBusinessCard();

                System.out.println("\n");
                System.out.println("6. uzdevums");

                printBusinessCardTwo("Diāna", "Stepule", "+371 27465819", "1985");
                printBusinessCardTwo("Arnis", "Zariņš", "+371 28965819", "1984");


                System.out.println("\n");
                System.out.println("7. uzdevums");

                int sum = sumOfTwoNumbers(8, 7);
                System.out.println(sum);


                System.out.println("\n");
                System.out.println("8. uzdevums");

                double numberAverage = average(3.6,5.8,4.4);
                System.out.println(numberAverage);

        }

        public static void printBusinessCard() {
                System.out.println("Vizītkarte");
                System.out.println("******************");
                System.out.println("Vārds: Diāna");
                System.out.println("Uzvārds: Stepule");
                System.out.println("Telefona numurs: +371 27465819");
                System.out.println("Dzimšanas gads: 1985");
                System.out.println("******************");
        }

        public static void printBusinessCardTwo(String name, String surname, String telephone, String birthDate) {
                System.out.println("Vizītkarte");
                System.out.println("******************");
                System.out.println("Vārds: " + name + "\n" + "Uzvārds: " + surname + "\n" +
                        "Telefona numurs: " + telephone + "\n" + "Dzimšanas gads: " + birthDate);
                System.out.println("******************");

        }

        public static int sumOfTwoNumbers(int a, int b) {
                int sum = a + b;
                return sum;
        }

        public static double average(double a, double b, double c) {
                double numberAverage = ((a + b + c) /3);
                return numberAverage;
        }




        }





