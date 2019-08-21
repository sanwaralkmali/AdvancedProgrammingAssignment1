import java.util.Scanner;

public class question10_7 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		Account[] accounts = new Account[10];

		initialBalance(accounts);
		
		do {
			System.out.print("Enter an id: ");
			int id = input.nextInt();

			if (isValidID(id, accounts)) {
				int choice;
				do {	
					choice = displayMainMenu(input);
					if (isTransaction(choice)) {
							executeTransaction(choice, accounts, id, input);
					}
				} while (choice != 4);
			}
		} while (true); 
	}

	public static void initialBalance(Account[] a) {
		int initialBalance = 100;
		for (int i = 0; i < a.length; i++) {
			a[i] = new Account(i, initialBalance);
		}
	}

	public static boolean isTransaction(int choice) {
		return choice > 0 && choice < 4;
	}

	public static boolean isValidID(int id, Account[] a) {
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getId())
				return true;
		}
		return false;
	}

	public static int displayMainMenu(Scanner input) {
		System.out.print(
			"\nMain menu\n1: check balance\n2: withdraw" +
			"\n3: deposit\n4: exit\nEnter a choice: ");
		return input.nextInt();
	}

	public static void executeTransaction(
		int c, Account[] a, int id, Scanner input) {
		switch (c) {
			case 1: 
					  System.out.println("The balance is " + a[id].getBalance());
					  break;
			case 2:
					  System.out.print("Enter an amount to withdraw: "); 
					  a[id].withdraw(input.nextDouble());
					  break;
			case 3: 
					  System.out.print("Enter an amount to deposit: "); 
					  a[id].deposit(input.nextDouble());
		}
		
	}

}
