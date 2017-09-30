
/**
 * Created by muridjonrahimov on 9/28/17.
 */
package Test;

import java.util.Random;
import java.util.Scanner;

//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("what is your name?");
//
//            String scanner1 = scanner.nextLine();
//            System.out.println("what is your second name");
//            String scanner2 = scanner.nextLine();
//            System.out.println("witch day have you born?");
//            int scanner3 = scanner.nextInt();
//            System.out.println("hove old are you?");
//            int scanner4 = scanner.nextInt();
//
//        }

public class TestS {



    public static void main(String[] args) {
        scannerIceCream();
    }

    public static void scannerIceCream() {

        int countToppings = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to our ice cream service! What's your name?");
        String name = s.next();

        Scanner scannerFlavour = new Scanner(System.in);
        System.out.println("Okay " + name + ", which flavor of ice cream would you like?");
        String orderedFlavour = scannerFlavour.next();

        Scanner scannerTopping1 = new Scanner(System.in);
        System.out.println("Would you like chocolate chips?");
        String answer1 = scannerTopping1.next();
        if (answer1.equals("yes")) {
            countToppings++;
        }

        Scanner scannerTopping2 = new Scanner(System.in);
        System.out.println("Would you like bananas?");
        String answer2 = scannerTopping2.next();
        if (answer2.equals("yes")) {
            countToppings++;
        }

        Scanner scannerTopping3 = new Scanner(System.in);
        System.out.println("Would you like gummy bears?");
        String answer3 = scannerTopping3.next();
        if (answer3.equals("yes")) {
            countToppings++;
        }

        double total = 2.33 + (0.33 * countToppings);

        Random r = new Random();
        int time = r.nextInt(50) + 1;

        System.out.println("Okay! A " + orderedFlavour + " ice cream with " + countToppings + " toppings. " +
                "Your total is $" + total + " and your ice cream will arrive in " + time + " minutes.");


    }
}
//
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to Intelligence Game!");
//                System.out.println("Please write your name to continue:");
//                String name = scanner.next();
//
//                Scanner scanner1 = new Scanner(System.in);
//
//                Random random = new Random();
//                String[] intellegence = {"Math Tast"};//, "History Test", "Sport Test", "Geography Test"};
//
//                boolean running = true;
//
//                GAME:
//
//                System.out.println("_____________________________________________________________________________________");
//                String scanner2 = intellegence[random.nextInt(intellegence.length)];
//                System.out.println(name + " lets play " + scanner2);
//
//                if(scanner2.equals("Math Test")) {
//                /          Scanner scanner3 = new Scanner(System.in);
//                System.out.println("A car averages 27 miles per gallon. If gas costs $4.04 per gallon, which of the following is closest to how much the gas would cost for this car to travel 2,727 typical miles?");
//            Scanner scanner3 = new Scanner(System.in);

