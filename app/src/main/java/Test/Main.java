package Test;

import java.lang.ref.SoftReference;

/**
 * Created by muridjonrahimov on 9/28/17.
 */

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Volha", 28, 200);
        Clerk clerk = new Clerk();
        Manager manager = new Manager();

//        System.out.println(manager.changeClerk("security"));

        clerk.receiveBonus(100);
        System.out.println(employee.salary);

    }
}


//
//    You have 3 classes:
//
//        Manager
//        Clerk
//        Employee
//
//        Every employee would have name, age and salary fields.
//        Every Clerk would also have a bonus filed.
//        Every Manager would have only one clerk.
//
//        There is a function receiveSalary(), that is responsible for giving a certain amount of $$ to each employee.
//        Each employee would have a method printPossition(), which would print “I am a manager” for managers and “I am a clerk” for  clerks.
//        Manager can change his clerk whenever he wants, write a function changeClerk() which manager can call to change the clerk.
//        Every Clerk would have a function receiveBonus(), which would take a bonus amount, would sum salary and bonus and return the total.
//
//        Test cases:
//        Create a manager, Volha, and create a clerk, Yuliya. Volha would receive a salary of $200,000, Yuliya would receive a salary of $100,000.
//        Volha would change her clerk and would get a new clerk Murad. Murad is getting a salary $120,000. Murrad is doing well at job and let Murad
//        receiveBonus() of $10,000. Invoke the method printPosition() and print positions of Volha, Yuliya and Mura