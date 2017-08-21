package Chapter4.FactoryMode.Store;

import Chapter4.FactoryMode.Pizza.Pizza;

/**
 * Created by lenovo on 2017/8/14.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
