package D12_Polymorphism;

public class ToyotaDizel extends Toyota{
    public void motor(){
        System.out.println("Toyota Dizel araclar 1.6 dizel motor kullanir");
    }
    public void yakit(){
        System.out.println("Toyota Dizel araclar EuroDizel yakit kullanir");
    }
    public void yakit(String renk){
        System.out.println("Toyota Dizel araclar uc farkli renkte uretilmistir.");

        if (renk.equalsIgnoreCase("Beyaz") || 
            renk.equalsIgnoreCase("Siyah") ||
            renk.equalsIgnoreCase("Mavi")){

            System.out.println("Istediginiz renkte Dizel Toyota bulunmaktadir.");
        } else {
            System.out.println("Istediginiz renkte Dizel Toyota bulunmamaktadir.");
        }
    }
}
