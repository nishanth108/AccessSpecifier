package com.xworkz.march24;

public class Student {
     String name;
    public int rollNo;
    private int marks;

    public void Name() {
        System.out.println("The Name of The Student is: "+this.name);

    }

    void setRollNo() {
        System.out.println("Teacher Setting the Roll No");
    }

    private void marks() {
        System.out.println("Hiding marks apart from other class");
    }




}
