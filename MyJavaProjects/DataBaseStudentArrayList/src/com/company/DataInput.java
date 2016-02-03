package com.company;

import java.util.ArrayList;
import java.util.jar.Attributes;

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
        String error = "Error:Слишком длинная фамилия!";
        do {
            System.out.print("Введите фамилию:");
            String str1 = sc.next();
            try {
                if (str1.length() > 15) {
                    System.err.println(error);
                    winner = false;
                }
                if (str1.length() <= 15) {
                    L.add(str1);
                    winner = true;
                }
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз!");
            }

        } while (winner != true);
    }

    void name(ArrayList N) {
        String error = "Error:Слишком длинное имя!";
        do {
            System.out.print("Введите имя:");
            String str2 = sc.next();
            try {
                if (str2.length() > 15) {
                    System.err.println(error);
                    winner = false;
                }
                if (str2.length() <= 15) {
                    N.add(str2);
                    winner = true;
                }
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз!");
            }

        } while (winner != true);
    }

    void profession(ArrayList P) {
        String error = "Error:Слишком длинное название!";
        do {
            System.out.print("Введите название профессии:");
            String str3 = sc.next();
            try {
                if (str3.length() > 1) {
                    System.err.println(error);
                    winner = false;
                }
                if (str3.length() == 1) {
                    P.add(str3);
                    winner = true;
                }
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз!");
            }

        } while (winner != true);
    }

    void weight(ArrayList W) {
        double weight = 0;
        do {
            System.out.print("Вес:");
            String str4 = sc.next();
            try {
                weight = Double.parseDouble(str4);
                if (weight>0) {
                    winner = true;
                    W.add(weight);
                }
                if (weight <= 0) {
                    winner = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте еще раз.");
                winner=false;
            }
        } while (winner != true);
    }
    int  select(){
        boolean win=false;
        while (win != true) {
            System.out.print("Если хотите продолжить нажмите 1,если нет то 2:");
            String str = sc.next();
            try {
                number = Integer.parseInt(str);
                if (number == 1 || number ==2) {
                    win=true;
                }
                else {
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
