import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {
	public static void main(String[] args) {
		
		List<Integer> list=List.of(4,2,6,2,5,8,73,23,12,52,21,42);
		List<Integer> res = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		
		System.out.println(res);
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
