import java.util.Scanner;

/**
 * @author Ashutosh kumar
 */
public class RestaurantMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			// Display the menu
			System.out.println("Welcome to the Restaurant!");
			System.out.println("Please select the type of food:");
			System.out.println("1. Veg (Green)");
			System.out.println("2. Non-Veg (Red)");
			System.out.println("3. Egg (Brown)");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Veg Dishes (Green):");
					System.out.println("1. Paneer Butter Masala");
					System.out.println("2. Vegetable Biryani");
					System.out.println("3. Aloo Gobi");
					break;
				case 2:
					System.out.println("Non-Veg Dishes (Red):");
					System.out.println("1. Chicken Biryani");
					System.out.println("2. Mutton Rogan Josh");
					System.out.println("3. Fish Curry");
					break;
				case 3:
					System.out.println("Egg Dishes (Brown):");
					System.out.println("1. Egg Curry");
					System.out.println("2. Egg Biryani");
					System.out.println("3. Egg Bhurji");
					break;
				case 4:
					System.out.println("Thank you for visiting our restaurant!");
					break;
				default:
					System.out.println("Invalid choice! Please try again.");
			}

			System.out.println();
		} while (choice != 4);

		scanner.close();
	}
}
