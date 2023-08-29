import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxMinFromList {
	public static void main(String[] args) {
		
		Integer min = Stream.of(4,5,2,1,8,6,16,-3,21,2).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		
		//max from the list
		
		Integer max = Stream.of(4,5,2,1,8,6,16,-3,21,2).max(Comparator.comparing(i -> Integer.valueOf(i))).get();
		
		System.out.println(max);
	}
}
