package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }
   public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public Student(String name,int studentId,int numberOfCredits,double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;

    }
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore/this.numberOfCredits;

        // Update the appropriate fields: numberOfCredits, gpa
    }

    public static String getGradeLevel(int credits) {
        if (credits <= 29){
            return "freshman";
        } else if (credits <= 59){
            return "sophomore";
        } else if (credits <= 89) {
            return "junior";
        } else {
            return "senior";
        }

    }

    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }
}