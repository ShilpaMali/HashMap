package com.velocity.hashmap;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap hm = new HashMap(); // it will create hashmap with 16 capacity
		hm.put(10, "ram"); //put() is used to add elements
		hm.put(20, "shyam");
		hm.put(15, "vikas");
		hm.put(25, "yogesh"); //String,String-Integer,Integer,
		// first way
		//hm.put(null,"sandip"); //can we pass key as null in hashmap ? yes we can 
		//hm.put(40,null); //can we pass value as null in hashmap ? yes
		hm.put(null,null); //can we pass both as null ? yes
		System.out.println(hm);
	}

}
