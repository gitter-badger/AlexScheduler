package ru.alexscheduler.logic.model.bo.person;

import java.util.List;


public class Teacher extends Person {
	private String scienceDegree;
	private List<Subject> subjects;

	public String getScienceDegree() {
		return scienceDegree;
	}

	public void setScienceDegree(String scienceDegree) {
		this.scienceDegree = scienceDegree;
	}
	
	public int getSubjectsCount()
	{
		return subjects.size();
	}
	public void addSubject(Subject subject)
	{
		subjects.add(subject);
	}
	public List<Subject> getSubjectsList()
	{
		return subjects;
	}
}
