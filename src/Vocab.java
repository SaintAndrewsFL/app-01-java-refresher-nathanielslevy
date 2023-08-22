import java.util.ArrayList;

public class Vocab {
    private static ArrayList<String> wordList = new ArrayList<>();
    private static ArrayList<String> definitionList = new ArrayList<>();

    private String word;
    private String definition;

    public Vocab(String word, String definition) {
        this.word = word;
        this.definition = definition;
        wordList.add(word);
        definitionList.add(definition);
    }

    public static ArrayList<String> getWordList() {
        return wordList;
    }

    public static ArrayList<String> getDefinitionList() {
        return definitionList;
    }
}
