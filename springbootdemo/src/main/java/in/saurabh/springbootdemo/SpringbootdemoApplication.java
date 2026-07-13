package in.saurabh.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
		Student student = context.getBean(Student.class);
		student.setName("Saurabh");
		student.setAge(20);

		System.out.println("Name: "+student.getName()+", Age: "+student.getAge());

	}

}
