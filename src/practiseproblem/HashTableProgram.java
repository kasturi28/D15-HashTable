package practiseproblem;

import java.util.HashMap;
import java.util.Map;

public class HashTableProgram {

	public static void main(String args[]) {

		// Declaring the String
		String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

		// Declaring a HashMap of <String, Integer>
		Map<String, Integer> hashMap = new HashMap<>();

		// Splitting the words of string
		// and storing them in the array.
		String[] words = str.split(" ");

		for (String word : words) {

			// Asking whether the HashMap contains the
			// key or not. Will return null if not.
			Integer integer = hashMap.get(word);

			if (integer == null)
				// Storing the word as key and its
				// occurrence as value in the HashMap.
				hashMap.put(word, 1);

			else {
				// Incrementing the value if the word
				// is already present in the HashMap.
				hashMap.put(word, integer + 1);
			}
		}
		System.out.println(hashMap);

		// code to remove whitespaces
		String newStr = str.replaceAll(" ", "");

		Map<Character, Integer> numCount = new HashMap<Character, Integer>(Math.min(newStr.length(), 26));

		System.out.println("The count is: ");
		for (int i = 0; i < newStr.length(); i++) {
			char charAt = newStr.charAt(i);
			if (!numCount.containsKey(charAt)) {
				numCount.put(charAt, 1);
			} else {
				numCount.put(charAt, numCount.get(charAt) + 1);
			}
		}
		System.out.println(numCount);

	}

}
