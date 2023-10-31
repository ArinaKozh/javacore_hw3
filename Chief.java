import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Chief extends Employee{

    public Chief(String name, String position, String hiring_date, Integer salary, Employee boss, ArrayList<Employee> subordinates) {
        super(name, position, hiring_date, salary, boss);
        this.subordinates = subordinates;
    }
    public Chief(String name, String position, String hiring_date, Integer salary, Employee boss) {
        super(name, position, hiring_date, salary);
    }
    public Chief(String name, String position, String hiring_date, Integer salary) {
        super(name, position, hiring_date, salary);
    }

    public Chief(String name, String position, String hiring_date, Integer salary, ArrayList<Employee> subordinates) {
        super(name, position, hiring_date, salary);
        this.subordinates = subordinates;
    }

    private ArrayList<Employee> subordinates;

    public static void Raise_the_salary(ArrayList<Employee> workers, Integer plus){
        for (Employee worker : workers) {
            if(!(worker instanceof Chief)) {
                worker.Raise_the_salary(plus);
            }
        }
    }
    public void Raise_the_salary(Integer plus){
        for (Employee worker : this.subordinates) {
            if(!(worker instanceof Chief)) {
                worker.Raise_the_salary(plus);
            }
        }
    }


}
