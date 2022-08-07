package Decorator.testing;

import Decorator.baseClasses.Mozzarella;
import Decorator.baseClasses.TomatoSauce;
import Decorator.classes.PlainPizza;
import Decorator.pizzaInterface.Pizza;

public class PizzaMaker {
    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredientes: \n" +
                          basicPizza.getDescription());

    }
}
