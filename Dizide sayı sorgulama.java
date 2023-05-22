import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] sayilar  = {1,5,7,9,0};
        int aranacak = 5;
        boolean vaka = false;

    for (int i = 0 ; i < sayilar.length ; i++){

        if (sayilar[i] == aranacak){
            vaka = true;
        }


    }


    if (vaka){

        System.out.println("bu dizide bu sayı vardır.");
    } else{
        System.out.println("bu dizide bu sayı yoktur.");
    }


    }

}
