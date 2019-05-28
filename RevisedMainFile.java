import java.util.Scanner;
//STEP 5 Encapsulate the mechanics we made in step 1 inside a do while statement so the user can repeat the program again or end it
public class RevisedMainFile
{
  
  public static void main(String args[]) 
  {
	

    // scanner reads input from the command line through various methods
    Scanner scanner = new Scanner(System.in);
  
	//DO START///////////////////////////////////////////////////////////////////////////////////
    String userchoice = "";
    do 
	 {//do open bracket
    
    
    // prompt and read a string
    System.out.print("Enter your name: ");
    String username = scanner.next();
  
    // prompt and read an int
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
  
    String output = "";
    if(age >= 16) {
    	output = "You are old enough to drive.";
    }
    else {
    	output = "You are not old enough to drive.";
    }
    System.out.print(String.format("Hello %s, your age is %d", username, age, output));
    System.out.println(" ");
    System.out.println(". "+output);
    //
    if(age >= 18) {
    	output = "You are old enough to vote";
    }
    else {
    	output = "You are not old enough to vote";
    }
    //System.out.print(String.format("Hello %s, your age is %d", username, age, output));
    System.out.println(". "+output);
    //
    if(age >= 21) {
    	output = "You are old enough to drink";
    }
    else {
    	output = "You are not old enough to vote";
    }
    //System.out.print(String.format("Hello %s, your age is %d", username, age, output));
    System.out.println(". "+output);
    //
    if(age >= 35) {
    	output = "You are old enough to be President";
    }
    else {
    	output = "You are not old enough to be President";
    }
    //System.out.print(String.format("Hello %s, your age is %d", username, age, output));
    System.out.println(". "+output);
    //
    if(age >= 55) {
    	output = "You can join AARP";
    }
    else {
    	output = "You cannot join AARP";
    }
    //System.out.print(String.format("Hello %s, your age is %d", username, age, output));
    System.out.println(". "+output);
    //
    if(age > 67) {
    	output = "You can start drawing Social Security";
    }
    else {
    	output = "You cannot start drawing Social Security";
    }
    //System.out.print(String.format("Hello %s, your age is %d", username, age, output));
    System.out.println(". "+output);
///////////END DO///////////////////////////////////////////////////////////////////////////////////// 
    // prompt and read a string
    System.out.print("Do you want to answer the questions again? Y or N ");
    userchoice = scanner.next();
	  } while(userchoice.equals("y")); //do close bracket
    
    //request input value from user to pass to methods 'branchingvoid' and 'branchingreturns'
    System.out.println("Choose Integer For Method Tests: ");
    int methodinput = scanner.nextInt();  // Arbitrary input value
    branchingvoid(methodinput);
    //branchingreturns(methodinput);
    if(branchingreturns(methodinput) != -1) {
    	System.out.println("Running total of even array elements matches the input.");
    }
    
  } // main close bracket
  
/////////////////////////////////////////////////////////////////////////////////////////////////////
  
  //Step 5 Method that prints even numbers
  public static void branchingvoid(int input) {
	    //for loop that places an integer value equal to the index into each element of an array
	  int [] myArray = new int[30];  
	  for(int i = 0; i < 30; i++)
	    {
	    	myArray[i] = i;
	    }
	  for(int j = 0; j < 30; j++) {
		  if(myArray[j] % 2 == 0) {
			  if(myArray[j] == input) {
				  break;
			  }
			  System.out.println(myArray[j]);
		  }
	  }
  }//branchingvoid method close bracket
	  
	  //Step 5 Method that returns odd numbers
	  public static int branchingreturns(int input) {
		    //for loop that places an integer value equal to the index into each element of an array
		  int [] myArray = new int[30];  
		  int total = 0;
		  int valuetoreturn = -1; //variable that will be returned to main and defaults at -1. Any deviation from this value leads to the user being notified
		  for(int i = 0; i < 30; i++)
		    {
		    	myArray[i] = i;
		    }
		  //Array is now populated with values matching their indices
		  
		  for(int j = 0; j < 30; j++) {//print odd-numbered members of myArray.
			  if(myArray[j] % 2 != 0) {
				  System.out.println(myArray[j]);
			  }
			  else
			  {
				  total = total + myArray[j];//add up the sum of the even members of myArray up to the current element j
				  if (total == input)
				  {
					  valuetoreturn = total;
					  continue;
				  }
			  }
		  }
		return valuetoreturn;
  }//branchingreturns method close bracket
  
} // class close bracket