import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//MÜKEMMEL SAYI
        //Kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı.


        int sayiAdayi = 0;
        int toplam = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Sorgulamak istediğiniz sayıyı giriniz.");
        sayiAdayi = input.nextInt();



        for (int i = 1; i < sayiAdayi; i++) {
            if (sayiAdayi % i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayiAdayi){
            System.out.println(sayiAdayi + " mükkemel sayıdır.");

        }
        else{
            System.out.println( sayiAdayi + " mükemmel sayı değildir.");
            System.out.println(toplam + " toplamıdır.");
        }

    }
}
