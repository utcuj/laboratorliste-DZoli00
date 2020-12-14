package exDictionar;

import java.util.*;
import java.util.Map.Entry;

public class Dictionar {
	
	private Map<String, String> dictionar = new HashMap<>();
	
	public void addCuvant(String cuvRo, String cuvEng){
		dictionar.put(cuvRo,cuvEng);
	}
	
	public int getDimensiune() {
		return dictionar.size();
	}
	
	/*HashMap<String, HashMap> selects = new HashMap<String, HashMap>();
	for(Map.Entry<String, HashMap> entry : selects.entrySet()) {
	  String key = entry.getKey();
	  HashMap value = entry.getValue();
	  // do what you have to do here
	  // In your case, an other loop.
	}*/
	
	public void afisareCuvinte() {
		for(Entry<String , String> entry: dictionar.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: " + key + " value: " + value);
		}
	}
	
	public String translate(String key) {
		return dictionar.get(key);
	}
	
	public void afisareCuvRo() {
		for(String key:dictionar.keySet()) {
			System.out.println(key);
		}
	}
	
	public void afisareCuvEng() {
		for(String value:dictionar.values()){
			System.out.println(value);
		}
	}
	
	public void setNewTranslate(String key, String value) {
		dictionar.put(key,value);
	}
	
}
