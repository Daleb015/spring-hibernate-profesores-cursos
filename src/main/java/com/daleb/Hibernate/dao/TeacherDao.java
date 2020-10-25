package com.daleb.Hibernate.dao;

import java.util.List;

import com.daleb.Hibernate.model.Teacher;

public interface TeacherDao {
	
	void saveTeacher(Teacher teacher);
	
	List<Teacher> findAllTeachers(); 
	
	void deleteTeacherById(Long idTeacher);
	
	void updateTeacher(Teacher teacher);
	
	Teacher findById(Long idTeacher);
	
	List<Teacher> findByName(String name);
	
}
