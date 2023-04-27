package abstractFactory;

public class SimplePizzaFactory {
    public AbstractFactory createPizza(String type) 
    {
    	AbstractFactory pizza = null;

        if (type.equals("cheese")) 
        {
            pizza = new CheesePizza();
        } 
        else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } 
        else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } 
        else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
