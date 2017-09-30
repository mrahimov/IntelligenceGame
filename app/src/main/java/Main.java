import com.example.muridjonrahimov.test.MathFunctions;

/**
 * Created by muridjonrahimov on 9/25/17.
 */

public class Main {
    public static void main(String[] args) {
//
//        Holiday womens = new Holiday("women's day", 8, "March");
//        Holiday newYear = new Holiday("New Year", 31, "December");
//        Holiday independenceDay = new Holiday("independenceDay", 3, "July");
//        Holiday independenceDay1 = new Holiday("independenceDay", 3, "July");
//
//
//        System.out.println(sameMonth(independenceDay, independenceDay1));
        MathFunctions math = new MathFunctions(3,7);
        System.out.println(math.add());

    }

//    public static boolean sameMonth(Holiday a, Holiday x) {
//        if (a.getMonth() == x.getMonth()) {
//            return true;
//        }
//        return false;
//    }
}