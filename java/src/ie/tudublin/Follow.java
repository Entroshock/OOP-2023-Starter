package ie.tudublin;

public class Follow {
    private String theWord;
    private int wordCount;


    
    public String toString(){
        return theWord + "{" + wordCount + "}";
    }

    public String getWord() {
        return theWord;
    }


    public void setWord(String word) {
        this.theWord = word;
    }



    public int getWordCount() {
        return wordCount;
    }



    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }



    public Follow(String word, int wordCount) {
        this.theWord = word;
        this.wordCount = wordCount;
    }
    
    
}
