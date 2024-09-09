package com.example.exam_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Exam1Application {

@GetMapping("/welcome")
	public String welcome(){
		return " hi this is 1 page";
	}

//	echo "# git-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Surbhi22533/git-example.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(Exam1Application.class, args);
	}

}
