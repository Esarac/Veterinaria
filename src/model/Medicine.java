package model;

public class Medicine{
	
	//Atributes
	private String name;
	private String dose;
	private double periodicity;
	private double price;
	
	//Constructor
	public Medicine(String name, String dose, double periodicity, double price){
		
		this.name=name;
		this.dose=dose;
		this.periodicity=periodicity;
		this.price=price;
		
	}
	
	//Gets
	public String getName(){
		
		return name;
		
	}
	
	public String getDose(){
		
		return dose;
		
	}
	
	public double getPeriodicity(){
		
		return periodicity;
		
	}
	
	public double getPrice(){
		
		return price;
		
	}
	
	//Sets
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public void setDose(String dose){
		
		this.dose=dose;
		
	}
	
	public void setPeriodicity(double periodicity){
		
		this.periodicity=periodicity;
		
	}
	
	public void setPrice(double price){
		
		this.price=price;
		
	}
	
}