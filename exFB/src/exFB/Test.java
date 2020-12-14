package exFB;

import java.util.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacebookAccount ana = new FacebookAccount("Ana", "Cluj", 18);
		
		Friend dan = new Friend("Dan", "Cluj");
		Friend emi = new Friend("Emi", "Oradea");
		Friend dragos = new Friend("Dragos", "Bistrita");
		Friend ciprian = new Friend("Cipri", "Bucuresit");
		Friend mihai = new Friend("Mihai", "Cluj");
		Friend catalin = new Friend("Catalin", "Cluj");
		Friend vasi = new Friend("Vasi", "Bistrita");
		Friend daniel = new Friend("Daniel", "Baia Mare");
		Friend nicolae = new Friend("Nicolae", "Cluj");
		Friend nicu = new Friend("Nicu", "Constanta");
		
		ana.adaugaPrieten(dan);
		ana.adaugaPrieten(emi);
		ana.adaugaPrieten(dragos);
		ana.adaugaPrieten(ciprian);
		ana.adaugaPrieten(mihai);
		ana.adaugaPrieten(catalin);
		ana.adaugaPrieten(vasi);
		ana.adaugaPrieten(daniel);
		ana.adaugaPrieten(nicolae);
		ana.adaugaPrieten(nicu);
		
		ana.afisarePrieteni();
		
		ana.stergePrieten(dan);
		ana.stergePrieten(nicu);
		
		System.out.println();
		
		ana.afisarePrieteni();
		
		System.out.println();
		List <Friend> prieten2 = ana.getFriendByLocation("Cluj");
		for(Friend prieten : prieten2) {
			System.out.println(prieten.getNume() + ' ' + prieten.getLocatie());
		}
		
	}

}
