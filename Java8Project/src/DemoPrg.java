import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoPrg {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,5,6,8,11,13,7,12,19,21);
		System.out.println(list);
		
		// num starting 1..
		List<String> res = list.stream().map(s -> s + "").filter(s -> s.charAt(0)=='1').collect(Collectors.toList());
		
		System.out.println(res);
		
		
		
	}
}
