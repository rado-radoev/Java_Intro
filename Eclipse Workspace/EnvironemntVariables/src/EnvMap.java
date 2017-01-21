import java.util.Map;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class EnvMap {

	public static void main(String[] args) {
		try {
			// getenv returns null if nothing is detected
			Map<String, String> env = System.getenv();
			// Create new file
			String path = "\\\\shcsd\\sharp\\soc\\profiles\\" + System.getProperty("user.name") + "\\Desktop\\Envs.txt";
			System.out.println(path);
			File outputFile = new File(path);
			
			// Check if file exists
			if (!outputFile.exists()) {
				outputFile.createNewFile();
			}
			
			// Create file write and buffer
			FileWriter fw = new FileWriter(outputFile.getAbsolutePath());
			BufferedWriter bw = new BufferedWriter(fw);
			
			// Print to screen and output to file
			for (String envName: env.keySet()) {
				String vars = String.format("%s=%s%n", envName,env.get(envName));
				System.out.println(vars);
				bw.write(vars);
			}
			
			// Close file
			bw.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
