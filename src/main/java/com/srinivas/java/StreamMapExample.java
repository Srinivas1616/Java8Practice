package com.srinivas.java;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapExample {
	
	public static void main(String[] args) {
		
		//Example 1
		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println(names.map(s -> {
				return s.toUpperCase();
			}).collect(Collectors.toList()));
		//prints [ABC, D, EF]
		
		
		//Example 2
		String[] st = {"hi", "hello", "bye"};
		Arrays.stream(st).map(s -> s.toUpperCase()).forEach(System.out::println);;
	
	
	}

}
