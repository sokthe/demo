package com.example.demo.Controller;

import com.example.demo.domain.Member;
import com.example.demo.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

    @Controller
    public class homeController {
    @GetMapping("/")
    public String home(){
        return "home";

    }


    @GetMapping("/form")
    public String Addform(){
        return "form";
         //
         //
         //
         //
    }


    @GetMapping("second")
    public String second() {
        return "first";
    }


}
