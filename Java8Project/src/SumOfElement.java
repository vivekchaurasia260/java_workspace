import java.util.List;

public class SumOfElement {
	public static void main(String[] args) {
		List<Integer> element = List.of(2,42,2,123,42,214,42,2,4);
		int sum = element.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
		
	}
}
