package model;
import java.util.ArrayList;

/**
*Description: The class Owner in the package model.<br>
*@author Esteban Ariza
*/
public class Owner{

	//Attributes
	private String name;
	private String id;
	private String address;
	private int phone;
	private ArrayList<Pet> pets;//###

	//Constructor
	/**
	*Description: the constructor of the class Owner.<br>
	*Post: All The attributes of the clase are initialize.<br>
	*@param name The name we want to set.
	*@param id The id we want to set.
	*@param address The address we want to set.
	*@param phone The phone we want to set.
	*@param pet The pet we want to add.
	*/
	public Owner(String name, String id, String address, int phone, Pet pet){

		this.name=name;
		this.id=id;
		this.address=address;
		this.phone=phone;

		this.pets=new ArrayList<Pet>();//###

		this.pets.add(pet);//###

	}

	//Do
	/**
	*Description: add a pet to the ArrayList pets.<br>
	*Post: The pet was added.<br>
	*@param pet The pet we want to add.
	*@return A String message that saids "Se ha creado la mascota exitosamente".
	*/
	public String createPet(Pet pet){

		String message="Se ha creado la mascota exitosamente";

		this.pets.add(pet);

		return message;

	}

	/**
	*Description This method allows to update the basic data of a veterinary client, these data include, address and phone number.<br>
	*pre: The client was created before.<br>
	*post: The address and /or phone number of the client is updated.<br>
	*@param address The new address of the client. This param could be empty.
	*@param phone The new phone number of the client. This param could be empty.
	*/
	public void changeAddressAndPhone(String address, int phone){

		if(!address.equals("")){

			this.address=address;

		}
		if(phone!=0){

			this.phone=phone;

		}

	}

	//Gets
	/**
	*Description: return the name of the owner.<br>
	*@return A String that is the name of the owner.
	*/
	public String getName(){

		return name;

	}

	/**
	*Description: return the id of the owner.<br>
	*@return A String that is the id of the owner.
	*/
	public String getId(){

		return id;

	}

	/**
	*Description: return the address of the owner.<br>
	*@return A String that is the address of the owner.
	*/
	public String getAddress(){

		return address;

	}

	/**
	*Description: return the phone of the owner.<br>
	*@return An int that is the phone of the owner.
	*/
	public int getPhone(){

		return phone;

	}

	/**
	*Description: return the pets of the owner.<br>
	*@return An ArrayList that is the pets of the owner.
	*/
	public ArrayList<Pet> getPets(){

		return pets;

	}

	//Sets
	/**
	*Description: modified the name of the owner.<br>
	*Post: The name was modified.<br>
	*@param name The name we want to set.
	*/
	public void setName(String name){

		this.name=name;

	}

	/**
	*Description: modified the id of the owner.<br>
	*Post: The id was modified.<br>
	*@param id The id we want to set.
	*/
	public void setId(String id){

		this.id=id;

	}

	/**
	*Description: modified the address of the owner.<br>
	*Post: The address was modified.<br>
	*@param address The address we want to set.
	*/
	public void setAddress(String address){

		this.address=address;

	}

	/**
	*Description: modified the phone of the owner.<br>
	*Post: The phone was modified.<br>
	*@param phone The phone we want to set.
	*/
	public void setPhone(int phone){

		this.phone=phone;

	}

	/**
	*Description: modified the pets of the owner.<br>
	*Post: The pets was modified.<br>
	*@param pets The ArrayList of pets we want to set.
	*/
	public void setPets(ArrayList<Pet> pets){

		this.pets=pets;

	}

}
