import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExeption {

    public static void main(String[] args) {
        try {
            readFile("/Users/dominikkrypel/IdeaProjects/JavaFromScratch/src/testFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Start print stackTrace");
            System.out.println(e.getMessage());
            System.out.println("End print stackTrace");
            System.out.println("Start getCause");
            System.out.println(e.getCause());
            System.out.println("End getCause");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        String file = fileInputStream.toString();
        System.out.println(file);
    }
}
