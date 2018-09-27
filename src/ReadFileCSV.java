import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileCSV {
    public static void main(String[] args) {
        ReadFileCSV readFileCSV = new ReadFileCSV();
        readFileCSV.readFileCSV("C:\\Users\\QuynhBeo\\Desktop\\demo.csv");
    }

    public void readFileCSV(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] country = line.split(",");
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }

            br.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
