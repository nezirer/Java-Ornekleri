import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Girilen dizi elemanlarını tersten yazdıran programa hoşgeldiniz.\n Kaç sayı olacağını giriniz. =>");
        int kacSayi = klavye.nextInt();

        int duzSira [] = new int [kacSayi];
        int tersSira [] = new int [kacSayi];

        Scanner duzSiraKlavye = new Scanner(System.in);

        for (int i = 0; i<kacSayi; i++){
            System.out.println((i+1) + ". Elemanı giriniz.");
            duzSira [i]= duzSiraKlavye.nextInt();
        }

        for (int i = 0; i<kacSayi; i++){
            tersSira [i] = duzSira[(kacSayi-1)-i];
        }

        for (int j = 0; j<kacSayi; j++){
            System.out.println("Ters Dizinin " + j + ".Elemanı = " + tersSira[j]);
        }
    }
}

