package com.example.springBoot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springBoot.learn_jpa_and_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"Java","Telusko"));
		repository.insert(new Course(2,"AWS","Edureka"));
		repository.insert(new Course(3,"Microservice","in 28 Minutes"));
		repository.insert(new Course(4,"Azure","Leete Code"));
		repository.insert(new Course(5,"DevOps","Code with Harry"));
		repository.insert(new Course(6,"Data Science","Telusko"));
		repository.deleteById(1);
	}

}
