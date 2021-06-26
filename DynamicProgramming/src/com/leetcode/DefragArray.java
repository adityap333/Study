package com.leetcode;

public class DefragArray {
	public static String defangIPaddr(String address) {
		String myarr[] = address.split("\\.", address.length());
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < myarr.length; i++) {

			if (i == myarr.length - 1)
				result.append(myarr[i]);
			else
				result.append(myarr[i] + "[.]");
		}
		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(defangIPaddr("1.1.1.1"));
		// System.out.println(defangIPaddr("geekss@for@geekss"));

	}
}
