/**
 * Created by Vlad on 06.02.2016.
 */
import java.util.Scanner;

public class Proverka {
    public static void main(String[] args) {
        boolean winner = false;
        int money_deposit=0, max_balans = 100000, cena_game = 10, sdacha = 0, result = 0;
        String error1 = "Максимальный банк 100тис!!!Деньги не принято(";
        System.out.println("Стоимость игры 10$");
        System.out.println("Максимальный возможный банк 100тис долларов!");
        proverka(money_deposit,max_balans,error1,winner);

    }
    public static void proverka(int money_deposit,int max_balans,String error1,boolean winner){
        First pr = new First();
        ProverkaSecond second = new ProverkaSecond();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Введите деньги для игры:");
            String str2 = sc.nextLine();
            try {
                money_deposit = Integer.parseInt(str2);
                if (money_deposit > 0 && money_deposit <= max_balans) {
                    winner = true;
                }
                if (money_deposit > max_balans) {
                    System.err.println(error1);
                    winner = false;
                }
            } catch (NumberFormatException e) {
                System.err.println("Попробуйте еще раз!");
            }
        } while (winner != true);
        if(money_deposit>=10){
            pr.volume(money_deposit,max_balans);}
        if(money_deposit<10){
            ProverkaSecond.second(money_deposit,max_balans);
        }
    }
}
