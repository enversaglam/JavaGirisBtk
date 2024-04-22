package D07_MiniProjects;

import java.util.Scanner;

public class E04_arkadasSayilar {
    public static void main(String[] args) {
        //220 - 284 pozitif bolenleri toplami bir digerine esit olan sayilara denir
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayi giriniz ve kardes sayilari bulun...");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if(number1 % i == 0) {
                total1 += i;
            }
        }

        for (int i = 1; i < number2; i++) {
            if(number2 % i == 0) {
                total2 += i;
            }
        }

        if(total1 == number2 && total2 == number1){
            System.out.println(number1+" ve "+number2+" sayilari arkadas sayilardir. ;) ");
        } else {
            System.out.println(number1+" ve "+number2+" sayilari arkadas sayilar değildir. :( ");
        }

    }
}
