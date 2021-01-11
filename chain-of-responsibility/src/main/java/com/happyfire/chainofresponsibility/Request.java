package com.happyfire.chainofresponsibility;

import lombok.Data;

import java.util.Objects;

/**
 * @Author deng shuo
 * @Date 2021/1/11 23:10
 * @Version 1.0
 */

@Data
public class Request {

    private final RequestType requestType;
    private final String requestDescription;
    private boolean handled;

    public Request(final RequestType requestType,final String requestDescription){
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public void markHandled(){
        this.handled = true;
    }
    @Override
    public String toString(){
        return getRequestDescription();
    }
}
