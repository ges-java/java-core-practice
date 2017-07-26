package com.ges.practice;

import java.util.Arrays;

public class AnagramsChecker {
	
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "helol";
		System.out.println(isAnagram(s1,s2));
	}
	
	public static boolean isAnagram(String s1, String s2) {
		if (s1 == null || s2 == null) {
			return false;
		}
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);		
		if (String.valueOf(chars1).equals(String.valueOf(chars2))) {
			return true;
		} else {
			return false;
		}
	}

}
