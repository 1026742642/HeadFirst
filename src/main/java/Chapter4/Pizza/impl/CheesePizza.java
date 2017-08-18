package Chapter4.Pizza.impl;

import Chapter4.Factory.PizzaIngredientFactory;
import Chapter4.Pizza.Pizza;

/**
 * Created by lenovo on 2017/8/14.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.crateSauce();
        cheese = ingredientFactory.createCheese();
    }
}
