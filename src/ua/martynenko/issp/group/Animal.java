package ua.martynenko.issp.group;

public interface Animal {
	String voice();
	default String voiceCat(){
		return "mauw";
	}
	default String voiceDog(){
		return "Woof";
	}
}
