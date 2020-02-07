package club;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
 
public class Team extends SportsClub{
	
 //int age;
	
	  public Team(String firstName, String lastName, String role, String gender,
	  String nationality, LocalDate DOB, String addressLine1, String
	  addressLine2,String city, String state, String postcode, String country) 
	  {
	  
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
	  public Team() {
		// TODO Auto-generated constructor stub
	}
	  static ArrayList<Team> memAry1 = Main.memberdetails;


	  static ArrayList<Team> memAry2 = new ArrayList<Team>();

	  boolean x=true; 
	  int i=0;



	  	//Junior male coach
	  	  public void getJuniorMaleCoach(int teamsize) 
	  	  {
	  		 
	  		  while(x) {
	  		
	  			
	  			  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  			  year=age.getYears();
	  			 
	  	  
	  			  if ( (year<18)   &&  (memAry1.get(i).getGender().contentEquals("MALE"))   &&   (memAry1.get(i).getRole().contentEquals("COACH") )  )
	  	  {
	  	  memAry2.add(memAry1.get(i)); 
	  	  }
	  	  i++; 
	  	 
	  	  
	  			
	  			  if(memAry2.size()==teamsize)
	  			  {
	  				  x=false;
	  			  
	  			  System.out.println("Here you go:" );
	  			  System.out.println(memAry2.toString() + "/"); }
	  			   
	  		  }
	  	 
	  	
	  }
	  	  
	  	  
	  	  //Junior Male Player
	  	  public void getJuniorMalePlayer(int teamsize) 
	  	  {
	  		 
	  		  while(x) {
	  		
	  			
	  			  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  			  year=age.getYears();
	  			 
	  	  
	  	  if ( (year<18)  && (memAry1.get(i).getGender().contentEquals("MALE")) && (memAry1.get(i).getRole().contentEquals("PLAYER")))
	  	  {
	  		  
	  	  memAry2.add(memAry1.get(i)); 
	  	  
	  	  }
	  	  i++; 
	  	 
	  	  
	  			
	  			  if(memAry2.size()==teamsize)
	  			  {
	  				  x=false;
	  			  
	  			  System.out.println("Here you go:" );
	  			  System.out.println(memAry2.toString() + "/"); }
	  			   
	  		  }
	  	 
	  	
	  }
	  	  
	  	  //code to get female junior coach
	  	  public void getJuniorFemaleCoach(int teamsize) 
	  	  {
	  		  while(x) {
	  		
	  	  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now());
	  	  int year=age.getYears();
	  	  
	  	  if ((year<18) && ((memAry1.get(i).getGender().contentEquals("FEMALE"))) && (memAry1.get(i).getRole().contentEquals("COACH"))) 
	  	  {
	  		  System.out.println(1);
	  		  
	  	  memAry2.add(memAry1.get(i)); 
	  	  System.out.println(2);
	  	  
	  	  }
	  	  i++; 
	  	  
	  			
	  			  if(memAry2.size()==teamsize)
	  			  {
	  				  x=false;
	  			  
	  			  System.out.println("Here you go:" );
	  			  System.out.println(memAry2.toString() + "/");
	  			  }
	  		  }
	  			   
	  		  }
	  	 
