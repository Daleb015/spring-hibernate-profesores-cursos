package com.daleb.Hibernate.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import com.daleb.Hibernate.model.Teacher;

public class TeacherDaoImpl extends DalebSession implements TeacherDao {

	private DalebSession session;

	public TeacherDaoImpl() {

		session = new DalebSession();

	}

	public void saveTeacher(Teacher teacher) {
		session.getSession().save(teacher);
		session.getSession().getTransaction().commit();
	}

	public List<Teacher> findAllTeachers() {

		return session.getSession().createQuery("from Teacher", Teacher.class).list();

	}

	public void deleteTeacherById(Long idTeacher) {
		Teacher temp = session.getSession().load(Teacher.class, idTeacher);
		session.getSession().delete(temp);
		session.getSession().getTransaction().commit();
	}

	public void updateTeacher(Teacher teacher) {
		session.getSession().merge(teacher);
		session.getSession().update(teacher);
		session.getSession().getTransaction().commit();
	}

	public Teacher findById(Long idTeacher) {

		return session.getSession().find(Teacher.class, idTeacher);
	}

	public List<Teacher> findByName(String name) {

		TypedQuery<Teacher> sql = session.getSession().createQuery("from Teacher where name = :name", Teacher.class);

		List<Teacher> teachers = sql.setParameter("name", name).getResultList();

		return teachers;

	}

}
