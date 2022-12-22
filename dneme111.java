package Alistirmalar;

import java.util.Scanner;

public class dneme111 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi yazin");

        int girilenSayi = scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        System.out.println("girilen sayinin rakamlar toplami"+ rakamlarToplami);
    }
}
