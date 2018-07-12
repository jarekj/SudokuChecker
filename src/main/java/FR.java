import java.io.BufferedReader;
import java.io.IOException;

public class FR {

    public static String readFromFile(String fileName) {
        BufferedReader br = null;
        String allLines = "";
        try {
            br = new BufferedReader(new java.io.FileReader(fileName));
            String nextLine = br.readLine();
            allLines += nextLine;
            while (nextLine != null) {
                nextLine = br.readLine();
                if (nextLine != null) {
                    allLines += "\n" + nextLine;
                }
            }
            if (br != null) br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }
}
