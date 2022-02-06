package org.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
	
		String a = "Java is a English Language";

				Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();

				for(int i=a.length()-1; i>=0; i--){
				       char charAt = a.charAt(i);
				       
				       System.out.print(charAt);{
				       
				       }System.out.print("");
				if(mp.containsKey(charAt)){
						
						int integer = mp.get(charAt);
						mp.put(charAt, integer+1);
				}
				
				else{
					mp.put(charAt, 1);

				}
				
				}
				
				System.out.println();
				System.out.println(mp);
}}


