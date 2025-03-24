package com.xworkz;

import com.xworkz.march24.AccesSpecifier;
import com.xworkz.march24.Student;
import com.xworkz.march24_1.AccesPublic;
import com.xworkz.march24_1.Invegilator;
import com.xworkz.march24_1.Principal;
import com.xworkz.march24_1.Teacher;

public class main {

    public static void main(String[] args) {

        Student student = new Student();
        Teacher teacher = new Teacher();
        teacher.setRollNo(student);
        Principal principal = new Principal();
        principal.name="mohan";

        principal.name();




    }

}
