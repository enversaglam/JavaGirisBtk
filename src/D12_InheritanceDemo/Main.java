package D12_InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        //OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        //ogretmenKrediManager.Hesapla();
        //Polymorphism
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKredimanager());

    }
}
