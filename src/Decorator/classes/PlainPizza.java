package Decorator.classes;

import Decorator.pizzaInterface.Pizza;

public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 9.85;
    }


    
}
