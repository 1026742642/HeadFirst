package Chapter4.FactoryMode.Store.impl;

import Chapter4.FactoryMode.Factory.PizzaIngredientFactory;
import Chapter4.FactoryMode.Factory.impl.NYPizzaIngredientFactory;
import Chapter4.FactoryMode.Pizza.Pizza;
import Chapter4.FactoryMode.Pizza.impl.CheesePizza;
import Chapter4.FactoryMode.Store.PizzaStore;

/**
 * Created by lenovo on 2017/8/14.
 */
public class NYPizzaStore extends PizzaStore{
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (item){
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "clam":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
        }
        return pizza;
    }
}
