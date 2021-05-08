package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
   public static void main(String[] args){
       double r;
       double pi = 3.14, area;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a radius:");
       r = s.nextDouble();
       area = Circle.getArea(r);
       //Circle.getArea();
       System.out.println("The area of a circle of radius " +r+ " is: " +area);
   }
}
