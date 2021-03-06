package com.script.manager;

import java.util.List;

import com.script.entity.Teacher;

public interface TeacherManager {

	public Teacher getTeacher(String id);
	
	public List<Teacher> getAllTeacher();
	
	public void addTeacher(Teacher teacher);
	
	public boolean delTeacher(String id);
	
	public boolean updateTeacher(Teacher teacher);
}
