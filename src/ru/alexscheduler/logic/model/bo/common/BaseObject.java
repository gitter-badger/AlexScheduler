package ru.alexscheduler.logic.model.bo.common;

public abstract class BaseObject {
	protected long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
