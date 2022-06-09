package javatalk;

public class FindUncommonStringElements {
	
	public void getAnswer() {
		
		// given itemsPurchased and itemsAvailable string arrays and corresponding
		// puchasedItemsUnits and availableItemsCost int arrays 
		// print the list of items that are purchased in UPPERCASE LETTERS seperated by "-" 
		// calculate the total cost of the purchased items and concettane it to the end of the list of items
		// print the list of items that are out of stock in lowercase letters seperated by - and concettanate 0 at the end of the out of stock items list
		
		// ASSUMPTIONS
		
		// make case-insensitive comparison
		// int array units are aligned with corresponding string array items
		// seperate the list of items with -
		// all calculations are done using int values
		
		String [] itemsPurchased = {"miLk", "Chicken", "chips", "coke"};
		String [] itemsAvailable = {"milk", "mAriNERA", "PaSta", "cHIps", "cakE"};
		int [] purchasedItemsUnit = {1,1,2,1};
		int [] availableItemsCost = {10,5,5,17,25};
//		sample output ---> "MILK-CHIPS-44" && "chicken-coke-0"
		
		
		
		String purchasedItems ="";
		String itemsOutOfStock="";
		int totalCost=0;
		int outOfStockCost =0;
		boolean isPurchased = false;
		
		for (int i=0; i<itemsPurchased.length; i++) {
			for (int j=0; j<itemsAvailable.length; j++) {
				if(itemsPurchased[i].equalsIgnoreCase(itemsAvailable[j])) {
					isPurchased=true;
					purchasedItems+=itemsPurchased[i].toUpperCase()+"-";
					totalCost+=purchasedItemsUnit[i]*availableItemsCost[j];
					
				}
				
			}
			if(isPurchased == false) {
				itemsOutOfStock+=itemsPurchased[i].toLowerCase()+"-";
			}
			isPurchased=false;
		}
		
		String finalPurchasedItems = purchasedItems+totalCost;
		String finalItemsNotFound = itemsOutOfStock+outOfStockCost;
		
		System.out.println("checkout items along with total bill: " + finalPurchasedItems);
		System.out.println("items out of stock: " + finalItemsNotFound);
		
		
	}

}
