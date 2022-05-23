package com.eval1;
public class Question1 {
  public static void main(String[] args) {
		/*
		 * String:- A string is an Object which represents the order of characters.
		 *  Why strings are immutable? 
		 *  Strings are immutable in java because Weak cannot change that string. 
		 *  Difference Between String And String Builder?
		 *  String Builder:-A mutable order of characters is known as String builder.
		 *  Strings are immutable but StringBuilder is mutable.
		 *  String Builder performance is faster than string.
		 *  String Builder takes less memory than string.
		 */
	  
	  // Write some example of method of String?
	  String s = "Kim gonna out";
	  System.out.println(s.substring(5));
	  System.out.println(s.length());
	  System.out.println(s.indexOf('o'));
	  System.out.println(s.charAt(8));
	  System.out.println(s.trim());
	  System.out.println(s.toLowerCase());
	  System.out.println(s.toUpperCase());
	
  }
}
