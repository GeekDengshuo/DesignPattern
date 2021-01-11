package com.happyfire.chainofresponsibility;

/**
 * @Author deng shuo
 * @Date 2021/1/11 23:25
 * @Version 1.0
 */
public class OrcKing {

    private RequestHandler chain;

    public OrcKing(){
        buildChain();
    }
    public void buildChain(){
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }
    public void makeRequest(Request request){
        chain.handleRequest(request);
    }
}
