package Java8Demo;

import java.util.StringJoiner;

public class Java8Examples {
	
	public static void main(String[] args) {
		
		StringJoiner joinNames = new StringJoiner(",","[", "]");
		
		joinNames.add("Vivek");
		joinNames.add("Rahul");
		joinNames.add("Vijayata");
		joinNames.add("Neeraj");
		
		System.out.println(joinNames);
		
		joinNames.add("Kiran");
		
		System.out.println(joinNames);
		
		// merging of two joiners
		
		StringJoiner joinNames2 = new StringJoiner(":", "[", "]");
		
		joinNames2.add("Peter");
		joinNames2.add("Ram");
		
		StringJoiner merge = joinNames.merge(joinNames2);
		System.out.println("Merging two StringJoiner " +merge);
		
	}
}
