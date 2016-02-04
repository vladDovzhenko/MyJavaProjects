package com.company;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Vlad on 29.01.2016.
 */
public class AdditionalFunctionality extends Main {
    void Select(ArrayList LastName, ArrayList Name, ArrayList Profession, ArrayList Weight) {
        System.out.println("Дополнительный Функционал:");
        System.out.println("1)Удаление строки.\n" +
                "2)Замена атрибута.\n" +
                "3)Смена местами студентов в списке\n" +
                "4)Добавление студента\n" +
                "5)Отображение списка всех студентов (только фамилии)\n" +
                "6)Отобразить полную информацию о студенте путем ввода его порядкового номера\n" +
                "7)Ничего не менять,оставить так как есть");
        int select = 0;
        do {
            System.out.println("Ваш выбор:");
            String LineSelect = "";
            LineSelect = sc.nextLine();
            try {
                if (LineSelect.length() == 1) {
                    select = Integer.parseInt(LineSelect);
                    if (select > 0 && select <= 6) {
                        winner = true;

                    }
                } else {
                    winner = false;
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (winner != true);
        switch (select) {
            case 1:
                remove(LastName, Name, Profession, Weight);
                break;
            case 2:
                set(number,i, LastName, Name, Profession, Weight);
                break;
            case 3:
                Swap();
                break;
            case 4:
                AddStudent(LastName, Name, Profession, Weight);
                break;
            case 5:
                DisplayedOnlyLastName(LastName, Name, Profession, Weight);
                break;
            case 6:
                DisplayedInformStudent(LastName, Name, Profession, Weight);
                break;
            case 7:
                System.exit(0);

        }
    }

    void remove(ArrayList LastName,ArrayList Name,ArrayList Profession,ArrayList Weight){
        OutPut o=new OutPut();
        Scanner sc=new Scanner(System.in);
        boolean win=false;
        int n=0;
        while (win != true) {
            System.out.println("Вы выбрали удаление");
            System.out.print("Какую строку вы хотите удалить:");
            String str = sc.nextLine();
            try {
                n = Integer.parseInt(str);
                if (n >= 0 && n <= LastName.size()) {
                    win = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте еще раз!");
                win = false;
            }
        }
            LastName.remove(n);
            Name.remove(n);
            Profession.remove(n);
            Weight.remove(n);
            for (i = 0; i < LastName.size(); i++) {
                System.out.print("№" + LastName.indexOf(LastName.get(i)));
                System.out.print("    Фамилия:" + (LastName.get(i)));
                System.out.print("    Имя:" + (Name.get(i)));
                System.out.print("    Профессия:" + (Profession.get(i)));
                System.out.print("    Вес:" + (Weight.get(i)) + "\n");
                System.out.println();
            }
        win=false;
        while (win != true) {
            System.out.println("Выйти(1),вернуться в доп.функционал(2)");
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
                else {
                    win=false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте еще раз!");
                win = false;
            }
        }





    }
    void set(int size,int i,ArrayList LastName,ArrayList Name,ArrayList Profession,ArrayList Weight){
        Main m=new Main();
        OutPut o=new OutPut();
        int selectInt=0;
        while (m.winner!=true) {
            System.out.print("В какой строке вы хотите поменять атрибут:");
            String str=sc.nextLine();
            try {
                size = Integer.parseInt(str);
                m.winner=true;

            } catch (Exception e) {
                System.out.println(error);
            }
        }
        m.winner=false;
        System.out.println("Какой атрибут вы хотите поменять:\n" +
                "1)Фамилию;\n" +
                "2)Имя;\n" +
                "3)Профессию;\n" +
                "4)Вес;");
        while (m.winner!=true) {
            System.out.print("Ваш выбор:");
            String select=sc.nextLine();
            try {
                selectInt = Integer.parseInt(select);
                m.winner=true;

            } catch (Exception e) {
                System.out.println(error);
            }
        }
        switch (selectInt){
            case 1:{
                System.out.print("Введите новый атрибут:");
                String newAttribute=sc.next();
                LastName.set(size,newAttribute);
                o.output(LastName,Name,Profession,Weight);
                break;
            }
            case 2:{
                System.out.print("Введите новый атрибут:");
                String newAttribute=sc.next();
                Name.set(size,newAttribute);
                o.output(LastName,Name,Profession,Weight);
                break;
            }
            case 3:{
                System.out.print("Введите новый атрибут:");
                String newAttribute=sc.next();
                Profession.set(size,newAttribute);
                o.output(LastName,Name,Profession,Weight);
                break;
            }
            case 4:{
                System.out.print("Введите новый атрибут:");
                String newAttribute=sc.next();
                Weight.set(size,newAttribute);
                o.output(LastName,Name,Profession,Weight);
                break;
            }
        }
        System.out.println("Изменения внесены!");
        Select(LastName,Name,Profession,Weight);

    }
    void Swap(){

    }
    void AddStudent(ArrayList LastName, ArrayList Name, ArrayList Profession, ArrayList Weight){
        DataInput di=new DataInput();
        OutPut o=new OutPut();
        di.enter(LastName,Name,Profession,Weight);
        o.output(LastName,Name,Profession,Weight);
        System.out.println("Изменения внесены!");
        Select(LastName,Name,Profession,Weight);
    }
    void DisplayedOnlyLastName(ArrayList LastName,ArrayList Name,ArrayList Profession,ArrayList Weight){
        int n=0;
        boolean win=false;
        for (int i = 0; i < LastName.size(); i++) {
            System.out.print("№"+LastName.indexOf(LastName.get(i)));
            System.out.print("    Фамилия:" + (LastName.get(i)));
            System.out.println();
        }
        while (win != true) {
            System.out.println("Выйти(1),вернуться в доп.функционал(2)");
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
                else {
                    win=false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте еще раз!");
                win = false;
            }
        }
    }
    void DisplayedInformStudent(ArrayList LastName,ArrayList Name,ArrayList Profession,ArrayList Weight){
        boolean win=false;
        int n=0;
        do {
            System.out.print("Какую строку вы хотите вывести:");
            String str = sc.nextLine();
            try {
                n = Integer.parseInt(str);
                if (n >= 0 && n <= i) {
                    win = true;
                }
                else {
                    System.out.println("Попробуйте еще раз!");
                    win=false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте еще раз!");
                win= false;
            }
        } while (winner != true);
            System.out.print("№"+LastName.indexOf(LastName.get(n)));
            System.out.print("    Фамилия:" + (LastName.get(n)));
            System.out.print("    Имя:" + (Name.get(n)));
            System.out.print("    Профессия:" + (Profession.get(n)));
            System.out.print("    Вес:" + (Weight.get(n)) + "\n");
        win=false;
        while (win != true) {
            System.out.println("Выйти(1),вернуться в доп.функционал(2)");
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
                else {
                    win=false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте еще раз!");
                win = false;
            }
        }

    }

}
