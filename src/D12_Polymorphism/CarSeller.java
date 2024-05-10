package D12_Polymorphism;

public class CarSeller {
    public static void main(String[] args) {
        //Ahmet Bulutluöz https://youtube.com/watch?v=XFHrNitc114
        //Overloading : ayni isim farkli signature ile ayni class da 
        //birden fazla method olusturmamiza imkan tanir.
        CarSeller Obj1 = new CarSeller();
        Obj1.yakit();
        Obj1.yakit(2020);
        Obj1.yakit(2022, 5.3);

        //overriding : parent class ta varolan bir methodun
        //child class ta olusturulan ayni isim ve signature a sahip
        //bir method tarafindan gecersiz kilinmasidir.

        Toyota obj2 = new Toyota();
        obj2.yakit();
        Toyota obj3 = new ToyotaBenzinli();
        obj3.yakit(); //overriding
        //obj3.yakit(6.8); --> parent class ta bu signature olmadigi icin hata verir
        Toyota obj4 = new ToyotaDizel();
        obj4.yakit(); //overriding
        Toyota obj5 = new ToyotaElektrikli();
        obj5.yakit(); //overriding
    }

    public void motor (){
        System.out.println("Musteri nasil motor isterse bulunur");
    }
    public void yakit (){
        System.out.println("Musteri hangi yakiti isterse bulunur");
    }
    public void yakit (double maxTuketim){
        System.out.println("Istediginiz "+maxTuketim+" lt tuketime uygun yakit buluruz");
    }
    public void yakit (int yil){
        System.out.println("Istediginiz model yili : "+yil+" sartina uygun arac buluruz");
    }
    public void yakit (int yil, double maxTuketim){
        System.out.println("Istediginiz model : "+yil+" uygun arac ve "+maxTuketim+" lt tuketime uygun yakit buluruz");
    }
}
