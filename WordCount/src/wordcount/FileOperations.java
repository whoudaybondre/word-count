
package wordcount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileOperations {
    
    public static String getFileContent(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        
        String str = "";
        
        while(sc.hasNext()){
            str = str.concat(sc.next().concat(" "));
        }
        return str;
    } 
    
    public static ArrayList<Character> getSymbolList(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        ArrayList<Character> SymbolList = new ArrayList<>();
        while(sc.hasNext()){
            SymbolList.add(sc.next().toLowerCase().charAt(0));
        }
        return SymbolList;
 
        
    }
    
    public static ArrayList<String> getStopword(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        ArrayList<String> StopWords = new ArrayList<>();
    while(sc.hasNext()){
        StopWords.add(sc.next().toLowerCase());
        
    }  
    
    return StopWords;
    }
    
}
