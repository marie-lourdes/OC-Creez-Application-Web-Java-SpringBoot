package com.example.webapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.example.webapp")
@Data // les setters et getters ne fonctionne pas meme apres installation du jar lombok et chargemnt du la dependency
public class CustomProperties {
	private String apiUrl;
	
	public String getApiUrl() {
		return apiUrl;
	}
	
}
