/* This program will allow user to type in details for creating a person object with
 * the person class. The person class will use Serialization to transfer the information
 * into a stream of bytes that will be located in a bin file. The user will
 * type in the person's name, email, phone number, and date of birth. After the user
 * typed the information for the person object, the program will create
 * the bin file that will store the person's details in. Next, the program will give the 
 * user 4 choices, to retrieve the information of the person object and output it to the user, to update a 
 * Information of the person object, to delete a information of the person object, or to end the program.
 * Assignment: 11
 * Name: Brandon Justice
*/

package justicebrandon_oophw11;

import java.io.*;
import java.util.*;

// Declaring Person class that will implement Serializable
class Person implements Serializable {
	
	// Declaring the String variable for the person name
	String personName;
	
	// Declaring the int variable for the person phone number
	int personPhoneNumber;
	
	// Declaring the String variable for the person email
	String personEmail;
	
	// Declaring the int variable for the person date of birth
	int personDateOfBirth;

	public Person(String name, int phone, String email, int dob) {
		this.personName = name;

		this.personPhoneNumber = phone;

		this.personEmail = email;

		this.personDateOfBirth = dob;
	}

	@Override
	public String toString() {

		return "Name: " + this.personName + "\nPhone number: " + this.personPhoneNumber + "\nEmail: " + this.personEmail + "\nDate of Birth: "
				+ this.personDateOfBirth;
	}
}

public class Main {

