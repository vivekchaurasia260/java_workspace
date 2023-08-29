import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOpr {
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(2, 3);
		map.put(1, 3);
		map.put(5, 1);
		map.put(4, 6);
		map.put(3, 2);
		map.put(8, 1);
		
		Integer value = map.entrySet().stream().filter(m -> m.getValue()==1).findFirst().get().getValue();
		
		System.out.println(value);
		
	}

}
