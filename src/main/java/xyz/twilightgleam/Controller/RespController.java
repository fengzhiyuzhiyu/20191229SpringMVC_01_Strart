package xyz.twilightgleam.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import xyz.twilightgleam.domain.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
    public void testCustomizeDispatcher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 手动编写转发
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/pages/resp.jsp");
        requestDispatcher.forward(request,response);
    }


    @RequestMapping("/testRedirect")
    public void testRedirect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 重定向
        System.out.println("重定向");
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        return;
    }

    @RequestMapping("/testDirectRespose")
    public void testDirectRespose(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 测试直接响应

        // 设置中文，防止乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        // 返回数据数据
        PrintWriter writer = response.getWriter();
        writer.println("测试...");
        return;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView  testModelAndView(ModelAndView modelAndView){
        // 模拟从数据库获取数据
        User user = new User();
        user.setUsername("FatCat");
        user.setAge(2);
        // 把数据存到model and view
        modelAndView.addObject("user",user.getUsername());
        modelAndView.addObject("age",user.getAge());
        // 跳转到的页面
        modelAndView.setViewName("resp");
        return modelAndView;
    }


    @RequestMapping("/testKeywordForward")
    public String testKeywordForward(){
        // 测试关键字转发
        return "forward:/WEB-INF/pages/resp.jsp";
    }

    @RequestMapping("/testKeywordRedirect")
    public String testKeywordRedirect(){
        // 测试关键字重定向
        System.out.println("重定向");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/testAjaxDeal")
    public @ResponseBody User testAjaxDeal(@RequestBody User user){ // 导入jack json包进行自动转换支持
        // 测试异步
        System.out.println(user);
        // 模拟响应
        user.setAge(1);
        // 模拟返回给客户端
        return user;
    }


}
