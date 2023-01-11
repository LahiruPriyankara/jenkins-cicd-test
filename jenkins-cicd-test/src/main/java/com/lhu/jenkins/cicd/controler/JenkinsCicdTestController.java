package com.lhu.jenkins.cicd.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins-cicd")
public class JenkinsCicdTestController {

	@GetMapping("one")
	public ResponseEntity<String> hitOnGetMethodOne() {
		return ResponseEntity.ok("SUCCESSULLY HIT JenkinsCicdTestController.hitOnGetMethodOne.");
	}

}
