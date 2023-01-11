package com.lhu.jenkinscicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsCicdTestController {

    @GetMapping("one")
    public ResponseEntity<String> testGetMethodOne() {
        return ResponseEntity.ok("testGetMethodOne");
    }
}
