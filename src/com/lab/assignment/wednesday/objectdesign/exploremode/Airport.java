package com.lab.assignment.wednesday.objectdesign.exploremode;

import java.util.Scanner;

public class Airport 
{

	public static void main(String[] args) 
	{
		Scanner crashAndBurn = new Scanner(System.in);
		String userAirplaneInput = null;
		boolean userMistake = false;
		int airPlaneTrait = 0;
		String airPlaneTraitString = null;
		
		CommercialAirplane ourNewPlane = new CommercialAirplane();
		
		System.out.println("Welcome to the Airport");
		System.out.println("Tell us about your flight needs for today.");
		System.out.println("Where would you like to travel today?");
		String userDestination = crashAndBurn.nextLine();
		do
		{
			System.out.println("How many doors do you want the airplane to have?" );
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		}
		while (userMistake);
		airPlaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setDoors(airPlaneTrait);
		
		do
		{
			System.out.println("How many windows do you want the airplane to have?" );
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		}
		while (userMistake);
		airPlaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setWindows(airPlaneTrait);
		
		do
		{
			System.out.println("How many seats do you want the airplane to have?" );
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		}
		while (userMistake);
		airPlaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setSeats(airPlaneTrait);
		
		do
		{
			System.out.println("How many wheels do you want the airplane to have?" );
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		}
		while (userMistake);
		airPlaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setWheels(airPlaneTrait);
		
		do
		{
			System.out.println("How many wings do you want the airplane to have?" );
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		}
		while (userMistake);
		airPlaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setWings(airPlaneTrait);
		
		do
		{
			System.out.println("How many pilots do you want to fly the airplane?" );
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		}
		while (userMistake);
		airPlaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setPilot(airPlaneTrait);
		
		do
		{
			System.out.println("How many flight attendants to you wish to be on the airplane?" );
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		}
		while (userMistake);
		airPlaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setFlightAttendants(airPlaneTrait);
		
		do
		{
			System.out.println("How long of a wingspan do you want the airplane to have?" );
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		}
		while (userMistake);
		airPlaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setWingSpan(airPlaneTrait);
		
		do
		{
			System.out.println("What snack would you like to be served on the flight?" );
			userAirplaneInput = crashAndBurn.nextLine();
		
			userMistake = stringEnteredIsValid(userAirplaneInput);
		}
		while (userMistake);
		airPlaneTraitString = userAirplaneInput;
		ourNewPlane.setSnacksServed(airPlaneTraitString);
		
		do
		{
			System.out.println("What drink would you like to be served on the flight?" );
			userAirplaneInput = crashAndBurn.nextLine();
		
			userMistake = stringEnteredIsValid(userAirplaneInput);
		}
		while (userMistake);
		airPlaneTraitString = userAirplaneInput;
		ourNewPlane.setWhatTypeofDrink(airPlaneTraitString);
		
		System.out.println(ourNewPlane.toString());
		System.out.println("You're in luck we have the perfect plane for your trip to " + userDestination);
		
	}//main
	
	public static boolean numberEnteredIsValid(String someStringToCreateANumber)
	{
		try
		{
			int aNumber = Integer.parseInt(someStringToCreateANumber);
			return false;
		}
		catch (NumberFormatException e)
		{
			return true;
		}
	}
	

	public static boolean stringEnteredIsValid(String someStringToCreateAString)
	{
		try
		{
			float aFloat = Float.parseFloat(someStringToCreateAString);
			return true;
		}
		catch (NumberFormatException e)
		{
			return false;
		}
	}
	

}
