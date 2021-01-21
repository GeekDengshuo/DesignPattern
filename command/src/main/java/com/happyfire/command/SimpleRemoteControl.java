package com.happyfire.command;

/**
 * @Author deng shuo
 * @Date 2021/1/17 14:14
 * @Version 1.0
 */
public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command){
        slot = command;
    }
    public void buttonPressed(){
        slot.execute();
    }
}
