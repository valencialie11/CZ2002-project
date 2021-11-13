package restaurant;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PackageUI {

	private static Scanner sc = new Scanner(System.in);

	public static String getNamePackageUI() {
		String name;
		while (true) {
			try {
				System.out.println("What is the name of the package?");
				name = sc.nextLine();
				break;
//		if (name < 0)
//			throw new Exception("Invalid input, price cannot be smaller than zero.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		return name;
	}

	public static int getIndexPackageUI() {
		
		int index;
		while (true) {
			System.out.println("What is the index of the package?");
			try {
				index = sc.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("PLease input an integer");
				sc.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		sc.nextLine();
		return index;
	}

	public static int getNewIndexPackageUI() {
		int index;
		while (true) {
			System.out.println("What is the new index of the package?");
			try {
				index = sc.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("PLease input an integer");
				sc.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		sc.nextLine();
		return index;
	}

	public static int getQuantity() {
		int num;
		while (true) {
			System.out.println("How much quantity of this item?");
			try {
				num = sc.nextInt();
				if (num <= 0)
					throw new Exception(
							"Invalid input, quantity cannot be smaller than or equals to 0. Please enter again.");
				break;
			} catch(InputMismatchException e) {
				System.out.println("PLease input an integer");
				sc.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		sc.nextLine();
		return num;
	}

	public static double getPricePackageUI(double oriPrice) {
		double price;
		while (true) {
			System.out.println("What is the price of the package?");
			try {
				price = sc.nextDouble();
				if (price >= oriPrice || price <= 0)
					throw new Exception(
							"Invalid input. Price cannot be smaller than 0 or higher than the total price of individual items inside the package. Please enter again.");

				break;
			} catch(InputMismatchException e) {
				System.out.println("PLease input an integer");
				sc.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}
		sc.nextLine();
		return price;
	}

	public static int updatePackageChoice() {
		int choice;
		while (true) {
			System.out.println(
					"What do you want to update? Enter 1 for Index, 2 for Name, 3 for Price, 4 to remove item inside, 5 to add item inside.");
			try {
				choice = sc.nextInt();
				if (choice < 1 || choice > 5)
					throw new Exception("Invalid input. Please enter either 1,2,3, 4 or 5.");
				break;
			} catch(InputMismatchException e) {
				System.out.println("PLease input an integer");
				sc.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}
		sc.nextLine();
		return choice;
	}

	public static int updateItemInPackage() {

		int choice;

		while (true) {
			try {
				choice = sc.nextInt();
				sc.nextLine();
				if (choice < 1 || choice > 2)
					throw new Exception("Invalid input. Please enter either 1 or 2.");
				break;
			}

			catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		return choice;

	}

	public static char addItemChoice() {
		char choice;
		while (true) {
			try {
				choice = sc.nextLine().charAt(0);
				if (choice != 'c' && choice != 'q')
					throw new Exception("Invalid input. Please enter either c or q.");
				break;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Please enter a character");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		return choice;

	}

}
