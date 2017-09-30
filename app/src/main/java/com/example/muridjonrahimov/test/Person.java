package com.example.muridjonrahimov.test;

/**
 * Created by muridjonrahimov on 9/24/17.
 */
//Create a class called Person, in its own file called Person.java.
//        Add a constructor, which will accept three (3) different values as arguments into three
//        (3) parameters, then store these values into field variables.
//        Add these methods:
//        printName()
//        printAge()
//        printFavoriteFood()
//        All of these methods should return no values whatsoever. These methods should, however,
//        print values onto the console. HTML Editor Keyboard Shortcuts

public class Person {


    public Person(String name, int age, String favoriteFood) {
        printName(name);
        age(age);
        favoriteFood(favoriteFood);



    }
    public void printName(String name) {
        System.out.println(name);

    }
    public void age(int age) {
        System.out.println(age);
    }
    public void favoriteFood(String favoriteFood) {
        System.out.println(favoriteFood);
    }


}
