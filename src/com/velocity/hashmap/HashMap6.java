package com.velocity.hashmap;

import java.util.HashMap;

public class HashMap6 {
	// Design method which return hashmap object to that method
		public static HashMap getHashMapDemo() {
			HashMap hm = new HashMap();
			hm.put(10, "ram");
			hm.put(20, "shyam");
			hm.put(15, "vikas");
			hm.put(25, "yogesh");
			return hm;
		}

		public static void main(String[] args) {
			HashMap hm1 = getHashMapDemo();
			System.out.println(hm1);

		}

}
