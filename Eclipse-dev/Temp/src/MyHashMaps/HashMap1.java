package MyHashMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		Map<Integer, String> myHash = new HashMap<Integer, String>(16,0.75f);
		myHash.put(1, "Pig skins");
		myHash.put(2, "Galoshki");
		
		for (Integer i : myHash.keySet()) {
			// System.out.println("key " + i + " value: " + myHash.get(i) );
		}
		
		
		Set<Integer> keySet = myHash.keySet();
		Iterator<Integer> keySetIterator = keySet.iterator();
		
		while (keySetIterator.hasNext()) {
			int key = keySetIterator.next();
			//System.out.println("key: " + key + " value: " + myHash.get(key));
		}

		Set<Map.Entry<Integer, String>> entrySet = myHash.entrySet();
		for (Entry entry: entrySet)  {
			//System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
		
		Set<Map.Entry<Integer, String>> entrySet1 = myHash.entrySet();
		Iterator<Entry<Integer, String>> entrySetIterator = entrySet1.iterator();
		
		while (entrySetIterator.hasNext()) {
			Entry entry = entrySetIterator.next();
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		
		
		System.out.println(myHash.containsValue("Pig skins"));
		Collection<String> s =  myHash.values();
		Iterator<String> iS = s.iterator();
		while (iS.hasNext()) {
			String string = (String) iS.next();
			System.out.println(string);
		}
		
		
		//System.out.println(s);
		System.out.println(myHash.get(1).hashCode());
		System.out.println(myHash.get(2).hashCode());

	}

}
