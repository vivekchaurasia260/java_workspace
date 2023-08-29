package com.array.problems;

public class MinimumJumps {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int N = arr.length;
		
		int minimumJumps = minimumJumps(arr, N);
		System.out.println(minimumJumps);
	}
	
	public static int minimumJumps(int[] nums, int N)
	{
		int jumps = 0;
        int pos = 0;
        int dest = 0;

        for(int i=0; i<nums.length-1; i++)
        {
            dest = Math.max(dest, nums[i]+i);
            
            if(pos == i)
            {
                pos = dest;
                jumps++;
            }
        }
        
        return jumps;
	}
	
//	public static int minimumJumps(int[] arr, int N)
//	{
//		if(arr.length <= 1)
//		{
//			return 0;
//		}
//		
//		// If value of first index gurantees
//		// only 1 jump is needed, return 1
//		if(arr[0] >= N-1)
//		{
//			return 1;
//		}
//		
//		// return -1 if not possible to jump
//		if(arr[0] == 0)
//		{
//			return -1;
//		}
//		
//		// initialization
//		int maxReach = arr[0];
//		int step = arr[0];
//		int jumps = 1;
//		
//		// start traversing array
//		for(int i=1; i<N; i++)
//		{
//			// check if we have reached the end of the array
//			if(i == N-1)
//			{
//				return jumps;
//			}
//			
//			// check if value at current gurantees jump to end
//			if(arr[i] >= (N-1)-i)
//			{
//				return jumps + 1;
//			}
//			
//			// updating maxReach
//			maxReach = Math.max(maxReach, i+arr[i]);
//			
//			// we use a step to get to the current index
//			step--;
//			
//			// If no further step left
//			if(step == 0)
//			{
//				// we must have used a jump
//				jumps++;
//				
//				// check if the current index/position or lesser index
//				// is the maximum reach point from the previous indexes
//				
//				if(i >= maxReach)
//					return -1;
//				
//				// re-initialize the steps to the amount
//                // of steps to reach maxReach from position i.
//                step = maxReach - i;
//				
//			}
//		}
//		
//		return -1;
//	}
}
