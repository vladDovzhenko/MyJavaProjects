package com.company;

import java.util.ArrayList;

/**
 * Created by Vlad on 29.01.2016.
 */
public class OutPut extends Main{
    void output(ArrayList LastName, ArrayList Name, ArrayList Profession, ArrayList Weight){
        for (int i = 0; i < LastName.size(); i++) {
            System.out.print("№"+LastName.indexOf(LastName.get(i)));
            System.out.print("    Lastname:" + (LastName.get(i)));
            System.out.print("    Name:" + (Name.get(i)));
            System.out.print("    Profession:" + (Profession.get(i)));
            System.out.print("    Weight:" + (Weight.get(i)) + "\n");
            System.out.println();
        }
    }

}
