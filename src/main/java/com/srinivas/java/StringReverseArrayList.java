package com.srinivas.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StringReverseArrayList  {


    public static void main(String[] args) {
    	
    	List<String> al = Arrays.asList("hello","hi","bye");

        System.out.println(reverse(al));;
    }
    public static List reverse(List<String> string) {
        
    	return string.stream()
            .map(s->new StringBuilder(s).reverse())
            .collect(Collectors.toList());
        
    }
}