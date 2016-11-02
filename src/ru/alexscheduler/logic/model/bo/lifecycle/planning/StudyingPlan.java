package ru.alexscheduler.logic.model.bo.lifecycle.planning;

import java.util.Date;
import java.util.List;

public class StudyingPlan {
	private int year;
	private String name;
	private Date startDate;
	private Date endDate;
	private List<PlanEntry> entries;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
