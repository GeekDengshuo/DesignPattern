package com.happyfire.chainofresponsibility;

/**
 * @Author deng shuo
 * @Date 2021/1/11 23:29
 * @Version 1.0
 */
public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (RequestType.DEFEND_CASTLE == req.getRequestType()) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}
