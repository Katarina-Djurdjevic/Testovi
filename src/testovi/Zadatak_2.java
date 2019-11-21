package testovi;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*U koliko kupac kupi robu u iznosu vecem od 1500 dinara dobija 10% popusta,a u koliko
		 * kupi robu u iznosu vecem od 7000 dinara dobija 20% popusta.Napisati program koji ce uneti iznos
		 * odabrane robe ispisati koliko treba da plati.
		 */
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite iznos robe: ");
		double iznos = sc.nextDouble();
		double popust1 = 0.1;
		double popust2 = 0.2;
		double a;
		double b;
		
		
		if (iznos >1500 && iznos < 7000) {
			a = iznos * popust1;
			b = iznos - a;
			System.out.println("Iznos Vaseg racuna je: " + b + " dinara");
		}
			else if (iznos >= 7000) {
				a = iznos * popust2;
				b= iznos - a;
			
				System.out.println("Iznos Vaseg racuna je: " + b + " dinara");
			}
			else if (iznos >0 && iznos<=1500){
					System.out.println("Iznos Vaseg racuna je: " + iznos + " dinara");
			}
					else {
						System.out.println("Molimo Vas unesite pozitivnu vrednost robe!");
						
					}
	}
				
}
			
			
		
		
		
		

	


