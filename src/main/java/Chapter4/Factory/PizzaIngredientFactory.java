package Chapter4.Factory;


import Chapter4.material.*;

/**
 * Created by lenovo on 2017/8/14.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce crateSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepproni();
    public Clams createClam();
}