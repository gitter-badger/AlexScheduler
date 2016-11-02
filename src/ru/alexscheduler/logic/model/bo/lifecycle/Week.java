package ru.alexscheduler.logic.model.bo.lifecycle;

import java.util.List;

import ru.alexscheduler.logic.model.bo.common.BaseObject;
import ru.alexscheduler.logic.model.bo.helpers.WeekType;

public class Week extends BaseObject {
	private WeekType weekType;
	private List<Day> days;
	
}
