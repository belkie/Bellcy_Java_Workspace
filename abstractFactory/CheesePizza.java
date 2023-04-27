package abstractFactory;

public class CheesePizza extends AbstractFactory {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
    }
}

 class ClamPizza extends AbstractFactory {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
    }
}

 class VeggiePizza extends AbstractFactory {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
    }
}
 class PepperoniPizza extends AbstractFactory {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
    }
}

