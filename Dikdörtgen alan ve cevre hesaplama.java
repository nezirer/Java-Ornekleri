import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merhabalar dikdörtgen çevre ve alan hesaplayan programa hoşgeldiniz.");
        
        int kisaKenar, uzunKenar,cevre,alan;

        Scanner input = new Scanner(System.in);
        System.out.println("Kisa kenar giriniz.");
        kisaKenar = input.nextInt();

        System.out.println("Uzun kenar giriniz.");
        uzunKenar = input.nextInt();
        
        cevre = (kisaKenar + uzunKenar)*2;
        alan= kisaKenar*uzunKenar;

        System.out.println("Çevresi = " + cevre);

        System.out.println("Alanı = " + alan);

    }
}
