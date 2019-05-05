package model;

/**
*Description: The class Medicine in the package model.<br>
*@author Esteban Ariza
*/
public class Medicine{

	//Attributes
	private String name;
	private String dose;
	private double periodicity;
	private double price;

	//Constructor
	/**
	*Description: the constructor of the class Medicine.<br>
	*Post: All The attributes of the clase are initialize.<br>
	*@param name The name we want to set.
	*@param dose The dose we want to set.
	*@param periodicity The periodicity we want to set.
	*@param price The price we want to set.
	*/
	public Medicine(String name, String dose, double periodicity, double price){

		this.name=name;
		this.dose=dose;
		this.periodicity=periodicity;
		this.price=price;

	}

	//Gets
	/**
	*Description: return the name of the medicine.<br>
	*@return A String that is the name of the medicine.
	*/
	public String getName(){

		return name;

	}

	/**
	*Description: return the dose of the medicine.<br>
	*@return A String that is the dose of the medicine.
	*/
	public String getDose(){

		return dose;

	}

	/**
	*Description: return the periodicity of the medicine.<br>
	*@return A double that is the periodicity of the medicine.
	*/
	public double getPeriodicity(){

		return periodicity;

	}

	/**
	*Description: return the price of the medicine.<br>
	*@return An double that is the price of the medicine.
	*/
	public double getPrice(){

		return price;

	}

	//Sets
	/**
	*Description: modified the name of the medicine.<br>
	*Post: The name was modified.<br>
	*@param name The name we want to set.
	*/
	public void setName(String name){

		this.name=name;

	}

	/**
	*Description: modified the dose of the medicine.<br>
	*Post: The dose was modified.<br>
	*@param dose The dose we want to set.
	*/
	public void setDose(String dose){

		this.dose=dose;

	}

	/**
	*Description: modified the periodicity of the medicine.<br>
	*Post: The periodicity was modified.<br>
	*@param periodicity The periodicity we want to set.
	*/
	public void setPeriodicity(double periodicity){

		this.periodicity=periodicity;

	}

	/**
	*Description: modified the price of the medicine.<br>
	*Post: The price was modified.<br>
	*@param price The price we want to set.
	*/
	public void setPrice(double price){

		this.price=price;

	}

}
