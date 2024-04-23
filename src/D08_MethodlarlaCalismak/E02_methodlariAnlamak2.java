package D08_MethodlarlaCalismak;

public class E02_methodlariAnlamak2 {
    public static void main(String[] args) {
        //istediğimiz Bir şeyi sadece yapan methodlar void methodlardır. print komutu da dahil
        String mesaj = "Bugün hava cok güzel.";
        //mesaj.substring(0, 2);
        //String yeniMesaj = mesaj.substring(0, 2);
        String yeniMesaj = sehirVer(); //Ankara
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);//22
        System.out.println(sayi);
        
    }

    public static void ekle(){
        System.out.println("eklendi");
    }

    public static void sil(){
        System.out.println("silindi");
    }

    public static void guncelle(){
        System.out.println("guncellendi");
    }
    //deger donduren method, operasyon, fonksiyon
    public static int topla(int sayi1, int sayi2){

        return sayi1+sayi2;
    }
    public static String sehirVer() {

        return "Ankara";
    }
}
