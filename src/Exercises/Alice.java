package Exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] orgs){
        String word;
        String message = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        //System.out.println(message.contains("Alice"));
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word you want to delete from sentence: ");
        word = scan.nextLine();
        message = message.replaceAll(word, "");
        System.out.println("Modified message\n" +message);
        System.out.println("The string length is: "+message.split("").length);

    }
}
