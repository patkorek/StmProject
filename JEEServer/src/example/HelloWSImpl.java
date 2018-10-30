package example;

import javax.jws.WebService;

@WebService()
public class HelloWSImpl implements HelloWS {
    public String hello(String name) {
        // replace with your impl here
        return "Hello "+name +" Welcome to Web Services!";

    }
}