package candyMachine;

import java.util.Scanner;

public class CANDYMACHINE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();//System.out.println will make the words printed on the console along with the next phrases
		System.out.println("Jharry Gando Sweet Store");
		System.out.println();
		System.out.println("Mabuhay! Welcome Buyers");
		System.out.println();
		
		Scanner sc = new Scanner(System.in); //This will allow the user to input a word on the console depending on the needed data
		System.out.print("Name of the Buyers: "); //This will be printed
		String a = sc.nextLine();// along with your name
		
		
		{
			//This is just the same on the given above
			System.out.println("Candy Menu:");
			System.out.println();
			
			Scanner scan = new Scanner(System.in); //Again I use this because in the next lines, The user will be needing to input the needed info.
			
			int ChosenCandy; //int is a datatype and Chosencandy is a identifier.
			int TotalCandyCost = 0;//int is a datatype and TotalCandyCost is an Identifier and 0 is a value
		
			//DISPLAY CANDY PRODUCTS AND IT'S PRICES
			System.out.println(" 		Product Cost");	
			System.out.println("[1]  HERSHEY'S      60");
			System.out.println("[2]  KIT KAT	    30");
			System.out.println("[3]  SNICKERS       50");
			System.out.println("[4]  BUBBLE POPS   25");
			System.out.println("[5]  TOBLERONE	    70");
			System.out.println("[6]  LOLLIPOP       20");
			System.out.println("[7]  DAIRY MILK	    60");
			System.out.println("[8]  M&MS	       55");
			System.out.println("[9]  REESE'S	    45");
			System.out.println("[10] COTTON CANDY   15");
			System.out.println();
			
			System.out.print("Count your Candies Picked: "); //How many Candies you want to order
			ChosenCandy = scan.nextInt(); //your answer here
			
			int[] BoughtCandies = new int[ChosenCandy]; // forgot to remind that int stands for Integer
			//BoughtCandies refers to the candy the buyer picked
			System.out.println("Pick your Candies Sweeteers:"); //this will be printed in the console once you entered your 													//answer on how many candies you want
			for(int i = 0; i < ChosenCandy; i++) {
				BoughtCandies[i] = scan.nextInt();//then your answers will be printed again
				}
			
			
			System.out.println("Purchased Candy/Candies: "); //After that, this will be printed in the console
			
			//This process shows what candies you want based on the questions above
			for(int i = 0; i < ChosenCandy; i++) {
				//I will be using if else conditional statements since there are many Candy Products
				if(BoughtCandies[i] == 1) {
					System.out.println("HERSHEY'S			60");// this will be read as If KITKAT is equal to 1 then 									//KITKAT 20 will be printed in the console and that also goes as follows
					} else if (BoughtCandies[i] == 2) {
						System.out.println("KIT KAT		    30");
					} else if (BoughtCandies[i] == 3) {
						System.out.println("SNICKERS		50");
					} else if (BoughtCandies[i] == 4) {
						System.out.println("BUBBLE POPS 	25");
					} else if (BoughtCandies[i] == 5) {
						System.out.println("TOBLERONE		70"); 
					} else if (BoughtCandies[i] == 6) {
						System.out.println("LOLLIPOP    	20");
					} else if (BoughtCandies[i] == 7) {
						System.out.println("DAIRY MILK		60");
					} else if (BoughtCandies[i] == 8) {
						System.out.println("M&MS	    	55");
					} else if (BoughtCandies[i] == 9) {
						System.out.println("REESE'S 		45");
						}
				}
			System.out.println();
			
			System.out.print("Total Candies Costs: "); //this will be printed in the console
			
			//this next process will show if the buyer buys 3 or more Candy Products
			//example if the buyer buys 1 LOLLIPOP and 2 SNICKERS 3 M&MS
			//then their prices will be added
			for(int i = 0; i < ChosenCandy; i++) {
				if(BoughtCandies[i] == 1) {
					//BoughtCandies represents the Candy Products
					TotalCandyCost += 60;
					} else if (BoughtCandies[i] == 2) {
						TotalCandyCost += 30;
				    } else if (BoughtCandies[i] == 3) {
						TotalCandyCost += 50;
					} else if (BoughtCandies[i] == 4) {
						TotalCandyCost += 25;
					} else if (BoughtCandies[i] == 5) {
						TotalCandyCost += 70; 
					} else if (BoughtCandies[i] == 6) {
						TotalCandyCost += 20;
					} else if (BoughtCandies[i] == 7) {
						TotalCandyCost += 60;
					} else if (BoughtCandies[i] == 8) {
						TotalCandyCost += 55;
					} else if (BoughtCandies[i] == 9) {
						TotalCandyCost += 45;
					
						
							}
				}
			
			System.out.print(TotalCandyCost);//This will be printed in the console along with the total cost of the bought candies 							//by the buyer
			System.out.println();
			System.out.println("Thank you for purchasing Jharry's Sweet Store. Please Come Back and Have a Sweet"
					+ ""
					+ " Day!"); 					//this will also be printed in the console
		
		}
		}
	}

		

