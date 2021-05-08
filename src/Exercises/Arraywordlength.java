package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraywordlength {
    public static String numChars(ArrayList<String> words){
        String output = "";
        for (String str : words) {
            if (str.length() == 5) {
                output += str;
            }
        }
        return output;
    }
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        Scanner word = new Scanner(System.in);
        System.out.println("Enter words: ");
        for (int i=0; i<3; i++){
            list.add(word.nextLine());

        }
        System.out.println("Five letter word: "+numChars(list));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

    }
}
