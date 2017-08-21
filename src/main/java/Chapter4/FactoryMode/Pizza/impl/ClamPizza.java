package Chapter4.FactoryMode.Pizza.impl;

import Chapter4.FactoryMode.Factory.PizzaIngredientFactory;
import Chapter4.FactoryMode.Pizza.Pizza;

/**
 * Created by lenovo on 2017/8/14.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.crateSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
