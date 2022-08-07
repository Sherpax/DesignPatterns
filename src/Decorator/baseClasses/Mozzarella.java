package Decorator.baseClasses;

import Decorator.decorator.ToppingDecorator;
import Decorator.pizzaInterface.Pizza;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");
        System.out.println("Adding Mozzarella");

    }

    @Override
    public double getCost() {
        return super.getCost() + 1.25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mozzarella";
    }
    


}
