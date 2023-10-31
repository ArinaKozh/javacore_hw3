import java.util.ArrayList;

public class EmployeeList extends ArrayList<Employee> {


    public void printSalary(){
        for (Employee worker:this) {
            System.out.println(worker.getSalary());
        }
    }

}
