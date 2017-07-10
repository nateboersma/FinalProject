
public class Customer {
	
	private String firstName;
	private String lastName;
	private String DOB;
	private String donor;
	
	public Customer() {		
	}
	
	public Customer(String first){
		firstName = first;
	}
	public Customer(String first, String last) {
		firstName = first;
		lastName = last;
	}
	
	public Customer(String first, String last, String DOB) {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName.toUpperCase();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName.toUpperCase();
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getDonor() {
		return donor;
	}

	public void setDonor(String donor) {
		this.donor = donor;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB + ", donor=" + donor
				+ "]";
	}
	

}
