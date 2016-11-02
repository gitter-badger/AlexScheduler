package ru.alexscheduler.logic.model.bo.infrostructure;

import java.util.List;

import ru.alexscheduler.logic.model.bo.common.BaseObject;

public class Faculty extends BaseObject {
	private String name;
	private List<Cathedra> cathedras;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCathedrasCount() {
		return cathedras.size();
	}

	public void addCathedra(Cathedra cathedra) {
		cathedras.add(cathedra);
	}

	public List<Cathedra> getCathedrasList() {
		return cathedras;
	}
}
