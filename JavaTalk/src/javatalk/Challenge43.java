package javatalk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge43 {
	/*
	 Mark has only a certain amount to spend, and he wants to maximize the number of toys 
	 he buys with this money. Given a list of toy prices and 
	 an amount to spend, determine the maximum number of gifts he can buy.
	 
	 Example prices = [1,2,3,4]
	 k=7
	 The budget is 7 units of currency. He can buy items that cost [1,2,3]  for 6, 
	 or [3.4]  for 7 units. The maximum is 3 items.
	 
	 Sample Input:
	 k = 50
     prices = 1 12 5 111 200 1000 10
     
     Expected Output :
     4
	 
	 */
	
	public void getAnswer() {
		
		List <Integer> prices = new ArrayList<>();
		prices.add(1);
		prices.add(12);
		prices.add(5);
		prices.add(111);
		prices.add(200);
		prices.add(1000);
		prices.add(10);
		
		int k = 50;
		
		int count=0;
		int total =0;
		prices.sort(null);
			while(total <= k) {
				for (int i=0; i<prices.size(); i++) {
				total +=prices.get(i);
				if(total > k) {
					break;
				}
//				System.out.println(total); // 1, 6, 16, 28
				count++;
			}
			
		}
		
		System.out.println("Solution using ArrayList: " + count); // 4
		
		// solution using Arr 
		
		int [] priceArr = {1,12,5,111,200,1000,10};
		int budget =50;
		int maxTotal =0;
		int toyCount =0;
		
		Arrays.sort(priceArr);
		
			while(maxTotal <=budget) {
				for( int i=0; i< priceArr.length; i++) {
					maxTotal += priceArr[i];
					if(maxTotal > budget) {
						break;
					}
					toyCount++;
				
			
			}
		}
		
		System.out.println("Toy count using int Arr is: " + toyCount);
		
	}
	

}
