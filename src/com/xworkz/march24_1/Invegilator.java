package com.xworkz.march24_1;

public class Invegilator {
    Teacher teacher;
    int name;

    public  Invegilator(Teacher teacher) {
        if(teacher!=null) {
            teacher.name="master";
            teacher.Name();
            teacher.workDone();
        } else System.err.println("Null pointer exception");
    }


}
