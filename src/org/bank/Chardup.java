package org.bank;

import java.util.HashMap;

public class Chardup {
	public static void main(String[] args) {
		String s="nageshwara rao";
	HashMap<Character,Integer> emp=new HashMap<Character,Integer>();
		char[] ch=s.toCharArray();
		for (char c : ch) {
			if(emp.containsKey(c)) {
				int x=emp.get(c);
				emp.put(c, x+1);
				}
			else {
				emp.put(c,1);
				}
		}
			System.out.println(emp);
		}
		}

