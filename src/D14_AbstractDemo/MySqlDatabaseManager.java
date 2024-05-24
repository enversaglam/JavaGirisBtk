package D14_AbstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{

    @Override
    public void getData() {
        System.out.println("Veri getirildi : MySql");
    }
    
}
