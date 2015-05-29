package ua.martynenko.issp.group;

public class Arr {
	public Arr(){}
	public String[] getfillMap(){
		String str[] = new String[5];
		for (int i =0; i < str.length ; i++){
			String r = Integer.toString((int)(Math.random()*100));
			str[i] = r;
		}
	return str;
	}
}