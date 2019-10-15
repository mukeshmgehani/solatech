package com.hackthon.solatech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.hackthon.solatech.config.FileStorageProperties;

/**
 * 
 * @author hackathon
 *
 */
@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class SolatechApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolatechApplication.class, args);
	}

}
