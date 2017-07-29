package util;

import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

	public static void writeFile(String FilePath, String str) {
		try {
			FileWriter writer = new FileWriter(FilePath);
			writer.write(str);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
