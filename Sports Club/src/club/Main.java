package club;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  {

	 



public Main(String firstName, String lastName, String gender, String nationality, LocalDate DOB,
			String addressLine1, String addressLine2, String city, String state, String postcode, String country) {
		
	}



 //int age;




	static ArrayList<Team> memberdetails = new ArrayList<Team>();


	  
	public static void main(String[] args)  {
				
				// Team members(players)
		memberdetails.add(new Team("Sania", "Mirza", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));

		memberdetails.add(new Team("MS", "Dhoni", "PLAYER", "MALE", "Indian", LocalDate.of(1996, 11, 14), "46,Quadrant court",
				"Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));

		memberdetails.add(new Team("Sachin", "Tendulkar", "PLAYER", "MALE", "Indian", LocalDate.of(1990, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));

		memberdetails.add(new Team("Irene", "Rebecca", "PLAYER", "FEMALE", "British", LocalDate.of(1995, 11, 14),
				"46,Quadrant court", "Jumla square", "winterthurway", "Basingstoke", "RG1 7GH", "UK"));

		memberdetails.add(new Team("Melina", "Mathews", "PLAYER", "FEMALE", "British", LocalDate.of(1996, 11, 14),
				"46,Quadrant court", "Jumla square", "winterthurway", "Basingstoke", "RG1 9GH", "UK"));

		memberdetails.add(new Team("Aliana", "Mathews", "PLAYER", "FEMALE", "British", LocalDate.of(2000, 11, 14),
				"46,Quadrant court", "Jumla square", "winterthurway", "Basingstoke", "RG1 8GH", "UK"));

		memberdetails.add(new Team("Jaden", "Maxwell", "PLAYER","MALE", "Indian", LocalDate.of(2001, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Sikkim", "814211", "INDIA"));

		memberdetails.add(new Team("Javed", "Akthar", "PLAYER", "MALE", "Indian", LocalDate.of(2002, 11, 14), "46,Quadrant court",
				"Mirla square", "Zarkhand", "Assam", "824291", "INDIA"));

		memberdetails.add(new Team("Dhruva", "Vikram", "PLAYER", "MALE", "Indian", LocalDate.of(2003, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));

		memberdetails.add(new Team("Sheeba", "Sherlin", "PLAYER", "FEMALE", "British", LocalDate.of(2004, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		
		memberdetails.add(new Team("Shradha", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		
		memberdetails.add(new Team("Karan", "Joan", "PLAYER", "MIXED", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		
		memberdetails.add(new Team("Manish", "Malhotra", "PLAYER", "MIXED", "British", LocalDate.of(1986, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		//unassigned
		memberdetails.add(new Team("Amir", "Khan", "UNASSIGNED", "Male", "British", LocalDate.of(1983, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Gouri", "Khan", "UNASSIGNED", "FEMALE", "British", LocalDate.of(1983, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		
		memberdetails.add(new Team("Imran", "Khan", "UNASSIGNED", "MIXED", "British", LocalDate.of(1983, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));

		memberdetails.add(new Team("Shaheed", "Kapoor", "UNASSIGNED", "Male", "British", LocalDate.of(2003, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Meera", "Shaheed", "UNASSIGNED", "FEMALE", "British", LocalDate.of(2003, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		
		memberdetails.add(new Team("Rakhi", "Sawanth", "UNASSIGNED", "MIXED", "British", LocalDate.of(2003, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));

		// Coach
		memberdetails.add(new Team("Rahul", "Dravid", "COACH", "MALE", "Indian", LocalDate.of(1981, 01, 14), "46,Quadrant court",
				"Mantri square", "Bangalore", "Karnataka", "506204", "INDIA"));

		memberdetails.add(new Team("Tom", "Lodziak", "COACH", "MALE", "Indian", LocalDate.of(2003, 11, 14), "Sir Speed",
				"25 E Beaver St", "Jacksonville", "FL", "32202", "USA"));

		memberdetails.add(new Team("Chris", "Silverwood", "COACH", "MALE", "British", LocalDate.of(1975, 05, 05),
				"46,Quadrant court", "Jumla square", "Berkshire", "Hook", "RG27 9UP", "UK"));
		
		memberdetails.add(new Team("Alia", "Bhat", "COACH", "FEMALE", "British", LocalDate.of(2003, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Kareena", "Kapoor", "COACH", "FEMALE", "British", LocalDate.of(1983, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Salman", "Khan", "COACH", "MIXED", "British", LocalDate.of(2003, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Saif Ali", "Khan", "COACH", "MIXED", "British", LocalDate.of(1983, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));

		
		System.out.println("TOTAL NUMBER OF PLAYERS & COACHES:" +memberdetails.size());
		
		Scanner userInput = new Scanner(System.in);
		
		

		String ageGroup;
		String gender;
		String role;
		
		
		
		try {
		
		  System.out.println("Please enter the age Group. Enter 'j' for Junior age group(if the age is below 18) or 's' for senior age group (if the age is above 18)" );
			 while(true) {
				ageGroup=userInput.nextLine().toUpperCase();
				 if(ageGroup.contains("J")) {
					
					 System.out.println("You have choosen the Junior age group");
				 		break;			
				 		}
				 else if(ageGroup.contains("S")){
					 System.out.println("You have choosen the Senior age group");
					 break;
									}
				 else {
					 System.out.println("Please enter the valid input");
					
				 }
			 			}
			 
			 
			 System.out.println("Please enter the gender. Enter male or 'F' for female or mixed" );
			 while(true) {
				gender=userInput.nextLine().toUpperCase();
				 if(gender.contentEquals("MALE") )
				 {
					
					 System.out.println("You have selected MALE" );
				 		break;				}
				 else if(gender.contains("F") )
				 {
					 System.out.println("You have selected FEMALE" );
						break;			}
				 else if(gender.contentEquals("MIXED")) {
					 System.out.println("You have selected MIXED" );
					 break;
				 }
			
				 else  {
					 System.out.println("Please enter the valid input. Enter Male or 'F' for female or mixed");
				 }
			 			
			 			}
			 
			 
			 System.out.println("Please enter the role.Enter 'C' for Coach or 'p' Player or 'u' unassigned");
			 while(true) {
			 role=userInput.nextLine().toUpperCase();
			 if(role.contentEquals("COACH") || (role.contains("C")))
			 {
				 System.out.println("You have selected COACH");
				 break;
			 }
			 else if(role.contentEquals("PLAYER") || (role.contains("P"))) {
				 System.out.println("You have selected PLAYER");
				 break;
			 }
			 else if(role.contentEquals("UNASSIGNED") || (role.contentEquals("U")))  {
				 System.out.println("You have selected  unassigned");
				 break;
			 }
			 else if(role.isEmpty() || (role.isBlank()))
			 {
				 System.out.println("Enter the role");
				 break;
			 }
			 else
			 {
				 System.out.println("Enter the role");
			 }
			 }
			 
			 
			 System.out.println("How many players would you like in the team ?. Please enter the number" );
			 
			 int teamsize=userInput.nextInt() ;
				
			System.out.println("You have entered:" +teamsize);
				
			 
		 Club club=new Club();
		
			
			if( (ageGroup.contains("J"))   &&   (gender.contentEquals("MALE") )  &&  (role.contains("C") ) ) 
			{
		
			club.getJuniorMaleCoach(teamsize);
				
			}
			
			else if( (ageGroup.contains("J"))  &&  (gender.contentEquals("MALE"))  &&  (role.contains("P"))) 
			{
				System.out.println(3);
				club.getJuniorMalePlayer(teamsize);
			}
		
			
			else if( (ageGroup.contains("J"))  &&  (gender.contains("F"))  &&  (role.contains("C"))) {
				club.getJuniorFemaleCoach(teamsize);
			}
			
			else if( (ageGroup.contains("J"))  &&  (gender.contains("F"))  &&  (role.contains("P"))) {
				club.getJuniorFemalePlayer(teamsize);
			}
			
			
			else if( (ageGroup.contains("J"))  &&  (gender.contentEquals("MIXED"))  &&  (role.contains("C"))) {
			club.getJuniorMixedCoach(teamsize);
				
			}
			
			else if( (ageGroup.contains("J"))  &&  (gender.contentEquals("MIXED")) &&  (role.contains("P"))) {
				club.getJuniorMixedPlayer(teamsize);
					
			}
						
			else if( (ageGroup.contains("S"))  &&  (gender.contentEquals("MALE"))  &&  (role.contains("C"))) {
				club.getMaleSeniorCoach(teamsize);
			}
			
			else if((ageGroup.contains("S"))  &&  (gender.contentEquals("MALE"))  &&  (role.contains("P"))) {
				club.getMaleSeniorPlayer(teamsize);
			}
			
			else if( (ageGroup.contains("S"))  &&  (gender.contains("F"))  &&  (role.contains("C"))) {
				club.getFemaleSeniorCoach(teamsize);
			}
			
			else if( (ageGroup.contains("S"))  &&  (gender.contains("F"))  &&  (role.contains("P"))) {
				club.getFemaleSeniorPlayer(teamsize);
			}
			
			else if( (ageGroup.contains("S"))  &&  (gender.contentEquals("MIXED"))  &&  (role.contains("C")) ){
				club.getSeniorMixedCoach(teamsize);
			}
			
			else if ((ageGroup.contains("S"))  &&  (gender.contentEquals("MIXED"))  &&  (role.contains("P")) ) {
				club.getSeniorMixedPlayer(teamsize);
			}
			
			else if ((ageGroup.contains("S"))  &&  (gender.contentEquals("MIXED"))  &&  (role.contains("U")) ) {
				club.getSeniorMixedTeam(teamsize);
			}
			
			else if ((ageGroup.contains("S"))  &&  (gender.contentEquals("MALE"))  &&  (role.contains("U")) ) {
				club.getSeniorMaleTeam(teamsize);
			}
			
			else if ((ageGroup.contains("S"))  &&  (gender.contains("F"))  &&  (role.contains("U")) ) {
				club.getSeniorFemaleTeam(teamsize);
			}
			
			else if ((ageGroup.contains("J"))  &&  (gender.contentEquals("MIXED"))  &&  (role.contains("U")) ) {
				club.getJuniorMixedTeam(teamsize);
			}
			
			else if ((ageGroup.contains("J"))  &&  (gender.contentEquals("MALE"))  &&  (role.contains("U")) ) {
				club.getJuniorMaleTeam(teamsize);
			}
			
			else if ((ageGroup.contains("J"))  &&  (gender.contains("F"))  &&  (role.contains("U")) ) {
				club.getJuniorFemaleTeam(teamsize);
			}
			  
	}
			 
			  catch(Exception e) {
				  System.out.println("There are not enough Members available to create a team" );
              }
				  
			  
		
}



	
}
