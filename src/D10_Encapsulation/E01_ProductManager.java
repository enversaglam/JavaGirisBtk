package D10_Encapsulation;

public class E01_ProductManager {
    
    public void Add(E01_Product product){
        //JDBC kodlari yazarak veritabanina kaydetmeyi gorecegiz.
        System.out.println("Ürün eklendi : "+product.getName());
    }

    public void Add2(int id, String name, String description, int stockAmount, double price, String renk){

    }
}
