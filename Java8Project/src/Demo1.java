import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		
		// custom imm
		int id;
		String name;
		List<Integer> ph;

//final class A
//{
//	int id;
//	String name;
//	List<Integer> ph;
//	
//	
//}


//Interface I {
//	
//	// single abstract 
//	public void m1();
//	
//}

// integer list 

//Sq(odd);

//List<Integer> list = [1,4,25,6];

//List<Integer> res = list.stream().filter(num -> num%2!=0).map(num -> )


// l1 l2;

List<Integer> list1 = List.of(1,2,44,55); 
List<Integer> list2 = List.of(12,5,44,66,444);

// 44
for(int i=0; i<list1.size(); i++) {
	
	for(int j=0; j<list2.size(); j++) {
		
		if(list1.get(i).compareTo(list2.get(j))==0)
		{
			System.out.println(list1.get(i));
		}
		
	}
	
}

	}
}



























