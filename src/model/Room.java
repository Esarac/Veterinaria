package model;

public class Room{
	
	//Atributes
	private int number;
	private Pet pet;
	private Record actualRecord;
	
	//Constructor
	public Room(int number){
		
		this.number=number;
		this.pet=null;
		this.actualRecord=null;
		
	}
	
	//Do
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
	*Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.
	*pre: The patient clinic story must be not null.
	*post: New medicines were added to the patient clinic story.
	*@param The medicine name. This param must be not null.
	*@param The medicine dose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned.
	*@param The medicine cost by each dose. This param could be empty.
	*@param The frequency of medicine application. This param could be empty.
	*@return A message that indiques if medicine was added to the patient clinic story
	*/
	public String addMedicine(String name, String dose, double periodicity, double price){
		
		String message="Se ha anadido una medicina a la historia clinica actual";
		
		Medicine medicine=new Medicine(name, dose, periodicity, price);
		actualRecord.addMedicines(medicine);
		
		return message;
		
	}
	
	//Gets
	public int getNumber(){
		
		return number;
		
	}
	
	public Pet getPet(){
		
		return pet;
		
	}
	
	public Record getActualRecord(){
		
		return actualRecord;
		
	}
	
	//Sets
	public void setNumber(int number){
		
		this.number=number;
		
	}
	
	public void setPet(Pet pet){
		
		this.pet=pet;
		
	}
	
	public void setActualRecord(Record actualRecord){
		
		this.actualRecord=actualRecord;
		
	}
	
}