package impl;

import service.SayHelloService;

public class SayHelloServiceImpl implements SayHelloService {
    public String sayHello(String msg) {
        return "hello "+msg;
    }
}
