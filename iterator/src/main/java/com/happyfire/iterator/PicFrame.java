package com.happyfire.iterator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author deng shuo
 * @Date 2021/1/23 16:37
 * @Version 1.0
 */
public class PicFrame extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    ViewPicture viewPicture;
    PicSet picSet;
    PicIterator picIterator;


    PicFrame(){
        super("pictures");

        this.setResizable(false);

        picSet = new LatestPicSet();

        picSet.add(new ViewPicture("月亮","抬头看见大大的月亮，生活中不经意的美好"));
        picSet.add(new ViewPicture("高楼","感受上海的繁华"));
        picSet.add(new ViewPicture("钟楼","六点钟声响起，回到老上海"));
        picSet.add(new ViewPicture("外滩","外滩美景，外滩永远都是那么多的人"));

        picIterator = picSet.createIterator();
        viewPicture = picIterator.first();
        this.showPicture(viewPicture.getName(),viewPicture.getIntroduce());

    }

    private void showPicture(String name, String introduce){
        Container container = this.getContentPane();
        JPanel picPanel = new JPanel();
        JPanel ctrlPanel = new JPanel();

        String fileName = "iterator/etc/"+name+".jpg";

        System.out.println(fileName);

        JLabel jLabel = new JLabel(name,new ImageIcon(fileName),JLabel.CENTER);
        JTextArea jTextArea = new JTextArea(introduce);
        jLabel.setHorizontalTextPosition(JLabel.CENTER);
        jLabel.setVerticalTextPosition(JLabel.TOP);
        jLabel.setFont(new Font("宋体", Font.BOLD, 20));

        jTextArea.setLineWrap(true);
        jTextArea.setEditable(false);

        picPanel.setLayout(new BorderLayout(5,5));
        picPanel.add("Center",jLabel);
        picPanel.add("South",jTextArea);

        JButton first,last,next,previous;

        first = new JButton("第一张");
        last = new JButton("最后一张");
        next = new JButton("下一张");
        previous = new JButton("前一张");

        first.addActionListener(this);
        last.addActionListener(this);
        next.addActionListener(this);
        previous.addActionListener(this);

        ctrlPanel.add(first);
        ctrlPanel.add(next);
        ctrlPanel.add(previous);
        ctrlPanel.add(last);

        container.add("Center",picPanel);
        container.add("South",ctrlPanel);

        this.setSize(650,550);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("第一张")){
            viewPicture = picIterator.first();
        }else if(command.equals("下一张")){
            viewPicture = picIterator.next();
        }else if(command.equals("前一张")){
            viewPicture = picIterator.previous();
        }else if(command.equals("最后一张")){
            viewPicture = picIterator.last();
        }
        this.showPicture(viewPicture.getName(),viewPicture.getIntroduce());
    }



}
