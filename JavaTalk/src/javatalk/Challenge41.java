package javatalk;

import java.util.ArrayList;
import java.util.List;

public class Challenge41 {
	
	public void getAnswer() {
		List <Integer> bill = new ArrayList<>();
		bill.add(2);
		bill.add(4);
		bill.add(6);
		
		int k =2;		
		int b =3; // Bon Appetit
//		int b = 10; // Brian overcharged Anna by 7
		
		int totalBill =0;
		int itemNotEaten = bill.get(k);
		
		for(int i=0; i<bill.size(); i++) {
			totalBill += bill.get(i);		
			}
	
		int honestBill = totalBill - itemNotEaten;
		
		if(b == honestBill/2) {
			System.out.println("Bon Appetit");
		}
		else {
			System.out.println("Brian overcharged Anna by " + (b - honestBill/2));
		}
		
	}

}
