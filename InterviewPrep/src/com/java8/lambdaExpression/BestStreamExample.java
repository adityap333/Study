package com.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BestStreamExample {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(34, 6, 3, 12, 651, 101, 8);
		
		//numList.stream().filter((n) -> n > 5).sorted().forEach(System.out::println);
		Stream<Integer> s = numList.stream();
		Function<Integer, Integer> f = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t * 2;
			}
		};
		Stream<Integer> s1 = s.map(f);
		BinaryOperator<Integer> bf = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		
		Integer result = s1.reduce(0, bf);
		System.out.println(result);
		//System.out.println(numList.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
		//System.out.println(numList.stream().map(i -> i*2).reduce(0,(c,e) ->Integer.sum(c, e)));
		System.out.println(numList.stream().map(i -> i*2).reduce(0,Integer::sum));
		
		// Use of filter
		int resultb = 0;
		for (int i : numList)
		{
			if(i%5==0) resultb += i;
		}
		System.out.println(resultb);
		
		Predicate<Integer> p = new Predicate<Integer>() {

			public boolean test(Integer t) {
				return t%5==0;
			}
		};
		System.out.println(numList.stream().filter(p).reduce(0,Integer::sum));
		//System.out.println(numList.stream().filter(i -> i%5==0).reduce(0,Integer::sum));
		
		//Filter + map + reduce
		System.out.println("Filter + map + reduce: " + 
		numList.stream().filter(i -> i%5==0).map(i -> i*2).reduce(0,Integer::sum));
		
		System.out.println("Filter + map + find first: " + 
				numList.stream()
					   .filter(i -> i%5==0)
					   .map(i -> i*2)
					   .findFirst()
					   .orElse(99));
		
		//Lazy evaluation Terminal function demo
		
		List<Integer> lazyList = Arrays.asList(22,33,44,55,11,102,100,67);
		System.out.println("Lazy evaluation Terminal function demo: " + 
				lazyList.stream()
					   //.map(BestStreamExample::mapDouble)
					   .filter(BestStreamExample::isDvisible)
					   .map(BestStreamExample::mapDouble)
					   .findFirst()
					   .orElse(99));
		//BestStreamExample.InfiniteStreamofIntegers();
		//BestStreamExample.InfiniteStreamofString();
		
		List<Integer> myList = Arrays.asList(7, 18, 10, 24, 17, 5);  
		long count = myList.stream().count();
		System.out.println("Total elements in the list " + count);
		
		BestStreamExample.CollectToMap();
	}
	
	public static boolean isDvisible(int i) {
		System.out.println("in divis : "+i);
		return i%5==0;
	}
	public static int mapDouble(int i) {
		System.out.println("in Map double"+i);
		return i*2;
	}
	// Below is the infinite stream of random integers
	public static void InfiniteStreamofIntegers()
	{
		Random r= new Random();
		Stream<Integer> randoms = Stream.generate(r::nextInt);
		randoms.forEach(System.out::println);
	}
	public static void InfiniteStreamofString() {
		Stream<String> as = Stream.iterate("a", s -> s +"a") ;
		as.forEach(System.out::println);
	}
	
	public static void CollectToMap()
	{
		List<Integer> myList = Arrays.asList(7, 18, 10, 7, 10, 24, 17, 5);
		System.out.println("Original list: " + myList);
		List<Integer> newList = myList.stream().distinct().collect(Collectors.toList());
		System.out.println("new List : " + newList);
	}
	public static void SortWithComparator()
	{
		List<User> userList = new ArrayList<>(Arrays.asList(
		        new User("John", 33), 
		        new User("Robert", 26), 
		        new User("Mark", 26), 
		        new User("Brandon", 42)));

		List<User> sortedList = userList.stream()
		        .sorted(Comparator.comparingInt(User::getAge))
		        .collect(Collectors.toList());

		sortedList.forEach(System.out::println);
	}
}
class User {
    
    private String name;
    private int age;
    
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
}
