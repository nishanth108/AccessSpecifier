package com.xworkz.march24_1;

public class Principal {


    public String name;
    String number;
    private long salary;

    Teacher teacher = new Teacher();

    Invegilator invegilator = new Invegilator(teacher);

     public  void name() {
         System.out.println("Name is : "+this.name);
     }


}
