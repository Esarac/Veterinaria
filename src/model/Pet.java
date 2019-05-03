package model;
import java.util.ArrayList;

public class Pet{
	
	//Constants
	public static final char DOG='D';
	public static final char CAT='C';
	public static final char BIRD='B';
	public static final char OTHER='O';
	
	//Atributes
	private String name;
	private String id;
	private char type;
	private int age;
	private double weight;
	private double height;
	private ArrayList<Record> records;//###
	
	//Constructor
	public Pet(String name, String id, char type, int age, double weight, double height, Record record){
		
		this.name=name;
		this.id=id;
		this.type=type;
		this.age=age;
		this.weight=weight;
		this.height=height;
		
		this.records=new ArrayList<Record>();//###
		
		this.records.add(record);//###
		
	}
	
	//Do
	/**
	*Description This method allows to calculate the body mass index for a pet.
	*pre: The pet was created before and its attributes height and weight are not null neither height must be zero.
	*post: The BMI is calculated.
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
	public void addRecords(Record record){
		
		this.records.add(record);
		
	}
	
	//Gets
	public String getName(){
		
		return name;
		
	}
	
	public String getId(){
		
		return id;
		
	}
	
	public char getType(){
		
		return type;
		
	}
	
	public int getAge(){
		
		return age;
		
	}
	
	public double getWeight(){
		
		return weight;
		
	}
	
	public double getHeight(){
		
		return height;
		
	}
	
	public ArrayList<Record> getRecords(){
		
		return records;
		
	}
	
	//Sets
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public void setId(String id){
		
		this.id=id;
		
	}
	
	public void setType(char type){
		
		this.type=type;
		
	}
	
	public void setAge(int age){
		
		this.age=age;
		
	}
	
	public void setWeight(double weight){
		
		this.weight=weight;
		
	}
	
	public void setHeight(double height){
		
		this.height=height;
		
	}
	
	public void setRecords(ArrayList<Record> records){
		
		this.records=records;
		
	}
	
}