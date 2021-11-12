package com.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByWithStreams {
	public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<Employee2> items = new ArrayList<>();
                items.add(new Employee2("aditya", "IT", Integer.valueOf("1000")));
                items.add(new Employee2("shubham", "IT", Integer.valueOf("500")));
                items.add(new Employee2("sumit", "comp", Integer.valueOf("200")));
               	items.add(new Employee2("raghav","comp", Integer.valueOf("500")));
        

        Map<String, Optional<Employee2>> counting = items.stream().collect(
                Collectors.groupingBy(Employee2::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employee2::getSalary))));

        System.out.println(counting);

    }
}

class Employee2 {

    private String name;
    private String department;
    private Integer salary;
    
	public Employee2(String name, String department, Integer salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}