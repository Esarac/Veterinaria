package model;
import java.util.ArrayList;

public class Pet{
	
	//Atributes
	private String name;
	private char type;
	private int age;
	private double weight;
	private ArrayList<Record> record;//###
	
	//Constructor
	public Pet(String name, char type, int age, double weight, Record record){
		
		this.name=name;
		this.type=type;
		this.age=age;
		this.weight=weight;
		
		this.record=new ArrayList<Record>();//###
		
		this.record.add(record);//###
		
	}
	
	//Gets
	public String getName(){
		
		return name;
		
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
	
	public ArrayList<Record> getRecord(){
		
		return record;
		
	}
	
	//Sets
	public void setName(String name){
		
		this.name=name;
		
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
	
	public void setRecord(ArrayList<Record> record){
		
		this.record=record;
		
	}
	
}