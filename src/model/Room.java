package model;

/**
*Description: The class Room in the package model.<br>
*@author Esteban Ariza
*/
public class Room{

	//Attributes
	private int number;
	private Pet pet;
	private Record actualRecord;

	//Constructor
	/**
	*Description: the constructor of the class Room.<br>
	*Post: All The attributes of the clase are initialize.<br>
	*@param number The number we want to set.
	*/
	public Room(int number){

		this.number=number;
		this.pet=null;
		this.actualRecord=null;

	}

	//Do
	/**
	*Description: This method create an actual Record.<br>
	*Pre: The attribute pet and the records(0) atribute of this pet must not be null.<br>
	*Post: The attribute actualDate was modified.<br>
	*@param symptom The symptom for the record.
	*@param diagnostic The diagnostic for the record.
	*@param dateIn The date in for the record.
	*@throws NullPointerException if the pet and the record 0 of the pet is null.
	*/
	public void createRecord(String symptom, String diagnostic, Date dateIn){

		String ownerName=pet.getRecords().get(0).getOwnerName();
		String ownerId=pet.getRecords().get(0).getOwnerId();
		String ownerAddress=pet.getRecords().get(0).getOwnerAddress();
		int ownerPhone=pet.getRecords().get(0).getOwnerPhone();

		String petName=pet.getRecords().get(0).getPetName();
		String petId=pet.getRecords().get(0).getPetId();
		char petType=pet.getRecords().get(0).getPetType();
		int petAge=pet.getRecords().get(0).getPetAge();
		double petWeight=pet.getRecords().get(0).getPetWeight();
		double petHeight=pet.getRecords().get(0).getPetHeight();

		Record record=new Record(true, symptom, diagnostic, dateIn, ownerName, ownerId, ownerAddress, ownerPhone, petName, petId, petType, petAge, petWeight, petHeight);

		actualRecord=record;

	}

	/**
	*Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.<br>
	*pre: The patient clinic story must be not null.<br>
	*post: New medicines were added to the patient clinic story.<br>
	*@param name The medicine name. This param must be not null.
	*@param dose The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned.
	*@param periodicity The medicine cost by each dose. This param could be empty.
	*@param price The frequency of medicine application. This param could be empty.
	*@return A message that indiques if medicine was added to the patient clinic story
	*/
	public String addMedicine(String name, String dose, double periodicity, double price){

		String message="Se ha anadido una medicina a la historia clinica actual";

		Medicine medicine=new Medicine(name, dose, periodicity, price);
		actualRecord.addMedicines(medicine);

		return message;

	}

	//Gets
	/**
	*Description: return the number of the room.<br>
	*@return An int that is the number of the room.
	*/
	public int getNumber(){

		return number;

	}

	/**
	*Description: return the pet of the room.<br>
	*@return A Pet that is the pet of the room.
	*/
	public Pet getPet(){

		return pet;

	}

	/**
	*Description: return the actual record of the room.<br>
	*@return A Record that is the actual record of the room.
	*/
	public Record getActualRecord(){

		return actualRecord;

	}

	//Sets
	/**
	*Description: modified the number of the room.<br>
	*Post: The number was modified.<br>
	*@param number The number we want to set.
	*/
	public void setNumber(int number){

		this.number=number;

	}

	/**
	*Description: modified the pet of the room.<br>
	*Post: The pet was modified.<br>
	*@param pet The pet we want to set.
	*/
	public void setPet(Pet pet){

		this.pet=pet;

	}

	/**
	*Description: modified the actual record of the room.<br>
	*Post: The actual record was modified.<br>
	*@param actualRecord The actual record we want to set.
	*/
	public void setActualRecord(Record actualRecord){

		this.actualRecord=actualRecord;

	}

}
