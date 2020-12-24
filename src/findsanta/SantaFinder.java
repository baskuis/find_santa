package findsanta;

import java.util.Scanner;

public class SantaFinder {

	public static void main(String[] args) {
		
		SantaSuspects santaSuspects = new SantaSuspects(20);
		
		santaSuspects.addSuspect("Bob Bezanga");
		santaSuspects.addSuspect("Sally Zimmers");
		santaSuspects.addSuspect("Peter Pinkelton");
		santaSuspects.addSuspect("Bobby Drop Tables");
		santaSuspects.addSuspect("Rudolph Rednose");
		santaSuspects.addSuspect("Bob Ross");
		santaSuspects.addSuspect("Ubiga Altman");
		santaSuspects.addSuspect("Tony Ross");
		santaSuspects.addSuspect("Aaron Rogers");
		santaSuspects.addSuspect("Yolo Once");
		santaSuspects.addSuspect("Yoka Yamalla");
		santaSuspects.addSuspect("Big Show");
		santaSuspects.addSuspect("Doug Dimmadome");
		
		System.out.println("Provide a name to search for:");
		Scanner scanner = new Scanner(System.in);
		String searchFor = scanner.nextLine();
		
		boolean foundMatch = santaSuspects.foundMatch(searchFor);
		if (foundMatch) {
			System.out.println(searchFor + " is indeed a santa suspect");
		} else {
			System.out.println(searchFor + " is not a santa suspect");
		}
		
	}

}
