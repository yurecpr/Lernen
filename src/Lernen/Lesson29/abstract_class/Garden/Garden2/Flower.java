package Lernen.Lesson29.abstract_class.Garden.Garden2;

class Flower extends Plant {
    public Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    void doSpring() {
        height += 10;

        System.out.println();
        System.out.println("<<<<<<<<<<  Spring  >>>>>>>>>>>>>>");

        System.out.println("Flower is growing in spring...");
    }

    @Override
    void doSummer() {

        System.out.println();
        System.out.println("<<<<<<<<<<  Summer  >>>>>>>>>>>>>>");

        System.out.println("Flower is blooming in summer...");
    }

    @Override
    void doAutumn() {
        if (height >= 10) {
            height = 0;
        }
        ;
        System.out.println();
        System.out.println("<<<<<<<<<<  Autumn  >>>>>>>>>>>>>>");
        System.out.println("Flower is being pruned in autumn...");
    }

    @Override
    void doWinter() {
        System.out.println();
        System.out.println("<<<<<<<<<<  Winter  >>>>>>>>>>>>>>");
        System.out.println("Flower is dormant in winter...");
    }
}