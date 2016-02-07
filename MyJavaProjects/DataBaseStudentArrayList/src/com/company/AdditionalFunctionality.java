package com.company;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vlad on 29.01.2016.
 */
public class AdditionalFunctionality extends Main {
    void Select(ArrayList LastName, ArrayList Name, ArrayList Profession, ArrayList Weight) {
        System.out.println("Additional functionality:");
        System.out.println("1)Delete line.\n" +
                "2)Replacement attribute.\n" +
                "3)Add student.\n" +
                "4)Displays a list of all students(only lastname)\n" +
                "5)To display detailed information about the student by entering its serial number\n" +
                "6)Not to change anything");
        int select = 0;
        String s=null;
        Pattern p = Pattern.compile("[1-6]{1}");
        Matcher l = null;
        do {
            System.out.print("Your choise:");
            s = sc.nextLine();
            l = p.matcher(s);
            if(!l.matches()){
                System.out.println("Try again!");
            }
        } while (!l.matches());
        select=Integer.parseInt(s);
        switch (select) {
            case 1:
                remove(LastName, Name, Profession, Weight);
                break;
            case 2:
                set(number,i, LastName, Name, Profession, Weight);
                break;
            case 3:
                AddStudent(LastName, Name, Profession, Weight);
                break;
            case 4:
                DisplayedOnlyLastName(LastName, Name, Profession, Weight);
                break;
            case 5:
                DisplayedInformStudent(LastName, Name, Profession, Weight);
                break;
            case 6:
                System.exit(0);

        }
    }

