package task3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Contact contactManager = new Contact();

		while (true) {
			System.out.println("\nContact Management System");
			System.out.println("1. Add Contact");
			System.out.println("2. View Contacts");
			System.out.println("3. Edit Contact");
			System.out.println("4. Delete Contact");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter name: ");
				String name = scanner.nextLine();
				System.out.print("Enter phone number: ");
				String phoneNumber = scanner.nextLine();
				System.out.print("Enter email address: ");
				String email = scanner.nextLine();
				contactManager.addContact(name, phoneNumber, email);
				break;
			case 2:
				contactManager.viewContacts();
				break;
			case 3:
				System.out.print("Enter name of contact to edit: ");
				String editName = scanner.nextLine();
				System.out.print("Enter new phone number: ");
				String newPhoneNumber = scanner.nextLine();
				System.out.print("Enter new email address: ");
				String newEmail = scanner.nextLine();
				contactManager.editContact(editName, newPhoneNumber, newEmail);
				break;
			case 4:
				System.out.print("Enter name of contact to delete: ");
				String deleteName = scanner.nextLine();
				contactManager.deleteContact(deleteName);
				break;
			case 5:
				System.out.println("Exiting program.");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a number from 1 to 5.");
			}
		}
	}

}
