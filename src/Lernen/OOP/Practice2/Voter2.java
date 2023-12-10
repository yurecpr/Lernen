package Lernen.OOP.Practice2;

public class Voter2 {
    private String name;
    private int age;
    private String address;

    public Voter2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        if (age < 16) {
            System.out.println(name + " It's too early to vote!!!");
        }

    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        if (age >= 16) {
            this.age = age;
        } else {
            System.out.println("Is too young!");
        }

    }

    @Override
    public String toString() {
        return "Voter2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Voter2 v1 = new Voter2("JAck", 14, "Street 1");
        Voter2 v2 = new Voter2("Kate", 13, "Street 2");
        Voter2[] voters = {v1, v2};

        for (Voter2 voter : voters) {
            System.out.println(voter);
        }


    }

}
