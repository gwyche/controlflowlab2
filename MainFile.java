import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////
//Step 1 and 2
public class MainFile
{
  
  public static void main(String args[]) 
  {
    // scanner reads input from the command line through various methods
    Scanner scanner = new Scanner(System.in);
  
    // prompt and read a string
    System.out.print("Enter your name: ");
    String username = scanner.next();
    System.out.println(" ");
  
    // prompt and read an int
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    System.out.println(" ");
    
    // prompt and read employment status//////////////////////////////////////////////////
    System.out.print("Enter: 'E', 'U', or 'S' for employment status - employed, unemployed, or student. ");
    String employmentabbreviation = scanner.next();
    
    String employment = "";
	switch(employmentabbreviation) {
		case "E":	
		employment = "employed";
		break;
		
		case "U":	
		employment = "unemployed";
		break;
		
		case "S":	
		employment = "a student";
		break;
	}
	  System.out.println(" ");
    // prompt and read vehicle ownership//////////////////////////////////////////////////
    System.out.print("Do you own a vehicle? Enter: 'C', 'T', 'S', or 'N' - automobile, truck, SUV, or no.");
    String vehabbreviation = scanner.next();
    
    String vehicle = "";
	switch(vehabbreviation) {
		case "C":	
		vehicle = "own a car.";
		break;
		
		case "T":	
		vehicle = "own a truck.";
		break;
		
		case "S":	
		vehicle = "own an SUV.";
		break;
		
		case "N":	
		vehicle = "do not own a vehicle.";
		break;
	}
	  System.out.println(" ");
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
    
    System.out.println(" ");
    System.out.println("- You are "+employment+" and "+vehicle);
    
    //char [] wordArray2 = new char[str.length()];
    int [] myArray = new int[30];
//////////////////////////////////////////////////////////////////////////////
    //Step 3
    
    //for loop that places an integer value equal to the index into each element of an array
    for(int i = 0; i < 30; i++)
    {
    	myArray[i] = i;
    }
    
    //enhanced for that prints each of the elements of the aforementioned array
	for (var item: myArray) {
		System.out.println(item);
	}
	
//////////////////////////////////////////////////////////////////////////////
	
	//use a for loop to place even integers into a 30 element array and print each element with an enhanced for
	int [] myEvenarray = new int[30];
    for(int i = 0; i < 30; i++)
    {
    	myEvenarray[i] = i * 2;
    }
    
	for (var item: myEvenarray) {
		System.out.println(item);
	}
    
//////////////////////////////////////////////////////////////////////////////
	
	//Reverse the order of the contents of myEvenarray
	int [] myReversedarray = new int[30];
	for(int i = 0; i < 30; i++)
	{
		myReversedarray[i] = myEvenarray[29 - i];
	}
	
	for (var item: myReversedarray) {
		System.out.println(item);
	}
	
/////////////////////////////////////////////////////////////////////////////
	//Step 4 repeat the previous 2 even array creation and print processes using only while loops
	int [] myEvenarray2 = new int[30];
	int j = 0;
	while(j < 30) {
		myEvenarray2[j] = j * 2;
		System.out.println(myEvenarray[j]);
		j++;
	}
	
	int [] myReversedarray2 = new int[30];
	int k = 0;
	while(k < 30) {
		myReversedarray2[k] = myEvenarray2[29 - k];
		System.out.println(myReversedarray2[k]);
		k++;
	}
/////////////////////////////////////////////////////////////////////////////
	
	
  }//MAIN END BRACKET
  
}//CLASS END BRACKET