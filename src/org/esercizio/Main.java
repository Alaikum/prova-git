package org.esercizio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Title; // ="Il Signore Degli Anelli";
		boolean isKindleFormat = true;
		float averageScore = 4.12F;
		int totalPage = 1157;
		long ISBN = 123456789L; // codice dei libri,11 cifre
		float price = 15F;
		float discount;
		
		Scanner s = new Scanner(System.in);
		//Titolo da inserire
		System.out.print("Inserisci il titolo:");
		Title = s.nextLine();
		//sconto da inserire
		
		//controllo che il valore inserito è positivo e float
		do {
			System.out.print("Inserisci lo sconto in (%):");
		    while (!s.hasNextFloat()) {
		        System.out.println("Non hai inserito un numero!!!");
		        System.out.print("Inserisci lo sconto in (%):");
		        s.next(); 
		    }
		    discount = s.nextFloat();
		    if(discount<0) {
		    	System.out.println("Lo sconto non può essere un valore negativo!!!");
		    }
		} while (discount < 0);
		
	
	
		  
		   

	
		System.out.println("Titolo: " + Title);
		System.out.println("Kindle: " + isKindleFormat);
		System.out.println("Valutazione media: " + averageScore);
		System.out.println("Pagine: " + totalPage);
		System.out.println("Codice ISBN: " + ISBN);
		System.out.println("Prezzo: " + price);
		System.out.println("Prezzo scontato: " + (price * (100 - discount) / 100));
		System.out.println("Sconto applicato: "+discount+"%");

		//CHIUDE LO SCANNER
		s.close();
	}

}
