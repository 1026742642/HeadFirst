package chapter6.command;

import chapter6.product.GarageDoor;

/**
 * Created by lenovo on 2017/9/7.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
    }
}
