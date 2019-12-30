package xyz.twilightgleam.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.twilightgleam.domain.Acount;
import xyz.twilightgleam.domain.CustomizeDataType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

// 控制器类
@Controller
@RequestMapping(path = "/modular") // 用于定义模块目录
public class HelloController {

    //1.
    @RequestMapping(path = "/testController") // 映射的文件目录(有个method方法(限制请求方法):method = RequestMethod.GET)
    public String returnCode(){
        System.out.println("This method is called.");
        // 由于配置了视图解析器，所以文件会自动在/WEB-INF/pages/下找target pages.jsp
        return "targetpages";
    }

    //2.
    @RequestMapping(path = "/bindingParamter")
    public String bindingParamter(String name, String password){
        System.out.println("测试绑定参数的请求: name_" + name + " password_" + password);
        return "targetpages";
    }

    // 3.
    @RequestMapping(path = "/testFormBindingByBean")
    public String bindingParamterbyUsingBean(String name, String password){
        return "testform";
    }

    @RequestMapping(path = "/testFormBindingByBeanImpl")
    public String bindingParamterbyUsingBeanImpl(Acount acount){
        System.out.println("测试绑定参数为Bean的请求:");
        System.out.println(acount);
        return "targetpages";
    }

    //4.
    @RequestMapping(path = "/testFormBindingByBeanQuoting")
    public String bindingParamterbyUsingBeanQuoting(String name, String password){
        return "testform02";
    }

    @RequestMapping(path = "/testFormBindingByBeanQuotingImpl")
    public String bindingParamterbyUsingBeanQuotingImpl(Acount acount){
        System.out.println("测试绑定参数为Bean引用的请求:");
        System.out.println(acount);
        return "targetpages";
    }

    // 5.
    @RequestMapping(path = "/testFormBindingByBeanCustomize")
    public String testFormBindingByBeanCustomize(){
        return "testcustomizedatetype";
    }

    @RequestMapping(path = "/testCustomizeDateType")
    public String testCustomizeCateType(CustomizeDataType customizeDataType){
        System.out.println("测试自定义类型转换:");
        System.out.println(customizeDataType);
        return "targetpages";
    }

    // 6.
    @RequestMapping(path = "/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request);
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            System.out.println(headerNames.nextElement());
        }
        System.out.println(request.getSession());
        System.out.println(request.getSession().getServletContext());
        System.out.println(response);
        return "targetpages";
    }
}
