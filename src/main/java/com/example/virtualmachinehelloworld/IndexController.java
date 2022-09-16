package com.example.virtualmachinehelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.sql.SQLException;

@Controller
public class IndexController {

    @GetMapping("/name")
    public String index() {
        return "index";

    }
}
