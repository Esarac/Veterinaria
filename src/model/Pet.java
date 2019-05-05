package model;
import java.util.ArrayList;

/**
*Description: The class Pet in the package model.<br>
*@author Esteban Ariza
*/
public class Pet{

	//Constants
	public static final char DOG='D';
	public static final char CAT='C';
	public static final char BIRD='B';
	public static final char OTHER='O';

	//Attributes
	private String name;
	private String id;
	private char type;
	private int age;
	private double weight;
	private double height;
	private ArrayList<Record> records;

	//Constructor
	/**
	*Description: the constructor of the class Pet.<br>
	*Post: All The attributes of the clase are initialize.<br>
	*@param name The name we want to set.
	*@param id The id we want to set.
	*@param type The type we want to set.
	*@param age The age we want to set.
	*@param weight The weight we want to set.
	*@param height The height we want to set.
	*@param record The record we want to set on the records(0).
	*/
	public Pet(String name, String id, char type, int age, double weight, double height, Record record){

		this.name=name;
		this.id=id;
		this.type=type;
		this.age=age;
		this.weight=weight;
		this.height=height;

		this.records=new ArrayList<Record>();

		this.records.add(record);

	}

	//Do
	/**
	*Description This method allows to calculate the body mass index for a pet.<br>
	*pre: The pet was created before and its attributes height and weight are not null neither height must be zero.<br>
	*post: The BMI is calculated.<br>
	*@return The pet body mass index. Returns -1 if the height is zero  due to the division on zero does not exist.
	*/
	public double calculateBmi(){

		double bmi=0;

		if(height!=0){

			bmi=((weight)/(height*height));

		}
		else{

			bmi=-1;

		}


		return bmi;

	}

	//Adds
	/**
	*Description: add a record to the ArrayList records .<br>
	*Post: The record was added.<br>
	*@param record The record we want to add.
	*/
	public void addRecords(Record record){

		this.records.add(record);

	}

	//Gets
	/**
	*Description: return the name of the pet.<br>
	*@return A String that is the name of the pet.
	*/
	public String getName(){

		return name;

	}

	/**
	*Description: return the id of the pet.<br>
	*@return A String that is the id of the pet.
	*/
	public String getId(){

		return id;

	}

	/**
	*Description: return the type of the pet.<br>
	*@return A char that is the type of the pet.
	*/
	public char getType(){

		return type;

	}

	/**
	*Description: return the age of the pet.<br>
	*@return An int that is the age of the pet.
	*/
	public int getAge(){

		return age;

	}

	/**
	*Description: return the weight of the pet.<br>
	*@return A double that is the weight of the pet.
	*/
	public double getWeight(){

		return weight;

	}

	/**
	*Description: return the height of the pet.<br>
	*@return A double that is the height of the pet.
	*/
	public double getHeight(){

		return height;

	}

	/**
	*Description: return the records of the pet.<br>
	*@return An ArrayList that is the records of the pet.
	*/
	public ArrayList<Record> getRecords(){

		return records;

	}

	//Sets
	/**
	*Description: modified the name of the pet.<br>
	*Post: The name was modified.<br>
	*@param name The name we want to set.
	*/
	public void setName(String name){

		this.name=name;

	}

	/**
	*Description: modified the id of the pet.<br>
	*Post: The id was modified.<br>
	*@param id The id we want to set.
	*/
	public void setId(String id){

		this.id=id;

	}

	/**
	*Description: modified the type of the pet.<br>
	*Post: The type was modified.<br>
	*@param type The type we want to set.
	*/
	public void setType(char type){

		this.type=type;

	}

	/**
	*Description: modified the age of the pet.<br>
	*Post: The age was modified.<br>
	*@param age The age we want to set.
	*/
	public void setAge(int age){

		this.age=age;

	}

	/**
	*Description: modified the weight of the pet.<br>
	*Post: The weight was modified.<br>
	*@param weight The weight we want to set.
	*/
	public void setWeight(double weight){

		this.weight=weight;

	}

	/**
	*Description: modified the height of the pet.<br>
	*Post: The height was modified.<br>
	*@param height The height we want to set.
	*/
	public void setHeight(double height){

		this.height=height;

	}

	/**
	*Description: modified the records of the pet.<br>
	*Post: The records was modified.<br>
	*@param records The ArrayList of records we want to set.
	*/
	public void setRecords(ArrayList<Record> records){

		this.records=records;

	}

}
