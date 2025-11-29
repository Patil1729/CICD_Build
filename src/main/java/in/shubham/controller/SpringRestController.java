package in.shubham.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringRestController {

	@GetMapping("/h")
	public ResponseEntity<String> greeting(){
		return new ResponseEntity<String> ("Welcome to CICD SpringBoot",HttpStatus.OK);
	}
}

/*
 *
 * 
 * echo "# CICD_Build" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Patil1729/CICD_Build.git
git push -u origin main
 * 
 * */
 