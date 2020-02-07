package club;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main  {

	 



public Main(String firstName, String lastName, String gender, String nationality, LocalDate DOB,
			String addressLine1, String addressLine2, String city, String state, String postcode, String country) {
		
	}


static ArrayList<Team> memberdetails = new ArrayList<Team>();


	  
	public static void main(String[] args)  {
				
				// Team members(players)
		memberdetails.add(new Team("Sania", "Mirza", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		memberdetails.add(new Team("Anita", "Kingsly", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		memberdetails.add(new Team("Savita", "Shennai", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		memberdetails.add(new Team("Shamita", "Chandrashekar", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		memberdetails.add(new Team("Sunita", "verma", "PLAYER", "FEMALE", "Indian", LocalDate.of(1992, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		memberdetails.add(new Team("Nayana", "tara", "PLAYER", "FEMALE", "Indian", LocalDate.of(1991, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		memberdetails.add(new Team("Samanta", "Akkinan", "PLAYER", "FEMALE", "Indian", LocalDate.of(1990, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		
		memberdetails.add(new Team("Sathya", "Kiran", "PLAYER", "FEMALE", "Indian", LocalDate.of(1989, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		memberdetails.add(new Team("Maina", "Verma", "PLAYER", "FEMALE", "Indian", LocalDate.of(1988, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		memberdetails.add(new Team("Anusha", "Rakshith", "PLAYER", "FEMALE", "Indian", LocalDate.of(1986, 01, 14),
				"46,Quadrant court", "Mantri square", "Hyderabad", "Andra Pradesh", "70140", "INDIA"));
		
		
		memberdetails.add(new Team("John", "Cena", "PLAYER", "MALE", "Indian", LocalDate.of(1992, 11, 14), "46,Quadrant court",
				"Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		
		memberdetails.add(new Team("MS", "Dhoni", "PLAYER", "MALE", "Indian", LocalDate.of(1996, 11, 14), "46,Quadrant court",
				"Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		
		memberdetails.add(new Team("John", "Kingsly", "PLAYER", "MALE", "Indian", LocalDate.of(1987, 11, 14), "46,Quadrant court",
				"Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		
		memberdetails.add(new Team("Joshua", "Paul", "PLAYER", "MALE", "Indian", LocalDate.of(1997, 11, 14), "46,Quadrant court",
				"Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		
		memberdetails.add(new Team("Sachin", "Tendulkar", "PLAYER", "MALE", "Indian", LocalDate.of(1990, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));
		
		memberdetails.add(new Team("Virendra", "Shewag", "PLAYER", "MALE", "Indian", LocalDate.of(1986, 11, 14), "46,Quadrant court",
				"Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));

		memberdetails.add(new Team("Virat", "Kohli", "PLAYER", "MALE", "Indian", LocalDate.of(1988, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));
		
		memberdetails.add(new Team("Shikan", "Dhawan", "PLAYER", "MALE", "Indian", LocalDate.of(1987, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));
		
		memberdetails.add(new Team("Ashish", "Nehra", "PLAYER", "MALE", "Indian", LocalDate.of(1986, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));
		
		memberdetails.add(new Team("Zaheer", "Khan", "PLAYER", "MALE", "Indian", LocalDate.of(1983, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));
		
		memberdetails.add(new Team("Hruthik", "Roshan", "PLAYER", "MALE", "Indian", LocalDate.of(1985, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));
		
		memberdetails.add(new Team("Pramod", "Chakravarthi", "PLAYER", "MALE", "Indian", LocalDate.of(1989, 11, 14),
				"46,Quadrant court", "Jumla square", "Bombay", "Mumbai", "824211", "INDIA"));
		
		memberdetails.add(new Team("Preetham", "Prakash", "PLAYER", "MALE", "Indian", LocalDate.of(1984, 11, 14),
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
		
		memberdetails.add(new Team("Dheeraj", "Reddy", "PLAYER", "MALE", "Indian", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));

		memberdetails.add(new Team("Arjun", "Reddy", "PLAYER", "MALE", "Indian", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		memberdetails.add(new Team("Akhil", "Reddy", "PLAYER", "MALE", "Indian", LocalDate.of(2009, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		memberdetails.add(new Team("Akshay", "Reddy", "PLAYER", "MALE", "Indian", LocalDate.of(2009, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		memberdetails.add(new Team("Pramod", "Shetty", "PLAYER", "MALE", "Indian", LocalDate.of(2004, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		memberdetails.add(new Team("Nick", "Joan", "PLAYER", "MALE", "Indian", LocalDate.of(2004, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		memberdetails.add(new Team("David", "Paul", "PLAYER", "MALE", "Indian", LocalDate.of(2005, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		memberdetails.add(new Team("Jeremy", "Paul", "PLAYER", "MALE", "Indian", LocalDate.of(2007, 11, 14),
				"46,Quadrant court", "Mirla square", "Zarkhand", "Bihar", "824211", "INDIA"));
		
		memberdetails.add(new Team("Sheeba", "Sherlin", "PLAYER", "FEMALE", "British", LocalDate.of(2004, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Karishma", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Kareena", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Sonum", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Sonali", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Janavi", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Kushi", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Keerthana", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Shreedevi", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Shradha", "Kapoor", "PLAYER", "FEMALE", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		
		memberdetails.add(new Team("Karan", "Joar", "PLAYER", "MIXED", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Keane", "Joar", "PLAYER", "MIXED", "British", LocalDate.of(2007, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Kavin", "Joar", "PLAYER", "MIXED", "British", LocalDate.of(2008, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Kaira", "Joar", "PLAYER", "MIXED", "British", LocalDate.of(2009, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Kayush", "Joar", "PLAYER", "MIXED", "British", LocalDate.of(2010, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Kamal", "Joar", "PLAYER", "MIXED", "British", LocalDate.of(2004, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Krupa", "Joar", "PLAYER", "MIXED", "British", LocalDate.of(2005, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Leeta", "Joar", "PLAYER", "MIXED", "British", LocalDate.of(2006, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Mili", "Joar", "PLAYER", "MIXED", "British", LocalDate.of(2009, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Leena", "Joar", "PLAYER", "MIXED", "British", LocalDate.of(2004, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		
		memberdetails.add(new Team("Neeraj", "Malhotra", "PLAYER", "MIXED", "British", LocalDate.of(1987, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Manish", "Malhotra", "PLAYER", "MIXED", "British", LocalDate.of(1986, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Anshul", "Saxena", "PLAYER", "MIXED", "British", LocalDate.of(1985, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Mayur", "Malhotra", "PLAYER", "MIXED", "British", LocalDate.of(1984, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Jacob", "Pandey", "PLAYER", "MIXED", "British", LocalDate.of(1988, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Jevin", "Jerlin", "PLAYER", "MIXED", "British", LocalDate.of(1989, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Mahesh", "J", "PLAYER", "MIXED", "British", LocalDate.of(1983, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Harsheed", "Khan", "PLAYER", "MIXED", "British", LocalDate.of(1996, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Hardik", "Pandey", "PLAYER", "MIXED", "British", LocalDate.of(1997, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Harvik", "Malya", "PLAYER", "MIXED", "British", LocalDate.of(1986, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		
		
		
		// Coach
		memberdetails.add(new Team("Rahul", "Dravid", "COACH", "MALE", "Indian", LocalDate.of(1981, 01, 14), "46,Quadrant court",
				"Mantri square", "Bangalore", "Karnataka", "506204", "INDIA"));

		memberdetails.add(new Team("Tom", "Lodziak", "COACH", "MALE", "Indian", LocalDate.of(1983, 11, 14), "Sir Speed",
				"25 E Beaver St", "Jacksonville", "FL", "32202", "USA"));

		memberdetails.add(new Team("Chris", "Silverwood", "COACH", "MALE", "British", LocalDate.of(1975, 05, 05),
				"46,Quadrant court", "Jumla square", "Berkshire", "Hook", "RG27 9UP", "UK"));
		memberdetails.add(new Team("Gary", "Kirsten", "COACH", "MALE", "British", LocalDate.of(1975, 05, 05),
				"46,Quadrant court", "Jumla square", "Berkshire", "Hook", "RG27 9UP", "UK"));
		memberdetails.add(new Team("Andy ", "Flower", "COACH", "MALE", "British", LocalDate.of(1975, 05, 05),
				"46,Quadrant court", "Jumla square", "Berkshire", "Hook", "RG27 9UP", "UK"));
		
		memberdetails.add(new Team("Jocky", "Chan", "COACH", "MALE", "British", LocalDate.of(2005, 05, 05),
				"46,Quadrant court", "Jumla square", "Berkshire", "Hook", "RG27 9UP", "UK"));
		memberdetails.add(new Team("Jai", "Prasad", "COACH", "MALE", "British", LocalDate.of(2004, 05, 05),
				"46,Quadrant court", "Jumla square", "Berkshire", "Hook", "RG27 9UP", "UK"));
		
		
		memberdetails.add(new Team("Sohali", "Bhat", "COACH", "FEMALE", "British", LocalDate.of(2003, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Maseema", "Khan", "COACH", "FEMALE", "British", LocalDate.of(2004, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		memberdetails.add(new Team("Sonakshi", "Kapoor", "COACH", "FEMALE", "British", LocalDate.of(1983, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Sameera", "reddy", "COACH", "FEMALE", "British", LocalDate.of(1975, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Samrudh", "Kapoor", "COACH", "FEMALE", "British", LocalDate.of(1977, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Shravanti", "Kapoor", "COACH", "FEMALE", "British", LocalDate.of(1977, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		memberdetails.add(new Team("Shalini", "Shada", "COACH", "FEMALE", "British", LocalDate.of(1985, 11, 14),
				"46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		
		/*
		 * memberdetails.add(new Team("Salman", "Khan", "COACH", "MIXED", "British",
		 * LocalDate.of(1984, 11, 14), "46,Quadrant court", "Mirla square", "Berkshire",
		 * "Reading", "RG21 7uh", "UK")); memberdetails.add(new Team("Salman", "Khan",
		 * "COACH", "MIXED", "British", LocalDate.of(1984, 11, 14), "46,Quadrant court",
		 * "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		 * memberdetails.add(new Team("Sareez", "Khan", "COACH", "MIXED", "British",
		 * LocalDate.of(1983, 11, 14), "46,Quadrant court", "Mirla square", "Berkshire",
		 * "Reading", "RG21 7uh", "UK")); memberdetails.add(new Team("Faraha", "Akthar",
		 * "COACH", "MIXED", "British", LocalDate.of(1984, 11, 14), "46,Quadrant court",
		 * "Mirla square", "Berkshire", "Reading", "RG21 7uh", "UK"));
		 * memberdetails.add(new Team("Shameem Ali", "Khan", "COACH", "MIXED",
		 * "British", LocalDate.of(1985, 11, 14), "46,Quadrant court", "Mirla square",
		 * "Berkshire", "Reading", "RG21 7uh", "UK"));
		 * 
		 * memberdetails.add(new Team("Maksood Ali", "Khan", "COACH", "MIXED",
		 * "British", LocalDate.of(2005, 11, 14), "46,Quadrant court", "Mirla square",
		 * "Berkshire", "Reading", "RG21 7uh", "UK")); memberdetails.add(new
		 * Team("Mehaboob", "Khan", "COACH", "MIXED", "British", LocalDate.of(2004, 11,
		 * 14), "46,Quadrant court", "Mirla square", "Berkshire", "Reading", "RG21 7uh",
		 * "UK"));
		 * 
		 */
		
		System.out.println("TOTAL NUMBER :" +memberdetails.size());
		
		Scanner userInput = new Scanner(System.in);
		
		

		String ageGroup;
		String gender;
		String role;
		
		
		
		try {
		
		  System.out.println("Please enter the age Group. Enter Junior (if the age is below 18) or Senior  (if the age is above 18)" );
			 while(true) {
				ageGroup=userInput.nextLine().toUpperCase();
				 if(ageGroup.contentEquals("JUNIOR")) {
					
					 System.out.println("You have choosen the Junior age group");
				 		break;			
				 		}
				 else if(ageGroup.contentEquals("SENIOR")){
					 System.out.println("You have choosen the Senior age group");
					 break;
									}
				 else {
					 System.out.println("Please enter the valid input");
					
				 }
			 			}
			 
			 
			 System.out.println("Please enter the gender. Enter Male or Female or Mixed" );
			 while(true) {
				gender=userInput.nextLine().toUpperCase();
				 if(gender.contentEquals("MALE") ) 
				 {
					
					 System.out.println("You have selected MALE" );
				 		break;				}
				 else if(gender.contentEquals("FEMALE") )
				 {
					 System.out.println("You have selected FEMALE" );
						break;			}
				 else if(gender.contentEquals("MIXED")) {
					 System.out.println("You have selected MIXED" );
					 break;
				 }
			
				 else  {
					 System.out.println("Please enter the valid input. Enter 'Male' or 'Female' or 'Mixed'");
				 }
			 			
			 			}
			 
			 
			 System.out.println("Please enter the role.Enter Coach or Player");
			 while(true) {
			 role=userInput.nextLine().toUpperCase();
			 if(role.contentEquals("COACH"))
			 {
				 System.out.println("You have selected COACH");
				 break;
			 }
			 else if(role.contentEquals("PLAYER")) {
				 System.out.println("You have selected PLAYER");
				 break;
			 }
				/*
				 * else if(role.contentEquals("UNASSIGNED") || (role.contentEquals("U"))) {
				 * System.out.println("You have selected  unassigned"); break; }
				 */
				/*
				 * else if(role.isEmpty() || (role.isBlank())) {
				 * System.out.println("Enter the role"); break; }
				 */
			 else
			 {
				 System.out.println("Enter the role");
			 }
			 }
			 
			 
			 System.out.println("How many players would you like in the team ?. Please enter the number" );
			 
			 int teamsize=userInput.nextInt() ;
				
			System.out.println("You have entered:" +teamsize);
				
			 
		 Team team=new Team();
		
			
			if( (ageGroup.contains("JUNIOR"))   &&   (gender.contentEquals("MALE") )  &&  (role.contentEquals("COACH") ) ) 
			{
		
				team.getJuniorMaleCoach(teamsize);
				
			}
			
			else if( (ageGroup.contains("JUNIOR"))  &&  (gender.contentEquals("MALE"))  &&  (role.contentEquals("PLAYER"))) 
			{
				team.getJuniorMalePlayer(teamsize);
			}
		
			
			else if( (ageGroup.contains("JUNIOR"))  &&  (gender.contentEquals("FEMALE"))  &&  (role.contentEquals("COACH"))) {
				team.getJuniorFemaleCoach(teamsize);
			}
			
			else if( (ageGroup.contains("JUNIOR"))  &&  (gender.contentEquals("FEMALE"))  &&  (role.contentEquals("PLAYER"))) {
				team.getJuniorFemalePlayer(teamsize);
			}
			
			
			else if( (ageGroup.contains("JUNIOR"))  &&  (gender.contentEquals("MIXED"))  &&  (role.contentEquals("COACH"))) {
				team.getJuniorMixedCoach(teamsize);
				
			}
			
			else if( (ageGroup.contains("JUNIOR"))  &&  (gender.contentEquals("MIXED")) &&  (role.contentEquals("PLAYER"))) {
				team.getJuniorMixedPlayer(teamsize);
					
			}
			else if( (ageGroup.contains("SENIOR"))  &&  (gender.contentEquals("MIXED")) &&  (role.contentEquals("PLAYER"))) {
				team.getSeniorMixedPlayer(teamsize);
					
			}
			else if( (ageGroup.contains("SENIOR"))  &&  (gender.contentEquals("MIXED")) &&  (role.contentEquals("COACH"))) {
				team.getSeniorMixedCoach(teamsize);
					
			}
				
						
			else if( (ageGroup.contains("SENIOR"))  &&  (gender.contentEquals("MALE"))  &&  (role.contentEquals("COACH"))) {
				team.getMaleSeniorCoach(teamsize);
			}
			
			else if((ageGroup.contains("SENIOR"))  &&  (gender.contentEquals("MALE"))  &&  (role.contentEquals("PLAYER"))) {
				team.getMaleSeniorPlayer(teamsize);
			}
			
			else if( (ageGroup.contains("SENIOR"))  &&  (gender.contentEquals("FEMALE"))  &&  (role.contentEquals("COACH"))) {
			
				team.getFemaleSeniorCoach(teamsize);
			}
			
			else if( (ageGroup.contains("SENIOR"))  &&  (gender.contentEquals("FEMALE"))  &&  (role.contentEquals("PLAYER"))) {
				team.getFemaleSeniorPlayer(teamsize);
			}
			
		
			  
	}
			 
			  catch(Exception e) {
				  System.out.println("There are not enough Members available to create a team" );
              }
				  
			  
		
}



	
}
