package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vlad on 29.01.2016.
 */
public class DataInput extends Main {
    public void enter(ArrayList LastName,ArrayList Name,ArrayList Profession,ArrayList Weight){
        while (number!=2) {
            lastName(LastName);
            name(Name);
            profession(Profession);
            weight(Weight);
            number=select();
        }
    }
    void lastName(ArrayList L) {
        String s = null;
        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{1,15}\\b");
        Matcher l = null;
        do {
            System.out.print("Enter lastname:");
            s = sc.nextLine();
            l = p.matcher(s);
            if (!l.matches()) {
                System.out.println("Try again!");
            }
        } while (!l.matches());
        String lastname = String.valueOf(s);
        L.add(lastname);
    }

    void name(ArrayList N) {
        String s=null;
        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{1,15}\\b");
        Matcher l = null;
        do {
            System.out.print("Enter name:");
            s = sc.nextLine();
            l = p.matcher(s);
            if(!l.matches()){
                System.out.println("Try again!");
            }
        } while (!l.matches());
        String name=String.valueOf(s);
        N.add(name);
    }

    void profession(ArrayList P) {
        String s=null;
        Pattern p = Pattern.compile("\\A[A-Z]{1}\\b");
        Matcher l = null;
        do {
            System.out.print("Enter the profession:");
                s = sc.nextLine();
                l = p.matcher(s);
            if(!l.matches()){
                System.out.println("Try again!");
            }
        } while (!l.matches());
        String profession=String.valueOf(s);
        P.add(profession);
    }

    void weight(ArrayList W) {
        String s=null;
        Pattern p = Pattern.compile("([0-9]{1,}[.][0-9]{1,2})|([0-9]{1,})");
        Matcher l = null;
        do {
            System.out.print("Enter weight:");
            s = sc.nextLine();
            l = p.matcher(s);
            if(!l.matches()){
                System.out.println("Try again!");
            }
        } while (!l.matches());
        double weight=Double.parseDouble(s);
        W.add(weight);
    }
    int  select(){
        boolean win=false;
        while (win != true) {
            System.out.print("If you want to continue click(1),no(2):");
            String str = sc.nextLine();
            try {
                number = Integer.parseInt(str);
                if (number == 1 || number ==2) {
                    win=true;
                }
                else {
                    System.out.println("Попробуйте еще раз!");
                    win=false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте еще раз!");
                win = false;
            }
        }
        return number;
}
}
