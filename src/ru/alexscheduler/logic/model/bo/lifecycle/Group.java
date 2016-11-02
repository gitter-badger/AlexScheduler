package ru.alexscheduler.logic.model.bo.lifecycle;

import java.util.List;

import ru.alexscheduler.logic.model.bo.common.BaseObject;
import ru.alexscheduler.logic.model.bo.person.Student;
import ru.alexscheduler.logic.model.bo.person.Teacher;

public class Group extends BaseObject {
	private String name;
	private List<Student> students;
	private Teacher curator;
	private Student captain;
	private int course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getCurator() {
		return curator;
	}
	public void setCurator(Teacher curator) {
		this.curator = curator;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public int getStudentsCount()
	{
		return students.size();
	}
	public void addStudent(Student student)
	{
		students.add(student);
	}
	public List<Student> getStudents()
	{
		return students;
	}

	public Student getCaptain() {
		return captain;
	}
	public void setCaptain(Student captain) {
		this.captain = captain;
	}
}
