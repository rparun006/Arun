package COLLECTION;

import java.util.ArrayList;

public class Student1 {
	public static void main(String[]args) {
		ArrayList <Integer> stdId=new ArrayList <> ();
		stdId.add(101);
		stdId.add(102);
		stdId.add(103);
		stdId.add(104);
		stdId.add(105);
		for(int i=0;i<stdId.size();i++) {
			System.out.println(stdId.get(i));
			
		}
			
		
		for(int i=stdId.size()-1;i>=0;i--) {
			System.out.println(stdId.get(i));
		}
		
		for(int i=0;i<stdId.size();i++) {
		
		
			if(stdId.get(i)%2==0) {
				System.out.println(stdId.get(i)+" even num");
			
	}
			else {
				System.out.println(stdId.get(i)+" odd num");
			}
		}
		int max=0;
		for(int i=0;i<stdId.size();i++) {
			if(stdId.get(i)>max) {
				max=stdId.get(i);
			
			}
			
		}
		System.out.println(max);
	}
			


	}

