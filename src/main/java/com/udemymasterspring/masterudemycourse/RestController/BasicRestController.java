package com.udemymasterspring.masterudemycourse.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BasicRestController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Java Basic", "mehmetocal"),
                new Course(2, "Java Master", "mehmetocal")
        );
    }

}
