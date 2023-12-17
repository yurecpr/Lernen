package HA.Lesson27Pizza;

class PizzaChoice {

    public Pizza choosePizza(int choice) {
        switch (choice) {
            case 1:
                return new PizzaSalami();
            case 2:
                return new PizzaMargarita();
            case 3:
                return new PizzaHawaii();
            default:
                return null;
        }
    }
}
