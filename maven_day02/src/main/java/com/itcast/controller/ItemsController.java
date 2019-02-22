package com.itcast.controller;

import com.itcast.domain.Items;
import com.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class ItemsController {
    @Autowired
    private ItemsService service;
    @RequestMapping("/findByID")
    public String test(Model model){
        Items items = service.findById(1);
        System.out.println("方法执行");
            model.addAttribute("items",items);
        return "success";
    }
}
