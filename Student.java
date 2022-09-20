package COLLECTION;

public class Student {
	private String name;
	private int rollNo;
	private int age;
	private boolean isMale;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
	return age;
	}
	public void setIsMale(boolean isMale) {
	this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public Student(String name,int rollNo,int age,boolean isMale) {
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.isMale=isMale;
	}
	public String toString() {
		return name+","+rollNo+","+age+","+isMale;
	}
	
	}
	


