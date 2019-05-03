package model;
import java.util.ArrayList;

public class Owner{
	
	//Atributes
	private String name;
	private String id;
	private String address;
	private int phone;
	private ArrayList<Pet> pets;//###
	
	//Constructor
	public Owner(String name, String id, String address, int phone, Pet pet){
		
		this.name=name;
		this.id=id;
		this.address=address;
		this.phone=phone;
		
		this.pets=new ArrayList<Pet>();//###
		
		this.pets.add(pet);//###
		
	}
	
	//Do
	public String createPet(Pet pet){
		
		String message="Se a creado la mascota exitosamente";
		
		this.pets.add(pet);
		
		return message;
		
	}
	
	/**
	*Description This method allows to update the basic data of a veterinary client, these data include, address and phone number.
	*pre: The client was created before.
	*post: The address and /or phone number of the client is updated.
	*@param The new address of the client. This param could be empty.
	*@param The new phone number of the client. This param could be empty.
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
	public String getName(){
		
		return name;
		
	}
	
	public String getId(){
		
		return id;
		
	}
	
	public String getAddress(){
		
		return address;
		
	}
	
	public int getPhone(){
		
		return phone;
		
	}
	
	public ArrayList<Pet> getPets(){
		
		return pets;
		
	}
	
	//Sets
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public void setId(String id){
		
		this.id=id;
		
	}
	
	public void setAddress(String address){
		
		this.address=address;
		
	}
	
	public void setPhone(int phone){
		
		this.phone=phone;
		
	}
	
	public void setPets(ArrayList<Pet> pets){
		
		this.pets=pets;
		
	}
	
}