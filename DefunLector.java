import java.util.HashMap;
import java.util.LinkedHashMap;

public class DefunLector {
    private HashMap<String, String> functions = new HashMap<String, String>();
    private HashMap<String, LinkedHashMap<String, String>> words = new HashMap<String, LinkedHashMap<String, String>>();

    public void createFunction(String name, String wordss, String wordInstructions){
        LinkedHashMap<String, String> wordsFunction = new LinkedHashMap<String, String>();
        String[] SeparatedWords = wordss.trim().split(",");
        for(String words: SeparatedWords)
            wordsFunction.put(words, "");
        this.words.put(name, wordsFunction);
        functions.put(name, wordInstructions);
    }

    public String Function(String name, String wordss){
        String defunLector = "";
        String[] SeparatedWords = wordss.trim().split(",");
        if(functions.containsKey(name)){
            String wordInstructions = functions.get(name);
            LinkedHashMap<String, String> wordsFunction = new LinkedHashMap<String, String>();
            if(SeparatedWords.length == wordsFunction.size()){
                int i = 0;
                for(String words: wordsFunction.keySet()){
                    wordsFunction.put(words, SeparatedWords[i]);
                    wordInstructions = wordInstructions.replace(words, wordsFunction.get(words));
                    i++;
                }
                defunLector = wordInstructions;
            }
        }
        return defunLector;
    } 
    //******************************************************************
}

