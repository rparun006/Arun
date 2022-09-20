package COLLECTION;

import java.util.ArrayList;

public class Pencil {
	public static void main(String[]args) {
		ArrayList<String>p=new ArrayList<>();
		p.add("rp");
		p.add("arun");
		p.add("reyno");
		p.add("hp");
		p.add("lp");
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i));
		}
		for(int i=p.size()-1;i>=0;i--) {
			System.out.println(p.get(i));
		}
		for(String X:p) {
			System.out.println(X);
		}
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i).charAt(0));
			
			}
		for(int i=p.size()-1;i>=0;i--) {
			System.out.println(p.get(i).charAt(p.get(i).length()-1));
		}
		int max=0;
		String String="";
		
		for(int i=0;i<p.size();i++) {
			if(p.get(i).length()>max) {
				max=p.get(i).length();
				String=p.get(i);
			}
			}
			System.out.println(String);
			p.forEach(x->System.out.println(x));
		}
		
	}
	


