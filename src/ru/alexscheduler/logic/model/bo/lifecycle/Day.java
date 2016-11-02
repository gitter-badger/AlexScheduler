package ru.alexscheduler.logic.model.bo.lifecycle;

import java.util.Date;
import java.util.List;

import ru.alexscheduler.logic.model.bo.common.BaseObject;

public class Day extends BaseObject {
	private Date date;
	private String name;
	private List<Pair> pair;
}
