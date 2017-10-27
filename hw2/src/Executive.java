//********************************************************************
//  Executive.java       
//
//  Represents an executive staff member, who can earn a bonus.
//********************************************************************

public class Executive extends Employee // write the correct SuperClassName based on the UML model
{
	private double bonus;

	// -----------------------------------------------------------------
	// Constructor: Sets up this executive with the specified
	// information.
	// -----------------------------------------------------------------
	public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		bonus = 0; // bonus has yet to be awarded
	}

	// -----------------------------------------------------------------
	// Awards the specified bonus to this executive.
	// -----------------------------------------------------------------
	public void awardBonus(double execBonus) {
		this.bonus = execBonus;
	}

	// -----------------------------------------------------------------
	// Computes the pay for an executive, which is the
	// regular employee payment plus a one-time bonus,
	// then resets bonus to zero, and returns the pay.
	// -----------------------------------------------------------------
	public double pay() {
		double p = bonus + super.pay();
		bonus = 0;
		return p;
	}
}
