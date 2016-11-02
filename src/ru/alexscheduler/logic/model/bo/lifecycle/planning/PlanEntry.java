package ru.alexscheduler.logic.model.bo.lifecycle.planning;

import java.util.Date;

import ru.alexscheduler.logic.model.bo.person.Subject;

public class PlanEntry {
	private Subject subject;
	private double hours;
	

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
}
