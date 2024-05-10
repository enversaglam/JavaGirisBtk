package D13_PolymorphismDemo;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }


    public void add(){
        System.out.println("Musteri eklendi.");
        this.logger.log("Log mesaji cus");
        //DatabaseLogger logger = new DatabaseLogger();
        //logger.Log("Log mesaji db");
        //bu yöntem tehlikeli cunku daha sonra degistirmek istersek cok zor.
    }
}
