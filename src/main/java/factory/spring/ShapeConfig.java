package factory.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapeConfig {
	
	@Bean
	public Triangle triangle() {
		return new Triangle();
	}
}
