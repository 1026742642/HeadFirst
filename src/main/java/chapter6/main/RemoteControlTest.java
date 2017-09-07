package chapter6.main;

import chapter6.command.GarageDoorOpenCommand;
import chapter6.command.LightOnCommand;
import chapter6.command.SimpleRemoteControl;
import chapter6.product.GarageDoor;
import chapter6.product.Light;

/**
 * Created by lenovo on 2017/9/7.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
