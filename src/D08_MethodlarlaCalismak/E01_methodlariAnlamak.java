package D08_MethodlarlaCalismak;

public class E01_methodlariAnlamak {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[] {1,2,5,7,9,0};

        int aranacak = 5;
        boolean varMi = false;

        for (int i : numbers) {
            if(aranacak == i){
                varMi = true;
                break;
            }
        }
        if(varMi == true){
            System.out.println(aranacak+" sayisi seri de mevcuttur. ;) ");
        }else{
            System.out.println(aranacak+" sayisi seri de mevcut değildir. :( ");
        }
    }
    public static void mesajVer (int aranacak){
        System.out.println("Sayi mevcuttur : "+aranacak);
    }
}
