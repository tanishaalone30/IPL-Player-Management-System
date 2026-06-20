package com.tka.controller;

import java.util.Scanner;

import com.tka.service.IPLService;

public class IPLController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		IPLService service = new IPLService();

		while(true) {

			System.out.println("\n===== IPL PLAYER MANAGEMENT =====");
			System.out.println("1. Show All Players");
			System.out.println("2. MI Players");
			System.out.println("3. CSK Players");
			System.out.println("4. RCB Players");
			System.out.println("5. SRH Players");
			System.out.println("6. Show Batters");
			System.out.println("7. Show Bowlers");
			System.out.println("8. Show All Rounders");
			System.out.println("9. Exit");

			System.out.print("Enter Choice : ");
			int choice = sc.nextInt();

			switch(choice) {

			case 1:
				service.getAllPlayers()
				.forEach(System.out::println);
				break;

			case 2:
				service.getPlayersByTeam("MI")
				.forEach(System.out::println);
				break;

			case 3:
				service.getPlayersByTeam("CSK")
				.forEach(System.out::println);
				break;

			case 4:
				service.getPlayersByTeam("RCB")
				.forEach(System.out::println);
				break;

			case 5:
				service.getPlayersByTeam("SRH")
				.forEach(System.out::println);
				break;

			case 6:
				service.getBatters()
				.forEach(System.out::println);
				break;

			case 7:
				service.getBowlers()
				.forEach(System.out::println);
				break;

			case 8:
				service.getAllRounders()
				.forEach(System.out::println);
				break;

			case 9:
				System.out.println("Thank You...");
				System.exit(0);

			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
