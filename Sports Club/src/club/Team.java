package club;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
 
public class Team extends SportsClub{
	
 int age;
	public Team(String firstName, String lastName, String role, String gender, String nationality, LocalDate DOB, String addressLine1,
    String addressLine2,String city, String state, String postcode, String country) {
		
		    this.setFirstName(firstName);
	        this.setLastName(lastName);
	        this.setGender(gender);
	        this.setNationality(nationality);
	        this.setDOB(DOB);
	        this.setAddressLine1(addressLine1);
	        this.setAddressLine2(addressLine2);
	        this.setCity(city);
	        this.setState(state);
	        this.setZipcode(postcode);
	        this.setCountry(country);
	        this.setRole(role);
	     
	 }
	
	
	public String getGender() {
		return gender;
	}
	
	    
	
	  @Override public String toString() { 
		  return "Team firstName=" + firstName +
	  ", lastName=" + lastName + ", gender=" + gender + ", DOB=" + DOB +
	  ", nationality=" + nationality  + ", role=" + role + "\n";
	  
	  }
	 
}	
	
	
	
	  
























