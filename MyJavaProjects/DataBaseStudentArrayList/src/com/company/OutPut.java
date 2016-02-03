package com.company;

import java.util.ArrayList;

/**
 * Created by Vlad on 29.01.2016.
 */
public class OutPut extends Main{
    void output(ArrayList LastName, ArrayList Name, ArrayList Profession, ArrayList Weight){
        int size=0;
        for (int i = 0; i < LastName.size(); i++) {
            System.out.print("№"+LastName.indexOf(LastName.get(i)));
            System.out.print("    Фамилия:" + (LastName.get(i)));
            System.out.print("    Имя:" + (Name.get(i)));
            System.out.print("    Профессия:" + (Profession.get(i)));
            System.out.print("    Вес:" + (Weight.get(i)) + "\n");
            System.out.println();
        }
    }

}
