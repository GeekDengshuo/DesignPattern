package com.happyfire.iterator;

import java.io.PipedReader;
import java.util.ArrayList;

/**
 * @Author deng shuo
 * @Date 2021/1/23 16:15
 * @Version 1.0
 */
public class LatestPicIterator implements PicIterator {

    private ArrayList<ViewPicture> pictureArrayList = null;
    private int index = -1;
    private ViewPicture obj = null;

    public LatestPicIterator(ArrayList<ViewPicture> list){
        this.pictureArrayList = list;

    }
    @Override
    public boolean hasNext() {
        return index < pictureArrayList.size() - 1;
    }

    @Override
    public ViewPicture first() {

        index = 0;
        obj = pictureArrayList.get(index);
        return obj;
    }

    @Override
    public ViewPicture last() {

        index = pictureArrayList.size() - 1;
        obj = pictureArrayList.get(index);
        return obj;
    }

    @Override
    public ViewPicture previous(){
        if(index >0){
            obj =  pictureArrayList.get(--index);
        }
        return obj;
    }

    @Override
    public ViewPicture next() {
        if(this.hasNext()){
            obj = pictureArrayList.get(++index);
        }
        return obj;
    }
}
