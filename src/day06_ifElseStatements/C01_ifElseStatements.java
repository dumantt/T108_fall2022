package day06_ifElseStatements;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {


        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();
        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){ System.out.println("Eşkenar Ucgen");
        } else {
            System.out.println("Eşkenar Ucgen Degil");}

         /*
           If ile baslayan bir kod else ile bitiyorsa
           input'un tum degerlerini kapsar
           Yani her deger icin mutlaka kodumuzda bir body calisir
         */



    }

}
