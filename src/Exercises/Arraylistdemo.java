package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistdemo {
    public static int sumEven(ArrayList<Integer> arr) {

        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        for (int i=0; i<10; i++){
            list.add(input.nextInt());
        }
        System.out.println(sumEven(list));
    }

}
