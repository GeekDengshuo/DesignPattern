package com.happyfire.command;

/**
 * @Author deng shuo
 * @Date 2021/1/17 14:45
 * @Version 1.0
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    private final int SLOTS = 7;

    public RemoteControl(){
        onCommands = new Command[SLOTS];
        offCommands = new Command[SLOTS];

        Command noCommand = new NoCommand();
        for (int i = 0; i <SLOTS ; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
    }
}
