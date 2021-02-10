package CollectionsPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		
		

		List<Integer> l = Arrays.asList(1, 4, 9, 3, 6, 0);
		LinkedList<Integer> ll = new LinkedList(l);
		System.out.println("initial Linkedlist: " + ll);
		System.out.println(ll.get(2));
		
		//Set method to replace data at specific point
		ll.set(2, 10);
		System.out.println(ll.get(2));
		System.out.println("After manipulation: " + ll);
		
		//getFirst method derived deque (Similarly getLast)
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println("Iterating using lamda");
		
		//itertating the linkedlist
		ll.forEach(s-> System.out.print(s+" "));
		
		//remove first element from linkedlist similarly remove last
		int i = ll.removeFirst();
		int j =ll.removeLast();
		System.out.println("removed first element: "+ i +", & last elemenet: "+j);
		
		//Many other methods like T remove(index), boolean contains(element), etc....
		
	}

}
