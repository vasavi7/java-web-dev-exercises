package Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmapid {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student (or ENTER to finish): ");
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newStudent,newID);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<String,Integer> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in a group: " + students.size());
    }
}