    void remove(ArrayList LastName,ArrayList Name,ArrayList Profession,ArrayList Weight){
        OutPut o=new OutPut();
        Scanner sc=new Scanner(System.in);
        boolean win=false;
        int n=0;
        while (win != true) {
            System.out.println("Remove!");
            System.out.print("Which line you want to delete:");
            String str = sc.nextLine();
            try {
                n = Integer.parseInt(str);
                if (n >= 0 && n <= LastName.size()) {
                    win = true;
                }
                if(n>LastName.size()){
                    System.out.println("Try again!");
                    win=false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again!");
                win = false;
            }
        }
            LastName.remove(n);
            Name.remove(n);
            Profession.remove(n);
            Weight.remove(n);
            for (i = 0; i < LastName.size(); i++) {
                System.out.print("№" + LastName.indexOf(LastName.get(i)));
                System.out.print("    Lastname:" + (LastName.get(i)));
                System.out.print("    Name:" + (Name.get(i)));
                System.out.print("    Profession:" + (Profession.get(i)));
                System.out.print("    Weight:" + (Weight.get(i)) + "\n");
                System.out.println();
            }
        win=false;
        while (win != true) {
            System.out.println("Exit(1),return to additional functionality(2)");
            String str = sc.nextLine();
            try {
                n = Integer.parseInt(str);
                if (n == 1 || n ==2) {
                   if(n==1){
                       System.exit(0);
                   }
                    if(n==2){
                        Select(LastName,Name,Profession,Weight);
                    }
                    win=true;
                }
                if(n<1&&n>2){
                    System.out.println("Try again!");
                    win = false;
                }
                else {
                    win=false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again!");
                win = false;
            }
        }





    }
    void set(int size,int i,ArrayList LastName,ArrayList Name,ArrayList Profession,ArrayList Weight){
        Main m=new Main();
        OutPut o=new OutPut();
        int selectInt=0;
        while (m.winner!=true) {
            System.out.print("In which line you want to change an attribute:");
            String str=sc.nextLine();
            try {
                size = Integer.parseInt(str);
                m.winner=true;

            } catch (Exception e) {
                System.out.println(error);
            }
        }
        m.winner=false;
        System.out.println("\n" +
                "Which attribute you want to change:\n" +
                "1)Lastname;\n" +
                "2)Name;\n" +
                "3)Profession;\n" +
                "4)Weight;");
        while (m.winner!=true) {
            System.out.print("Your choice:");
            String select=sc.nextLine();
            try {
                selectInt = Integer.parseInt(select);
                m.winner=true;
                if (selectInt<1&&selectInt>4){
                    System.out.println("Try again");
                    m.winner=false;
                }
                else{
                    m.winner=true;
                }

            } catch (Exception e) {
                System.out.println(error);
            }
        }
        switch (selectInt){
            case 1:{
                System.out.print("Enter the new attribute:");
                String newAttribute=sc.next();
                LastName.set(size,newAttribute);
                o.output(LastName,Name,Profession,Weight);
                break;
            }
            case 2:{
                System.out.print("Enter the new attribute:");
                String newAttribute=sc.next();
                Name.set(size,newAttribute);
                o.output(LastName,Name,Profession,Weight);
                break;
            }
            case 3:{
                System.out.print("Enter the new attribute:");
                String newAttribute=sc.next();
                Profession.set(size,newAttribute);
                o.output(LastName,Name,Profession,Weight);
                break;
            }
            case 4:{
                System.out.print("Enter the new attribute:");
                String newAttribute=sc.next();
                Weight.set(size,newAttribute);
                o.output(LastName,Name,Profession,Weight);
                break;
            }
        }
        System.out.println("Changes applied!");
        Select(LastName,Name,Profession,Weight);

    }
    void AddStudent(ArrayList LastName, ArrayList Name, ArrayList Profession, ArrayList Weight){
        DataInput di=new DataInput();
        OutPut o=new OutPut();
        di.enter(LastName,Name,Profession,Weight);
        o.output(LastName,Name,Profession,Weight);
        System.out.println("Changes applied!");
        Select(LastName,Name,Profession,Weight);
    }
    void DisplayedOnlyLastName(ArrayList LastName,ArrayList Name,ArrayList Profession,ArrayList Weight){
        int n=0;
        boolean win=false;
        for (int i = 0; i < LastName.size(); i++) {
            System.out.print("№"+LastName.indexOf(LastName.get(i)));
            System.out.print("    Lastname:" + (LastName.get(i)));
            System.out.println();
        }
        while (win != true) {
            System.out.println("Exit(1),return to additional functionality(2)");
            String str = sc.nextLine();
            try {
                n = Integer.parseInt(str);
                if (n == 1 || n ==2) {
                    if(n==1){
                        System.exit(0);
                    }
                    if(n==2){
                        Select(LastName,Name,Profession,Weight);
                    }
                }
                if(n<1&&n>2) {
                    System.out.println("Try again!");
                    win=false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again!");
                win = false;
            }
        }
    }
    void DisplayedInformStudent(ArrayList LastName,ArrayList Name,ArrayList Profession,ArrayList Weight){
        boolean win=false;
        int n=0;
            String s = null;
            Pattern p = Pattern.compile("[0-9]{1}\\b");
            Matcher l = null;
        while (win!=true) {
            do {
                System.out.print("What line you want to display:");
                s = sc.nextLine();
                l = p.matcher(s);
                if (!l.matches()) {
                    System.out.println("Try again!");
                }
            } while (!l.matches());
            n = Integer.parseInt(s);
            if (n > LastName.size()&&n<0) {
                System.out.println("Try again!");
            }
            else{
                win=true;
            }
        }

            System.out.print("№"+LastName.indexOf(LastName.get(n)));
            System.out.print("    Lastname:" + (LastName.get(n)));
            System.out.print("    Name:" + (Name.get(n)));
            System.out.print("    Profession:" + (Profession.get(n)));
            System.out.print("    Weight:" + (Weight.get(n)) + "\n");
        win=false;
            do {
                System.out.println("Exit(1),return to additional functionality(2)");
                String str = sc.nextLine();
                try {
                    n = Integer.parseInt(str);
                    if (n == 1 || n == 2) {
                        if (n == 1) {
                            System.exit(0);
                        }
                        if (n == 2) {
                            Select(LastName, Name, Profession, Weight);
                        }
                    } else {
                        System.out.println("Try again!");
                        win = false;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Try again!");
                    win = false;
                }
            }
            while (win!=true);

    }

}
