package factory.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PointConfig {
	
	@Bean
	public Point pointZero() {
		return new Point(0, 0);
	}
	
	@Bean
	public Point pointXOnly() {
		return new Point(20, 0);
	}
	
	@Bean
	public Point pointYOnly() {
		return new Point(0, 20);
	}
}
