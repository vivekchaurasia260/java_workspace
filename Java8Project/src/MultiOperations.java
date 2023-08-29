import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MultiOperations {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(3,5,1,7,6,4,9,2,8,3,1,6,5);
		
		list.stream().map(ele -> ele*ele*ele).filter(ele -> ele > 50).forEach(System.out::println);
		
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<list.size(); i++)
		{
			int temp = map.getOrDefault(list.get(i), 0);
			map.put(list.get(i), ++temp);
		}
		
		System.out.println(map);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		
	}
}
