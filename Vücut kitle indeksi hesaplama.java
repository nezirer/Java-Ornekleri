import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy = 0;
        double kilo = 0;
        double vki = 0 ;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz.");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        kilo = input.nextDouble();



        vki = kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: " + vki);

        if (vki < 18.5){
            System.out.println("Durumunuz: Zayıf ");

        } else if (vki>18.5 && vki <24.9){
            System.out.println("Durumunuz: İdeal Kiloda");

        }else if (vki>25 && vki <29.9){
            System.out.println("Durumunuz: Şişman ");

        }else if (vki>30 && vki <34.9){
            System.out.println("Durumunuz: Obez ");

        }else {
            System.out.println("Durumunuz: Aşırı Obez");
        }



    }

}
