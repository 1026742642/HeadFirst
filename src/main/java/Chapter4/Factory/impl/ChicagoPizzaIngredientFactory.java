package Chapter4.Factory.impl;

import HeadFirst.Factory.PizzaIngredientFactory;
import HeadFirst.material.*;

/**
 * Created by lenovo on 2017/8/14.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return null;
    }

    public Sauce crateSauce() {
        return null;
    }

    public Cheese createCheese() {
        return null;
    }

    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    public Pepperoni createPepproni() {
        return null;
    }

    public Clams createClam() {
        return null;
    }
}