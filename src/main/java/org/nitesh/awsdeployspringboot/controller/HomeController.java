package org.nitesh.awsdeployspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/data")
    public String homeData() {
        return "First Hello World from Home Data AWS ECS ";
    }
}
