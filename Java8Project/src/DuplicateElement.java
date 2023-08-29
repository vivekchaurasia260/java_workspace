import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
	public static void main(String[] args) {
		
		List<Integer> element = List.of(17,5,23,2,4,65,32,5,1,4,2);
		
		element.stream().distinct().forEach(System.out::println);
		
		Set<Integer> uniqueEle = element.stream().collect(Collectors.toSet());
		
		System.out.println(uniqueEle);

	}
}
