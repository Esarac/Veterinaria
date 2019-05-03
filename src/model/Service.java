package model;

public class Service{
	
	//Constants
	public final static String[] SERVICE_TYPES= {"Bano en veterinaria", "Bano a domicilio", "Corte de unas", "Profilaxis dental", "Aplicacion de vacunas"};
	
	//Atributes
	private String type;
	private double price;
	private String ownerId;
	private String petId;
	private Date date;
	
	//Constructor
	public Service(String type, double price, String ownerId, String petId, Date date){
		
		this.type=type;
		this.price=price;
		this.ownerId=ownerId;
		this.petId=petId;
		this.date=date;
		
	}
	
	//Do
	public String printReport(){
		
		String record="\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		record+="\n Fecha:"+date.getDay()+"/"+date.getMonth()+"/"+date.getYear();
		record+="\n";
		record+="\n Tipo de servicio:"+type;
		record+="\n";
		record+="\n Id del dueno: "+ownerId;
		record+="\n Id de la mascota: "+petId;
		record+="\n";
		record+="\n Costo: $"+price;
		record+="\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		
		return record;
		
	}
	
	public boolean itsOnTheWeek(Date startDate){
		
		boolean truth=false;
		
		//Date
		int dateTotal=(date.getYear()*365)+(date.getDay());
		switch(date.getMonth()){
			
			case 1:
				
				dateTotal+=0;
			
			break;
			
			case 2:
				
				dateTotal+=31;
				
			break;
			
			case 3:
				
				dateTotal+=59;
				
			break;	
			
			case 4:
				
				dateTotal+=90;
				
			break;
			
			case 5:
				
				dateTotal+=120;
				
			break;
			
			case 6:
				
				dateTotal+=151;
				
			break;
			
			case 7:
				
				dateTotal+=181;
				
			break;
			
			case 8:
				
				dateTotal+=212;
				
			break;
			
			case 9:
				
				dateTotal+=243;
				
			break;
			
			case 10:
				
				dateTotal+=273;
				
			break;
			
			case 11:
				
				dateTotal+=304;
				
			break;
			
			case 12:
				
				dateTotal+=334;
				
			break;
			
			default:
				
				dateTotal+=0;
				
			break;
			
		}
		//...
		
		//startDate
		int actualDateTotal=(startDate.getYear()*365)+(startDate.getDay());
		switch(startDate.getMonth()){
			
			case 1:
				
				actualDateTotal+=0;
			
			break;
			
			case 2:
				
				actualDateTotal+=31;
				
			break;
			
			case 3:
				
				actualDateTotal+=59;
				
			break;	
			
			case 4:
				
				actualDateTotal+=90;
				
			break;
			
			case 5:
				
				actualDateTotal+=120;
				
			break;
			
			case 6:
				
				actualDateTotal+=151;
				
			break;
			
			case 7:
				
				actualDateTotal+=181;
				
			break;
			
			case 8:
				
				actualDateTotal+=212;
				
			break;
			
			case 9:
				
				actualDateTotal+=243;
				
			break;
			
			case 10:
				
				actualDateTotal+=273;
				
			break;
			
			case 11:
				
				actualDateTotal+=304;
				
			break;
			
			case 12:
				
				actualDateTotal+=334;
				
			break;
			
			default:
				
				actualDateTotal+=0;
				
			break;
			
		}
		//...
		
		if( (dateTotal >= actualDateTotal) && (dateTotal <= actualDateTotal+7) ){
			
			truth=true;
			
		}
		
		return truth;
		
	}
	
	public boolean itsBetweenThisTimeLapse(Date startDate, Date endDate){
		
		boolean truth=false;
		
		//Date
		int dateTotal=(date.getYear()*365)+(date.getDay());
		switch(date.getMonth()){
			
			case 1:
				
				dateTotal+=0;
			
			break;
			
			case 2:
				
				dateTotal+=31;
				
			break;
			
			case 3:
				
				dateTotal+=59;
				
			break;	
			
			case 4:
				
				dateTotal+=90;
				
			break;
			
			case 5:
				
				dateTotal+=120;
				
			break;
			
			case 6:
				
				dateTotal+=151;
				
			break;
			
			case 7:
				
				dateTotal+=181;
				
			break;
			
			case 8:
				
				dateTotal+=212;
				
			break;
			
			case 9:
				
				dateTotal+=243;
				
			break;
			
			case 10:
				
				dateTotal+=273;
				
			break;
			
			case 11:
				
				dateTotal+=304;
				
			break;
			
			case 12:
				
				dateTotal+=334;
				
			break;
			
			default:
				
				dateTotal+=0;
				
			break;
			
		}
		//...
				
		//startDate
		int startDateTotal=(startDate.getYear()*365)+(startDate.getDay());
		switch(startDate.getMonth()){
			
			case 1:
				
				startDateTotal+=0;
			
			break;
			
			case 2:
				
				startDateTotal+=31;
				
			break;
			
			case 3:
				
				startDateTotal+=59;
				
			break;	
			
			case 4:
				
				startDateTotal+=90;
				
			break;
			
			case 5:
				
				startDateTotal+=120;
				
			break;
			
			case 6:
				
				startDateTotal+=151;
				
			break;
			
			case 7:
				
				startDateTotal+=181;
				
			break;
			
			case 8:
				
				startDateTotal+=212;
				
			break;
			
			case 9:
				
				startDateTotal+=243;
				
			break;
			
			case 10:
				
				startDateTotal+=273;
				
			break;
			
			case 11:
				
				startDateTotal+=304;
				
			break;
			
			case 12:
				
				startDateTotal+=334;
				
			break;
			
			default:
				
				startDateTotal+=0;
				
			break;
			
		}
		//...
		
		//endDate
		int endDateTotal=(endDate.getYear()*365)+(endDate.getDay());
		switch(endDate.getMonth()){
			
			case 1:
				
				endDateTotal+=0;
			
			break;
			
			case 2:
				
				endDateTotal+=31;
				
			break;
			
			case 3:
				
				endDateTotal+=59;
				
			break;	
			
			case 4:
				
				endDateTotal+=90;
				
			break;
			
			case 5:
				
				endDateTotal+=120;
				
			break;
			
			case 6:
				
				endDateTotal+=151;
				
			break;
			
			case 7:
				
				endDateTotal+=181;
				
			break;
			
			case 8:
				
				endDateTotal+=212;
				
			break;
			
			case 9:
				
				endDateTotal+=243;
				
			break;
			
			case 10:
				
				endDateTotal+=273;
				
			break;
			
			case 11:
				
				endDateTotal+=304;
				
			break;
			
			case 12:
				
				endDateTotal+=334;
				
			break;
			
			default:
				
				endDateTotal+=0;
				
			break;
			
		}
		//...
		
		if( (dateTotal >= startDateTotal) && (dateTotal <= endDateTotal) ){
			
			truth=true;
			
		}
		
		return truth;
		
	}
	
	//Gets
	public String getType(){
		
		return type;
		
	}
	
	public double getPrice(){
		
		return price;
		
	}
	
	public String getOwnerId(){
		
		return ownerId;
		
	}
	
	public String getPetId(){
		
		return petId;
		
	}
	
	public Date getDate(){
		
		return date;
		
	}
	
	//Sets
	public void setType(String type){
		
		this.type=type;
		
	}
	
	public void setPrice(double price){
		
		this.price=price;
		
	}
	
	public void setOwnerId(String ownerId){
		
		this.ownerId=ownerId;
		
	}
	
	public void setPetId(String petId){
		
		this.petId=petId;
		
	}
	
	public void setDate(Date date){
		
		this.date=date;
		
	}
	
}