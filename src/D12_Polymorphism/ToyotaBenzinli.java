package D12_Polymorphism;

public class ToyotaBenzinli extends Toyota{
    public void motor(){
        System.out.println("Toyota benzinli araclar 1.4 cevreci motor kullanir");
    }
    public void yakit(){
        System.out.println("Toyota benzinli araclar E10 benzin kullanir");
    }
    public void yakit(Double maxTuketim){
        System.out.println("Toyota benzinli araclar ortalama 6.8 lt benzin kullanir");

        if (maxTuketim > 6.8){
            System.out.println("Benzinli bir toyota alabilirsiniz.");
        } else {
            System.out.println("Isteginize uygun bir Toyota bulamazsiniz");
        }
    }
}
