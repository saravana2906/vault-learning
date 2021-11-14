package com.learn.vault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
	
	
	@Value("${mykey}")
	String mykey;

	@Value("${hello.world}")
	String helloWorld;
	
	
	
	@GetMapping("/test-vault")
	public String testVault() {
		return mykey+ helloWorld;
	}

}
