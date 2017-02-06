package MyHashMaps;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Test1 {

	public static void main(String[] args) {

		class MyKey {
			Integer i;
			public MyKey(Integer i){
				this.i =i;
			}
			
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((i == null) ? 0 : i.hashCode());
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
				MyKey other = (MyKey) obj;
				if (i == null) {
					if (other.i != null)
						return false;
				} else if (!i.equals(other.i))
					return false;
				return true;
			}

			

		}
		Date begin = new Date();
		Map <MyKey,String> myMap= new HashMap<>(2_500_000,1);
		for (int i=0;i<2_000_000;i++){
			myMap.put( new MyKey(i), "test "+i);
		}

		Date end = new Date();
		System.out.println("Duration (ms) "+ (end.getTime()-begin.getTime()));
	}
}
