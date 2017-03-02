import java.nio.file.AccessDeniedException;

public interface ISupport {

	public boolean VerifyUserExists(String[] s);
	public boolean VerifyPassword(String[] s1, String s2) throws AccessDeniedException;
	public String[] FindUserAndPassword(String s);
	
}
