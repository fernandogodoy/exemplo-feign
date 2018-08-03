package br.com.fsg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @author fernando-godoy
 *
 */
@EnableFeignClients
@SpringBootApplication
public class FeignApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplicationStarter.class, args);
	}
}
