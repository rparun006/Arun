package COLLECTION;

public class Institute {
	private String name;
	private int noOfCourse;
	private int fees;
	private int duration;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setNoOfCourse(int noOfCourse) {
		this.noOfCourse=noOfCourse;
	}
	public int getNoOfCourse() {
		return noOfCourse;
	}
	public void setfees(int fees) {
		this.fees=fees;
	}
	public int getFees() {
		return fees;
	}
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	public Institute(String name,int noOfCourse,int fees,int duration) {
		this.name=name;
		this.noOfCourse=noOfCourse;
		this.fees=fees;
		this.duration=duration;
	}
	public String toString() {
		return name+","+noOfCourse+","+fees+","+duration;
	}
		
	}


