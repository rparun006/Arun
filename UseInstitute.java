package COLLECTION;

import java.util.ArrayList;

public class UseInstitute {
	public static void main(String[]args) {
		Institute ins=new Institute("rp",3,12000,5);
		Institute ins1=new Institute("kp",2,17000,3);
		Institute ins2=new Institute("ky",4,18999,7);
		Institute ins3=new Institute("ty",2,18000,4);
		Institute ins4=new Institute("sh",3,6778,3);
		Institute ins5=new Institute("hs",4,19000,7);
		Institute ins6=new Institute("khg",2,18000,7);
		Institute ins7=new Institute("hsa",8,198000,7);
		Institute ins8=new Institute("hsl",8,12000,5);
		Institute ins9=new Institute("hsw",1,19000,3);
		Institute ins10=new Institute("hsf",1,13000,3);
		Institute ins11=new Institute("hse",3,12000,7);
		ArrayList<Institute> list=new ArrayList<>();
		list.add(ins);
		list.add(ins1);
		list.add(ins2);
		list.add(ins3);
		list.add(ins4);
		list.add(ins5);
		list.add(ins6);
		list.add(ins7);
		list.add(ins8);
		list.add(ins9);
		list.add(ins10);
		list.add(ins11);
		ArrayList<Institute> name=new ArrayList<>();
		for(Institute X:list) {
			if(X.getFees()>12000&&X.getNoOfCourse()>3) {
				name.add(X);
			}
		}
		System.out.println(name) ;
		ArrayList<Institute> name1=new ArrayList<>();
		list.forEach(x->{
			if(x.getDuration()%2==0) {
				
			}
		});
	}
}
	

	