	  	  //junior female player
	  	  public void getJuniorFemalePlayer(int teamsize) 
	  	  {
	  		  while(x) {
	  		
	  	  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now());
	  	  int year=age.getYears();
	  	  
	  	  if ((year<18) && (memAry1.get(i).getGender().contentEquals("FEMALE")) && (memAry1.get(i).getRole().contentEquals("PLAYER"))) 
	  	  {
	  		  
	  	  memAry2.add(memAry1.get(i)); 

	  	  
	  	  }
	  	  i++; 
	  	  
	  			
	  			  if(memAry2.size()==teamsize)
	  			  {
	  				  x=false;
	  			  
	  			  System.out.println("Here you go:" );
	  			  System.out.println(memAry2.toString() + "/");
	  			  }
	  		  }
	  			   
	  		  }
	  	  
	  	  
	  	//male senior coach
	  	  public void getMaleSeniorCoach(int teamsize) { 
	  		  while(x) {
	  			  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  			  year=age.getYears();
	  			  
	  			  
	  			  if((year >= 18)  && (memAry1.get(i).getGender().contentEquals("MALE")) && (memAry1.get(i).getRole().contentEquals("COACH"))) {
	  	  
	  				  memAry2.add(memAry1.get(i));
	  	  
	  			  		} i++;
	  	  
	  	  
	  	  
	  			  		if(memAry2.size()==teamsize)
	  			  		{ 
	  			  			x=false;
	  	  
	  			  		System.out.println("Here you go:" ); 
	  			  		System.out.println(memAry2.toString() + "/"); }
	  	  
	  		  			}
	  	  
	  	  
	  	  }

	  	  
	  	  //male senior player
	  	  public void getMaleSeniorPlayer(int teamsize) { 
	  		  while(x) {
	  			  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  			  year=age.getYears();
	  			  
	  			  
	  			  if((year >= 18) && (memAry1.get(i).getGender().contentEquals("MALE")) && (memAry1.get(i).getRole().contentEquals("PLAYER"))) {
	  	  
	  				  memAry2.add(memAry1.get(i));
	  	  
	  			  		} i++;
	  	  
	  	  
	  	  
	  			  		if(memAry2.size()==teamsize) { x=false;
	  	  
	  			  		System.out.println("Here you go:" ); 
	  			  		System.out.println(memAry2.toString() + "/"); }
	  	  
	  		  			}
	  	  
	  	  
	  	  }

	  	  //female senior coach
	  	public void getFemaleSeniorCoach(int teamsize) {
	  		// TODO Auto-generated method stub
	  		 while(x) {
	  			  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  			  year=age.getYears();
	  			  
	  			  
	  			  if((year >= 18) && (memAry1.get(i).getGender().contentEquals("FEMALE")) && (memAry1.get(i).getRole().contentEquals("COACH"))) {
	  	  
	  				  memAry2.add(memAry1.get(i));
	  	  
	  			  		} i++;
	  	  
	  	  
	  	  
	  			  		if(memAry2.size()==teamsize) { 
	  			  			x=false;
	  	  
	  			  		System.out.println("Here you go:" ); 
	  			  		System.out.println(memAry2.toString() + "/"); }
	  	  
	  		  			}
	  	  
	  		
	  	}

	  	//female senior player
	  	public void getFemaleSeniorPlayer(int teamsize) {
	  		// TODO Auto-generated method stub
	  		 while(x) {
	  			  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); 
	  			  int year=age.getYears();
	  			  
	  			  
	  			  if((year >= 18) && (memAry1.get(i).getGender().contentEquals("FEMALE")) && (memAry1.get(i).getRole().contentEquals("PLAYER"))) {
	  	  
	  				  memAry2.add(memAry1.get(i));
	  	  
	  			  		} i++;
	  	  
	  			  		if(memAry2.size()==teamsize) { 
	  			  			x=false;
	  	  
	  			  		System.out.println("Here you go:" ); 
	  			  		System.out.println(memAry2.toString() + "/"); }
	  	  
	  		  			}
	  	  
	  		
	  	}
	  	
	  	
	  	//junior mixed coach
	  	public void getJuniorMixedCoach(int teamsize) {
	  		// TODO Auto-generated method stub
	  		 while(x) {
	  			  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  			  year=age.getYears();
	  			  
	  			  
	  			  if((year< 18) && (memAry1.get(i).getGender().contains("M")) && (memAry1.get(i).getRole().contentEquals("COACH"))) {
	  	  
	  				  memAry2.add(memAry1.get(i));
	  	  
	  			  		} i++;
	  	  
	  			  		if(memAry2.size()==teamsize) { 
	  			  			x=false;
	  	  
	  			  		System.out.println("Here you go" );
	  			  		
	  			  		System.out.println(memAry2.toString() + ""); }
	  	  
	  		  			}
	  	  
	  		
	  	}
	  	//junior mixed player
	  		public void getJuniorMixedPlayer(int teamsize) {
	  			// TODO Auto-generated method stub
	  			 while(x) {
	  				  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  				  year=age.getYears();
	  				  
	  				  
	  				  if((year< 18) && (memAry1.get(i).getGender().contains("M")) && (memAry1.get(i).getRole().contentEquals("PLAYER"))) {
	  		  
	  					  memAry2.add(memAry1.get(i));
	  		  
	  				  		} i++;
	  		  
	  				  		if(memAry2.size()==teamsize) { 
	  				  			x=false;
	  		  
	  				  		System.out.println("Here you go" );
	  				  		
	  				  		System.out.println(memAry2.toString() + ""); }
	  		  
	  			  			}
	  		  
	  		}

	  		//senior mixed player
	  		public void getSeniorMixedPlayer(int teamsize) {
	  			 while(x) {
	  				  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  				  year=age.getYears();
	  				  
	  				  
	  				  if((year>= 18) && (memAry1.get(i).getGender().contains("M"))  && (memAry1.get(i).getRole().contentEquals("PLAYER"))) {
	  		  
	  					  memAry2.add(memAry1.get(i));
	  		  
	  				  		} i++;
	  		  
	  				  		if(memAry2.size()==teamsize) { 
	  				  			x=false;
	  		  
	  				  		System.out.println("Here you go" );
	  				  		
	  				  		System.out.println(memAry2.toString() + ""); }
	  		  
	  			  			}
	  		  
	  		}

	  		//senior mixed coach
	  		public void getSeniorMixedCoach(int teamsize) {
	  			 while(x) {
	  				  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
	  				  year=age.getYears();
	  				
	  				 //String GEN= memAry1.get(i).getGender().contentEquals("MALE")
	  				  if((year>= 18) && (memAry1.get(i).getGender().contains("M")) && (memAry1.get(i).getRole().contentEquals("COACH"))) {
	  		
	  					  memAry2.add(memAry1.get(i));
	  		  
	  				  		} i++;
	  		  
	  				  		if(memAry2.size()==teamsize) { 
	  				  			x=false;
	  		  
	  				  		System.out.println("Here you go" );
	  				  		
	  				  		System.out.println(memAry2.toString() + ""); }
	  		  
	  			  			}
	  		  
	  			
	  		}
	  	
	  	
	  	
	  	 
	  	  
	
	
	  @Override public String toString() { return "Team firstName=" + firstName +
	  ", lastName=" + lastName + ", gender=" + gender + ", DOB=" + DOB +
	  ", nationality=" + nationality + ", role=" + role + "\n";
	  
	  }
	 
	 
}	
	
	
	
	  
























