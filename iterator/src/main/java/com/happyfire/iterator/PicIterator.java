package com.happyfire.iterator;

/**
 * @Author deng shuo
 * @Date 2021/1/23 16:01
 * @Version 1.0
 */
public interface PicIterator {

    boolean hasNext();
    ViewPicture first();
    ViewPicture last();
    ViewPicture previous();
    ViewPicture next();

}