	public static void main(String[] args) {

		// Declaring scanner variable
		Scanner scannerVariable = new Scanner(System.in);

		// Outputting to let the user type in the person's name
		System.out.print("Type in the name of the person: ");

		// Declaring string variable for taking the line
		String personName = scannerVariable.nextLine();

		// Outputting to let the user type in the person's email
		System.out.print("Type in the email of the person: ");

		// Declaring string variable for taking the line
		String personEmail = scannerVariable.nextLine();

		// Outputting to let the user type in the person's number
		System.out.print("Type in the phone number of the person: ");

		// Declaring int variable for taking the line
		int personPhoneNumber = scannerVariable.nextInt();

		// Outputting to let the user type in the person's date of birth
		System.out.print("Type in the date of birth of the person: ");

		// Declaring int variable for taking the line
		int personDateOfBirth= scannerVariable.nextInt();

		Person p = new Person(personName, personPhoneNumber, personEmail, personDateOfBirth);

		// Updating the date of birth of the person
		// p.dob = 10061777;
		
		
		// Declaring a try method for printing the person information into a bin file
		try {

			writeToFile(p);
		} catch (IOException e) {

			System.out.println(e.getMessage());
		}

		
		// Outputting the next choices that the user got to choose
		System.out.print(
				"\nYou have 4 choices now: \n1. Retrieve and Dispaly information \n2. Update a infomation \n3. Delete a infomation \n4. Exit \nAnswer: ");
		
		// Declaring string variable for taking the line
		int userAnswer = scannerVariable.nextInt();
		
		// If statement that will retrieve and display the person information from the bin file as long the user entered in 1
		if (userAnswer == 1) {
			
			// Declaring a try method reading the bin file and displaying the data from that file
			try {

				readFile();

			} catch (ClassNotFoundException | IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		// If statement that give the user a option to update one of the information of the person as long the user entered in 2
		if (userAnswer == 2) {
			
			// Outputting the next choices that the user got to choose
			System.out.print("\nWhich infomatoin do you want to update? \n1. Name \n2. Email \n3. Phone number"
					+ "\n4. Date of birth \nAnswer: ");

			int userAnswer2 = scannerVariable.nextInt();
			
			// If statement that give the user a option to update the name of the person as long the user entered in 1
			if (userAnswer2 == 1) {

				// Declaring scanner variable
				Scanner scannerVariable2 = new Scanner(System.in);

				// Outputting to let the user type in the person's name
				System.out.print("Type in the name of the person: ");

				// Declaring string variable for taking the line
				String personName2 = scannerVariable2.nextLine();

				System.out.print("\nInfomation updated ");

				Person p2 = new Person(personName2, personPhoneNumber, personEmail, personDateOfBirth);

				try {

					writeToFile(p2);
				} catch (IOException e) {

					System.out.println(e.getMessage());
				}

				try {

					readFile();

				} catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
				
			  // Else if statement that give the user a option to update the email of the person as long the user entered in 2
			} else if (userAnswer2 == 2) {

				// Declaring scanner variable
				Scanner scannerVariable2 = new Scanner(System.in);

				// Outputting to let the user type in the person's email
				System.out.print("Type in the email of the person: ");

				// Declaring string variable for taking the line
				String personEmail2 = scannerVariable2.nextLine();

				System.out.print("\nInfomation updated ");

				Person p2 = new Person(personName, personPhoneNumber, personEmail2, personDateOfBirth);

				try {

					writeToFile(p2);
				} catch (IOException e) {

					System.out.println(e.getMessage());
				}

				try {

					readFile();

				} catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
				
			  // Else if statement that give the user a option to update the phone number of the person as long the user entered in 3
			} else if (userAnswer2 == 3) {

				// Declaring scanner variable
				Scanner scannerVariable2 = new Scanner(System.in);

				// Outputting to let the user type in the person's number
				System.out.print("Type in the phone number of the person: ");

				// Declaring string variable for taking the line
				int personPhoneNumber2 = scannerVariable2.nextInt();

				System.out.print("\nInfomation updated ");

				Person p2 = new Person(personName, personPhoneNumber2, personEmail, personDateOfBirth);

				try {

					writeToFile(p2);
				} catch (IOException e) {

					System.out.println(e.getMessage());
				}

				try {

					readFile();

				} catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
				
			  // Else if statement that give the user a option to update the date of birth of the person as long the user entered in 4
			} else if (userAnswer2 == 4) {

				// Declaring scanner variable
				Scanner scannerVariable2 = new Scanner(System.in);

				// Outputting to let the user type in the person's date of birth
				System.out.print("Type in the date of birth of the person: ");

				// Declaring string variable for taking the line
				int personDateOfBirth2 = scannerVariable2.nextInt();

				System.out.print("\nInfomation updated ");

				Person p2 = new Person(personName, personPhoneNumber, personEmail, personDateOfBirth2);

				try {

					writeToFile(p2);
				} catch (IOException e) {

					System.out.println(e.getMessage());
				}

				try {

					readFile();

				} catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
			}

		}
		
		// If statement that give the user a option to delete one of the information of the person as long the user entered in 3
		if (userAnswer == 3) {
			
			// Outputting the next choices that the user got to choose
			System.out.print("\nWhich infomatoin do you want to delete? \n1. Name \n2. Email \n3. Phone number"
					+ "\n4. Date of birth \nAnswer: ");

			int userAnswer2 = scannerVariable.nextInt();
			
			// If statement that give the user a option to delete the name of the person as long the user entered in 1
			if (userAnswer2 == 1) {
				
				personName = "";
				
				Person p2 = new Person(personName, personPhoneNumber, personEmail, personDateOfBirth);
				
				try {

					writeToFile(p2);
				} catch (IOException e) {

					System.out.println(e.getMessage());
				}

				try {

					readFile();

				} catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
				
			  // Else If statement that give the user a option to delete the email of the person as long the user entered in 2
			} else if (userAnswer2 == 2) {
				
				personEmail = "";
				
				Person p2 = new Person(personName, personPhoneNumber, personEmail, personDateOfBirth);
				
				try {

					writeToFile(p2);
				} catch (IOException e) {

					System.out.println(e.getMessage());
				}

				try {

					readFile();

				} catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
				
			  // Else If statement that give the user a option to delete the phone number of the person as long the user entered in 3
			} else if (userAnswer2 == 3) {
				
				personPhoneNumber = 0;
				
				Person p2 = new Person(personName, personPhoneNumber, personEmail, personDateOfBirth);
				
				try {

					writeToFile(p2);
				} catch (IOException e) {

					System.out.println(e.getMessage());
				}

				try {

					readFile();

				} catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
				
			  // Else If statement that give the user a option to delete the date of birth of the person as long the user entered in 4
			} else if (userAnswer2 == 4) {
				
				personDateOfBirth = 0;
				
				Person p2 = new Person(personName, personPhoneNumber, personEmail, personDateOfBirth);
				
				try {

					writeToFile(p2);
				} catch (IOException e) {

					System.out.println(e.getMessage());
				}

				try {

					readFile();

				} catch (ClassNotFoundException | IOException e) {
					System.out.println(e.getMessage());
				}
			}
		} 
		
		// If statement that will end the program after the user entered in 4
		if (userAnswer == 4) {
			
			System.out.print("\nThank you for using this program. Have a nice day :)");
			
			System.exit(0);
		}

	}
	
	
	// Declaring static void method for taking the data from the Person object and putting it into a bin file
	public static void writeToFile(Person p) throws IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("MainPerson.bin"));

		objectOutputStream.writeObject(p);

		System.out.println("\nPerson has been serialized ");
	}
	
	
	// Declaring static void method that will read from the bin file that was created and pull in data from it
	public static void readFile() throws IOException, ClassNotFoundException {

		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("MainPerson.bin"));

		System.out.println("\nData from the file: ");

		Person personDetails = (Person) objectInputStream.readObject();

		System.out.println(personDetails);

	}

}
