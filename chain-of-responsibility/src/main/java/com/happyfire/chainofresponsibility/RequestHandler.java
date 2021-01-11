package com.happyfire.chainofresponsibility;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author deng shuo
 * @Date 2021/1/11 23:04
 * @Version 1.0
 */
public abstract class RequestHandler {

       private static final Logger LOGGER = LoggerFactory.getLogger(RequestHandler.class);
       private final RequestHandler next;

       public RequestHandler(RequestHandler next){
           this.next = next;
       }

       // request handler
       public void handleRequest(Request request){
           if(next != null){
               next.handleRequest(request);
           }
       }
       protected void printHandling(Request request){
           LOGGER.info("{} handling request \"{}\"",this,request);
       }

    @Override
    public abstract String toString();
}
