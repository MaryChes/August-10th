package com.lab.assignment.wednesday.objectdesign.adventuremode;

public class Boeing extends CommercialAirplane
{
	public int yearBuilt = 0;
	public String engineType = null;
	
	public Boeing(int doors, int windows, int seats, int wheels, int wings, int pilot, int flightAttendants,
			int wingSpan, String snacksServed, String whatTypeofDrink, int yearBuilt, String engineType)
	{
		super(doors, windows, seats, wheels, wings, pilot, flightAttendants, wingSpan, snacksServed, whatTypeofDrink);
		this.yearBuilt = yearBuilt;
		this.engineType = engineType;
	}

	public Boeing()
	{
		super();
	}

	public int getYearBuilt()
	{
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt)
	{
		this.yearBuilt = yearBuilt;
	}

	public String getEngineType()
	{
		return engineType;
	}

	public void setEngineType(String engineType)
	{
		this.engineType = engineType;
	}	
}
