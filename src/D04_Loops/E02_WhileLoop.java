package D04_Loops;

public class E02_WhileLoop {
    public static void main(String[] args) {
        
        //For döngüsü
        for (int i = 2; i < 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("for loop 2 finish..");

        //While loop
        int i = 1;

        while(i<10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While loop finish..");
    }
}
