package D12_Inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        //customer.email
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        customerManager.Add();
        employeeManager.BestEmployee();
        
    }
}
