package com.happyfire.prototype;

import javax.swing.*;
import java.awt.*;

/**
 * @Author deng shuo
 * @Date 2021/1/10 16:22
 * @Version 1.0
 */
public class DollySheepCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        JFrame jf = new JFrame("Prototype test");
        jf.setLayout(new GridLayout(1,2));
        Container containerPane = jf.getContentPane();

        DollySheep dollySheep = new DollySheep();
        containerPane.add(dollySheep);

        DollySheep dollySheepClone = (DollySheep) dollySheep.clone();

        containerPane.add(dollySheepClone);

        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("dollySheep == dollySheepClone ?"+ (dollySheep == dollySheepClone));
        System.out.println("dollySheep hashcode = " + dollySheep.hashCode());
        System.out.println("dollySheepClone hashcode = " + dollySheepClone.hashCode());

    }
}
