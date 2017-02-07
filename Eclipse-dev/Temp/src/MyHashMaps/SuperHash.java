package MyHashMaps;
import java.util.Map;
import java.util.HashMap;

public class SuperHash {

	Map<Integer, String> superMap = new HashMap<Integer, String>();
	
	private int id;
	private String name;
	
	public SuperHash(int id, String name) {
		super();
		setId(id);
		setName(name);
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
}
