import java.util.stream.Stream;

public class ConcatTwoStreams {
	public static void main(String[] args) {
		
		Stream stream1 = Stream.of(4,2,56,7,3,6,9);
		
		Stream stream2 = Stream.of(77,66,44,33,22,88);
		
		Stream res = Stream.concat(stream1, stream2);
		
		res.forEach(System.out::println);
		
	}
}
