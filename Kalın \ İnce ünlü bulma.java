import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char harf;

        Scanner input = new Scanner(System.in);
        System.out.println("Öğrenmek istediğiniz ünlüyü giriniz.");
        harf = input.next().charAt(0);

        switch (harf){
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }


    }
}
