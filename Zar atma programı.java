import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Merhabalar zar atma programına hoş geldiniz!");

        int zar1, zar2,girdiK;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Zar Atmak İçin 1 Tuşlayınız.\n Çıkmak için 0 Tuşlayınız.");
        girdiK = girdi.nextInt();

            while(girdiK == 1){

                int sayac = 0;
                sayac = sayac+1;
                System.out.println("Zar Atılıyor...");

                zar1 = ((int)(Math.random()*6+1));
                zar2= ((int)(Math.random()*6)+1);

                System.out.println((sayac+1) + ".Zar =" + zar1 + "-"+ zar2);

                System.out.println(" ");

                switch(zar1){
                    case 1:
                        System.out.println(".  ");
                        break;
                    case 2:
                        System.out.println(":  ");
                        break;
                    case 3:
                        System.out.println(":. ");
                        break;
                    case 4:
                        System.out.println(":: ");
                        break;
                    case 5:
                        System.out.println("::.");
                        break;
                    case 6:
                        System.out.println(":::");
                        break;

                }
                switch(zar2){
                    case 1:
                        System.out.println(".  ");
                        break;
                    case 2:
                        System.out.println(":  ");
                        break;
                    case 3:
                        System.out.println(":. ");
                        break;
                    case 4:
                        System.out.println(":: ");
                        break;
                    case 5:
                        System.out.println("::.");
                        break;
                    case 6:
                        System.out.println(":::");
                        break;

                }

                System.out.println(" ");

                System.out.println("Zar Atmak İçin 1 Tuşlayınız.\n Çıkmak için 0 Tuşlayınız.");

                System.out.println(" ");

                Scanner cikmak = new Scanner(System.in);
                girdiK = cikmak.nextInt();




            }



    }
}
