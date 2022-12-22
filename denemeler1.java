package Alistirmalar;

import java.util.Scanner;

public class denemeler1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int input=36;
        int karakok=1;
        boolean sonuc=false;
            while (karakok*karakok<=input){
                if (karakok*karakok==input){
                    System.out.println("girilen sayinin karekoku" + karakok);
                    sonuc=true;
                    break;
                }else {
                    karakok++;

                }


            }
        System.out.println(sonuc);
    }
}
