package io.fdlessard.codesamples.uribuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@PropertySource("classpath:applicationFullUrl.properties")
public class UriBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(UriBuilderApplication.class, args);
	}
}
