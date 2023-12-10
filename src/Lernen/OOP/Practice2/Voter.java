package Lernen.OOP.Practice2;


public class Voter {
    private String name;
    private int age;
    private String address;

    public Voter(String name, int age, String address) {
        this.name = name;
        this.age = validateAge(age);
        this.address = address;
    }

    private int validateAge(int age) {
        if (age < 16) {
            return 16;
        }
        return age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = validateAge(newAge);
    }

    public String getAddress() {
        return address;
    }

    public static void main(String[] args) {
        Voter v1 = new Voter("Ivan", 12, "Street 2");
        System.out.println(v1.getName() + " " + v1.getAge() + " " + v1.getAddress());
    }
}
