import java.io.FileWriter;
import java.io.IOException;

public class atf {
    public static void main(String[] args){
        String path = "file.txt";
        String text = "Append a new text";

        try(
            FileWriter fw= new FileWriter(path,true);
        ){
            fw.write(text);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
