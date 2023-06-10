import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                int sayi;
                Scanner input = new Scanner(System.in);
                System.out.println("Sayıyı giriniz");
                sayi = input.nextInt();

                if (sayi == 0 ){
                    System.out.println("Sayı 0 dır.");
                } else if (sayi < 0) {
                    System.out.println("Sayı negatiftir.");
                } else {
                    System.out.println("Sayı pozitiftir.");
                }

    }
}

