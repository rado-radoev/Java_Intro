import javax.management.InvalidAttributeValueException;

public interface Grade<T> {
	public String toString();
	public boolean isPass();
	public boolean includeInAverage();
	public T toPercent(T grade) throws InvalidAttributeValueException;
//	public int toPercent(String grade) throws InvalidAttributeValueException;
}
