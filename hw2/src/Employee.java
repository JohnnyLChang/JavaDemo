//********************************************************************
//  Employee.java       
//
//  Represents a general paid employee.
//********************************************************************

public class Employee extends StaffMember // write the correct SuperClassName based on the UML model
{
	protected String socialSecurityNumber;
	protected double payRate;

	// -----------------------------------------------------------------
	// Constructor: Sets up this employee with the specified
	// information.
	// -----------------------------------------------------------------
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone);
		this.socialSecurityNumber = socSecNumber;
		this.payRate = rate;
	}

	// -----------------------------------------------------------------
	// Returns information about an employee as a string.
	// -----------------------------------------------------------------
	public String toString() {
		return String.format("%s,%s,%f", super.toString(), this.socialSecurityNumber, this.payRate);
	}

	// -----------------------------------------------------------------
	// Returns the pay rate for this employee.
	// -----------------------------------------------------------------
	public double pay() {
		return payRate;
	}
}
