package wordcount;

import java.io.FileNotFoundException;
import java.util.*;

public class DataOperations {

    public static String getRemoveSymbols(String FileContentPath) throws FileNotFoundException {
        String str = FileOperations.getFileContent(FileContentPath);
        char StringArray[] = str.toCharArray();
        ArrayList<Character> fileContentCharacterList = new ArrayList<>();
        for (char c : StringArray) {
            fileContentCharacterList.add(c);
        }
        ArrayList<Character> SymbolList = FileOperations.getSymbolList("E:\\symbols.txt");
        fileContentCharacterList.removeAll(SymbolList);
        String str1 = "";
        for (Character c : fileContentCharacterList) {
            str1 = str1.concat(c.toString());
        }
        return str1;
    }



    public static ArrayList<String> getRemoveStopWord(String FileContentPath) throws FileNotFoundException {
        String str1 = getRemoveSymbols(FileContentPath);
        ArrayList<String> StopWordList = FileOperations.getStopword("E:\\stopwords.txt");
        String[] str2 = str1.split(" ");
        ArrayList<String> WithoutSymbolList = new ArrayList<>();
        for (String string : str2) {
            WithoutSymbolList.add(string);
        }
        WithoutSymbolList.removeAll(StopWordList);
        return WithoutSymbolList;
    }

    public static TreeSet<String> getUiqueWordList(String FilePath) throws FileNotFoundException {
        ArrayList<String> pureWordList = getRemoveStopWord(FilePath);
        TreeSet<String> uniqueWordList = new TreeSet<String>(pureWordList);

        return uniqueWordList;

    }
    
    

}
