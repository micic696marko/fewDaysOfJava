package com.markomicic;

import java.util.LinkedList;

public class DemoTest1 {

    public static void main(String[] args) {
	
	LinkedList<String> names = new LinkedList<String>();
	names.push("Medo");
	names.push("Bebo");
	names.push("Dino");
	
	System.out.println(names.pop());
	System.out.println(names.pop());
	System.out.println(names.pop());
    }
}
