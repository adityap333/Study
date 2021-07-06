package com.geeksForGeeks;

import java.util.ArrayList;

public class RemoveDuplicate {
	public static void main(String[] args) {
		System.out.println(removeDups("zvvo"));
	}
	private static String removeDups(String S) 
	{ 
	    char[] ch = S.toCharArray();
	    char[] letters = new char[S.length()];
	    ArrayList<Character> c = new ArrayList<>();
	    int j = 0;
	    for(int i = 0; i < S.length(); i++)
	    {
	    	if(!c.contains(ch[i])) 
	    		{
	    		c.add(ch[i]);
	    		letters[j]=ch[i];
	    		j++;
	    		}
	    }
	    
	    return  String.valueOf(letters);  
	}
}
