import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BubbleSort {
	public static void main(String[] args) {
		
//		int[] arr = {5,1,3,7,4,8};
//		
//		
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//				
//			}
//		}
//		
//		for(int x : arr) {
//			System.out.print(x+" ");
//		}
		
	//	System.out.println();
		// unique element int arr.
		// 10, 20, 30, 40, 50, 10, 20;
		
		int arr[] = {10, 20, 30, 40, 50, 10, 20};
//		int i,j;
//		boolean flag=false;
//		
//		for(i=0; i<arr.length-1; i++) {
//			flag=true;
//			for(j=i+1; j<arr.length; j++) {
//				if(arr[i]==arr[j] && arr[i]!=-1) {
//					arr[i]=-1;
//					arr[j]=-1;
//					flag=false;
//					break;
//				}
//			}
//			if(flag && arr[i]!=-1)
//				System.out.println(arr[i]);
//		}
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int k=0; k<arr.length; k++) {
			int temp=map.getOrDefault(arr[k], 0);
			map.put(arr[k], ++temp);
			
		}
		
		//map.entrySet().iterator().
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1)
				System.out.println(entry.getKey());
		}
	
	}
}
