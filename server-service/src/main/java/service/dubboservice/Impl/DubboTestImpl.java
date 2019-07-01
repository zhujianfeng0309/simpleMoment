package service.dubboservice.Impl;

import org.springframework.stereotype.Service;
import service.dubboservice.DubboTest;

/**
 * Created by Administrator on 2019/6/10.
 */
@Service
public class DubboTestImpl implements DubboTest {
    @Override
    public String sayHelloDubbo() {
        String resultMessage = "hello,dubbo";
        System.out.println(resultMessage);
        return  resultMessage;
    }
}
