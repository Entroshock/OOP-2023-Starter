package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> model;	

	public void loadFile(){


		String [] lines = loadStrings("small.txt");
		for(int i = 0; i < lines.length; i++){
			String[] wD = split(lines[i], " ");
			for(int j = 0; j < wD.length; j++){
				wD[j] = wD[j].replaceAll("[^\\w\\s]","");
				wD[j]= wD[j].toLowerCase();
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
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
		writeSonnet();
		printModel();
       
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
}
