package CollectionsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterating {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		// Adding elements to map
		map.put("Amit", 1);
		map.put("Rahul", 5);
		map.put("Jai", 2);
		map.put("Amit", 7);

	}
	
	//EntrySet and for Loop
	public void iterateUsingEntrySet(Map<String, Integer> map) {
	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	}
	
	//Iterator and EntrySet
	public void iterateUsingIteratorAndEntry(Map<String, Integer> map) {
	    Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
	    while (iterator.hasNext()) {
	        Map.Entry<String, Integer> entry = iterator.next();
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	}
	
	//With Lambdas
	public void iterateUsingLambda(Map<String, Integer> map) {
	    map.forEach((k, v) -> System.out.println((k + ":" + v)));
	}
	
	//Stream API
	public void iterateUsingStreamAPI(Map<String, Integer> map) {
	    map.entrySet().stream()
	      // ...
	      .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
	}
}
