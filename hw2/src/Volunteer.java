//********************************************************************
//  Volunteer.java 
//
//  Represents a staff member that works as a volunteer.
//********************************************************************

public class Volunteer extends StaffMember // write the correct SuperClassName based on the UML model
{
	// -----------------------------------------------------------------
	// Constructor: Sets up this volunteer using the specified
	// information.
	// -----------------------------------------------------------------
	public Volunteer(String eName, String eAddress, String ePhone) {
		super(eName, eAddress, ePhone);
	}

	// -----------------------------------------------------------------
	// Returns a zero pay value for this volunteer.
	// -----------------------------------------------------------------
	public double pay() {
		return 0.0;
	}
}