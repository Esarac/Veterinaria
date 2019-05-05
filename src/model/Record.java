package model;
import java.util.ArrayList;

/**
*Description: The class Record in the package model.<br>
*@author Esteban Ariza
*/
public class Record{

	//Attributes
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
	/**
	*Description: the constructor of the class Record.<br>
	*Post: All The attributes of the clase are initialize.<br>
	*@param status The status we want to set.
	*@param symptom The symptom we want to set.
	*@param diagnostic The diagnostic we want to set.
	*@param dateIn The date in we want to set.
	*@param ownerName The owner name we want to set.
	*@param ownerId The owner id we want to set.
	*@param ownerAddress The owner address we want to set.
	*@param ownerPhone The owner phone we want to set.
	*@param petName The pet name we want to set.
	*@param petId The pet id we want to set.
	*@param petType The pet type we want to set.
	*@param petAge The pet age we want to set.
	*@param petWeight The pet weight we want to set.
	*@param petHeight The pet height we want to set.
	*/
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
	/**
	*Description: This method create a record in text that includes all the data of the hospitalization .<br>
	*Pre: The attribute dateIn is not null.<br>
	*@return A String that is the record in text.
	*@throws NullPointerException if the dateIn is null.
	*/
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

	/**
	*Description: This method create an information document of the owner in text that includes all the data of the owner.<br>
	*@return A String that is the information document in text.
	*/
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

	/**
	*Description: This method calculate the cost of the hospitalization .<br>
	*Pre: The attribute dateIn is not null.<br>
	*@return A double that is the hospitalization cost.
	*@throws NullPointerException if the dateIn is null.
	*/
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

	/**
	*Description: This method analize if the hospitalization was between a specific week.<br>
	*@param actualDate The date which the week starts. This param must not be null.
	*@throws NullPointerException if the actualDate param is null.
	*@return A boolean that represent if the hospitalization was on that week.
	*/
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
	*Description This method allows to update the basic data of a veterinary client, these data include, address and phone number.<br>
	*post: The address and /or phone number of the client is updated.<br>
	*@param ownerAddress The new address of the client. This param could be empty.
	*@param ownerPhone The new phone number of the client. This param could be empty.
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
	*Description: This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories.<br>
	*pre: The patient clinic story must be not null.<br>
	*post: New notes were added to the possible diagnostic in the patient clinic story.<br>
	*@param diagnostic The notes of possible diagnostic. This param must be not null.
	*/
	public void addDiagnostic(String diagnostic){

		if(!diagnostic.equals("")){

			this.diagnostic+=". "+diagnostic;

		}

	}

	/**
	*Description: This method allows to add a new symptom presented during the hospitalization at the patient stories.<br>
	*pre: The patient clinic story must be not null.<br>
	*post: A new symptom were added to the patient clinic story.<br>
	*@param symptom The new symptom presented. This param must be not null.
	*/
	public void addSymptom(String symptom){

		if(!symptom.equals("")){

			this.symptom+=". "+symptom;

		}

	}

	//Gets
	/**
	*Description: return the status of the record.<br>
	*@return A boolean that is the status of the record.
	*/
	public boolean getStatus(){

		return status;

	}

	/**
	*Description: return the symptom of the record.<br>
	*@return A String that is the symptom of the record.
	*/
	public String getSymptom(){

		return symptom;

	}

	/**
	*Description: return the diagnostic of the record.<br>
	*@return A String that is the diagnostic of the record.
	*/
	public String getDiagnostic(){

		return diagnostic;

	}

	/**
	*Description: return the owner name of the record.<br>
	*@return A String that is the owner name of the record.
	*/
	public String getOwnerName(){//Owner

		return ownerName;

	}

	/**
	*Description: return the owner id of the record.<br>
	*@return A String that is the owner id of the record.
	*/
	public String getOwnerId(){

		return ownerId;

	}

	/**
	*Description: return the owner address of the record.<br>
	*@return A String that is the owner address of the record.
	*/
	public String getOwnerAddress(){

		return ownerAddress;

	}

	/**
	*Description: return the owner phone of the record.<br>
	*@return An int that is the owner phone of the record.
	*/
	public int getOwnerPhone(){

		return ownerPhone;

	}//...

	/**
	*Description: return the pet name of the record.<br>
	*@return A String that is the pet name of the record.
	*/
	public String getPetName(){//Pet

		return petName;

	}

	/**
	*Description: return the pet Id of the record.<br>
	*@return A String that is the pet Id of the record.
	*/
	public String getPetId(){

		return petId;

	}

	/**
	*Description: return the pet Type of the record.<br>
	*@return A char that is the pet Type of the record.
	*/
	public char getPetType(){

		return petType;

	}

	/**
	*Description: return the pet age of the record.<br>
	*@return An int that is the pet age of the record.
	*/
	public int getPetAge(){

		return petAge;

	}

