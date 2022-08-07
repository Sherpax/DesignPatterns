package Decorator.decorator;
import Decorator.pizzaInterface.Pizza;

public abstract class ToppingDecorator implements Pizza {
    
    private Pizza tempPizza;
    
    public ToppingDecorator(Pizza newPizza) {
        this.tempPizza = newPizza;
    }

    public String getDescription(){
        return this.tempPizza.getDescription();
    }

    public double getCost(){
        return this.tempPizza.getCost();
    }
    
}
