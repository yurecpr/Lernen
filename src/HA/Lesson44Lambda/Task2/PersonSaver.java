package HA.Lesson44Lambda.Task2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PersonSaver {
    public static void main(String[] args) {

        List<Person> peopleList = List.of(
                new Person("Vovan", 35),
                new Person("Ivan", 30),
                new Person("Natali", 25),
                new Person("Dimon", 36),
                new Person("Elena", 46),
                new Person("Ivanovna", 66)


        );

        savePersonsToFile("D:\\!AitTr\\test_idea\\src\\HA\\Lesson44Lambda\\Task2\\people.txt", peopleList);
    }

    public static void savePersonsToFile(String fileName, List<Person> persons) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Person person : persons) {
                String line = person.getName() + ", " + person.getAge();
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}



