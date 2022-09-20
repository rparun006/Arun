package COLLECTION;

import java.util.ArrayList;

public class ReplaceNo {
	public static void main(String[]args) {
	ArrayList<Integer> a=new ArrayList<>();
	a.add(5);
	a.add(7);
	a.add(8);
	a.add(5);
	a.add(14);
	a.add(13);
	a.add(16);
	a.add(12);
	a.add(11);
	a.add(18);
	for(int i=0;i<a.size();i++){
		if(a.get(i)%2!=0) {
			a.set(i,2);
		}
			
		}
	System.out.println(a);
	}
	

}
