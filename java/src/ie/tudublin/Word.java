package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String theNewWord;

    ArrayList<Follow> w = new ArrayList<Follow>();


    public String getTheNewWord() {
        return theNewWord;
    }


    public void setTheNewWord(String theNewWord) {
        this.theNewWord = theNewWord;
    }


    public ArrayList<Follow> getW() {
        return w;
    }


    public void setW(ArrayList<Follow> w) {
        this.w = w;
    }


    public Word(String theNewWord, ArrayList<Follow> w) {
        this.theNewWord = theNewWord;
        this.w = w;
    }

    public int findFollow(String theNewWord){
        for(Follow foll: w){
            if(foll.getWord().equals(theNewWord)){
                return w.indexOf(foll);
            }
        }
        return -1;
    }


    @Override
    public String toString(){
        String result = theNewWord + ": ";
        for (Follow follow : w) {
            result += follow.toString() + " ";
        }
        return result.trim();
    }

}

