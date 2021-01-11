package com.happyfire.chainofresponsibility;

/**
 * @Author deng shuo
 * @Date 2021/1/11 23:33
 * @Version 1.0
 */
public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (RequestType.COLLECT_TAX == req.getRequestType()) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "OrcSolider";
    }
}
