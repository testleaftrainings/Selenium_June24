package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	
	public static void main(String[] args) {
		
		
		List<String> names = new LinkedList<String>();
		
		/*LinkedList<String> n = new LinkedList<String>();
//		n.remo
		*/
		
		List<String> mentors = new ArrayList<String>();
		
		names.add("Gokul");
		names.add("Aravind");
		names.add("Raghu");
		names.add("Dilip");
		names.add("Vinoth");
		names.add("Vineeth");
		
		System.out.println(names);
		mentors.addAll(names);
		mentors.addAll(names);
		System.out.println(mentors);
		
		
		mentors.remove(0);
		mentors.remove("Dilip");
//		mentors.removeAll(names);
		System.out.println(mentors);
		System.out.println(mentors.get(2));
		System.out.println(mentors.size());
//		mentors.clear();
		System.out.println(mentors);
		Collections.sort(mentors);
		System.out.println(mentors);
		
	}
	
	
}
