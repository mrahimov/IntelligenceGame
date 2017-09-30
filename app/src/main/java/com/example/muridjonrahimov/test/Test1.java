
package com.example.muridjonrahimov.test;

import java.lang.ref.SoftReference;
import java.util.Random;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

    }
}
//         int a =7, b =42;
//         int smaller = minimum(a,b);
//         if(smaller == a) {
//             System.out.println("a is the smallest!");
//         }
//     }
//
//     public static int minimum(int a, int b) {
//         int smaller = 0;
//         if(a<b) {
//
//             smaller = a;
//
//         } else if(a >= b) {
//
//             smaller = b;
//
//         }
//
//         return smaller;
//
//     }
//
// }
// sout + enter;
// fori + enter;


//public class Test1 {
//    public static void main(String[] args) {
//        System.out;
//        for (int i = 0; i < ; i++) {
//
//        }
//
//    }
//}

//
//import java.sql.SQLOutput;
//import java.util.Scanner;

//public class Test1 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("what is your name?");
//
//        String scanner1 = scanner.nextLine();
//        System.out.println("what is your second name");
//        String scanner2 = scanner.nextLine();
//        System.out.println("witch day have you born?");
//        int scanner3 = scanner.nextInt();
//        System.out.println("hove old are you?");
//        int scanner4 = scanner.nextInt();
//    }
//
//}
//
//
//public class Test1 {
//
//    public static void main(String[] args) {
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//
//        System.out.println("hove old are you?");
//        int ageNumber = scanner.nextInt();
//
//            if(ageNumber > 5 && ageNumber < 9){
//
//            }
//        switch (ageNumber) {
//            case 1:
//
//            case 2:
//
//            case 3:
//
//            case 4:
//
//            case 5:
//                System.out.println("Small Number");
//                break;
//            default:
//                System.out.println("big number man!");
//        }
//        }
//    }
//}
//
//
//public class Test1 {
//
//    public static void main(String[] args) {
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("hove old are you?");
//            int ageNumber = scanner.nextInt();
//
//            if (ageNumber <= 9 && ageNumber > 5) {
//                System.out.println("Big Number");
//            } else if(ageNumber > 9) {
//                System.out.println("Really Big Numbe");
//            } else {
//                System.out.println("Small Number");
//
//            }
//        }
//    }
//}
//
//
//public class Test1 {
//
//    public static void main(String[] args) {
//        while (true) {
//
//            Scanner scanner = new Scanner(System.in);
//            int ageNumber = scanner.nextInt();
//
//
//            if (ageNumber == 99) {
//                System.out.println("Saw 99");
//            }
//        }
//    }
//}
//
//
//public class Test1 {
//
//    public static void main(String[] args) {
//
//
//        while (true) {
//
//            Scanner scanner = new Scanner(System.in);
//            int ageNumber = scanner.nextInt();
//
//            if (ageNumber < 50) {
//                System.out.println("Small Number");
//            } else if (ageNumber == 99) {
//                System.out.println("Saw 99");
//            } else {
//                System.out.println("Large Number");
//            }
//        }
//    }
//}
// a, e, i, o , u
//
//public class Test1 {
//    public static void main(String[] args){
//
//        System.out.println(countChar("longer string with more vowels"));
//
//    }
//    public static int countChar(String x) {
//        int count = 0;
//
//        for (int i = 0; i < x.length(); i++) {
//            int a = x.charAt(i);
//            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
//                count+=1;
//            }
//
//        }
//        return count;
//    }
//}


//
//public class Test1{
//    public static void main(String[] args) {
//        sum();
//    }
//    public static void sum(){
//        int sum = 0;
//        for(int i = 100; i <= 1; i -= 10){
//            sum +=i;
//        }
//        System.out.println(sum);
//    }
//}
//
//public class Test1 {
//    public static void main(String[] args) {
//        scannerIceCream();
//    }
//
//    public static void scannerIceCream() {
//
//        int countToppings = 0;
//
//        Scanner s = new Scanner(System.in);
//        System.out.println("Welcome to our ice cream service! What's your name?");
//        String name = s.next();
//
//        Scanner scannerFlavour = new Scanner(System.in);
//        System.out.println("Okay " + name + ", which flavor of ice cream would you like?");
//        String orderedFlavour = scannerFlavour.next();
//
//        Scanner scannerTopping1 = new Scanner(System.in);
//        System.out.println("Would you like chocolate chips?");
//        String answer1 = scannerTopping1.next();
//        if (answer1.equals("yes")) {
//            countToppings++;
//        }
//
//        Scanner scannerTopping2 = new Scanner(System.in);
//        System.out.println("Would you like bananas?");
//        String answer2 = scannerTopping2.next();
//        if (answer2.equals("yes")) {
//            countToppings++;
//        }
//
//        Scanner scannerTopping3 = new Scanner(System.in);
//        System.out.println("Would you like gummy bears?");
//        String answer3 = scannerTopping3.next();
//        if (answer3.equals("yes")) {
//            countToppings++;
//        }
//
//        double total = 2.33 + (0.33 * countToppings);
//
//        Random r = new Random();
//        int time = r.nextInt(50) + 1;
//
//        System.out.println("Okay! A " + orderedFlavour + " ice cream with " + countToppings + " toppings. " +
//                "Your total is $" + total + " and your ice cream will arrive in " + time + " minutes.");
//


