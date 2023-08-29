import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiplyElement {
	public static void main(String[] args) {
		List<Integer> list = List.of(4,1,7,3,8,3,9,0,2,5);
		System.out.println(list);
		List<Integer> result = Stream.of(4,1,7,3,8,3,9,0,2,5).map(ele -> ele*6).collect(Collectors.toList());
		System.out.println(result);
	}
}
