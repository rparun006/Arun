package COLLECTION;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[]args) {
		Student s=new Student("arun",01,16,true);
		Student s1=new Student("rps",02,18,true);
		Student s2=new Student("miithra",03,7,false);
		Student s3=new Student("kavi",04,8,true);
		ArrayList<Student> stud=new ArrayList<>();
		stud.add(s);
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		ArrayList<Student> female=new ArrayList<>();
		for(Student X:stud) {
			if(X.getIsMale()==false) {
				female.add(X);
			}
		}
		female.forEach(x->System.out.println(x));
		ArrayList<Student> rollNo=new ArrayList<>();
		for(Student M:stud) {
			if(M.getRollNo()<2&&M.getRollNo()<5) {
				rollNo.add(M);
				
			}
			
		}
		rollNo.forEach(x->System.out.println(x));
		ArrayList<Student>length=new ArrayList<>();
		for(Student L:stud) {
			if(L.getName().length()>4) {
				length.add(L);
				
				
			}
		}
		length.forEach(x->System.out.println(x));
		ArrayList<Student>odd=new ArrayList<>();
		for(Student H:stud) {
			if(H.getName().length()%2!=0) {
				odd.add(H);
			}
		}
		odd.forEach(x->System.out.println(x));
		ArrayList<Student>count=new ArrayList<>();
		for(Student K:stud) {
			if(K.getName().length()%2==0){
				count.add(K);
			}
		}
				count.forEach(x->System.out.println(x));
				ArrayList<Student>count1=new ArrayList<>();
				int c=0;
				for(Student A:stud) {
						c=A.getName().length();
						System.out.println(c+A.getName());
						
						
					}
				}
				
				
			}
		
	
