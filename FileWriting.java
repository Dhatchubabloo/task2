import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
public class FileWriting{
    public static void newFile()throws IOException{
        File file = new File("sample.txt");
        boolean check = file.createNewFile();
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("programatically created file");
        bw.newLine();
        bw.write("these words were written programatically");
        bw.newLine();
        bw.write("all is well....be happy & enjoy the life");
        bw.close();
    }
}