import org.junit.Test;
import static org.junit.Assert.*;

public class TestJuni1 {

	@Test
	public void testAdd() {
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";
		
		assertEquals("Junit is working fine", str);
		assertFalse(num > 6);
		assertNotNull(str);
	}
}
