package example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public interface HelloWS {
    @WebMethod(operationName = "hello")
    public String hello(String name);
}