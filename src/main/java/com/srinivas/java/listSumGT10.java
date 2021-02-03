package com.srinivas.java;

import java.util.Arrays;
import java.util.List;

public class listSumGT10 {
	
	
	
	public static void main(String[] args) {
		
		System.out.println(sumStream(Arrays.asList(10,8,4,6,0,20,14)));
	}
	
	
	//iterate over a list of integers and find out sum of all the integers greater than 10.
	
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}

}
