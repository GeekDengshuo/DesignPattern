package com.happyfire.chainofresponsibility;

/**
 * @Author deng shuo
 * @Date 2021/1/11 23:32
 * @Version 1.0
 */
public class OrcOfficer extends RequestHandler {
    public OrcOfficer(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (RequestType.TORTURE_PRISONER == req.getRequestType()) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "OrcOfficer";
    }
}
