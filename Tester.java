import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		//created a new scanner so users can input information
		Scanner in = new Scanner(System.in);
		
		//This is used as a key in the map. In future versions, I will put in a lookup option which the will be used to lookup as well as last name and first name.
		int customerID = 100;

		System.out.print("How many different people are you making a label for? ");
		//User inputs an int that says how many different labels they are planning on making.
		int labels = in.nextInt();

		//Had to put this in so it wasn't skipping first name and jumping right in to last name.
		//Dr. Ruse gave me another option on how to fix but this was easier from my point of view.
		in.nextLine();

		//Created a map that puts the user input in the map and uses customerID as the key.
		Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

		do {
			//Create a new customer
			Customer customer = new Customer();

			//Sets the customer's ID and then gets it and displays what the ID number is.
			//This will be used more in future versions.
			customer.setID(customerID++);
			System.out.println("The ID for this label is " + customer.getID());

			//Takes input and sets them to the different customer variables
			System.out.print("Customer first name: ");
			// String name = in.nextLine();
			customer.setfirstName(in.nextLine());

			System.out.print("Customer last name: ");
			// String name = in.nextLine();
			customer.setLastName(in.nextLine());

			System.out.print("Street Address: ");
			// String streetAddress = in.nextLine();
			customer.setStreetAddress(in.nextLine());

			System.out.print("City: ");
			// String city = in.nextLine();
			customer.setCity(in.nextLine());

			System.out.print("State: ");
			// String state = in.nextLine();
			customer.setState(in.nextLine());

			System.out.print("Zipcode: ");
			// String zipcode = in.nextLine();
			customer.setZipcode(in.nextLine());

			//This puts the customerID in the map as the key and then takes the other information and puts it in the map as the value
			customers.put(customer.getID(), customer);
			//Each time it runs through it takes the number the user input and reduces it by 1 until there are no more to create
			labels--;

			//do-while loop. It does the above while there is more than 0 labels to create.
		} while (labels > 0);
		
		//Asks the user how many pages of each label they would like.
		System.out.println("How many page printouts of each would you like?");
		int numberWanted = in.nextInt();
		
		//Creates an ArrayList, iterates through and takes the key and the associated values and puts them in a list.
		List<Customer> customerList = new ArrayList<Customer>();
		for (Integer key : customers.keySet()) {
			customerList.add(customers.get(key));
		}

		//Based on bubble sort. Takes the list we created and comparesTo(in customer class) the customer in position[j]
		//to the customer in position[j+1] based on last name then first name and then moves to the next position until the list is sorted.
		for (int i = 0; i < customerList.size() - 1; i++) {
			for (int j = 0; j < customerList.size() - 1; j++) {
				if (customerList.get(j).compareTo(customerList.get(j + 1))) {
					Customer tempVar = customerList.get(j + 1);
					customerList.set(j + 1, customerList.get(j));
					customerList.set(j, tempVar);
				}
			}
		}
		
		//takes the number of pages the customer requests and loops through the print below until it has printed that many copies.
		//This also formats the printout and prints the information to upper case.
		for (int x = 1; x <= numberWanted; x++) {
			for (Customer c : customerList) {
				System.out.print(c.getfirstName().toUpperCase() + " " + c.getLastName().toUpperCase() + " \n"
						+ c.getStreetAddress().toUpperCase() + " \n" + c.getCity().toUpperCase() + " "
						+ c.getState().toUpperCase() + ", " + c.getZipcode() + "\n");
				System.out.println("-----------------------------------------------------");
			}
			System.out.println("");
		}

		in.close();
	}

}
