package Lernen.Lesson29.abstract_class.Garden.Garden2;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower("Rose", 10, 2);
        Tree tree = new Tree("Oak", 50, 5);

        Garden.growPlants(flower, tree, 3);

    }
}