package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> model;	
	StringBuilder sb;

	public void loadFile(){


		String [] lines = loadStrings("small.txt");
		for(int i = 0; i < lines.length; i++){
			String[] wD = split(lines[i], " ");
			for(int j = 0; j < wD.length; j++){
				wD[j] = wD[j].replaceAll("[^\\w\\s]","");
				wD[j]= wD[j].toLowerCase();


				boolean followedWord;
				if(j+1 == wD.length)
				{
					followedWord = true;
				}
				else
				{
					followedWord = false;
				}
				
				if(!followedWord)
				{
					wD[j+1] = wD[j+1].replaceAll("[^\\w\\s]", "");
					wD[j+1] = wD[j+1].toLowerCase();
				}

				int result = findWord(wD[j]);
				Word word;
				
				if(result == -1)
				{
					word = new Word(wD[j]);
					model.add(word);
				}
				else
				{
					word = model.get(result);
				}

			
				if(!followedWord)
				{

				}
			}
		}
	}

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
		sonnet = new String[14];
		for(int i = 0; i < 14; i++){
			
		}

    }

	public void setup() {
		colorMode(HSB);
		model = new ArrayList<Word>();
		loadFile();
		printModel();
		writeSonnet();
		printSonnet();
		
	}

	public int findWord(String wD){
		for(int i = 0; i < model.size(); i++){
			if(model.get(i).getTheNewWord().equals(wD)){	
				return i;
			}
		}
		return -1;
	}

	public void keyPressed() {
		if(keyPressed){
			if(key == ' '){
				writeSonnet();
			}
		}
	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public void printModel(){
	 	for(Word w: model){
			System.out.println(w.toString());
		}
	}

	public void printSonnet(){
		for(String s: sonnet){
			System.out.println(s);
		}
	}
}
