package Car_Showroom;

import java.util.Scanner;

public class Showroom implements utility {

	String showroomname;
	String showroomaddress;
	String managername;
	int total_car_in_stock = 0;
	int total_showroom_employe;

	@Override
	public void setDetailes() {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");

		System.out.println();

		System.out.println("Enter Showroom name");

		showroomname = scanner.nextLine();

		System.out.println("Enter Showroom address");
		showroomaddress = scanner.nextLine();

		System.out.println("Enter Manager name");
		managername = scanner.nextLine();

		System.out.println("Enter total car in stock");
		total_car_in_stock = scanner.nextInt();

		System.out.println("Enter total showromm employe");
		total_showroom_employe = scanner.nextInt();

	}

	@Override
	public void getDetailes() {
		// TODO Auto-generated method stub

		System.out.println("Showroom Name : " + showroomname);
		System.out.println("Showroom Address : " + showroomaddress);
		System.out.println("Manager name : " + managername);
		System.out.println("Total car in stock : " + total_car_in_stock);
		System.out.println("Total employe : " + total_showroom_employe);

	}

}
