package org.esercizio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Title="Il Signore Degli Anelli";
		boolean isKindleFormat=true;
		float averageScore=4.12F;
		int totalPage=1157;
		long ISBN=123456789L; //codice dei libri,11 cifre
		float price=15F;
		float discount=50F;
		
		System.out.println("Titolo: "+Title);
		System.out.println("Kindle: "+isKindleFormat);
		System.out.println("Valutazione media: "+averageScore);
		System.out.println("Pagine: "+totalPage);
		System.out.println("Codice ISBN: "+ISBN);
		System.out.println("Prezzo: "+price);
		System.out.println("Prezzo scontato: "+ (price*(100 -discount)/100));
		
	
	}

}
