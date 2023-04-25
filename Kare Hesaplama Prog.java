import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);
        System.out.println("Kaça kadar karelerinin bulunmasını istiyorsunuz?");
        int girilenSay = inputNum.nextInt();

        for(int i = 1; i<= girilenSay;i++){
            double kareHesapla = 0;
            kareHesapla = Math.pow(i,2);
            System.out.println(i +"^2 = " +kareHesapla);

        }
    }
}
