package Decorator.baseClasses;

import Decorator.decorator.ToppingDecorator;
import Decorator.pizzaInterface.Pizza;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
    }

    @Override
    public double getCost() {
        return super.getCost() + .35;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato Sauce";
    }

    
    
}
