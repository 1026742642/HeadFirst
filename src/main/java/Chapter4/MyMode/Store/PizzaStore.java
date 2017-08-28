package Chapter4.MyMode.Store;

import Chapter4.MyMode.Pizza.Pizza;
import Chapter4.MyMode.Pizza.impl.ChicagoStyleCheesePizza;
import Chapter4.MyMode.Pizza.impl.NYStyleCheesePizza;

/**
 * Created by lenovo on 2017/8/21.
 */
public class PizzaStore {
    public Pizza createPizza(String style, String type){
        Pizza pizza = null;
        if(style.equals("NY")){
            if(type.equals("cheese")){
                pizza = new NYStyleCheesePizza();
            }
        }else if(style.equals("Chicago")){
            if(type.equals("cheese")){
                pizza = new ChicagoStyleCheesePizza();
            }
        }else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
