package com.xworkz.march24_1;

import com.xworkz.march24.AccesSpecifier;

public class AccesPublic {

    public AccesSpecifier accesSpecifier;

    public void getAccesSpecifier() {
        if(accesSpecifier!=null)
             accesSpecifier.msg();
        else
            System.out.println("Null Exception in Access Public");

    }
}
