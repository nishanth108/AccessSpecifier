package com.xworkz.march24;

public class AccesSpecifier {

    public int roll_no;
    private int addarNo;
    protected String project;

    public void msg() {
        System.out.println("This is Student Details");

    }

    void department() {
        System.out.println("Only department level access");
    }



}
