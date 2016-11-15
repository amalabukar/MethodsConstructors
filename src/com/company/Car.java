package com.company;

/**
 * Created by amalabukar on 11/15/16.
 */
    //stores information about vehicle details
    public class Car {
    private String carType;
    private String color;
    private int modelYear;
    private boolean isFirstCar;



    public Car () {
        carType= "SUV";
    }


    public Car (String s) {
    if (isSUV(s)) {
        carType= s;

    }}

    public String getCarType() {
        return carType;
    }

    public void setName(String s) {
        if(isSUV (s)) {
            carType = s;}}

    public boolean isSUV (String carType)
    {return carType.contains (" ") && !carType.isEmpty() && carType.length() <=10;

    }

    public int getModelYear() {
        return modelYear;
    }
    public void setModelYear (int my) {
        if (my>2000) {
            modelYear = my;
        }
    }

    public boolean getisFirstCar() {
        return isFirstCar;

    }
    public void setFirstCar (boolean firstCar) {
        isFirstCar= firstCar;


    }
}

