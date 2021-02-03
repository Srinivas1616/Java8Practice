package com.srinivas.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {

	public static void main(String[] args) {

		System.out.println(reverse("Sinu"));
		System.out.println(reverseList(Arrays.asList("Hi", "hello","Sinu", "Parker", "Rich", "Albert")));
		//reverseList(Arrays.asList("hi", "hello"));
	}

	public static String reverse(String string) {

		return Stream.of(string).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(""));

	}

	public static List reverseList(List<String> str) {

		// below can used when need to print each element separately.... with return type changed to void... and calling this static method
		// str.stream().map(s-> new StringBuilder(s).reverse()).forEach(System.out::println);
		return str.stream().map(s-> new StringBuilder(s).reverse()).collect(Collectors.toList());

	}
}