package ru.alexscheduler.logic.model.bo.lifecycle;

import java.util.Date;
import java.util.List;

import javax.security.auth.Subject;

import ru.alexscheduler.logic.model.bo.common.BaseObject;
import ru.alexscheduler.logic.model.bo.infrostructure.Room;
import ru.alexscheduler.logic.model.bo.person.Teacher;

public class Pair extends BaseObject {
	private String name;
	private int counter;
	private Date startTime;
	private Date endTime;
	private Subject subject;
	private Teacher teacher;
	private List<Group> groups;
	private List<Absence> absences;
	private Room room;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
}
