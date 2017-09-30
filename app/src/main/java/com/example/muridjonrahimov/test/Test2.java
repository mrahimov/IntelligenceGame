package com.example.muridjonrahimov.test;
//public class Test2 {

//}
//
//public void firstN(int n) {
//        int counter = 0;
//            while(counter <= n) {
//                print(counter);
//            counter++;
//        }
//
//        }
//
//public void firstN(int num) {
//        int counter = 0;
//        while(counter <= num) {
//        print(counter);
//        counter++;
//        }
//
//        }
//

//
//         Printing all numbers within a range
//        Printing all multiples of 5 till 50
//        Printing all prime numbers till 100


//
//public class Test2 {
//
//    public static void main(String[] args) {
//        int start = 1;
//        while(start <= 100) {
//            if (start < 10) {
//
//                System.out.println(start);
//                start += 1;
//            } else if (start <= 100) {
//                System.out.println(start);
//                start +=10;
//            }
//
//        }
//    }
//}
//
//public class Test2 {
//
//    public static void main(String[] args) {
//
//     int number = 100;
//        while(number > 0) {
//            if (number > 10) {
//                System.out.println(number);
//                number -= 5;
//
//            } else if(number <= 10) {
//                System.out.println(number);
//                number -= 1;
//            }
//        }
//        System.out.println("blastOff");
//    }
//}



//Write a while loop that prints out all the numbers between 10 and 1 from largest to smallest, and then back up from smallest to largest.
//
//        Ex: (5,4,3,2,1,2,3,4,5)
//
//public class Test2 {
//    public static void main(String[] args) {
//        int number = 10;
//        while (number >= 1) {
//            System.out.println(number);
//            number--;
//        }
//        number++;
//        while (number <= 9) {
//            number++;
//            System.out.println(number);
//        }
//    }
//}


//
//public class Test2 {
//    public static void main(String[] args) {
//        int count = 0;
//        while (true) {
//            System.out.println(count);
//            count += 1;
//            if (count > 10)
//                break;
//        }
//    }
//}
//
//public class Test2 {
//    public static void main(String[] args) {
//        for(int i = 1 ; i <,= 5 ; i++)
//        {
//            System.out.println("i is : " + i);
//
//        }
//    }
//}


//public class Test2 {
//    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5};
//        for(int x: numbers) {
//            System.out.println(x);
//        }
//    }
//}
//_____________________________________________________________________________________
//public class Test2 {
//    public static void main(String[] args) {
//        System.out.println("plz enter a number b/w q-7:");
//        Scanner in = new Scanner(System.in);
//        int day = in.nextInt();
//        System.out.println("you entered:" + day);
//        String dayString = numToday(day);
//        System.out.println("the day is: " + dayString);
//    }
//    public static String numToday
//}
//______________________________________________________________________________________


//import java.util.*;
//
//public class Test2 {
//    public static void main(String[] args) {
//
//
//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
//}






//            public static void sumi(){
//                int sum = 0;
//                for(int i = 100; i <= 1; i -= 10){
//                    sum +=i;
//                }
//                System.out.println(sum);
//            }
//





//        int result = calc("-", 3,5);
//        System.out.println(result);
//    }
//    public static int calc(String operator, int a, int b) {
//
//        switch(operator) {
//            case "+":
//                return a+b;
//            case "-":
//                return a-b;
//        }
//
//        return 0;
//    }
//}


//public class Test2 {
//    public static void main(String[] args) {
//
//        Scanner scannerInitial = new Scanner(System.in);
//        System.out.println("Initial value: ");
//        int initial = scannerInitial.nextInt();
//
//        Scanner scannerMax = new Scanner(System.in);
//        System.out.println("max: ");
//        int max = scannerMax.nextInt();
//
//        Scanner scannerInc = new Scanner(System.in);
//        System.out.println("inc: ");
//        int incr = scannerInc.nextInt();
//
//
//        while (initial <= max) {
//            System.out.println(initial);
//            initial += incr;
//        }
//    }
//}


//
//public class Test2 {
//    public static void main(String[] args) {

//        The following function takes a String as a parameter, and is
// supposed to return the number of vowels (a, e, i, o, u) within the string.
// It's implementation is missing some details. Fix its logic using a for loop.
//
//        public int countVowels(String input){
//            int vowelCount = 0;
//            for(int x=0; x<= )
//
//            return vowelCount;
//        }

//
//        int number1 = 22;
//        int number2 = 233;
//        int nuber3 = 123;
//        int average = number1 + number2 + nuber3 / 3;
//        System.out.println(average);
//    }
//}
//
//public class Test2 {
//    public static void main(String[] args) {
//
//        boolean result = answerCell(false, false, false);
//        boolean result2 = answerCell(false, false, true);
//        boolean result3 = answerCell(true, false, false);
//
//        System.out.println(result);
//        System.out.println(result2);
//        System.out.println(result3);
//
//    }
//
//    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
//
//        if (isMom && isMorning) {
//            return true;
//        } else if (isMorning || isAsleep) {
//            return false;
//        }
//        return true;
//    }
//
//}

//
//public class Test2 {
//    public static void main(String[] args) {
//
//        add(1, 2);
//        add(10, 12);
//    }
//
//    public static int add(int num1, int num2) {
//        int result = num1 + num2;
//        System.out.println(result);
//        return result;
//    }
//}


