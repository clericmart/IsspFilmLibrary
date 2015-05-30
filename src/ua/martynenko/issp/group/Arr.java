package ua.martynenko.issp.group;


public class Arr {
   String text;
   String [] words;
   
   public String getText() {
	return text;
   }
   public String[] getWords() {
	   words = getString(text);
	return words;
   }
   public void setText(String text) {
	this.text = text;
   }
   public void setWords(String[] words) {
	this.words = words;
   }
   public Arr(){
   }
   public String[] getString(String a){
	   String [] mass = a.split(" ");
	   return mass;
   }
}