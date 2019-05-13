package org.test;

public class R {
	public static void main(String[] args) {
		String s="shamele";
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println(rev);
	}

}
