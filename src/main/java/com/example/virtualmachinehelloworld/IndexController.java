package com.example.virtualmachinehelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.sql.SQLException;

@Controller
public class IndexController {

    Repository repo = new Repository();

    @GetMapping("/name")
    public String index(Model dataToView) throws SQLException {
        repo.connectDB();
        String nameFetch = repo.fetchName();
        dataToView.addAttribute("name", nameFetch);
        return "index";

    }
}
