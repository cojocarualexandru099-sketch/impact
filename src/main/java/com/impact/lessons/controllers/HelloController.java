package com.impact.lessons.controllers;
import com.impact.lessons.services.HelloServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
        @RestController
public class HelloController {
    private final HelloServices helloServices = new HelloServices();

            @GetMapping("/")
            public String sayHeiio(){
                return helloServices.sayHallo();
            }

}
