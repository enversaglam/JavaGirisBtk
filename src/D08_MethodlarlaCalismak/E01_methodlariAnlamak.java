package D08_MethodlarlaCalismak;

public class E01_methodlariAnlamak {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[] {1,2,5,7,9,0};

        int aranacak = 3;
        boolean varMi = false;

        for (int i : numbers) {
            if(aranacak == i){
                varMi = true;
                break;
            }
        }
        if(varMi){
            mesajVer(aranacak+" sayisi seri de mevcuttur. ;) ");
        }else{
            mesajVer(aranacak+" sayisi seri de mevcut değildir. :( ");
        }
    }
    public static void mesajVer (String mesaj){
        System.out.println(mesaj);
    }
}
