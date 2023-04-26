package ie.tudublin;

public class Follow {
    private String word;
    private int wordCount;


    
    public String getWord() {
        return word;
    }



    public void setWord(String word) {
        this.word = word;
    }



    public int getWordCount() {
        return wordCount;
    }



    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }



    public Follow(String word, int wordCount) {
        this.word = word;
        this.wordCount = wordCount;
    }


    
}
