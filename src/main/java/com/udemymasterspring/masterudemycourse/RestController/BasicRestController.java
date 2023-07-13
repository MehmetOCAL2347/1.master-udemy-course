package com.udemymasterspring.masterudemycourse.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BasicRestController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Java Basic", "mehmetocal"),
                new Course(2, "Java Master", "mehmetocal"),
                new Course(3, "Java Selenium", "mehmetocal"),
                new Course(4, "Java Swing", "mehmetocal"),
                new Course(5, "Autodesk 3Ds Max", "mehmetocal")
        );
    }

    @RequestMapping("/currency-service")
    public CurrencyServiceConfiguration getProperties(){
        return currencyServiceConfiguration;
    }

}
