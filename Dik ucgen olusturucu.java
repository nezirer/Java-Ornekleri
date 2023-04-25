import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner siraSayGir = new Scanner(System.in);
        System.out.println("Kaç sıra oluşturulsun!");
        int sirasay = 0;
       sirasay = siraSayGir.nextInt();

       for (int i = 1;i<=sirasay;i++){
           for (int j = 1; j <= i; j++) {
               System.out.print(" * ");
           }
           System.out.println();


       }

    }
}
