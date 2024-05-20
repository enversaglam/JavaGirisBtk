package D14_AbstractClasses;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        kidsGameCalculator.hesapla();
        //GameCalculator gameCalculator = new GameCalculator(); abstract oldugu icin bu sekilde kullanmak mümkün degil
        

    }
}
