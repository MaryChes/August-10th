package com.lab.assignment.wednesday.objectdesign.adventuremode;

public class CommercialAirplane extends Airplane
{
	public int doors = 0;
	public int windows = 0;
	public int seats = 0;
	public int wheels = 0;
	public int wings = 0;
	public int pilot = 0;
	public int flightAttendants = 0;
	public int wingSpan = 0;
	public String snacksServed = null;
	public String whatTypeofDrink = null;
	
	public CommercialAirplane(int doors, int windows, int seats, int wheels, int wings, int pilot, int flightAttendants,
			int wingSpan, String snacksServed, String whatTypeofDrink)
	{
		this.doors = doors;
		this.windows = windows;
		this.seats = seats;
		this.wheels = wheels;
		this.wings = wings;
		this.pilot = pilot;
		this.flightAttendants = flightAttendants;
		this.wingSpan = wingSpan;
		this.snacksServed = snacksServed;
		this.whatTypeofDrink = whatTypeofDrink;
	}

	public CommercialAirplane()
	{
	
	}

	public int getDoors()
	{
		return doors;
	}

	public void setDoors(int doors)
	{
		this.doors = doors;
	}

	public int getWindows()
	{
		return windows;
	}

	public void setWindows(int windows)
	{
		this.windows = windows;
	}

	public int getSeats()
	{
		return seats;
	}

	public void setSeats(int seats)
	{
		this.seats = seats;
	}

	public int getWheels()
	{
		return wheels;
	}

	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}

	public int getWings()
	{
		return wings;
	}

	public void setWings(int wings)
	{
		this.wings = wings;
	}

	public int getPilot()
	{
		return pilot;
	}

	public void setPilot(int pilot)
	{
		this.pilot = pilot;
	}

	public int getFlightAttendants()
	{
		return flightAttendants;
	}

	public void setFlightAttendants(int flightAttendants)
	{
		this.flightAttendants = flightAttendants;
	}

	public int getWingSpan()
	{
		return wingSpan;
	}

	public void setWingSpan(int wingSpan)
	{
		this.wingSpan = wingSpan;
	}

	public String getSnacksServed()
	{
		return snacksServed;
	}

	public void setSnacksServed(String snacksServed)
	{
		this.snacksServed = snacksServed;
	}

	public String getWhatTypeofDrink()
	{
		return whatTypeofDrink;
	}

	public void setWhatTypeofDrink(String whatTypeofDrink)
	{
		this.whatTypeofDrink = whatTypeofDrink;
	}

	@Override
	public void flies()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void starts()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stops()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isFlying()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLanding()
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
	
	
}
