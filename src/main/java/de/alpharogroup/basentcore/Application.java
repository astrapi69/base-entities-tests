package de.alpharogroup.basentcore;

import de.alpharogroup.basentcore.configuration.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableConfigurationProperties({ ApplicationProperties.class })
public class Application
{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
