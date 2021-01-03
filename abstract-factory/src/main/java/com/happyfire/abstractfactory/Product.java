package com.happyfire.abstractfactory;

/**
 * @Author deng shuo
 * @Date 2021/1/3 16:19
 * @Version 1.0
 */

public class Product {

    private CellPhone cellPhone;
    private Computer computer;
    private Pad pad;

    public CellPhone getCellPhone() {
        return cellPhone;
    }

    public Computer getComputer() {
        return computer;
    }

    public Pad getPad() {
        return pad;
    }

    public void setCellPhone(CellPhone cellPhone) {
        this.cellPhone = cellPhone;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setPad(Pad pad) {
        this.pad = pad;
    }

    public static class factoryMaker{
        public enum FactoryType{
            APPLE,XIAOMI
        }
        public static ProductFactory makeFactory(FactoryType factoryType){
            switch (factoryType){
                case APPLE:
                    return new AppleProductFactory();
                case XIAOMI:
                    return new XiaoMiProductFactory();
                default:
                    throw new IllegalArgumentException("factoryType not supported.");
            }
        }
    }
}
