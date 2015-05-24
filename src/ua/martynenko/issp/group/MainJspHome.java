package ua.martynenko.issp.group;

import java.util.ArrayList;
import java.util.Random;

public class MainJspHome {
	public static MainJspHome instance;
	
	public static MainJspHome getInstance() {
		if (instance == null) instance = new MainJspHome();
		return instance;
	}
	
	private MainJspHome(){
		
	}
	private static int[] Array;
	
	public int[] getArray() {
		return Array;
	}
	public void generateArray(String a, String b) {
		Random rand = new Random();
		int size = Integer.parseInt(a);
			Array = new int[size];
			for (int i = 0; i < size; i++)
				Array[i] = rand.nextInt(Integer.parseInt(b) * 2) - Integer.parseInt(b);
	}
	
	public String showArray() {
		String s = "";
		for (int i : Array) {
			s += i + ", ";
		}
		return s;
	}
	
	
	public double middleArray() {
		int sum = 0;
		for (int i : Array) {
			sum += i;
		}		
		return sum/(double)Array.length;
	}
	
	public ArrayList<Integer> divArray(String a) {
		int number = Integer.parseInt(a);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : Array) {
			if (i % number == 0) list.add(i); 
		}
		return list;
	}
	
	public ArrayList<Integer> indexArray(String a) {
		int number = Integer.parseInt(a);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] == number) list.add(i);
		}
		return list;
	}
} 
