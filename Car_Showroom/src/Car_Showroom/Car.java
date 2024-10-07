package Car_Showroom;

import java.util.Scanner;

public class Car extends Showroom implements utility {

	String car_name;
	String car_colour;
	String car_fuel_type;
	String car_price;
	String car_type;

	@Override
	public void setDetailes() {
		System.out.println("Enter car detailes");
		System.out.println();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter car name");
		car_name = scanner.nextLine();

		System.out.println("Enter car colour");
		car_colour = scanner.nextLine();

		System.out.println("Enter car fuel type");
		car_fuel_type = scanner.nextLine();

		System.out.println("Enter car price");
		car_price = scanner.nextLine();

		System.out.println("Enter car type");
		car_type = scanner.nextLine();

		total_car_in_stock++;
	}

	@Override
	public void getDetailes() {

		System.out.println("Car name : " + car_name);
		System.out.println("Car colour : " + car_colour);
		System.out.println("Car fuel type : " + car_fuel_type);
		System.out.println("Car price : " + car_price);
		System.out.println("Car type : " + car_type);
	}

}
