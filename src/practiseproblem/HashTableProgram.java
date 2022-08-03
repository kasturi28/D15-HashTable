package practiseproblem;

import java.util.HashMap;
import java.util.Map;

public class HashTableProgram {

		
	    // Defining remove method
	
	    static void remove(String str, String word)
	    {
	        // Spliting the string using split() method
	        String msg[] = str.split(" ");
	        String new_str = "";
	 
	        // Iterating the string using for each loop
	        for (String words : msg) {
	 
	            // If desired word is found
	            if (!words.equals(word)) {
	 
	                // Concat the word not equal to the given
	                // word
	                new_str += words + " ";
	            }
	        }
	 
	        // Printing the original String & modified string
	        
	        System.out.println("Oringinal string : " +str);
	        System.out.println("Modified string : " +new_str);
	    }
	 
	    // Calling remove method to remove word avoidable
	    
	    public static void main(String[] args)
	    {
	        // Custom string as input
	        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
	 
	        // Word to be removed from above string
	        String word = "avoidable";
	 
	        // Calling the method remove 
	        remove(str, word);
       
	}

}
