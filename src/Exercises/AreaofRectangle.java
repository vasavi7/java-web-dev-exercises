package Exercises;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        double length = scan.nextDouble();
        System.out.println("Enter the width of rectangle: ");
        double width = scan.nextDouble();
        double area = length*width;
        System.out.println("Area of rerctangle: "+area);
    }

}
