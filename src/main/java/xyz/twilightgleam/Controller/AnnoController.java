package xyz.twilightgleam.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

@Controller
@RequestMapping(path = "/anno")
@SessionAttributes(value = {"sessionKey"}) // 由于域对象的注解要作用与类上，所以此处相当于把"sessionKey"存到session的域对象上
public class AnnoController {

    // 7.表单属性name与bean中属性不一致，可以用Request Parameter注解配置
    @RequestMapping("/testrequestparam01")
    public String testRequestparam(){
        return "testrequestparam";
    }

    @RequestMapping("/testRequestparamImpl")
    public String testRequestparamImpl(@RequestParam(value = "unfix_name", required = true) String username){
        System.out.println("测试@RequestParam: "+username);
        return "success";
    }

    // 8.Request Param body注解配置,只能post
    @RequestMapping("/testRequestBodyImpl")
    public String testRequestBodyImpl(@RequestBody String body){
        System.out.println("测试@RequestBody: "+ body);
        return "success";
    }

    // 9.PathVariable注解,restful风格
    @RequestMapping(value = "/testpathvariables/{sid}",method = RequestMethod.PUT)
    public String testpathvariables(@PathVariable("sid") String id){
        System.out.println("测试@PathVariable(restful风格的语法): " + id);
        return "success";
    }

    // 10. 测试@request Header,返回特定的返回头而非全部
    @RequestMapping(value = "/testrequestheader")
    public String testRequestHeader(@RequestHeader(value = "accept") String header){
        System.out.println("测试@request Header,返回特定的返回头而非全部: " + header);
        return "success";
    }

    // 11. 测试@CookieValue
    @RequestMapping(value = "/testCookieValue")
    public String testtestCookieValue(@CookieValue(value = "JSESSIONID") String cookievalue){
        System.out.println("测试@CookieValue " + cookievalue);
        return "success";
    }

    // 11. 测试@CookieValue
    @RequestMapping(value = "/testModelAttr")
    public String testModelAttr(@ModelAttribute("k_abc") String s){
        System.out.println("测试@ModelAttribute, 在testModelAttrPriority方法会把数据存于一个map集合中,而在此处则被取出调用：" + s);
        return "success";
    }

    // 12. 测试@ModelAttribute
    @ModelAttribute
    public void testModelAttrPriority(Map<String, String> map){
        String abc = "Priority executed.";
        map.put("k_abc",abc);
    }

    // 13. 测试把数据存到request的域对象中
    @RequestMapping("/testSaveSession")
    public String testSaveSession(Model model){
        model.addAttribute("sessionKey","sessionValue");
        System.out.println("Model类可以把数据存到request域对象上,而如果想要把request对象的数据存到session域对象,还需要在类上显示配置SessionAttributes注解用于保存session数据");
        return "success";
    }

    // 13. 获取数据从session域对象
    @RequestMapping("/testGetSession")
    public String testGetSession(ModelMap modelMap){
        System.out.println(modelMap.getAttribute("sessionKey"));
        System.out.println("Model类的实现类ModelMap类可以提供获取session值得方法");
        return "success";
    }

    // 13. 测试把数据存到request的域对象中
    @RequestMapping("/testdelSession")
    public String testDelSession(SessionStatus sessionStatus){
        System.out.println("SessionStatus类可以删除session的值");
        sessionStatus.setComplete();
        return "success";
    }

}
