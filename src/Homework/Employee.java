package Homework;


public class Employee {
    String surname;
    int salary;
    Employee(String surname2, int salary2){
        surname=surname2;
        salary=salary2;
    }

    int highSalary(){
        salary*=2;
        return salary;
    }

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee worker1 = new Employee("Иванов",1000);
        Employee worker2 = new Employee("Петров",500);
        System.out.println("Зарплата " + worker1.surname + " " + worker1.highSalary());
        System.out.println("Зарплата " + worker2.surname + " " + worker2.highSalary());
    }



}