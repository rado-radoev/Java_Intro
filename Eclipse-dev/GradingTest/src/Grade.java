import javax.management.InvalidAttributeValueException;

public interface Grade<T> {
	public String toString();
	public T toPercent(T grade) throws InvalidAttributeValueException;
	public boolean isPass();
	public boolean includeInAverage();
}
