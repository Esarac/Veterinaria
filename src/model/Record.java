package model;
import java.util.ArrayList;

public class Record{
	
	//Atributos
	private boolean status;
	private String symptom;
	private String diagnostic;
	private ArrayList<Medicine> medicines;
	private Date dateIn;
	private Date dateOut;
	//...
	private String ownerName;
	private String ownerId;
	private String ownerAddress;
	private int ownerPhone;
	//...
	private String petName;
	private String petId;
	private char petType;
	private int petAge;
	private double petWeight;
	private double petHeight;
	//...
	
	//Constructor
	public Record(boolean status, String symptom, String diagnostic, Date dateIn, String ownerName, String ownerId, String ownerAddress, int ownerPhone, String petName, String petId, char petType, int petAge, double petWeight, double petHeight){
		
		this.status=status;
		this.symptom=symptom;
		this.diagnostic=diagnostic;
		
		this.dateIn=dateIn;
		this.dateOut=null;
		
		this.ownerName=ownerName;
		this.ownerId=ownerId;
		this.ownerAddress=ownerAddress;
		this.ownerPhone=ownerPhone;
		
		this.petName=petName;
		this.petId=petId;
		this.petType=petType;
		this.petAge=petAge;
		this.petWeight=petWeight;
		this.petHeight=petHeight;
		
		this.medicines=new ArrayList<Medicine>();
		
	}
	
	//Do
	public String printRecord(){
		
		String record="\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		//Status
		if(status){
			
			record+="\n Estado: ABIERTO";
			
		}
		else{
			
			record+="\n Estado: CERRADO";
			
		}
		record+="\n";
		//DateIn
		record+="\n Fecha:"+dateIn.getDay()+"/"+dateIn.getMonth()+"/"+dateIn.getYear();
		record+="\n";
		//Owner
		record+="\n Dueno:";
		record+="\n  Nombre: "+ownerName;
		record+="\n  Id: "+ownerId;
		record+="\n  Direccion: "+ownerAddress;
		record+="\n  Telefono: "+ownerPhone;
		record+="\n";
		//Pet
		record+="\n Mascota:";
		record+="\n  Nombre: "+petName;
		record+="\n  Id: "+petId;
		if(petType==Pet.DOG){
			
			record+="\n  Animal: Perro";
			
		}
		else if(petType==Pet.CAT){
			
			record+="\n  Animal: Gato";
			
		}
		else if(petType==Pet.BIRD){
			
			record+="\n  Animal: Ave";
			
		}
		else{
			
			record+="\n  Animal: Otro";
			
		}
		record+="\n  Edad: "+petAge+" anos";
		record+="\n  Peso: "+petWeight+" Kg";
		record+="\n  Estatura: "+petHeight+" m";
		record+="\n";
		//Data
		record+="\n Datos de la hospitalizacion:";
		record+="\n  Sintomas:";
		record+="\n  "+symptom;
		record+="\n  Diagnostico:";
		record+="\n  "+diagnostic;
		record+="\n";
		//Medicines
		record+="\n Medicamentos Resetados";
		for(int i=0; i<medicines.size(); i++){
			
			record+="\n";
			record+="\n -Medicamento #"+(i+1);
			record+="\n  Nombre: "+medicines.get(i).getName();
			record+="\n  Dosis: "+medicines.get(i).getDose();
			record+="\n  Frecuencia: Cada "+medicines.get(i).getPeriodicity()+" horas";
			record+="\n  Costo: $"+medicines.get(i).getPrice();
			
		}
		record+="\n";
		//Out
		if(dateOut!=null){
			
			record+="\n Salida: "+dateOut.getDay()+"/"+dateOut.getMonth()+"/"+dateOut.getYear();
			record+="\n";
			record+="\n Costo total de la hospitalizacion: $"+calculateHospitalizationCost();
			
		}
		record+="\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		
		return record;
		
	}
	
	public String showOwnerData(){
		
		String data="\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		data+="\n Datos del dueno:";
		data+="\n  Nombre: "+ownerName;
		data+="\n  Id: "+ownerId;
		data+="\n  Direccion: "+ownerAddress;
		data+="\n  Telefono: "+ownerPhone;
		data+="\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n";
		
		return data;
		
	}
	
