package in.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.resource.ConfigFile;

import in.mizbah.Student;

public class Main {

	public static void main(String[] args) {
		
	 ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
//	  Student std = (Student) context.getBean("s1");
//	  std.display();
	 
	 Student std = context.getBean(Student.class);
	 std.display();

	}

}
