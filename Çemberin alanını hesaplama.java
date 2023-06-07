import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int yaricap;
        double pi , alan;
        pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz.");
        yaricap = input.nextInt();

        alan = pi*yaricap*yaricap;

        System.out.println(alan);


    }
}
