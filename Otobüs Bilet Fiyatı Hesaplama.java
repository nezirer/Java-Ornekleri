import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yolculukTipi = 0;
        int yolcuYas = 0;
        double yolcuIskonto = 0;
        int yol1 = 0;
        double odenecekTutar = 0;
        double kmBasina = 0.10;

        System.out.println("Lutfen yolculuk tipini seciniz. \n 1-Tek yon \n 2-Cift yon");
        Scanner input = new Scanner(System.in);
        yolculukTipi = input.nextInt();

        System.out.println("Lutfen yasinizi giriniz.");
        Scanner yas = new Scanner(System.in);
        yolcuYas = yas.nextInt();

        if (yolculukTipi == 1) {
            yolcuIskonto = 0;
        } else if (yolculukTipi == 2) {
            yolcuIskonto = 0.80;
        } else {
            System.out.println("Hatali veri girdiniz.");
            return;
        }

        System.out.println("Kac km yol gideceksiniz ? ");
        Scanner yolGirdi = new Scanner(System.in);
        yol1 = yolGirdi.nextInt();


        if (yol1 <= 0){
            System.out.println("Km verisini hatalı girdiniz");
        } else if (yolcuYas <=0) {
            System.out.println("Yaş verisini hatalı girdiniz");
        } else if (yolculukTipi !=1 && yolculukTipi!=2) {
            System.out.println("Yolculuk seçimini yanlış yaptınız.");
        } else {
            System.out.println("Hesaplama Yapılıyor...");
        }


        if (yolcuYas < 12 ){
            odenecekTutar = (yol1*kmBasina*yolcuIskonto)-((yol1*kmBasina*yolcuIskonto*50)/100);

        } else if (yolcuYas > 12 || yolcuYas < 24 ) {

            odenecekTutar = (yol1*kmBasina*yolcuIskonto)-((yol1*kmBasina*yolcuIskonto*10)/100);


        } else if (yolcuYas > 65 ) {

            odenecekTutar = (yol1*kmBasina*yolcuIskonto)-((yol1*kmBasina*yolcuIskonto*30)/100);
        }

        if (yolculukTipi == 1){
            System.out.println("Ödenecek tutar: " + odenecekTutar);
        } else if (yolculukTipi == 2) {
            System.out.println("2 Bilete Ödenecek tutar: " + odenecekTutar*2);
        }


    }
}
