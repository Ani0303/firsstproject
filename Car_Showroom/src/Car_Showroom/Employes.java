package Car_Showroom;

import java.util.Scanner;
import java.util.UUID;

public class Employes extends Showroom implements utility {

	String emplye_id;
	String employe_name;
	int employe_age;
	String employe_dipartment;

	@Override
	public void setDetailes() {

		Scanner scanner = new Scanner(System.in);
		UUID uuid = UUID.randomUUID();
		emplye_id = String.valueOf(uuid);

		System.out.println("Enter employe detailes");
		System.out.println();

		System.out.println("Enter Employe name");
		employe_name = scanner.nextLine();

		System.out.println("Enter employe age");
		employe_age = scanner.nextInt();

		System.out.println("Enter employe dipartment");
		employe_dipartment = scanner.nextLine();

		System.out.println("Enter employe showroom name");
		showroomname = scanner.nextLine();
	}

	@Override
	public void getDetailes() {

		System.out.println("Employe Id :            " + emplye_id);
		System.out.println("Employe Name :          " + employe_name);
		System.out.println("Employe age :           " + employe_age);
		System.out.println("Employe Dipartment :    " + employe_dipartment);
		System.out.println("Employe Showroom name : " + showroomname);

	}

}
