package com.happyfire.iterator;

import lombok.Data;

/**
 * @Author deng shuo
 * @Date 2021/1/23 15:45
 * @Version 1.0
 */
@Data
public class ViewPicture {
    private String name;
    private String introduce;

    ViewPicture(String name,String intro){
        this.name = name;
        this.introduce = intro;
    }
}
