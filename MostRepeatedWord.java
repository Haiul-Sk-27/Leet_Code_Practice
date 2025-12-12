// How to find the word with the highest frequency  from a file in Java?

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;

public class MostRepeatedWord {
    public static void main(String[] args){
        int count = 0;
        String MostRepeatedWord = null;

        HashMap<String,Integer> wordCountMap = new HashMap<String,Integer>();

        try(
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        ){
            String currentLine = reader.readLine();

            while (currentLine != null) {
                String[] words = currentLine.toLowerCase().split(" ");

                for(String word : words){
                    if(wordCountMap.containsKey(word)){
                        wordCountMap.put(word,wordCountMap.get(word)+1);
                    }else{
                        wordCountMap.put(word,1);
                    }
                }

                currentLine = reader.readLine();
            }

            Set<Entry<String,Integer>> entrySet = wordCountMap.entrySet();

            for(Entry<String,Integer> entry : entrySet){
                if(entry.getValue() > count){
                    MostRepeatedWord = entry.getKey();
                    count = entry.getValue();
                }
            }

            System.out.println("The mostReapted word in input files is: "+MostRepeatedWord);

            System.out.println("Number of occurence: "+count);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
