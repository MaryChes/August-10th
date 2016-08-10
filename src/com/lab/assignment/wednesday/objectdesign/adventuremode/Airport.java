package com.lab.assignment.wednesday.objectdesign.adventuremode;

import java.util.Scanner;

public class Airport 
{

	
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
