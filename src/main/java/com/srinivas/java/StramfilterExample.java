package com.srinivas.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StramfilterExample {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			myList.add(i);
		Stream<Integer> sequentialStream = myList.stream();

		Stream<Integer> highNums = sequentialStream.filter(p -> p > 90); // filter numbers greater than 90
		
		System.out.print("High Nums greater than 90=");
		highNums.forEach(p -> System.out.print(p + " "));
		//highNums.forEach(System.out::println);
	}
}