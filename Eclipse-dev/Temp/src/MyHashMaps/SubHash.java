package MyHashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SubHash extends SuperHash {
	
	public SubHash(int id, String name) {
		super(id, name);
	}

	public static void main(String[] args) {
		SubHash sh = new SubHash(3, "Rado");
		SubHash sh1 = new SubHash(5, "patko");
		
		Map<Integer, String> sbhMap = new HashMap<Integer, String>();
		Map<Integer, SubHash> myHash = new HashMap<Integer, SubHash>();
		
		myHash.put(1000, sh1);
		myHash.put(10, sh);
		
		SubHash sh3 = myHash.get(10);
		System.out.println(sh3.getId() + sh3.getName());
		
		Set<Map.Entry<Integer, SubHash>> mySet = myHash.entrySet();
		Iterator<Entry<Integer, SubHash>> mySetIterator = mySet.iterator();
		while (mySetIterator.hasNext()) {
			Entry entry = mySetIterator.next();
			SubHash temp = (SubHash)entry.getValue();
			((SubHash)entry.getValue()).getId();
			((SubHash)entry.getValue()).getName();
			System.out.println("-----------------------------------");
			System.out.println("User ID is: " + temp.getId() + " User name is: " + temp.getName());
			System.out.println("userid: " + ((SubHash)entry.getValue()).getId() + " username: " + ((SubHash)entry.getValue()).getName());
			System.out.println("-----------------------------------");
			
		}
		
		
		
		
		
		sbhMap.put(sh1.getId(), sh1.getName());
		sbhMap.put(sh.getId(), sh.getName());
		
		// foreach
		for (Integer s : sbhMap.keySet()) {
			System.out.println("Key " + s + " is: " + sbhMap.get(s));
		}
		
		// keyset iterator
		Set<Integer> keySet = sbhMap.keySet();
		Iterator<Integer> keySetIterator = keySet.iterator();
		
		while (keySetIterator.hasNext()) {
			int i =keySetIterator.next();
			System.out.println("Key is: " + i + " value: " + sbhMap.get(i));
		}
		
		// foreach keyset
		Set<Map.Entry<Integer, String>> sbhmEntry = sbhMap.entrySet();
		for (Entry entry : sbhmEntry) {
			System.out.println("Key is: " + entry.getKey() + " Value is: " + entry.getValue());
		}
		
		
		Iterator<Entry<Integer, String>> mapIterator = sbhmEntry.iterator();
		while (mapIterator.hasNext()) {
			Entry next = mapIterator.next();
			System.out.println("Next key is; " + next.getKey());
			System.out.println("Next value is: " + next.getValue());
		}
		
	}

}
