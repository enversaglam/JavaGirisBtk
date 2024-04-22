package D07_MiniProjects;

import java.util.Scanner;

public class E03_mukemmelSayi {
    public static void main(String[] args) {

        //6 -- > 1,2,3 e bölünür ve bu rakamların toplamı 6 eder
        //28 --> 1,2,4,7,14 e bölünür ve bu rakamların toplamı 28 eder
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz ve mükemmel sayiyi bulun...");
        int number = scanner.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if(number % i == 0) {
                total += i;
            }
        }

        if(total == number){
            System.out.println(number+" sayısı mükemmel sayıdır. ");
        } else {
            System.out.println(number+" sayisi mükemmel sayı değildir.");
        }
    }
}
