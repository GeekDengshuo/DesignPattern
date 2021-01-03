package com.happyfire.abstractfactory;

import org.springframework.cglib.proxy.Factory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 16:14
 * @Version 1.0
 */
public class AppleProductFactory implements ProductFactory {
    @Override
    public CellPhone createCellPhone() {
        return new AppleCellPhone();
    }

    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }

    @Override
    public Pad createPad() {
        return new ApplePad();
    }
}
