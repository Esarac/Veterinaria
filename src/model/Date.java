package model;

/**
*Description: The class Date in the package model.<br>
*@author Esteban Ariza
*/
public class Date{

	//Attributes
	private int day;
	private int month;
	private int year;

	//Constructor
	/**
	*Description: the constructor of the class Date.<br>
	*Post: All The attributes of the clase are initialize.<br>
	*@param day The day we want to set.
	*@param month The month we want to set.
	*@param year The year we want to set.
	*/
	public Date(int day, int month, int year){

		this.day=day;
		this.month=month;
		this.year=year;

	}

	//Gets
	/**
	*Description: return the day of the date.<br>
	*@return An int that is the day of the date.<br>
	*/
	public int getDay(){

		return day;

	}

	/**
	*Description: return the month of the date.
	*@return An int that is the month of the date.
	*/
	public int getMonth(){

		return month;

	}

	/**
	*Description: return the year of the date.<br>
	*@return An int that is the year of the date.<br>
	*/
	public int getYear(){

		return year;

	}

	//Sets
	/**
	*Description: modified the day of the date.<br>
	*Post: The day was modified.<br>
	*@param day The day we want to set.
	*/
	public void setDay(int day){

		this.day=day;

	}

	/**
	*Description: modified the month of the date.<br>
	*Post: The month was modified.<br>
	*@param month The month we want to set.
	*/
	public void setMonth(int month){

		this.month=month;

	}

	/**
	*Description: modified the year of the date.<br>
	*Post: The year was modified.<br>
	*@param year The year we want to set.
	*/
	public void setYear(int year){

		this.year=year;

	}

}
