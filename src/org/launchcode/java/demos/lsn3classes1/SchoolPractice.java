package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student s = new Student();
        s.setName("Bob");
        s.setStudentId(342);
        s.setNumberOfCredits(1);
        s.setGpa(4.0);
        System.out.println(s.getName()+" has a GPA of:"+s.getStudentId());
        System.out.println(s.getName()+" has a Credits of:"+s.getNumberOfCredits());

    }
}
