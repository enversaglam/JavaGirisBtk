package D14_AbstractDemo;

public class CustomerManager {

    BaseDatabaseManager databaseManager; 

    public void getCustomers (){
        databaseManager.getData();
    }
}
