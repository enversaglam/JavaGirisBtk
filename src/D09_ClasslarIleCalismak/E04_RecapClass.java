package D09_ClasslarIleCalismak;

public class E04_RecapClass {
    public static void main(String[] args) {
        //Class lar operasyonlari tutar
        E04_DortIslem dortIslem = new E04_DortIslem();
        int sonuc = dortIslem.Topla(3, 4);
        System.out.println(sonuc);
        
        sonuc = dortIslem.Cikar(9, 4);
        System.out.println(sonuc);

        sonuc = dortIslem.Carp(3, 4);
        System.out.println(sonuc);

        sonuc = dortIslem.Bol(98, 4);
        System.out.println(sonuc);

    }
}
