package factory.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Drawing {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ShapeConfig.class, PointConfig.class);
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		System.out.println(triangle);
	}
}
