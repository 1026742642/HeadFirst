package chapter6.command;

/**
 * Created by lenovo on 2017/9/7.
 */
public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){}
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
