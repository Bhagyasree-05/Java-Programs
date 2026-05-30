import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello Java File");
        fw.close();
        System.out.println("Written successfully");
    }
}
