package ru.alexscheduler.logic.model.bo.lifecycle;

import java.util.List;

import ru.alexscheduler.logic.model.bo.common.BaseObject;

public class Schedule extends BaseObject {
	private String version;
	private int semesterNumber;
	private List<Week> weeks;
}
