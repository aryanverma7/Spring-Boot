package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RESTController {
    @GetMapping("/haha")
    public String loadData() {
        return "success";
    }

}