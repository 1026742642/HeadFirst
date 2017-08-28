package Chapter4.MyMode.Pizza.impl;

import Chapter4.MyMode.Pizza.Pizza;

/**
 * Created by lenovo on 2017/8/28.
 */
public class ChicagoStyleCheesePizza extends Pizza{

    @Override
    public void prepare() {
        dough = null;
        sauce = null;
        cheese = null;
        veggies = null;
        pepperoni = null;
        clam = null;
    }
}
