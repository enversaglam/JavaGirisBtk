package D10_Encapsulation;

public class E01_Product {
    //attribute | field
    private int id;
    private String description;
    private String name;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter
    public int getId(){ //buraya veri yaazamaz ama okuyabilir hale getirmis olduk
        return id;
    }

    //setter
    public void setId(int id){
        this.id = id; // this bu Class in id si demek yani yukaridaki 5. satirdaki diger id ise bu methodtaki id
        //_id = id; //field kullanimi _ ile tanimlanan variable lar icin
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1)+id;
    }

    // ---------------------
    

    /*
     * SOLID yazılım prensipleri; geliştirilen yazılımın esnek, yeniden kullanılabilir, sürdürülebilir ve anlaşılır olmasını sağlayan, kod tekrarını önleyen ve Robert C. Martin tarafından öne sürülen prensipler bütünüdür. Kısaltması Michael Feathers tarafından tanımlanan bu prensiplerin amacı;
     * 

     * S — Single-responsibility principle - tek sorumluluk prensibi
     * ÖZET: Bir sınıf (nesne) yalnızca bir amaç uğruna değiştirilebilir, o da o sınıfa yüklenen sorumluluktur, yani bir sınıfın(fonksiyona da indirgenebilir) yapması gereken yalnızca bir işi olması gerekir.
     * 
     * O — Open-closed principle - 
     * ÖZET: Bir sınıf ya da fonksiyon halihazırda var olan özellikleri korumalı ve değişikliğe izin vermemelidir. Yani davranışını değiştirmiyor olmalı ve yeni özellikler kazanabiliyor olmalıdır.
     * 
     * L — Liskov substitution principle
     * ÖZET: Kodlarımızda herhangi bir değişiklik yapmaya gerek duymadan alt sınıfları, türedikleri(üst) sınıfların yerine kullanabilmeliyiz.
     * 
     * I — Interface segregation principle
     * ÖZET: Sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz oluşturmalıyız.
     * 
     * D — Dependency Inversion Principle
     * ÖZET: Sınıflar arası bağımlılıklar olabildiğince az olmalıdır özellikle üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır.
     */
}
