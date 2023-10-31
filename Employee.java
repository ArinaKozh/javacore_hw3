import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee {
    @Getter
    @Setter


    private String name;
    private String position;
    private String hiring_date;
    private Integer salary;

    private Employee boss;

    public Employee(String name,String position,String hiring_date,Integer salary, Employee boss){
        this.name = name;
        this.position = position;
        this.hiring_date = hiring_date;
        this.salary = salary;
        this.boss = boss;
    }
    public Employee(String name,String position,String hiring_date,Integer salary){
        this.name = name;
        this.position = position;
        this.hiring_date = hiring_date;
        this.salary = salary;
    }

    protected void Raise_the_salary(Integer plus){
        this.salary += plus;
    }


    public static int compare(String date1, String date2){
        float date1_fl = Integer.parseInt(date1.split("-")[0])
                + (float) Integer.parseInt(date1.split("-")[1]) /12
                + (float)Integer.parseInt(date1.split("-")[2])/365;
        float date2_fl = Integer.parseInt(date2.split("-")[0])
                + (float) Integer.parseInt(date2.split("-")[1]) /12
                + (float)Integer.parseInt(date2.split("-")[2])/365;
        return Float.compare(date1_fl,date2_fl);
    }

    @Override
    public String toString() {
        return String.format("Сотрудник %s на должности %s \n" +
                "дата трудоустройства: %s, зп - %d, начальник - %s",
                this.name, this.position, this.hiring_date, this.salary, this.boss.name);
    }

    public Integer getSalary() {
        return salary;
    }
}
