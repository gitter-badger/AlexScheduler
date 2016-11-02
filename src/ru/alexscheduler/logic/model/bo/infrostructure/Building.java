package ru.alexscheduler.logic.model.bo.infrostructure;

import java.util.List;

import ru.alexscheduler.logic.model.bo.common.BaseObject;

public class Building extends BaseObject {
	private String address;
	private String name;
	private List<Room> rooms;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
