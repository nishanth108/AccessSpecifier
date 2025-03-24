package com.xworkz.march24_1;

import com.xworkz.march24.Student;

public class Teacher {
    public String name;
    String subjectName;
    private long salary;

    public void  Name() {
        System.out.println(this.name);
    }

    public void setRollNo(Student student) {
        if(student!=null) {
            student.rollNo = 32;
        } else System.err.println("Null Exception in Teacher Class When try to Set RollNo");
    }

    public void workDone() {
        System.out.println("Corections of Reports");
    }


}
