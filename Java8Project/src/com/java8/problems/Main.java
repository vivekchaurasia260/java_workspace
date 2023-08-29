package com.java8.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Neeraj Pandey", "neeraj.pandey345@gmail.com", 45000, "EC");
		Employee emp2 = new Employee(2, "Avinash Verma", "verma.avinash770@gmail.com", 51000, "DPE");
		Employee emp3 = new Employee(3, "Swati Desai", "desai.swati813@yahoo.com", 39000, "EC");
		Employee emp4 = new Employee(4, "Pankaj Singh", "pankaj.singh983@outllook.com", 69000, "ME");
		Employee emp5 = new Employee(5, "Sirius Black", "black.siri452@gmail.com", 71000, "KIA");
		Employee emp6 = new Employee(6, "Raghvendra Singh", "singh.raghv550@outlook.com", 59000, "DPE");
		Employee emp7 = new Employee(7, "Pradeep Prajapati", "praja.pradeep991@gmail.com", 82000, "EC");
		Employee emp8 = new Employee(8, "Rashmi Gupta", "gupta.rashmi921@yahoo.com", 34000, "KIA");
		
		List<Employee> list = List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);
		
		list.stream().forEach(emp -> {
			System.out.println(emp);
		});
		
		
		System.out.println("\n --------------------------------------------------------------------");
		
		// Sort employee based on their salary in desc order using java 8.
		List<Employee> sortedSalary = list.stream().sorted((o1, o2) -> (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
		
		sortedSalary.stream().forEach(emp -> {
			System.out.println(emp);
		});
		
		
		// To get the top 3 highest salary
		List<Employee> top_3_salary = list.stream().sorted((o1, o2) -> (o2.getSalary() - o1.getSalary())).limit(3).collect(Collectors.toList());
		
		System.out.println("\n --------------------------------------------------------------------");
		
		top_3_salary.stream().forEach(emp -> {
			System.out.println(emp);
		});
		
		
		System.out.println("\n --------------------------------------------------------------------");
		
		// Fetch all employees having salary less than 3rd highest salary
		
		List<Employee> specific_salary = list.stream().sorted((o1, o2) -> (o2.getSalary() - o1.getSalary())).skip(3).collect(Collectors.toList());
		
		specific_salary.stream().forEach(emp -> {
			System.out.println(emp);
		});
		
		System.out.println("\n --------------------------------------------------------------------");
		
		// Finding the maximum salary
		
		Integer maxSalary = list.stream().map(sal -> sal.getSalary()).max((s1, s2) -> s1.compareTo(s2)).get();
		
		System.out.println("Max Salary " + maxSalary);
		
		// Finding the minimum salary
		
		Integer minSalary = list.stream().map(sal -> sal.getSalary()).min((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println("Min Salary " + minSalary);
		
		System.out.println("\n --------------------------------------------------------------------");
		
		// USING GROUPING BY 
		
		Map<Integer, List<Employee>> deptGroup = list.stream().collect(Collectors.groupingBy(sal -> sal.getSalary()));
		
		System.out.println(deptGroup);
		
		System.out.println("\n --------------------------------------------------------------------");
		
		// Printing the name of highest salary employee.
		
//		List<Integer> highestSalaryEmpDetails = list.stream().map(sal -> sal.getSalary()).sorted((s1, s2) -> s2.compareTo(s1)).limit(1).collect(Collectors.toList());
//		
//		System.out.println("Highest \n" + highestSalaryEmpDetails);
		
		Employee employee = list.stream().max((s1, s2) -> Integer.compare(s1.getSalary(), s2.getSalary())).get();
		
		System.out.println(employee.getName());
		
		
		// Find the count of Employee based on salary...
		
		
		
		
		// FIND SUM OF ALL THE ELEMENTS IN A ARRAY USING JAVA 8 
		
//		int[] arr = {2,3,4,5,7};
//		
//		int sum = Arrays.stream(arr).sum();
//		
//		System.out.println(sum);
		
		
		
	}
}
