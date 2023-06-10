import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yas;
        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz.");
        if (input.hasNextInt()) {
            yas = input.nextInt();

            if (yas >= 18) {
                System.out.println("Ehliyet alabilirsiniz.");
            } else {
                System.out.println("Ehliyet alamazsınız.");
            }
        } else {
            System.out.println("Lütfen yaşınızı doğru formatta giriniz.");
        }
    }
}
