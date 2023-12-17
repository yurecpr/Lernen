package HA.Lesson27Pizza;

public class PizzaChoice {
    public void orderPizza(String type) {
        Pizza pizza = choosePizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.pack();
        }
    }

    private Pizza choosePizza(String type) {
        switch (type) {
            case "Salami Pizza":
                return new PizzaHawaii();
            case "Margarita Pizza":
                return new PizzaMargarita();
            case "Hawaii Pizza":
                return new PizzaSalami();
            default:
                return null;
        }
    }
}