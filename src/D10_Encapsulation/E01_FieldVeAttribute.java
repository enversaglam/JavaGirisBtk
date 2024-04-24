package D10_Encapsulation;

public class E01_FieldVeAttribute {
    public static void main(String[] args) {
        E01_Product product = new E01_Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("k");

        E01_ProductManager productManager = new E01_ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

        /* productManager.Add2(2, "Aaa", "bnasbansb", 4, 200,"k");
        productManager.Add2(2, "Aaa", "bnasbansb", 4, 200);
        productManager.Add2(2, "Aaa", "bnasbansb", 4, 200);
        productManager.Add2(2, "Aaa", "bnasbansb", 4, 200); */
    }
}
