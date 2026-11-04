package org.example;

public class Employee {

    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Зарплата после повышения:" + salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Иван Иванов", "Программист", 1000.0);
        emp.raiseSalary(10);
        System.out.println(emp);
    }
}
