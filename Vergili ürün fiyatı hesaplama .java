import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int fiyat,oran,vergi,vergiliFiyat;
       
       Scanner input = new Scanner(System.in);
        System.out.println("Ürünün fiyatını giriniz.");
        fiyat = input.nextInt();
        System.out.println("Vergi oranını giriniz.");
        oran = input.nextInt();
        
        vergi = fiyat * oran/100;
        vergiliFiyat= vergi + fiyat;

        System.out.println("Ürünün vergisi = "+ vergi);
        System.out.println("Vergili ürünün fiyatı = "+ vergiliFiyat);
    }
}
