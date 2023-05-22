import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int temp;


        Scanner input = new Scanner(System.in);
        System.out.println("Hava sicakligini giriniz");
        temp = input.nextInt();

        if (temp < 5 ){
            System.out.println("Yapabileceğin etkinlik: KAYAK ");
        } else if (temp >= 5  || temp < 15){
            System.out.println("Yapabileceğin etkinlik: TİYATRO ");
        } else if (temp >= 15 || temp<25) {
            System.out.println("Yapabileceğin etkinlik: MANGAL ");
        } else if (temp >= 25) {
            System.out.println("Yapabileceğin etkinlik: YÜZME ");
        }
    }
}
