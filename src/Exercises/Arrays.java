package Exercises;

public class Arrays {
    public static void main(String[] args){
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(",");
        //for (String ph : words){
          //  System.out.println(ph);
        //}
       // System.out.println(words.toString(phrase));
        System.out.println(java.util.Arrays.toString(words));
    }
}
