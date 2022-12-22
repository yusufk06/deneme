package Alistirmalar;

import java.util.Random;
import java.util.Scanner;

public class sdasd {
    public static void main(String[] args) {


        int zar1, zar2, deneme = 1;
        Random random = new Random();
        while (true) {
            zar1 = random.nextInt(1,7); // +1 Yapmasaydım 0-5 arasında random değer üretecekti.
            zar2 = random.nextInt(1,7);

                if (zar1 == 6 && zar2 == 6) {
                    System.out.println("--------\nBilgisayar " + deneme + " deneme yaparak zarları 6-6 atmayı başardı.");
                    break; // Döngüyü kırmak için ekledik.
                } else {
                    System.out.println(deneme + ".Deneme\nAtılan İlk Zar: " + zar1 + "\tAtılan İkinci Zar: " + zar2);
                }
                deneme++;
            }
        }
    }














