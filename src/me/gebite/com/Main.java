package me.gebite.com;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		boolean finish = false;
		
		while(!finish) {
			Main main  =  new Main();
			System.out.println("Scrivi 1 per giocare.\n" +
		"Scrivi 2 per uscire.");
			int selection = in.nextInt();
			if (selection == 2) {
				finish = true;
				System.out.println("Arrivederci!");
				break;
			} else {
				if (selection == 1) {
					main.option1();
				}
			}
		}

	}
	
	public void option1() {
		Scanner in = new Scanner(System.in);
		int high = 1000;
		int low = 1;
		int tries = 1;
		int guess = (low + high) / 2;
		
		//Chiedo se il numero e' 500, a meta'
		String risposta = "";
		System.out.println("Il numero che stai pensando e': " + guess + "?");
		System.out.println("Scrivi high o low, oppure se e' corretto scrivi: yes");
		risposta = in.nextLine();
		do {
			if (risposta.equals("low")) { //e' minore di 500
				high = guess - 1;
				guess = (high + low) / 2;
				System.out.println("Il numero che stai pensando e':" + guess + " ?\n" + tries + " tentativi.");
				risposta = in.nextLine();
				tries++;
			} else {
				if (risposta.equals("high")) { //e' maggiore di 500
				    low = guess + 1;
					guess = (high + low)/2;
					System.out.println("Il numero che stai pensando e':" + guess + " ?\n" + tries + " tentativi.");
					risposta = in.nextLine();
					tries++;
				}
			}
		} while (!risposta.equals("yes"));	
			System.out.println("Indovinato!!\n" + tries + " tentativi.");
		
	   if (tries >= 10) {
		  System.out.println("10 Tentativi raggiunti! Siamo sicuri che non hai barato?"); 
		   
	   }
	}
}

