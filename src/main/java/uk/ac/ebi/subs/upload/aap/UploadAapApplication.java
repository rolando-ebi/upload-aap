package uk.ac.ebi.subs.upload.aap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration(exclude = uk.ac.ebi.tsc.aap.client.security.AAPWebSecurityAutoConfiguration.class)
public class UploadAapApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadAapApplication.class, args);
	}
}
