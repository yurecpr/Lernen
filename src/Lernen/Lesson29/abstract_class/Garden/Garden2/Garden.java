package Lernen.Lesson29.abstract_class.Garden.Garden2;

class Garden {
    public static void growPlants(Plant plant1, Plant plant2, int years) {
        for (int year = 1; year <= years; year++) {
            System.out.println("Year: " + year);
            System.out.println(plant1);
            System.out.println(plant2);
            for (int season = 1; season <= 4; season++) {
                switch (season) {
                    case 1:
                        plant1.doSpring();
                        plant2.doSpring();
                        break;
                    case 2:
                        plant1.doSummer();
                        plant2.doSummer();
                        break;
                    case 3:
                        plant1.doAutumn();
                        plant2.doAutumn();
                        break;
                    case 4:
                        plant1.doWinter();
                        plant2.doWinter();
                        break;
                }
                System.out.println("Flowers status: " + plant1);
                System.out.println("Trees status: " + plant2);
                System.out.println("***********************************************");
            }
        }
    }
}
