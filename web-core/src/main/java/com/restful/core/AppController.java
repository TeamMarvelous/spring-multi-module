package com.restful.core;

import com.restful.dbc.ExampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping(path = "/")
    public String index() {
        ExampleDTO example = new ExampleDTO();
        example.setName("Nam");
        example.setAge(22);

        System.out.println(example.getAge());
        System.out.println(example.getName());

        return "index";
    }

}