	public double calculateHospitalizationCost(){
		
		double cost=0;
		
		int dateTotal=0;
		
		double medicineCost=0;
		
		if(dateOut!=null){
			
			int dateInTotal=(dateIn.getYear()*365)+(dateIn.getDay());
			switch(dateIn.getMonth()){
				
				case 1:
					
					dateInTotal+=0;
				
				break;
				
				case 2:
					
					dateInTotal+=31;
					
				break;
				
				case 3:
					
					dateInTotal+=59;
					
				break;	
				
				case 4:
					
					dateInTotal+=90;
					
				break;
				
				case 5:
					
					dateInTotal+=120;
					
				break;
				
				case 6:
					
					dateInTotal+=151;
					
				break;
				
				case 7:
					
					dateInTotal+=181;
					
				break;
				
				case 8:
					
					dateInTotal+=212;
					
				break;
				
				case 9:
					
					dateInTotal+=243;
					
				break;
				
				case 10:
					
					dateInTotal+=273;
					
				break;
				
				case 11:
					
					dateInTotal+=304;
					
				break;
				
				case 12:
					
					dateInTotal+=334;
					
				break;
				
				default:
					
					dateInTotal+=0;
					
				break;
				
			}
			
			int dateOutTotal=(dateOut.getYear()*365)+(dateOut.getDay());
			switch(dateOut.getMonth()){
				
				case 1:
					
					dateOutTotal+=0;
				
				break;
				
				case 2:
					
					dateOutTotal+=31;
					
				break;
				
				case 3:
					
					dateOutTotal+=59;
					
				break;	
				
				case 4:
					
					dateOutTotal+=90;
					
				break;
				
				case 5:
					
					dateOutTotal+=120;
					
				break;
				
				case 6:
					
					dateOutTotal+=151;
					
				break;
				
				case 7:
					
					dateOutTotal+=181;
					
				break;
				
				case 8:
					
					dateOutTotal+=212;
					
				break;
				
				case 9:
					
					dateOutTotal+=243;
					
				break;
				
				case 10:
					
					dateOutTotal+=273;
					
				break;
				
				case 11:
					
					dateOutTotal+=304;
					
				break;
				
				case 12:
					
					dateOutTotal+=334;
					
				break;
				
				default:
					
					dateOutTotal+=0;
					
				break;
				
			}
			
			dateTotal=(dateOutTotal-dateInTotal);
			
			for(int i=0; i<(medicines.size()); i++){
				
				medicineCost+=medicines.get(i).getPrice();
				
			}
			
			if(petType==Pet.DOG){
				
				if(petWeight>0 && petWeight<=3){
					
					cost=15000;
					
				}
				else if(petWeight<=10){
					
					cost=17000;
					
				}
				else if(petWeight<=20){
					
					cost=20000;
					
				}
				else if(petWeight>20){
					
					cost=25000;
					
				}
				else{
					
					cost=0;
					
				}
				
			}
			else if(petType==Pet.CAT){
				
				if(petWeight>0 && petWeight<=3){
					
					cost=10000;
					
				}
				else if(petWeight<=10){
					
					cost=12000;
					
				}
				else if(petWeight<=20){
					
					cost=15000;
					
				}
				else if(petWeight>20){
					
					cost=20000;
					
				}
				else{
					
					cost=0;
					
				}
				
			}
			else if(petType==Pet.BIRD){
				
				if(petWeight>0 && petWeight<=3){
					
					cost=10000;
					
				}
				else if(petWeight<=10){
					
					cost=12000;
					
				}
				else if(petWeight<=20){
					
					cost=20000;
					
				}
				else if(petWeight>20){
					
					cost=25000;
					
				}
				else{
					
					cost=0;
					
				}
				
			}
			else{
				
				if(petWeight>0 && petWeight<=3){
					
					cost=10000;
					
				}
				else if(petWeight<=10){
					
					cost=17000;
					
				}
				else if(petWeight<=20){
					
					cost=30000;
					
				}
				else if(petWeight>20){
					
					cost=33000;
					
				}
				else{
					
					cost=0;
					
				}
				
			}
			
			cost*=dateTotal;
			cost+=medicineCost;
			
		}
		
		return cost;
		
	}
	
