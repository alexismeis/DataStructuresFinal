/**
 * Client Class
 * @author Alexis Meis
 * @version 1.0
 */
import java.time.LocalDate;

public class Client {

	// variables
	private String firstName;
	private String lastName;
	private int numOfPets;
	private boolean existingClient;
	private LocalDate startDate;
	private LocalDate endDate;
	
	/**
	 * Default no-arg constructor
	 */
	public Client() {
		this.setFirstName("");
		this.setLastName("");
		this.setNumOfPets(0);
		this.setExistingClient(false);
		this.setStartDate(null);
		this.setEndDate(null);
	}
	
	/**
	 * Non-default constructor
	 * @param firstName
	 * @param lastName
	 * @param numOfPets
	 * @param existingClient
	 * @param startDate
	 * @param endDate
	 */
	public Client(String firstName, String lastName, int numOfPets, boolean existingClient, LocalDate startDate, LocalDate endDate) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setNumOfPets(numOfPets);
		this.setExistingClient(existingClient);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
	}

	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNumOfPets() {
		return numOfPets;
	}

	public void setNumOfPets(int numOfPets) {
		this.numOfPets = numOfPets;
	}

	public boolean isExistingClient() {
		return existingClient;
	}

	public void setExistingClient(boolean existingClient) {
		this.existingClient = existingClient;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	// toString helper method
	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", lastName=" + lastName + ", numOfPets=" + numOfPets
				+ ", existingClient=" + existingClient + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
}
