package testovi;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/* Trazite od korisnika da unese pozitivan broj n.Zatim ucitajte N brojeva sa standardnog ulaza i
		 * ispisati vrednost najmanjeg unetog broja
		 */
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite koliko zelite da upisete brojeva: ");
		int n = sc.nextInt();
		int i;
		int min;
		if (n <=0) {
			System.out.println("Molimo unesite pozitivan broj!");
		}
		else {
			
		
		System.out.println("Unesite broj: ");
		int a = sc.nextInt();
		min = a;
		for (i=1; i<n; i++) {
			System.out.println("Unesite broj: ");
			a = sc.nextInt();
			if (min > a) {
				min = a;
			}
		}
			System.out.println("Najmanji broj je:" + min);
			
		}
		
	}
}

	


