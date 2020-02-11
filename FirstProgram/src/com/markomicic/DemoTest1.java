package com.markomicic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoTest1 {

    public static void main(String[] args) throws FileNotFoundException {
	Scanner scanner = new Scanner(new File("students.txt"));
	
	List<String> students = new ArrayList<String>();
	
	while(scanner.hasNextLine()) {
	    students.add(scanner.nextLine());
	}
	
	for(int i =0; i < students.size(); i++) {
	    System.out.println("name: " + students.get(i));
	}
	scanner.close();
    }
}
