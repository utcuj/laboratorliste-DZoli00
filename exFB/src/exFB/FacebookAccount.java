package exFB;

import java.util.*;
import java.util.stream.Collectors;

public class FacebookAccount {
	private String nume;
	private String locatie;
	private int varsta;
	private List <Friend> prieteni = new ArrayList<>();
	
	public FacebookAccount(String nume, String locatie, int varsta) {
		this.nume = nume;
		this.locatie = locatie;
		this.varsta = varsta;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void adaugaPrieten(Friend prieten) {
		prieteni.add(prieten);
	}
	
	public void stergePrieten(Friend prieten) {
		prieteni.remove(prieten);
	}
	
	public List<Friend> getFriends() {
		return prieteni;
	}
	
	public List<Friend> getFriendByLocation(String loc){
		return (List<Friend>) prieteni.stream().filter(friend -> friend.getLocatie().equals(loc)).collect(Collectors.toList());
	}
	
	public void afisarePrieteni() {
		for(Friend prieten : prieteni) {
			System.out.println(prieten.getNume() + ' ' + prieten.getLocatie());
		}
	}
}
