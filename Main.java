import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        EmployeeList empList = new EmployeeList();
        empList.add(new Chief("Sergey", "Head Boss", "2016-05-30",120000));
        empList.add(new Employee("Ivan","DevOps","2022-01-16",60000));
        empList.add(new Employee("Elena","Tester","2022-05-17",80000));
        empList.add(new Employee("Arina","DevOps","2021-01-16",60000));
        empList.add(new Employee("Misha","Designer","2022-02-20",90000));

        System.out.println("До:");
        empList.printSalary();
        Chief.Raise_the_salary(empList, 2000);
        System.out.println("\nПосле: ");
        empList.printSalary();

        switch (Employee.compare("2022-01-18","2022-01-17")){
            case -1:
                System.out.println("меньше");
            case 0:
                System.out.println("равно");
            case  1:
                System.out.println("больше");
        }


    }
}

