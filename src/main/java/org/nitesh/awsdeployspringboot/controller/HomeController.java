package org.nitesh.awsdeployspringboot.controller;

import org.nitesh.awsdeployspringboot.dto.HomeDetails;
import org.nitesh.awsdeployspringboot.dto.HomeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/data")

    public String homeData() {
        HomeDetails homeDetails = new HomeDetails(1L,"Home 1",true,"Pune",1000L);
        HomeDto homeData= new HomeDto(101,true,400L,homeDetails);

        return "First Hello World from Home Data AWS ECS \n\t\t\t"+homeData;
    }
}
