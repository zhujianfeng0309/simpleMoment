package self.person.study.webPackge.login;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/7/1.
 */
@RestController
@ApiOperation(value="页面登录",notes = "页面登录")
public class login {
    @RequestMapping()
    public void firstLogin(){
        String username = "123";
        String password = "123";

    }
}
