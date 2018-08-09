package org.devsjavagirl.meetupmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = "org.devsjavagirl.meetupmvc")
@RestController
@EnableAutoConfiguration
public class MeetupMvcApplication extends SpringBootServletInitializer {

	private static final Class<MeetupMvcApplication> meetupMvcApplicationClass = MeetupMvcApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(MeetupMvcApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(meetupMvcApplicationClass);
    }
	
	
}
