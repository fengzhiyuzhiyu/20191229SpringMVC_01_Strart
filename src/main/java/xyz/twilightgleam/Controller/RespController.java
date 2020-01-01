package xyz.twilightgleam.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.twilightgleam.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/resp")
public class RespController {

    @RequestMapping("/testReturnData")
    public String testReturnData(HttpServletRequest request){
        // 模拟从数据库获取数据
        User user = new User();
        user.setUsername("FatCat");
        user.setAge(2);
        // 把数据存到requestScope
        request.setAttribute("user",user.getUsername());
        request.setAttribute("age",user.getAge());
        return "resp";
    }

    @RequestMapping("/testCustomizeDispatcher")
    public void testCustomizeDispatcher(HttpServletRequest request, HttpServletResponse response){
//        request
        System.out.println();
    }
}
