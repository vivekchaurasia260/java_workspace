import java.util.List;
import java.util.stream.Stream;

public class StringCount {
	public static void main(String[] args) {
		
		List<String> list = List.of("Sr", "Jyoo", "Dnd", "Pankaj", "Arjun");
		long count = Stream.of("Sr", "Jyoo", "Dnd", "Pankaj", "Arjun").filter(str -> str.length() <= 3).count();
		System.out.println(count);
		
		// printing the String whose length is smaller than 3..
		
		list.stream().filter(str -> str.length() < 3).forEach(str -> System.out.println(str));
	}
}
