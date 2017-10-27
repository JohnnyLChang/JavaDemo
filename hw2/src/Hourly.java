//********************************************************************
//  Hourly.java      
//
//  Represents an employee that gets paid by the hour.
//********************************************************************

public class Hourly extends Employee // write the correct SuperClassName based on the UML model
{
	private int hoursWorked;

	// -----------------------------------------------------------------
	// Constructor: Sets up this hourly employee using the specified
	// information.
	// -----------------------------------------------------------------
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		hoursWorked = 0;
	}

	// -----------------------------------------------------------------
	// Adds the specified number of hours to this employee's
	// accumulated hours.
	// -----------------------------------------------------------------
	public void addHours(int moreHours) {
		this.hoursWorked += moreHours;
	}

	// -----------------------------------------------------------------
	// Computes the pay for this hourly employee, which is
	// payRate * hoursWorked, then resets hourWorked to zero,
	// and returns the pay
	// -----------------------------------------------------------------
	public double pay() {
		return this.payRate * this.hoursWorked;
	}

	// -----------------------------------------------------------------
	// Returns information about this hourly employee as a string.
	// -----------------------------------------------------------------
	public String toString() {
		return String.format("%s,%f", super.toString(), this.pay());
	}
}
