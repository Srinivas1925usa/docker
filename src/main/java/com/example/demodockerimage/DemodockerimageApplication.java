package com.example.demodockerimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemodockerimageApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemodockerimageApplication.class, args);
    }

    @RestController
    static final class MyController {
        @GetMapping("/docker")
        String hello() {

            return "This is docker image srinivases";
        }

    }
}
