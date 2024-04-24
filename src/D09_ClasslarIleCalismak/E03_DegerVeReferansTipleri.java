package D09_ClasslarIleCalismak;

public class E03_DegerVeReferansTipleri {
    public static void main(String[] args) {
        E02_CustomerManager customerManager;
        E02_CustomerManager customerManager2 = new E02_CustomerManager();

        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value type
        //polimorfizm
        //stack memory - heap memory 101 - 101 ve 102 - 102
        
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number1); //30
        System.out.println(number2); //10

        int[] numbers1 = new int[] {1,2,3};
        int[] numbers2 = new int[] {4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);
    }
}
