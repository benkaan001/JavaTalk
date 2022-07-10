package javatalk;

import java.util.HashMap;

public class Challenge59 {
	

	public void getAnswer() {
		
		int [] inputArray = {1,2,3,1,7,8,9,1,20,1};
		
		HashMap<Integer,Integer> hashy = new HashMap<>();
		
		int minDistance = Integer.MAX_VALUE;
		int prevIndex = 0;
		int currentIndex = 0;
		
		int answer=0;
		
		for (int i=0; i<inputArray.length; i++) {
			if(hashy.containsKey(inputArray[i])) {
				currentIndex = i;
				prevIndex =hashy.get(inputArray[i]);
				minDistance = Math.min(minDistance, (currentIndex-prevIndex));
				
			}
			// regardless if the key exists or not, must insert the key
			hashy.put(inputArray[i], i);
//			System.out.println(hmap);
			
			/*
			 			{1=0}
			            {1=0, 2=1}
						{1=0, 2=1, 3=2}
						{1=3, 2=1, 3=2}
						{1=3, 2=1, 3=2, 7=4}
						{1=3, 2=1, 3=2, 7=4, 8=5}
						{1=3, 2=1, 3=2, 7=4, 8=5, 9=6}
						{1=7, 2=1, 3=2, 7=4, 8=5, 9=6}
						{1=7, 2=1, 3=2, 20=8, 7=4, 8=5, 9=6}
						{1=9, 2=1, 3=2, 20=8, 7=4, 8=5, 9=6}
			 */
		}
		
		if (minDistance == Integer.MAX_VALUE) {
			
			answer = -1;
			
		} else {
			answer = minDistance;
		}
		
		
		System.out.println(answer);
	}

}
