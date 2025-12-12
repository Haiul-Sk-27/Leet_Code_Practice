//How to sort a text file in java?

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortTextFile {
    public static void main(String[] args){

        ArrayList<String> lines = new ArrayList<>();

    try(
        BufferedReader reader = new BufferedReader(new FileReader("file.txt")); 
        BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
    ){
        String currentLine = reader.readLine();

        while (currentLine != null) {
            lines.add(currentLine);
            currentLine = reader.readLine();
        }

        Collections.sort(lines);

        for(String line : lines){
            writer.write(line);
            writer.newLine();
        }
    }catch(IOException e){
        e.printStackTrace();
    }

    }
}
