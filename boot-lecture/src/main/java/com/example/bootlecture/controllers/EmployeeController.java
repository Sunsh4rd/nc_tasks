package com.example.bootlecture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @GetMapping("/index")
    public String getEmployee(@RequestParam(name = "name", required = false, defaultValue = "employee") String id, Model model) {
        model.addAttribute("name", String.valueOf((int) (Math.random() * 100)));
        return "index";
    }
}
