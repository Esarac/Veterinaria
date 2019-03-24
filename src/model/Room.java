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