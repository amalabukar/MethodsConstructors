package com.company;
// details about the the District of Columbia
/**
 * Created by amalabukar on 11/14/16.
 */
public class DC {
    String population;
    String precipation;
    int year;
    int universities;
    boolean isSportsFan;

public DC () {
    precipation = "rain";

}

public DC (String p) {
    if (isRained (p)) {
        precipation = p;

    }
    }

    public String getPrecipation () {
        return precipation;

    }
    public void setPrecipation (String p) {
        if(isRained (p)) {
            precipation = p; }}

    public boolean isRained (String name) { return name.contains ("")
       && !name.isEmpty() && name. length() <=10;}

    public int getYear() {
        return year;
    }

    public void setYear (int y) {
        if (y>0) {
            year=y;

        }
    }

    public boolean isSportsFan () {
        return isSportsFan;
    }
    public void setSportsFan (boolean sportsfan) {
        isSportsFan= sportsfan;
    }}