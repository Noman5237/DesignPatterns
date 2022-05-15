package factory.spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class Triangle {
	
	@Qualifier ("pointZero")
	@Autowired
	private Point pointA;
	
	@Qualifier ("pointXOnly")
	@Autowired
	private Point pointB;
	
	@Qualifier ("pointYOnly")
	@Autowired
	private Point pointC;
	
	public void draw() {
		System.out.println("Triangle drawn");
	}
}
