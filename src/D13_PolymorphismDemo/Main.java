package D13_PolymorphismDemo;

public class Main {
    public static void main(String[] args) {
        /*
        * EmailLogger logger = new EmailLogger();
        * logger.Log("Log mesaji");
        */

        //bu sayede istedigimizi ekleyip cikarabiliriz 
        //plug and play
        
        /* BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};

        for (BaseLogger logger : loggers) {
            logger.log("Log Mesaji");
        } */
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

        
    }
}