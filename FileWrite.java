import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
public class FileWrite{
    public static void newFile(){
        try{
        File file = new File("sam.txt");
        boolean check = file.createNewFile();
        FileWriter fwrite = new FileWriter(file);
        BufferedWriter bwrite = new BufferedWriter(fwrite);
        bwrite.write("programatically created file\n");
        bwrite.newLine();
        bwrite.write("these words were written programatically\n");
        bwrite.newLine();
        bwrite.write("all is well....be happy & enjoy the life\n");
        }catch(Exception e){
            System.out.println(e);
        }finally {
        	bwrite.close();
        }
        
    }
}