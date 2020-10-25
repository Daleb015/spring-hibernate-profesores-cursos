package com.daleb.Hibernate;

import java.util.List;

import com.daleb.Hibernate.dao.TeacherDaoImpl;
import com.daleb.Hibernate.model.Teacher;

public class App {

  public static void main(String[] args) {

    TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();

    // teacherDaoImpl.saveTeacher(teacher);
    List<Teacher> lista = teacherDaoImpl.findAllTeachers();

    for (Teacher tmp : lista) {
      System.out.println(tmp);
    }
    
    List<Teacher> teachers = teacherDaoImpl.findByName("Daniel Lineros");
    
    System.out.println(teachers);

  }
}