//public class Test2 {
//    public static void main(String[] args) {
//        calculateAge(1988, 2017);
//
//    }
//    public static String calculateAge(int yearOfAge, int currentYear) {
//        int result = currentYear - yearOfAge;
//        int result2 = currentYear - yearOfAge - 1;
//        String result3 = "You are either " +  result + " or "  + result2 + ".";
//
//        System.out.println(result3);
//        return result3;
//    }
//
//}

//        XO("ooxx")    // returns true
//        XO("xooxx")   // returns false
//        XO("ooxXm")   // returns true

//
//public class Test2 {
//    public static void main(String[] args) {
//
//        System.out.println(oX("ooxx"));
//        System.out.println(oX("xooxx"));
//        System.out.println(oX("ooxXm"));
//
//    }

//    public static boolean oX(String stringName) {
//
//
//        int count = 0;
//        int count1 = 0;
//        for (int i = 0; i < stringName.length(); i++) {
//
//            char letter = stringName.charAt(i);
//
//
//            if (letter == 'x' || letter == 'X') {
//                count++;
//            } else if (letter == 'o' || letter == 'O') {
//                count1++;
//            }
//
//        }
//
//        if (count == count1) {
//            return true;
//        }
//        return false;
//
//    }
//}




//Write a Java method that takes a string as a parameter and returns true if it ends in "ly".


//
//public class Test2 {
//    public static void main(String[] args) {
//        System.out.println(javaMethod("kfjdskj"));
//
//    }
//    public static boolean javaMethod(String ly) {
//
//
//        int lastInteger = ly.length()-1;
//        int secLastInteger = ly.length()-2;
//        char lastL = ly.charAt(lastInteger);
//        char secL = ly.charAt(secLastInteger);
//
//
//        if(lastL == 'y' && secL == 'l') {
//            return true;
//        } return false;
//
//
//    }
//}
//
//public class Test2 {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static void Scanner() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your name");
//
//        String name = scanner.next();
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("How old are you");
//        int age = scanner1.nextInt();
//
//        System.out.println("Her name is " + name + " and she is " + age);
//
//
//    }
//}

//import java.util.Scanner;
//
//public class Test2 {
//    public static void main(String[] args) {
//        while(true) {
//            scanner();
//        }
//    }
//
//    public static void scanner() {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter a food:\n");
//
//            String food = scanner.next();
//
//            if (food.charAt(0) == 'h') {
//                System.out.print("Yum!\n");
//            } else {
//                System.out.print("Yum!\n");
//            }
//    }
//}


//
//public static void () {
//
//        String name = "Volha";
//        String result = name.substring(1, 6);
//        System.out.println(result);
//

//
//public class Test2 {
//
//    public static void main(String[] args) {
//
//        System.out.println(ellipsis("Hello!"));
//        System.out.println(ellipsis("Hello, world!"));
//        System.out.println(ellipsis("That's not my name."));
//
//
//    }
//    public static String ellipsis(String ell) {
//
//        String ellString = ell.substring(0,3);
//        char ellStringLast = ell.charAt(ell.length() -1);
//
//        if(ell.length() < 7) {
//            return ell;
//        } return ellString + "..." + ellStringLast;
//    }
//
//
//
//}
//
//public class Test2{
//        public static void main(String[] args) {
//                System.out.println(countCode("acoreacodecacodebbb"));
//        }
//public static int countCode(String w){
//        int count=0;
//
//        for(int o=0;o<w.length();o++){
//
//        char first=w.charAt(o);
//        if(first=='c'){
//
//        String newString=w.substring(o,o+4);
//        boolean isCode=match(newString);
//
//        if(isCode){
//        count++;
//
//        }
//        }
//        }
//        return count;
//        }
//
//public static boolean match(String p){
//
//        if(p.charAt(1)== 'o' && p.charAt(3)== 'e'){
//        return true;
//        }
//        return false;
//
//        }


//
//public class Test2 {
//
//    public static void main(String[] args) {
//
//        System.out.println(vowelCount("abcbob"));
//        System.out.println(vowelCount("bobThere"));
//        System.out.println(vowelCount("bac"));
//
//    }
//
//    public static boolean vowelCount(String o) {
//
//
//        for (int p = 0; p < o.length(); p++) {
//
//            char zero = o.charAt(p);
//            if (zero == 'b') {
//                String newString = o.substring(p, p + 3);
//            boolean match = match(newString);
//                if(match == true) {
//                    return true;
//
//                }
//            }
//        } return false;
//
//    }
//    public static boolean match(String p) {
//        if (p.charAt(2) == 'b') {
//            return true;
//        }
//        return false;
//    }
//
//}



//
//public class Test2 {
//
//    public static void main(String[] args) {
//
//       String test = myFunction("this is a test string", 'a');
//
//        System.out.println(test);
//    }
//    public static String myFunction(String x, char y) {
//
//        String m = null;
//        for (int i = 0; i < x.length(); i++) {
//            //m = null;
//            if (x.charAt(i) == y) {
//                m = x.substring(i+1,x.length());
//                //return newString;
//            }
//        }
//        return m;
//    }
//    }

import java.sql.SQLOutput;

public class Test2 {
    public static void main(String[] args) {
//        FlowerPot pot = new FlowerPot(20);
//        pot.setNumberOfFlower(7);
//        pot.addFlower();
//        System.out.println(pot.getNumberOfFlower());


        Food food = new Food();
        food.setName("plov");
        food.setRipe(true);
        food.setType("Cooked");
        System.out.println(food.getName());

    }
}




