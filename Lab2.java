package com.company;

import java.util.*;

public class Lab2{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        Foursquare figure1 = new Foursquare();
        Foursquare figure2 = new Foursquare();
        Prism figure2height = new Prism();

        Prism square1 = new Prism();
        Prism square2 = new Prism();

        System.out.print("Width for 1st:");
        figure1.setWidth(scan.nextInt());

        System.out.print("Lenght for 1st:");
        figure1.setLenght(scan.nextInt());


        System.out.print("Width for 2st:");
        figure2.setWidth(scan.nextInt());

        System.out.print("Lenght for 2st:");
        figure2.setLenght(scan.nextInt());

        System.out.print("Height for 2st:");
        figure2height.setHeight(scan.nextInt());

        square1.Square();
        square2.Square();

    }
}

class Foursquare {
    protected int width = 0;

    public void setWidth(int width1) {
        width = width1;
    }


    protected int lenght = 0;
    public void setLenght(int lenght1){
        lenght = lenght1;
    }
}

class Prism extends Foursquare{
    protected int height = 0;

    public void setHeight(int height1){
        height = height1;
    }

    public void Square(){
        if(height == 0) {
            int square1st = width * lenght;
            System.out.println("Square 1st: " + square1st);
        }else {
            int square2st = width * lenght * height;
            System.out.println("Square 2st: " + square2st);
        }
    }

}
