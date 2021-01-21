package com.happyfire.command;

/**
 * @Author deng shuo
 * @Date 2021/1/17 14:09
 * @Version 1.0
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
