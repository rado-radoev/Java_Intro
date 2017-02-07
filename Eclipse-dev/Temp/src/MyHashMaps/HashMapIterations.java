package MyHashMaps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapIterations {
	
	private int userId;
	private String userName;
	private String userPassword;
	
	public HashMapIterations() {
		this(0, null, null);
	}
	
	public HashMapIterations(int userId) {
		this(userId, null, null);
	}
	
	public HashMapIterations (int userId, String userName) {
		this(userId, userName, null);
	}
	
	public HashMapIterations (int userId, String userName, String userPassword) {
		setUserId(userId);
		setUserName(userName);
		setUserPassword(userPassword);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapIterations other = (HashMapIterations) obj;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		return true;
	}

	public int getUserId() {
		return this.userId;
	}
	
	public String getUserName()	{
		return this.userName;
	}
	
	public String getUserPassword()	{
		return this.userPassword;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	

	public static void main(String[] args) {
		Map<String, String> myHashMap = new HashMap<String, String>();
		
		myHashMap.put("Petkan", "Divaka");
		myHashMap.put("Viki", "Vacata");
		myHashMap.put("Radko", "Peshteradko");
		myHashMap.put("Ivo", "Burgiata");
		
		// Foreach loop
		for (String key : myHashMap.keySet()) {
			System.out.println("Key is: " + key.hashCode());
		}
		
		
		// KeySet Iterator loop
		Set<String> keySet = myHashMap.keySet();
		Iterator<String> keySetIterator = keySet.iterator();

		while(keySetIterator.hasNext()) {
			String key = keySetIterator.next();
			System.out.println("Key in key set iterator is: " + key);
		}
		
		// Entry set foreach loop
		Set<Map.Entry<String, String>> mapEntry = myHashMap.entrySet();
		for (Entry entry : mapEntry) {
			System.out.println("Key is: " + entry.getKey() + "\n\tValue is: " + entry.getValue()) ;
		}
		
		// Entry set Iterator loop
		Set<Map.Entry<String, String>> mapEntrySet = myHashMap.entrySet();
		Iterator<Entry<String, String>> mapEntrySetIterator = mapEntrySet.iterator();
		
		while (mapEntrySetIterator.hasNext()) {
			Entry entry = mapEntrySetIterator.next();
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
			
		}
	}

}
