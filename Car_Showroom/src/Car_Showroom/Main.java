package Car_Showroom;

import java.util.Scanner;

public class Main {

	static void mainmenu() {
		System.out.println();
		System.out.println(
				"======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
		System.out.println();
		System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
		System.out.println();
		System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
		System.out.println();
		System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
		System.out.println();
		System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mainmenu();
		Scanner scanner = new Scanner(System.in);
		Car car[] = new Car[5];
		Employes employes[] = new Employes[5];
		Showroom showroom[] = new Showroom[5];

		int car_counter = 0;
		int showroom_counter = 0;
		int employe_counter = 0;
		int choice = 100;

		int c = 55;

		while (c != 100) {

			mainmenu();

			switch (choice = scanner.nextInt()) {
			case 1:

				showroom[showroom_counter] = new Showroom();
				showroom[showroom_counter].setDetailes();
				showroom_counter++;
				System.out.println(" 1 Enter showroom detailes");
				System.out.println(" 9 to go main menu");

				choice = scanner.nextInt();

				break;
			case 2:
				employes[employe_counter] = new Employes();
				employes[employe_counter].setDetailes();
				employe_counter++;
				System.out.println();
				System.out.println();
				System.out.println(" Enter 2 add employes");
				System.out.println(" 9 to go main menu");
				choice = scanner.nextInt();

				break;

			case 3:
				car[car_counter] = new Car();
				car[car_counter].setDetailes();
				car_counter++;
				System.out.println(" Enter 3 to add new car");
				System.out.println(" 9 to go main menu");

				choice = scanner.nextInt();

				break;

			case 4:
				for (int i = 0; i < showroom_counter; i++) {

					showroom[i].getDetailes();

					System.out.println();
					System.out.println();

				}
				System.out.println(" Enter 0 exit");
				System.out.println(" 9 to go main menu");
				choice = scanner.nextInt();

				break;
			case 5:
				for (int i = 0; i < employe_counter; i++) {
					employes[i].getDetailes();
					System.out.println();
					System.out.println();
				}
				System.out.println("enter 0 to exit");
				System.out.println("enter 9 to main menu");

				choice = scanner.nextInt();
				break;

			case 6:
				for (int i = 0; i < car_counter; i++) {
					car[i].getDetailes();
					System.out.println();
					System.out.println();
				}
				System.out.println("enter 0 to exit");
				System.out.println("enter 9 to main menu");
				choice = scanner.nextInt();
				break;

			case 0:
				System.exit(c);
				break;

			default:
				break;
			}

		}

	}

}
