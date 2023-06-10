import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
                int sayi;
                Scanner input = new Scanner(System.in);
                System.out.println("Sayıyı giriniz");
                sayi = input.nextInt();
                if (sayi % 2 == 0) {
                    System.out.println("Girilen sayı çifttir");
                } else {
                    System.out.println("Girilen sayı tektir.");
                }
            }
        }
        
    }
}
