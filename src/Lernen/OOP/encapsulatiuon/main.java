package Lernen.OOP.encapsulatiuon;

public class main {
    public static void main(String[] args) {
        Employee a1 = new Employee("John", 34, "Street 1", 5000);
//        System.out.println(a1.name + ":");
//        System.out.println("Age: " + a1.age);
//        System.out.println("Adress " + a1.adress);
//        System.out.println("Salary " + a1.salary);
//        a1.setAge(50);
//        a1.setAdress("Street2 ");
//        a1.setSalary(500);
//
//        System.out.println(a1.name + ":");
//
//        System.out.println("Adress " + a1.getAdress());


        a1.setAge(0);
        a1.setSalary(100000);
        System.out.println("Employee " + a1.getName());
        System.out.println("Age: " + a1.getAge());
        System.out.println("Salary " + a1.getSalary());
        System.out.println(a1);
        System.out.println("Another employee");
        Employee a2 = new Employee("Kate", 25, "Street 3", 3000);
        System.out.println(a2);

        Employee[] employees = {a1, a2};
        System.out.println();
        System.out.println("Print array of employees");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
