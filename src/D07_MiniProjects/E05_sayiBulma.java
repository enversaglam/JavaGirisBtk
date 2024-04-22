package D07_MiniProjects;

public class E05_sayiBulma {
    public static void main(String[] args) {
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
}
