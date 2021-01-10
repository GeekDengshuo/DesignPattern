package com.happyfire.prototype;

import javax.swing.*;

/**
 * @Author deng shuo
 * @Date 2021/1/10 16:12
 * @Version 1.0
 */
public class DollySheep extends JPanel implements Cloneable {

    private static final long serialVersionID = 5543049531872119328L;

    private String name;

    public DollySheep(){
        JLabel jLabel = new JLabel(new ImageIcon("prototype/etc/dolly.jpeg"));
        this.add(jLabel);
    }

    // shallow copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        DollySheep dollySheep = null;

        try{
            dollySheep = (DollySheep) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("dolly clone failed");
        }
        return dollySheep;
    }


}
