package in.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.mizbah.Student;

@Configuration
public class ConfigFile {
	
	@Bean
	public Student s1()
	{
		Student obj = new Student();
		obj.setName("Mizbah");
		obj.setRoll(1001);
		obj.setEmail("miz@gmail.com");
		
		return obj;
	}

}
