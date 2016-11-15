package com.company;

// information of coffee preferences
/**
 * Created by amalabukar on 11/14/16.
 */
public class Coffee {
    private String type;
    private  String cafeChoice;
    private int sugar;
    private boolean addsMilk;


public Coffee () {
    type = "latte";}

    public Coffee (String l) {
        if(isLatte (l)) {
            type = l;
        }}

    public String getType () {
        return type;
        }

    public void setType (String l) {
            if (isLatte (l)) {
                type=l;}}

    public  boolean isLatte (String type) {
        return type.contains("Latte ") && !type.isEmpty() && type.length() <= 4;
    }


public int getSugar () {
    return sugar;
}

public void setSugar  (int s) {
    if (s > 0) {
        sugar = s;
    }
}
public boolean addsMilks () {
return addsMilk; }

public void setAddsMilks (boolean milk) {
        addsMilk= milk;
    }
        }









