package Lernen.OOP.encapsulatiuon;

public class Employee {
    String name;
    int age;
    String adress;
    int salary;

    public Employee(String name, int age, String adress, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.adress = adress;

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setSalary(int salary) {
        if (salary < 0 || salary > 10000) {
            System.out.println("Salary is wrong ");
        } else {
            this.salary = salary;
        }

    }

    public void setAge(int age) {
        if (age > 17) {
            this.age = age;
        } else {
            System.out.println("To small ");
        }
    }

    public String toString() {

        return "Employee " + getName() + ":" + "age " + getAge() + " .salary " + getSalary() + ", address " + getAdress();
    }
}
