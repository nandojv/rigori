package esercizicarlo;

import java.util.Scanner;

public class rigori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String giocatore;
		int tiro=0;
		
		
		
		
		System.out.println("-------inizio partita--------");
		
		System.out.println("inserire nome------- inserire numero da 1 a 10  per tirare");
		
		
		 
		Scanner sc = new Scanner(System.in); 

		giocatore = sc.nextLine(); 
		
		
		
		
	    	Scanner sc1 = new Scanner(System.in); 

		     tiro = sc1.nextInt();
	
		    	
			    	
			    		
			    	if(tiro>5 ) {
			    		System.out.println("goooal");
			    	}
			    	else if(tiro<5) {
			    		System.out.println("parata");
			    		
			    	}
}}
