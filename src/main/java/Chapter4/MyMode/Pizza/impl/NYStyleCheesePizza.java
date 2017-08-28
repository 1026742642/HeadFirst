package Chapter4.MyMode.Pizza.impl;

import Chapter4.MyMode.Material.impl.*;
import Chapter4.MyMode.Pizza.Pizza;

/**
 * Created by lenovo on 2017/8/28.
 */
public class NYStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NYStyleCheesePizza");
        dough = new ThinCrustDough();
        sauce = new MarinaraSauce();
        cheese = new ReggianoCheese();

        veggies.add(new Garlic());
        veggies.add(new Onion());
        veggies.add(new Mushroom());
        veggies.add(new ReadPepper());

        pepperoni = new SlicedPepperoni();
        clam = new FreshClams();
    }
}
