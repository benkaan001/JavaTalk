package javatalk;

public class Challenge49 {
	
	// HackerRank appendAndDelete

	public void getAnswer() {

		String s = "hackerhappy";
		String t = "hackerrank";

		int k = 9;

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < t.length(); j++) {
				while (s.charAt(i) == t.charAt(j)) {
					count++;
					break;
				}
			}
		}

		String shorter = s.length() < t.length() ? s : t;
		String longer = s.length() > t.length() ? s : t;

		int longDiff = longer.length() - (count / 2);
		int shortDiff = shorter.length() - (count / 2);

		if (longDiff + shortDiff == k || shorter.equals(longer)) {
			System.out.println("Yes");
		} else {

			System.out.println("No");
		}

	}

}
