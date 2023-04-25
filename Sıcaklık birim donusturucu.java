import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner girdiScan = new Scanner(System.in);

        System.out.println("Sıcaklık birim dönüştürücü programa hoşgeldiniz.\n Elinizdeki sıcaklık Celcius ise 1'i \n Elinizdeki sıcaklık Fahrenheit ise 2'yi tuşalyınız.  ");

        int girdi=girdiScan.nextInt();

        if(girdi == 1){

            Scanner celGir = new Scanner(System.in);
            System.out.println("Dönüştürmek istediğiniz derece kaç Celcius ? ");
           double cel = celGir.nextDouble();
           double fah =0;

            fah = (cel * 1.8) + 32;

            System.out.println("Girdiğiniz  " +cel+"  derece,  "+fah+" Fahrenheit");

        }
        else if (girdi==2){
            Scanner fah1Gir = new Scanner(System.in);
            System.out.println("Dönüştürmek istediğiniz derece kaç Fahrenheit ? ");
            double fah1 = fah1Gir.nextDouble();
            double cel1 =0;

            cel1 = (fah1 - 32) / 1.8;

            System.out.println("Girdiğiniz  " +fah1+"  Fahrenheit,  "+cel1+" derece");



        }










    }

}
