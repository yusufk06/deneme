package Alistirmalar;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class dddddd {
    public static void main(String[] args) {

      /*

        random olarak 1 ile 100 arasinda bir sayi olusturun kullanicidan bu sayiyi bilmesini isteyin
        kullanici her deger girdiginde
        tuttugumuz sayi ile karsilastirip tahminin buyult/kucult diyelim
        kullanici tuttugumuz sayiyi bildiginde

        - 3 veya daha az tahminde bildyse " Vaowww"
        - 4-8 tahminde bildiyse "Aferin"
        = daha fazla tahminde bildiyse " basarisiz"
        yazdirin
         */

        Random rnd= new Random();
        int tutulanSayi= rnd.nextInt(100);
        int sayac=1;
        int tahmin=0;

        Scanner scan=new Scanner(System.in);

        while (tutulanSayi!=tahmin){

            System.out.println("Lutfen bir tahmin giriniz");
            tahmin= scan.nextInt();

            if (tutulanSayi==tahmin) {
                System.out.println(sayac + " ile tuttugum sayiyi bildin");
                if (sayac <= 3)
                    System.out.println("vaaoooow");
                else if (sayac <= 8) {
                    System.out.println("aferin");


                } else {
                    System.out.println("basarisiz");

                }
                break;
            }else if (tahmin>tutulanSayi){

                        System.out.println("Sayiyi kucult");

                        sayac++;
                    } else {

                           System.out.println("sayiyi buyut");
                           sayac++;
                       }

                    }
                }
            }








