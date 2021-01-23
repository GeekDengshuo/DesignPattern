package com.happyfire.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author deng shuo
 * @Date 2021/1/23 16:03
 * @Version 1.0
 */
public class LatestPicSet implements PicSet {

    private ArrayList<ViewPicture> pictureList = new ArrayList<ViewPicture>();
    @Override
    public void add(ViewPicture obj) {
        pictureList.add(obj);
    }

    @Override
    public void remove(ViewPicture obj) {
        pictureList.remove(obj);
    }

    @Override
    public PicIterator createIterator() {
        return (new LatestPicIterator(pictureList));
    }
}
