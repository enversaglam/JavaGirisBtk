package D14_AbstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
    
    @Override
    public void getData() {
        System.out.println("Veri getirildi : Sql Server");
    }
}
