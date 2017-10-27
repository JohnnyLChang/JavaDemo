//********************************************************************
//  Hourly.java      
//
//  Represents an employee that gets paid by the hour.
//********************************************************************

public class Hourly extends SuperClassName // write the correct SuperClassName based on the UML model
{
   private int hoursWorked;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this hourly employee using the specified
   //  information.
   //-----------------------------------------------------------------
   public Hourly(String eName, String eAddress, String ePhone,
                 String socSecNumber, double rate)
   {
      // write your code

      hoursWorked = 0;
   }

   //-----------------------------------------------------------------
   //  Adds the specified number of hours to this employee's
   //  accumulated hours.
   //-----------------------------------------------------------------
   public void addHours(int moreHours)
   {
      // write your code
   }

   //-----------------------------------------------------------------
   //  Computes the pay for this hourly employee, which is 
   //  payRate * hoursWorked, then resets hourWorked to zero,
   //  and returns the pay
   //-----------------------------------------------------------------
   public double pay()
   {
      // write your code
   }

   //-----------------------------------------------------------------
   //  Returns information about this hourly employee as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      // wrtie your code based on the information presented in result.pdf
   }
}
