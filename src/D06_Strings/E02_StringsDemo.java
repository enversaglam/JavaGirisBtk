package D06_Strings;

public class E02_StringsDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün hava cok güzel.";
        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj);
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2, 5));
        
        System.out.println("-----------");

        for( String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        //toLowerCase - toUpperCase
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        //trim bastaki ve sondaki bosluklari alir
        String deneme = "     Merhaba Dünya merhaba     ";
        System.out.println(deneme);
        System.out.println(deneme.trim());

    }
}
