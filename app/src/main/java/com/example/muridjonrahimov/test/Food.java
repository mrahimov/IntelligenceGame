package com.example.muridjonrahimov.test;

import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;

/**
 * Created by muridjonrahimov on 9/25/17.
 */

public class Food {
    String name;
    String type;
    boolean isRipe;
    boolean isSpicy;
    boolean isEdible;

    public Food() {
    }

    public void setName(String name) {
        name = name;
    }

    public void setType(String t) {
        type = t;
    }

    public void setRipe(boolean b) {
        isRipe = b;
    }

    public void setEdible(boolean b) {
        isEdible = b;
    }

    public void getSpicy(boolean b) {
        isSpicy = b;
    }

    public String getName() {
        return name;
    }

    public String getBotanicalName() {
        return name;
    }

}