package Chapter4.FactoryMode.Factory;


import Chapter4.FactoryMode.Material.*;

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
