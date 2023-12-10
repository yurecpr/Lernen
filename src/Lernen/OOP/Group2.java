package Lernen.OOP;

public class Group2 {
    public static void main(String[] args) {
        Group group37_1 = new Group("Cohort 37_1", 26, "M", "Vasia");
        System.out.println("Group: " + group37_1.name);
        System.out.println("Number of students: " + group37_1.numberOfStud);
        System.out.println("Time of studies: " + group37_1.timeOfStud);
        System.out.println("Starosta: " + group37_1.starosta);

        Group group37_2 = new Group("Group37_2", 25, "M", "We don't know");
        System.out.println();
        System.out.println("Group: " + group37_2.name);
        System.out.println("Number of students: " + group37_2.numberOfStud);
        System.out.println("Time of studies: " + group37_2.timeOfStud);
        System.out.println("Starosta: " + group37_2.starosta);

    }
}
