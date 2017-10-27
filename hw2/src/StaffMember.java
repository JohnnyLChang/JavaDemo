//********************************************************************
//  StaffMember.java       
//
//  Represents a generic staff member.
//********************************************************************

abstract public class StaffMember {
	protected String name;
	protected String address;
	protected String phone;

	// -----------------------------------------------------------------
	// Constructor: Sets up this staff member using the specified
	// information.
	// -----------------------------------------------------------------
	public StaffMember(String eName, String eAddress, String ePhone) {
		this.name = eName;
		this.address = eAddress;
		this.phone = ePhone;
	}

	// -----------------------------------------------------------------
	// Returns a string including the basic employee information.
	// -----------------------------------------------------------------
	public String toString() {
		return String.format("%s,%s,%s", name, address, phone);
	}

	// -----------------------------------------------------------------
	// Derived classes must define the pay method for each type of
	// employee.
	// -----------------------------------------------------------------
	public abstract double pay();
}
