package D07_MiniProjects;

import java.util.Scanner;

public class E01_sayiAsalMi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz...");
        int number = scanner.nextInt();
        //int remainder = number%2;
        boolean isPrime = true;
        //int flag = 20;
        if (number == 1) {
            System.out.println("Sayi asal degil");
            return;
        }
        if (number<1) {
            System.out.println("Gecersiz sayi");
            return;
        }
        
        for (int i = 2; i < number; i++) {
            if(number % i == 0) {
                //System.out.println("Verilen sayi "+i+" ye bölünüyor sayi asal degil");
                isPrime = false;
                //flag = 10;
                //break;
            }
        }
        if(isPrime) {// == true
            System.out.println(number+" Sayisi asal sayidir.");
        } else {
            System.out.println("Sayi asal degil");
        }

    }
}
