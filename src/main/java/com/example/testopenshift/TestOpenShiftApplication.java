package com.example.testopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/get")
public class TestOpenShiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestOpenShiftApplication.class, args);
    }

    @GetMapping
    public ResponseEntity<?> go(){
        return ResponseEntity.ok("ok");
    }

}
