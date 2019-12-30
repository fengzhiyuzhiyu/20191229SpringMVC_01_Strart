package xyz.twilightgleam.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/anno")
public class AnnoController {

    // 7.
    @RequestMapping("/testrequestparam01")
    public String testRequestparam(){
        return "testrequestparam";
    }

    @RequestMapping("/testRequestparamImpl")
    public String testRequestparamImpl(@RequestParam(value = "unfix_name", required = true) String username){
        System.out.println("测试@RequestParam: "+username);
        return "success";
    }

    // 8.
    @RequestMapping("/testRequestBodyImpl")
    public String testRequestBodyImpl(@RequestBody String body){
        System.out.println("测试@RequestBody: "+ body);
        return "success";
    }

    // 9.
    @RequestMapping(value = "/testpathvariables/{sid}",method = RequestMethod.PUT)
    public String testpathvariables(@PathVariable("sid") String id){
        System.out.println("测试@PathVariable(restful风格的语法): " + id);
        return "success";
    }
}
