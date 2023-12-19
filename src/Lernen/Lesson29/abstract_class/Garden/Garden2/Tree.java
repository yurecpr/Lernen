package Lernen.Lesson29.abstract_class.Garden.Garden2;

class Tree extends Plant {
    public Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    void doSpring() {
        height += 5;
        System.out.println("Tree is growing in spring...");
    }

    @Override
    void doSummer() {
        height += 10;
        System.out.println("Tree is growing in summer...");
    }

    @Override
    void doAutumn() {
        System.out.println("Tree is dormant in autumn...");
    }

    @Override
    void doWinter() {
        System.out.println("Tree is dormant in winter...");
    }
}
