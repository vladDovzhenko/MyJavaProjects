/**
 * Created by Vlad on 06.02.2016.
 */

import java.util.Scanner;

public class First {
    String lemon = "Lemon", cherry = "cherry", pear = "pear", peach = "peach", sevens = "777", BAR = "BAR";
    String [][] arr=new String[3][3];
    String win = "You Win";
    boolean winner = false;
    String error1 = "Максимальный банк 100тис!!!Деньги не принято(";
    int counter,index=0,money_win=0;
    Scanner sc=new Scanner(System.in);
    void volume(int money_deposit,int max_balans){
        Proverka proverka=new Proverka();
        do {
            System.out.println("___________________________Твой баланс: " + money_deposit + "___________________");
            if (money_deposit < 10) {
                System.out.println("У тебя нету денег для игры(\n");
                Proverka.proverka(money_deposit,max_balans,error1,winner);

            }
            money_deposit -= 10;
            for (int k = 0; k < 3; k++) {
                for (int m = 0; m < 3; m++) {
                    counter = (int) (Math.random() * 24);
                    if (counter >= 0 && counter <= 6) {
                        arr[k][m] = lemon;
                        System.out.print("  " + arr[k][m] + "  ");
                    }
                    if (counter >= 7 && counter <= 12) {
                        arr[k][m] = cherry;
                        System.out.print(" " + arr[k][m] + " ");
                    }
                    if (counter >= 13 && counter <= 17) {
                        arr[k][m] = pear;
                        System.out.print("   " + arr[k][m] + "   ");
                    }
                    if (counter >= 18 && counter <= 21) {
                        arr[k][m] = peach;
                        System.out.print("  " + arr[k][m] + "  ");
                    }
                    if (counter >= 22 && counter <= 23) {
                        arr[k][m] = sevens;
                        System.out.print("    " + arr[k][m] + "    ");
                    }
                    if (counter == 24) {
                        arr[k][m] = BAR;
                        System.out.print("    " + arr[k][m] + "    ");
                    }
                }
                System.out.println("\n");
            }
            for (int k = 0; k < 3; k++) {
                for (int m = 0; m < 1; m++) {
                    if (arr[k][m] == arr[k][m + 1] && arr[k][m + 1] == arr[k][m + 2]) {
                        if (arr[k][m] == lemon) {
                            money_win = 10;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == cherry) {
                            money_win = 20;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == pear) {
                            money_win = 30;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == peach) {
                            money_win = 40;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == sevens) {
                            money_win = 50;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == BAR) {
                            money_win = 100;
                            money_deposit += money_win;
                        }
                        winner = true;
                    }
                }
            }
            for (int k = 0; k < 1; k++) {
                for (int m = 0; m < 1; m++) {
                    if (arr[k][m] == arr[k + 1][m + 1] && arr[k + 1][m + 1] == arr[k + 2][m + 2]) {
                        if (arr[k][m] == lemon) {
                            money_win = 10;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == cherry) {
                            money_win = 20;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == pear) {
                            money_win = 30;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == peach) {
                            money_win = 40;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == sevens) {
                            money_win = 50;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == BAR) {
                            money_win = 100;
                            money_deposit += money_win;
                        }
                        winner = true;
                    }
                    if (arr[k][m + 2] == arr[k + 1][m + 1] && arr[k + 1][m + 1] == arr[k + 2][m + 0]) {
                        if (arr[k][m] == lemon) {
                            money_win = 10;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == cherry) {
                            money_win = 20;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == pear) {
                            money_win = 30;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == peach) {
                            money_win = 40;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == sevens) {
                            money_win = 50;
                            money_deposit += money_win;
                        }
                        if (arr[k][m] == BAR) {
                            money_win = 100;
                            money_deposit += money_win;
                        }
                        winner = true;
                    }
                }
            }
            System.out.println("\n");

            if (winner == true)
                System.out.println(win + " " + money_win + "$ !!!");
            winner = false;
            money_win = 0;
            do {
                System.out.print("Ты хочешь продолжить (1(да)/2(нет)): ");
                while (!sc.hasNextInt()) sc.next();

                {
                    index = sc.nextInt();
                }
                if (index != 1 && index != 2) {
                    System.out.println("Вы ввели некоректные данные!!!");
                }
                if(index==2){
                    System.out.println("Спасибо за игру!!!\nЗаберите свой выграш в размере " + money_deposit + "$");
                }
            }while (index!=1 && index!=2);
        } while (index != 2);
    }
}
