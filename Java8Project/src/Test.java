import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(5,3,4,1,6,2,9,11,7,10,8);
		
		// number grater than 4.
		
		System.out.println("Actual list " +list);
		
		List<Integer> byUsingFilterItr = list.stream().filter(num -> num>2).collect(Collectors.toList());
		
		List<Integer> byUsingFunctionalInr = list.stream().map(num -> num*2).collect(Collectors.toList());
		
		System.out.println(byUsingFilterItr);
		
		System.out.println(byUsingFunctionalInr);
		
		
		String str = "absbbaabdhdbaba";
		
		Map<String, Long> freq = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(freq);
		
		freq.entrySet().forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));
		
	}
}
