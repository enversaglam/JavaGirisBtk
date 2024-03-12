package D07_MiniProjects;

import java.util.Scanner;

public class E02_sesliHarfler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz...");
        char harf = scanner.next().charAt(0);

        System.out.println(214 + " "+220);

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli harf");
                break;
            default:
                System.out.println("Ince harf..");
        }
    }
}
