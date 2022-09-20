package COLLECTION;

import java.util.ArrayList;

public class UseEmployee {
public static void main(String[]args) {
	Employee e=new Employee("arun",24,101,30000,true);
	Employee e1=new Employee("rp",25,102,34000,true);
	Employee e2=new Employee("praveen",34,103,40000,true);
	Employee e3=new Employee("dk",23,104,34555,false);
	Employee e4=new Employee("Kaviya",22,105,35666,false);
	ArrayList<Employee> list=new ArrayList<>();
	list.add(e);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	for(Employee X:list) {
		System.out.println(X);
	}
	list.forEach(x->System.out.println(x));
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i).getSalary()>30000&&list.get(i).getSalary()<=50000) {
			System.out.println(list.get(i));

		}
	}
	list.forEach(x->{
	if(x.getAge()>23) {
		System.out.println(x.getName());
	}
		
	});		
	int min=list.get(0).getAge();
	String temp="";
	for(int i=0;i<list.size();i++) {
		if(list.get(i).getAge()<min) {
			min=list.get(i).getAge();
		temp=list.get(i).getName();
		
		}
		
	}
	System.out.println(temp);
	
	for(int i=0;i<list.size();i++) {
		if(list.get(i).getIsMale()==false) {
			
			System.out.println(list.get(i).getName());
		}
	}
	list.forEach(x-> {
		if(x.getName().startsWith("K")) {
			System.out.println(x.getName());
		}
	});
	

	
	
	
}
	
}

