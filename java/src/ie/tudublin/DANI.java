package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void loadFile(){


		String [] lines = loadStrings("small.txt");
		String w = " ";
		
		for(String line: lines){
			w += split(line, ' ');;
		}
		
		System.out.println(w);


		// loadStrings("filename.txt"); // Load a text file into a String array
		// split(line, ' '); // Split a string into an array of words
		w.replaceAll("[^\\w\\s]",""); // Remove punction characters
		// s.toLowerCase(); // Convert a string to lower case 
	}

	public void settings() {
		size(1000, 1000);
		loadFile();
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void findStr(String[] sonnet){

	}

	public void keyPressed() {
		if(keyPressed){
			if(key == ' '){
				
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
}
