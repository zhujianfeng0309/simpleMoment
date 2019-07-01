package mainTest.dubbo.dubboprovade;

import mainTest.dubbo.dubboapi.GreetingService;

/**
 * Created by Administrator on 2019/6/19.
 */
public class GreetServiceImpl implements GreetingService {
    @Override
    public String sayHi(String name) {
        return "hello" + name;
    }
}
