package Chapter4.Factory.impl;


import Chapter4.Factory.PizzaIngredientFactory;
import Chapter4.material.*;
import Chapter4.material.impl.*;

/**
 * Created by lenovo on 2017/8/14.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce crateSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new ReadPepper()};
        return veggies;
    }

    public Pepperoni createPepproni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
