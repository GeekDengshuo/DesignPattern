package com.happyfire.abstractfactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 16:12
 * @Version 1.0
 */
public interface ProductFactory {
    CellPhone createCellPhone();
    Computer createComputer();
    Pad createPad();
}
