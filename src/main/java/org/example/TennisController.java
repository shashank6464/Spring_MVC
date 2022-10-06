package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TennisController {

    @RequestMapping(value="/")
    @ResponseBody
    public String welcome(){
        return "Hello Tennis Application";
    }
}