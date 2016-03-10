import java.util.Scanner;

/**
 * Created by Vlad on 06.02.2016.
 */
public class ProverkaSecond {
    public static void second(int money_deposit,int max_balans){
        Scanner sc=new Scanner(System.in);
        First pr = new First();
        int result,cena_game=10,sdacha=0;
        if (money_deposit < 10) {
            while (money_deposit < 10) {
                System.out.println("Тебе следует ввести "+(result=cena_game-money_deposit)+"$");
                System.out.println("Введите деньги:");
                String str1 = sc.nextLine();
                try {
                    sdacha = Integer.parseInt(str1);

                }
                catch (NumberFormatException e) {
                    System.err.println("Неверный формат строки!");
                }
                money_deposit+=sdacha;
            }
        }
        pr.volume(money_deposit,max_balans);
    }
}