	/**
	*Description: return the pet weight of the record.<br>
	*@return A double that is the pet weight of the record.
	*/
	public double getPetWeight(){

		return petWeight;

	}

	/**
	*Description: return the height of the record.<br>
	*@return A double that is the height of the record.
	*/
	public double getPetHeight(){

		return petHeight;

	}//...

	/**
	*Description: return the date in of the record.<br>
	*@return A Date that is the date in of the record.
	*/
	public Date getDateIn(){

		return dateIn;

	}

	/**
	*Description: return the date out of the record.<br>
	*@return A Date that is the date out of the record.
	*/
	public Date getDateOut(){

		return dateOut;

	}

	/**
	*Description: return the medicines of the record.<br>
	*@return An ArrayList that is the medicines of the record.
	*/
	public ArrayList<Medicine> getMedicines(){

		return medicines;

	}

	//Sets
	/**
	*Description: modified the status of the record.<br>
	*Post: The status was modified.<br>
	*@param status The status we want to set.
	*/
	public void setStatus(boolean status){

		this.status=status;

	}

	/**
	*Description: modified the symptom of the record.<br>
	*Post: The symptom was modified.<br>
	*@param symptom The symptom we want to set.
	*/
	public void setSymptom(String symptom){

		this.symptom=symptom;

	}

	/**
	*Description: modified the diagnostic of the record.<br>
	*Post: The diagnostic was modified.<br>
	*@param diagnostic The diagnostic we want to set.
	*/
	public void setDiagnostic(String diagnostic){

		this.diagnostic=diagnostic;

	}

	/**
	*Description: modified the owner name of the record.<br>
	*Post: The owner name was modified.<br>
	*@param ownerName The owner name we want to set.
	*/
	public void setOwnerName(String ownerName){//Owner

		this.ownerName=ownerName;

	}

	/**
	*Description: modified the owner id of the record.<br>
	*Post: The owner id was modified.<br>
	*@param ownerId The owner id we want to set.
	*/
	public void setOwnerId(String ownerId){

		this.ownerId=ownerId;

	}

	/**
	*Description: modified the owner address of the record.<br>
	*Post: The owner address was modified.<br>
	*@param ownerAddress The owner address we want to set.
	*/
	public void setOwnerAddress(String ownerAddress){

		this.ownerAddress=ownerAddress;

	}

	/**
	*Description: modified the owner phone of the record.<br>
	*Post: The owner phone was modified.<br>
	*@param ownerPhone The owner phone we want to set.
	*/
	public void setOwnerPhone(int ownerPhone){

		this.ownerPhone=ownerPhone;

	}//...

	/**
	*Description: modified the pet name of the record.<br>
	*Post: The pet name was modified.<br>
	*@param petName The pet name we want to set.
	*/
	public void setPetName(String petName){//Pet

		this.petName=petName;

	}

	/**
	*Description: modified the pet id of the record.<br>
	*Post: The pet id was modified.<br>
	*@param petId The pet id we want to set.
	*/
	public void setPetId(String petId){

		this.petId=petId;

	}

	/**
	*Description: modified the pet type of the record.<br>
	*Post: The pet type was modified.<br>
	*@param petType The pet type we want to set.
	*/
	public void setPetType(char petType){

		this.petType=petType;

	}

	/**
	*Description: modified the pet age of the record.<br>
	*Post: The pet age was modified.<br>
	*@param petAge The pet age we want to set.
	*/
	public void setPetAge(int petAge){

		this.petAge=petAge;

	}

	/**
	*Description: modified the pet weight of the record.<br>
	*Post: The pet weight was modified.<br>
	*@param petWeight The pet weight we want to set.
	*/
	public void setPetWeight(double petWeight){

		this.petWeight=petWeight;

	}

	/**
	*Description: modified the pet height of the record.<br>
	*Post: The pet height was modified.<br>
	*@param petHeight The pet height we want to set.
	*/
	public void setPetHeight(double petHeight){

		this.petHeight=petHeight;

	}//...

	/**
	*Description: modified the date in of the record.<br>
	*Post: The date in was modified.<br>
	*@param dateIn The date in we want to set.
	*/
	public void setDateIn(Date dateIn){

		this.dateIn=dateIn;

	}

	/**
	*Description: modified the date out of the record.<br>
	*Post: The date out was modified.<br>
	*@param dateOut The date out we want to set.
	*/
	public void setDateOut(Date dateOut){

		this.dateOut=dateOut;

	}

	/**
	*Description: modified the medicines of the record.<br>
	*Post: The medicines was modified.<br>
	*@param medicines The ArrayList of medicines we want to set.
	*/
	public void setMedicines(ArrayList<Medicine> medicines){

		this.medicines=medicines;

	}

}
