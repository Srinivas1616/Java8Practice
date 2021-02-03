package com.srinivas.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class parallelStreamExample {

	public static void main(String[] args) {
		
	
	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

	//get count of empty string .....  takes the advantage of the multi-core system with multiple pipelines 
	long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
	
	//Sequential stream can also be used but parallel stream is highly preferred(cause its synchronized and uses single pipeline of objects)
	//long count = strings.stream().filter(string -> string.isEmpty()).count();
	
	System.out.println(count);
	
	
	}
}
