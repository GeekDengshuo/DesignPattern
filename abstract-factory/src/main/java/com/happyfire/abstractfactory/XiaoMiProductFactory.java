package com.happyfire.abstractfactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 16:16
 * @Version 1.0
 */
public class XiaoMiProductFactory implements ProductFactory {
    @Override
    public CellPhone createCellPhone() {
        return new XiaoMiCellPhone();
    }

    @Override
    public Computer createComputer() {
        return new XiaoMiComputer();
    }

    @Override
    public Pad createPad() {
        return new XiaoMiPad();
    }
}
