package com.java8.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Some other difference between using wildcards and type parameters are:

If you have only one parameterized type argument, then you can use wildcard, although type parameter will also work.
Type parameters support multiple bounds, wildcards don't.
Wildcards support both upper and lower bounds, type parameters just support upper bounds. So, if you want to define a method that takes a List of type Integer or it's super class, you can do:

public void print(List<? super Integer> list)  // OK
but you can't use type parameter:

 public <T super Integer> void print(List<T> list)  // Won't compile
*/ 
interface Collection<E> {
    public boolean containsAll(Collection<?> c);
    public boolean addAll(Collection<? extends E> c);
}
interface CollectionB<E> {
    public <T> boolean containsAll(Collection<T> c);
    public <T extends E> boolean addAll(Collection<T> c);
    // Hey, type variables can have bounds too!
}
public class Wildcard {
	//public <T super Integer> void print(List<T> list) {} compile time error
	public void printb(List<? super Integer> list) {}
	public <T extends Integer> void printc(List<T> list) {}
}
class GenClass<K, V> {
	private K key;

	public GenClass(K key, V value) {
		this.key = key;

	}

	public K getKey() {
		return key;
	}
}

class Test<T extends Number> {
	T[] numArr;

	Test(T[] numArr) {
		this.numArr = numArr;
	}

	public double getAvg() {
		double sum = 0.0;
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i].doubleValue();
		}
		double avg = sum / numArr.length;
		
		String abc = "sdfsd";
		String pqr = "def";
		if(abc > pqr) {
			System.out.println("hii");
		}
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfElements(li));
		
		return avg;
	}
	// below examples of wildcard lower/upper bound in generics
	public static <T extends Number> double sumOfElements(List<T> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}

	public static double sumOfElementsWild(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}// ended wildcard bounded generics
	
	public static void printElements(List<?> list){
		  for (Object elem : list){
		    System.out.println(elem + " ");
		  }
		  System.out.println();
		}
	public static <T> void printElementsnoWild(List<?> list,T t){
		  for (Object elem : list){
		    System.out.println(elem + " ");
		  }
		  System.out.println(t);
		}
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(5, 6, 7);
		printElements(li);
		sumOfElements(li);
		sumOfElementsWild(li);
		
		List alist = new ArrayList();
	}	
}