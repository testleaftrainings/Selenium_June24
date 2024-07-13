package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	
	/**
	 * Set will not allow duplicate values, it accept only unique values
	 * get() is not available in Set.
	 * 
	 * implementation Class
	 * LinkedHashSet --> Maintain the order
	 * HashSet --> random order by using hashing algorithim
	 * TreeSet ---> Sort based on ASCII value
	 */
	public static void main(String[] args) {
		
		Set<Integer> numbers1 = new LinkedHashSet<Integer>();
		numbers1.add(7);
		numbers1.add(2);
		numbers1.add(5);
		numbers1.add(11);
		numbers1.add(5);
		System.out.println(numbers1.remove(5));
		System.out.println(numbers1);
		
		
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(11);
		numbers.add(1);
		numbers.add(4);
		numbers.add(7);
		numbers.add(2);
		numbers.add(5);
		numbers.add(11);
		numbers.add(5);
		numbers.add(6);
		numbers.add(9);
		numbers.add(8);
		System.out.println(numbers);
		
		
		Set<String> names1 = new LinkedHashSet<String>();
		names1.add("Gokul");
		names1.add("ragu");
		names1.add("vinoth");
		names1.add("Vineeth");
		names1.add("Muthu");
		names1.add("Mukesh");
		names1.add("Ajay");
		System.out.println("LinkedHashSet: "+names1);
		
		Set<String> names2 = new HashSet<String>();
		names2.add("Gokul");
		names2.add("ragu");
		names2.add("vinoth");
		names2.add("Vineeth");
		names2.add("Muthu");
		names2.add("Mukesh");
		names2.add("Saranya");
		System.out.println("HashSet: "+names2);
		
		Set<String> names3 = new TreeSet<String>();
		names3.add("Gokul");
		names3.add("ragu");
		names3.add("vinoth");
		names3.add("Vineeth");
		names3.add("Muthu");
		names3.add("Mukesh");
		names3.addAll(names2);
		names3.removeAll(names1);
		System.out.println("TreeSet: "+names3);
		
	
		System.out.println(names1.contains("ajay"));
		
		
		List<String> names = new ArrayList<String>(names1);
		/*
		 * names.addAll(names1); names.addAll(names2); names.addAll(names3);
		 */
		
		System.out.println(names);
		System.out.println(names.get(6));
		
		
	}
	
}
