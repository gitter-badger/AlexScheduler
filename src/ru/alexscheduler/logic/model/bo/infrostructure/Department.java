package ru.alexscheduler.logic.model.bo.infrostructure;

import java.util.List;

import ru.alexscheduler.logic.model.bo.common.BaseObject;

public class Department extends BaseObject {
	private List<Building> buildings;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBuildingsCount() {
		return buildings.size();
	}

	public List<Building> getBuildingsList() {
		return buildings;
	}

	public void addBuilding(Building building) {
		buildings.add(building);
	}

}
