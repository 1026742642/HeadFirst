package chapter6.command;

import chapter6.product.Light;

/**
 * Created by lenovo on 2017/9/7.
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
