package ru.alexscheduler.logic.model.bo.infrostructure;

public class Room {

	private String number;
	private int floor;
	private boolean hasBoard;
	private boolean hasProjector;
	private boolean isLectureHall;
	private boolean isComputerClass;
	private boolean hasInternetProblem;
	private boolean isLabarotary;
	private int seatCount;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public boolean isHasBoard() {
		return hasBoard;
	}

	public void setHasBoard(boolean hasBoard) {
		this.hasBoard = hasBoard;
	}

	public boolean isHasProjector() {
		return hasProjector;
	}

	public void setHasProjector(boolean hasProjector) {
		this.hasProjector = hasProjector;
	}

	public boolean isLectureHall() {
		return isLectureHall;
	}

	public void setLectureHall(boolean isLectureHall) {
		this.isLectureHall = isLectureHall;
	}

	public boolean isComputerClass() {
		return isComputerClass;
	}

	public void setComputerClass(boolean isComputerClass) {
		this.isComputerClass = isComputerClass;
	}

	public boolean isHasInternetProblem() {
		return hasInternetProblem;
	}

	public void setHasInternetProblem(boolean hasInternetProblem) {
		this.hasInternetProblem = hasInternetProblem;
	}

	public boolean isLabarotary() {
		return isLabarotary;
	}

	public void setLabarotary(boolean isLabarotary) {
		this.isLabarotary = isLabarotary;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

}
