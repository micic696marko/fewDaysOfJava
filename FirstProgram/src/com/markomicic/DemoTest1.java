package com.markomicic;

import java.util.Scanner;

public class DemoTest1 {

    public static void main(String[] args) {
	System.out.println("Enter your name");

	Scanner scanner = new Scanner(System.in);
	
	int i = 0;
	
	do {
	    System.out.println("i is: " + i);
	} while( i < 10);
	scanner.close();
    }
}