	public boolean itsOnTheWeek(Date actualDate){
		
		boolean truth=false;
		
		//Date
		int dateTotal=0;
		if(dateOut!=null){
			
			dateTotal=(dateOut.getYear()*365)+(dateOut.getDay());
			switch(dateOut.getMonth()){
				
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
			
		}
		//...
		
		//actualDate
		int actualDateTotal=(actualDate.getYear()*365)+(actualDate.getDay());
		switch(actualDate.getMonth()){
			
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
	
	/**
	*Description This method allows to update the basic data of a veterinary client, these data include, address and phone number.
	*pre: The client, a pet and the record(0) was created before.
	*post: The address and /or phone number of the client is updated.
	*@param The new address of the client. This param could be empty.
	*@param The new phone number of the client. This param could be empty.
	*/
	public void changeAddressAndPhone(String ownerAddress, int ownerPhone){
		
		if(!ownerAddress.equals("")){
			
			this.ownerAddress=ownerAddress;
			
		}
		if(ownerPhone!=0){
			
			this.ownerPhone=ownerPhone;
			
		}
		
	}
	
	//Adds
	public void addMedicines(Medicine medicine){
		
		this.medicines.add(medicine);
		
	}
	
	/**
	*Description This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories.
	*pre: The patient clinic story must be not null.
	*post: New notes were added to the possible diagnostic in the patient clinic story.
	*@param The notes of possible diagnostic. This param must be not null.
	*/
	public void addDiagnostic(String diagnostic){
		
		if(!diagnostic.equals("")){
			
			this.diagnostic+=". "+diagnostic;
			
		}
		
	}
	
	/**
	*Description This method allows to add a new symptom presented during the hospitalization at the patient stories.
	*pre: The patient clinic story must be not null.
	*post: A new symptom were added to the patient clinic story.
	*@param The new symptom presented. This param must be not null.
	*/
	public void addSymptom(String symptom){
		
		if(!symptom.equals("")){
			
			this.symptom+=". "+symptom;
			
		}
		
	}
	
	//Gets
	public boolean getStatus(){
		
		return status;
		
	}
	
	public String getSymptom(){
		
		return symptom;
		
	}
	
	public String getDiagnostic(){
		
		return diagnostic;
		
	}
	
	
	public String getOwnerName(){//Owner
		
		return ownerName;
		
	}
	
	public String getOwnerId(){
		
		return ownerId;
		
	}
	
	public String getOwnerAddress(){
		
		return ownerAddress;
		
	}
	
	public int getOwnerPhone(){
		
		return ownerPhone;
		
	}//...
	
	public String getPetName(){//Pet
		
		return petName;
		
	}
	
	public String getPetId(){
		
		return petId;
		
	}
	
	public char getPetType(){
		
		return petType;
		
	}
	
	public int getPetAge(){
		
		return petAge;
		
	}
	
	public double getPetWeight(){
		
		return petWeight;
		
	}
	
	public double getPetHeight(){
		
		return petHeight;
		
	}//...
	
	public Date getDateIn(){
		
		return dateIn;
		
	}
	
	public Date getDateOut(){
		
		return dateOut;
		
	}
	
	public ArrayList<Medicine> getMedicines(){
		
		return medicines;
		
	}
	
	//Sets
	public void setStatus(boolean status){
		
		this.status=status;
		
	}
	
	public void setSymptom(String symptom){
		
		this.symptom=symptom;
		
	}
	
	public void setDiagnostic(String diagnostic){
		
		this.diagnostic=diagnostic;
		
	}
	
	public void setOwnerName(String ownerName){//Owner
		
		this.ownerName=ownerName;
		
	}
	
	public void setOwnerId(String ownerId){
		
		this.ownerId=ownerId;
		
	}
	
	public void setOwnerAddress(String ownerAddress){
		
		this.ownerAddress=ownerAddress;
		
	}
	
	public void setOwnerPhone(int ownerPhone){
		
		this.ownerPhone=ownerPhone;
		
	}//...
	
	public void setPetName(String petName){//Pet
		
		this.petName=petName;
		
	}
	
	public void setPetId(String petId){
		
		this.petId=petId;
		
	}
	
	public void setPetType(char petType){
		
		this.petType=petType;
		
	}
	
	public void setPetAge(int petAge){
		
		this.petAge=petAge;
		
	}
	
	public void setPetWeight(double petWeight){
		
		this.petWeight=petWeight;
		
	}
	
	public void setPetHeight(double petHeight){
		
		this.petHeight=petHeight;
		
	}//...
	
	public void setDateIn(Date dateIn){
		
		this.dateIn=dateIn;
		
	}
	
	public void setDateOut(Date dateOut){
		
		this.dateOut=dateOut;
		
	}
	
	public void setMedicines(ArrayList<Medicine> medicines){
		
		this.medicines=medicines;
		
	}
	
}