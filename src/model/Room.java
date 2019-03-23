package model;

public class Room{
	
	//Atributes
	private int number;
	private Pet pet;
	private Record actualRecord;
	private Date actualDate;
	
	//Constructor
	public Room(int number, Date actualDate){
		
		this.number=number;
		this.pet=null;
		this.actualRecord=null;
		this.actualDate=actualDate;
		
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
	
	public Date getActualDate(){
		
		return actualDate;
		
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
	
	public void setActualDate(Date actualDate){
		
		this.actualDate=actualDate;
		
	}
	
}