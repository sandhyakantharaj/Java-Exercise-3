package club;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Club {

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
			  
			  
			  if((year< 18) && (memAry1.get(i).getGender().contentEquals("MIXED")) && (memAry1.get(i).getRole().contentEquals("COACH"))) {
	  
				  memAry2.add(memAry1.get(i));
	  
			  		} i++;
	  
			  		if(memAry2.size()==teamsize) { 
			  			x=false;
	  
			  		System.out.println("Here you go" );
			  		
			  		System.out.println(memAry2.toString() + ""); }
	  
		  			}
	  
		
	}
	//junior mixed coach
		public void getJuniorMixedPlayer(int teamsize) {
			// TODO Auto-generated method stub
			 while(x) {
				  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
				  year=age.getYears();
				  
				  
				  if((year< 18) && (memAry1.get(i).getGender().contentEquals("MIXED")) && (memAry1.get(i).getRole().contentEquals("PLAYER"))) {
		  
					  memAry2.add(memAry1.get(i));
		  
				  		} i++;
		  
				  		if(memAry2.size()==teamsize) { 
				  			x=false;
		  
				  		System.out.println("Here you go" );
				  		
				  		System.out.println(memAry2.toString() + ""); }
		  
			  			}
		  
		}


		public void getSeniorMixedPlayer(int teamsize) {
			 while(x) {
				  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
				  year=age.getYears();
				  
				  
				  if((year>= 18) && (memAry1.get(i).getGender().contentEquals("MIXED")) && (memAry1.get(i).getRole().contentEquals("PLAYER"))) {
		  
					  memAry2.add(memAry1.get(i));
		  
				  		} i++;
		  
				  		if(memAry2.size()==teamsize) { 
				  			x=false;
		  
				  		System.out.println("Here you go" );
				  		
				  		System.out.println(memAry2.toString() + ""); }
		  
			  			}
		  
		}


		public void getSeniorMixedCoach(int teamsize) {
			 while(x) {
				  Period age=Period.between(memAry1.get(i).getDOB(),LocalDate.now()); int
				  year=age.getYears();
				  
				  
				  if((year>= 18) && (memAry1.get(i).getGender().contentEquals("MIXED")) && (memAry1.get(i).getRole().contentEquals("COACH"))) {
		  
					  memAry2.add(memAry1.get(i));
		  
				  		} i++;
		  
				  		if(memAry2.size()==teamsize) { 
				  			x=false;
		  
				  		System.out.println("Here you go" );
				  		
				  		System.out.println(memAry2.toString() + ""); }
		  
			  			}
		  
			
		}
	
	
	}
	 
	





		 

		 
	
		 
	

	
		 
		 
		 
		 
	
	 
	  
	  
	 


