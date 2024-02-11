
package wordcount;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.TreeSet;


public class WordCount {

   
    public static void main(String[] args) throws FileNotFoundException {
        String str = DataOperations.getRemoveSymbols("E:\\input.txt");
        System.out.println(str);
        ArrayList<String> str1 = DataOperations.getRemoveStopWord("E:\\input.txt");
        System.out.println(str1);
        TreeSet<String> str2 = DataOperations.getUiqueWordList("E:\\input.txt");
        for (String string : str2) {
            System.out.println(string);
        }
        
        
        

    }
    
}
