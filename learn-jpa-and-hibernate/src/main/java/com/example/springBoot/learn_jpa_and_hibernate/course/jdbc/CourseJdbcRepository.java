package com.example.springBoot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springBoot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate jdbcTemp;
	private static String INSERT_QUERY = """

			INSERT INTO COURSE (id,name,author) values (?,?,?);
			""";
	private static String DELETE_QUERY = """

			DELETE FROM COURSE WHERE ID= ?;
			""";

	public void insert(Course course) {
		jdbcTemp.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteById(long id) {
		jdbcTemp.update(DELETE_QUERY, id);
	}
}
