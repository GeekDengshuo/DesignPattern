package com.happyfire.iterator;

/**
 * @Author deng shuo
 * @Date 2021/1/23 15:58
 * @Version 1.0
 */
public interface PicSet {

    void add(ViewPicture obj);

    void remove(ViewPicture obj);

    PicIterator createIterator();
}
