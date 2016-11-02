package ru.alexscheduler.logic.model.bo.infrostructure;

import java.util.List;

import ru.alexscheduler.logic.model.bo.common.BaseObject;
import ru.alexscheduler.logic.model.bo.lifecycle.Group;
import ru.alexscheduler.logic.model.bo.person.Teacher;

public class Cathedra extends BaseObject {
	private String name;
	private List<Teacher> teachers;
	private List<Group> groups;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
