package Java8Demo;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		random.ints().limit(10).forEach(System.out::println);
	}
}
