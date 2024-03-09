package D03_conditionals;

public class E03_switchDemo {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Gectiniz.");
                break;
            case 'B':
            case 'C':
                System.out.println("Iyi : Gectiniz.");
                break;
            case 'D':
                System.out.println("Fena Degil: Gectiniz.");
                break;
            case 'F':
                System.out.println("Malesef : Kaldiniz.");
                break;
            default:
                System.out.println("Gecersiz not girdiniz..");
        }
    }
}
