
public interface Grade<T> {
	public String toString();
//	public int toPercent(Integer grade);
	public boolean isPass();
	public boolean includeInAverage();
}
