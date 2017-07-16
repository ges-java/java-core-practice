package com.ges.example;

public class LoopsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		for (int c = 1; c <= 10; c++) {
			if (c == 9) {
				break;
			}
			if (c % 3 == 0) {				
				continue;
			} else {
				System.out.println(c);
			}
		}
		while (i < 10) {
			i++;
			if (i == 9) {
				break;
			}
			if (i % 3 == 0) {				
				continue;
			} else {
				System.out.println(i);
			}			
		}
	}

}
