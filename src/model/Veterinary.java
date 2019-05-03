package model;
import java.util.ArrayList;

public class Veterinary{
	
	//Constatants
	public static final int ROOM_QUANTITY=8;
	
	//Atributes
	private String name;
	private Room[] rooms;//###
	private double totalHospitalizationMoney;//!!!
	private ArrayList<Owner> owners;//###
	private ArrayList<Service> services;
	
	//Constructor
	public Veterinary(String name){
		
		this.name=name;
		this.totalHospitalizationMoney=0;
		
		this.rooms=new Room[ROOM_QUANTITY];//###
		
		this.owners=new ArrayList<Owner>();
		this.services=new ArrayList<Service>();
		
	}
	
	//Menu
	public String showMenu(){
		
		String message="\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		message+="\nVeterinaria "+name;
		message+="\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		message+="\nBienvenido a la aplicacion SmartPet, Seleccione una opcion:";
		message+="\n 1.Registrar a un cliente";
		message+="\n 2.Registrar a una mascota";
		message+="\n 3.Hospitalizar una mascota";
		message+="\n 4.Mostrar los mini cuartos vacios";
		message+="\n 5.Consultar el numero de mini cuarto en el que se encuentra una mascota";
		message+="\n 6.Mostrar informe de las historias clinicas de los animales hospitalizados";
		message+="\n 7.Consultar el historial de historias clinicas de una mascota";
		message+="\n 8.Dar de alta a una mascota";
		message+="\n 9.Consultar datos del cliente a traves de la mascota";
		message+="\n 10.Consultar datos del cliente a traves del nombre del cliente";
		message+="\n 11.Total de ingresos por hospitalizaciones";
		message+="\n 12.Mostrar el IMC de una mascota";
		message+="\n 13.Actualizar datos de un cliente";
		message+="\n 14.Anadir medicina a una mascota hospitalizada";
		message+="\n 15.Anadir diagnostico a una mascota hospitalizada";
		message+="\n 16.Anadir sintoma a una mascota hospitalizada";
		message+="\n 17.Registrar un servicio";
		message+="\n 18.Total de ingresos en un servicio especifico";
		message+="\n 19.Mostrar el promedio de ingreso de los servicios";
		message+="\n 20.Mostrar el promedio de ingreso prestados en una semana";
		message+="\n 21.Mostrar los servicios prestados en un rango de tiempo";
		message+="\n 22.Total de ingresos de la veterinaria";
		message+="\n 23.Salir";
		message+="\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
		message+="\n~";
		
		return message;
		
	}
	
	public String showRoomMenu(boolean empty){
		
		String message="\nElegir el mini cuarto";
		
		if(empty){
			
			if(rooms[0].getPet()==null){
				
				message+="\n 1.Mini Cuarto 1";
				
			}
			if(rooms[1].getPet()==null){
				
				message+="\n 2.Mini Cuarto 2";
				
			}
			if(rooms[2].getPet()==null){
				
				message+="\n 3.Mini Cuarto 3";
				
			}
			if(rooms[3].getPet()==null){
				
				message+="\n 4.Mini Cuarto 4";
				
			}
			if(rooms[4].getPet()==null){
				
				message+="\n 5.Mini Cuarto 5";
				
			}
			if(rooms[5].getPet()==null){
				
				message+="\n 6.Mini Cuarto 6";
				
			}
			if(rooms[6].getPet()==null){
				
				message+="\n 7.Mini Cuarto 7";
				
			}
			if(rooms[7].getPet()==null){
				
				message+="\n 8.Mini Cuarto 8";
				
			}
			
		}
		else{
			
			if(rooms[0].getPet()!=null){
				
				message+="\n 1.Mini Cuarto 1 ("+rooms[0].getPet().getName()+")";
				
			}
			if(rooms[1].getPet()!=null){
				
				message+="\n 2.Mini Cuarto 2 ("+rooms[1].getPet().getName()+")";
				
			}
			if(rooms[2].getPet()!=null){
				
				message+="\n 3.Mini Cuarto 3 ("+rooms[2].getPet().getName()+")";
				
			}
			if(rooms[3].getPet()!=null){
				
				message+="\n 4.Mini Cuarto 4 ("+rooms[3].getPet().getName()+")";
				
			}
			if(rooms[4].getPet()!=null){
				
				message+="\n 5.Mini Cuarto 5 ("+rooms[4].getPet().getName()+")";
				
			}
			if(rooms[5].getPet()!=null){
				
				message+="\n 6.Mini Cuarto 6 ("+rooms[5].getPet().getName()+")";
				
			}
			if(rooms[6].getPet()!=null){
				
				message+="\n 7.Mini Cuarto 7 ("+rooms[6].getPet().getName()+")";
				
			}
			if(rooms[7].getPet()!=null){
				
				message+="\n 8.Mini Cuarto 8 ("+rooms[7].getPet().getName()+")";
				
			}
			
		}
		message+="\n~";
		
		return message;
		
	}
	
	public String showServiceTypeMenu(){
		
		String menu="\nElije el tipo de servicio:\n 1.Bano de mascotas en la veterinaria\n 2.Bano de mascotas a domicilio\n 3.Corte de Unas\n 4.Profilaxis dental \n 5.Aplicacion de vacunas\n~";
		
		return menu;
		
	}
	
	//Do
	public boolean emptyRoom(int roomNumber){
		
		boolean empty=false;
		
		if(rooms[roomNumber].getPet()==null){
			
			empty=true;
			
		}
		else{
			
			empty=false;
			
		}
		
		return empty;
		
	}
	
	public String createOwner(String ownerName, String ownerId, String ownerAddress, int ownerPhone, String petName, String petId, char petType, int petAge, double petWeight, double petHeight, int dayIn, int monthIn, int yearIn){
		
		String message="Se a creado el usuario exitosamente";
		
		Date petDateIn=new Date(dayIn, monthIn, yearIn);
		
		Record petRecord=new Record(false, "", "", petDateIn, ownerName, ownerId, ownerAddress, ownerPhone, petName, petId, petType, petAge, petWeight, petHeight);
		Pet pet=new Pet(petName, petId, petType, petAge, petWeight, petHeight, petRecord);
		
		Owner profile=new Owner(ownerName, ownerId, ownerAddress, ownerPhone, pet);
		owners.add(profile);
		
		return message;
		
	}//R1*
	
	public String createPet(String ownerId, String name, String id, char type, int age, double weight, double height, int dayIn, int monthIn, int yearIn){
		
		String message="No se encontro el usuario";
		
		Date dateIn=new Date(dayIn, monthIn, yearIn);
		
		int ownerSize=owners.size();
		
		for(int i=0; i<ownerSize; i++){
			
			String ownerIdI=owners.get(i).getId();
			
			if(ownerIdI.equals(ownerId)){
				
				Record record=new Record(false, "", "", dateIn, owners.get(i).getName(), owners.get(i).getId(), owners.get(i).getAddress(), owners.get(i).getPhone(), name, id, type, age, weight, height);
				
				Pet pet=new Pet(name, id, type, age, weight, height, record);
				
				message=owners.get(i).createPet(pet);
				
			}
			
		}
		
		return message;
		
	}//R2*
	
	public String hospitalizate(String ownerId, String petName, int roomNumber){
		
		String message="No se encontro al dueno o a la mascota digitada";
		
		int ownerSize=owners.size();
		
		Pet profile=null;
		
		for(int i=0; i<ownerSize; i++){
			
			String ownerIdI=owners.get(i).getId();
			
			if(ownerIdI.equals(ownerId)){
				
				int petSize=owners.get(i).getPets().size();
				
				for(int j=0; j<petSize; j++){
					
					String petNameJ=owners.get(i).getPets().get(j).getName();
					
					if(petNameJ.equals(petName)){
						
						profile=owners.get(i).getPets().get(j);
						message="Se ha hospitalizado la mascota";
						
					}
					
				}
				
			}
			
		}
		
		if(emptyRoom(roomNumber-1)){
			
			rooms[roomNumber-1].setPet(profile);
			
		}
		else{
			
			message="El cuarto esta ocupado";
			
		}
		
		return message;
		
	}//R3*
	
	public String createRecord(String symptom, String diagnostic, int dayIn, int monthIn, int yearIn, int roomNumber){
		
		String message="Se ha creado la historia clinica exitosamente";
		
		Date dateIn=new Date(dayIn, monthIn, yearIn);
		
		if(!emptyRoom(roomNumber-1)){
			
			rooms[roomNumber-1].createRecord(symptom, diagnostic, dateIn);
			
		}
		else{
			
			message="No se pudo crear la historia clinica, porque no hay un animal en el cuarto";
			
		}
		
		return message;
		
	}//R3*
	
	public String showEmptyRooms(){
		
		String firstMessage="Los mini cuartos disponibles son:";
		String message="Los mini cuartos disponibles son:";
		
		for(int i=1; i<=8; i++){
			
			if(emptyRoom(i-1)){
				
				message+="\nMini Cuarto "+i;
				
			}
			
		}
		if(message.equals(firstMessage)){
			
			message="No hay cuartos disponibles";
			
		}
		
		return message;
		
	}//R4*
	
	public String showPetRoomNumber(String petName){
		
		String firstMessage="Esta en el cuarto:";
		String message="Esta en el cuarto:";
		
		for(int i=0; i<ROOM_QUANTITY; i++){
			
			if(rooms[i].getPet()!=null){
				
				String petNameI=rooms[i].getPet().getName();
				
				if(petNameI.equals(petName)){
					
					message+=" "+rooms[i].getNumber();
					
				}
				
			}
			
		}
		if(message.equals(firstMessage)){
			
			message="No se encontro a la mascota";
			
		}
		
		return message;
		
	}//R5*
	
	public String showAllActualRecord(){
		
		String firstMessage="Historias medicas de las mascotas hopitalizadas";
		String message="Historias medicas de las mascotas hopitalizadas";
		
		for(int i=0; i<ROOM_QUANTITY; i++){
			
			if(rooms[i].getActualRecord()!=null){
				
				message+=rooms[i].getActualRecord().printRecord();
				
			}
			
		}
		if(message.equals(firstMessage)){
			
			message="No hay mascotas hospitalizadas";
			
		}
		
		return message;
		
	}//R6*
	
	public String showPetRecords(String id, String name){
		
		String message="No se encontro a la mascota";
		
		int ownerSize=owners.size();
		
		for(int i=0; i<ownerSize; i++){
			
			String ownerId=owners.get(i).getId();
			
			if(ownerId.equals(id)){
				
				int petSize=owners.get(i).getPets().size();
				
				for(int j=0; j<petSize;j++){
					
					String petName=owners.get(i).getPets().get(j).getName();
					
					if(petName.equals(name)){
						
						message="Historias medicas de la mascota "+name;
						
						int recordSize=owners.get(i).getPets().get(j).getRecords().size();
						
						for(int l=1; l<recordSize; l++){
							
							message+="\n"+owners.get(i).getPets().get(j).getRecords().get(l).printRecord();
							
						}
						
					}
					
				}
				
			}
			
		}
		if(message.equals("Historias medicas de la mascota "+name)){
			
			message="La mascota no tiene historias clinicas";
			
		}
		
		return message;
		
	}//R7*
	
	public String dischargePet(int roomNumber, int dayOut, int monthOut, int yearOut){
		
		String message="Este cuarto esta vacio";
		boolean run=true;
		
		while(run){
			
			if(!emptyRoom(roomNumber-1)){
				
				int ownerSize=owners.size();
				
				for(int i=0; i<ownerSize; i++){
					
					String ownerId=owners.get(i).getId();
					
					if(rooms[roomNumber-1].getActualRecord()!=null){
						
						if(ownerId.equals(rooms[roomNumber-1].getActualRecord().getOwnerId())){
							
							int petSize=owners.get(i).getPets().size();
							
							for(int j=0; j<petSize;j++){
								
								String petName=owners.get(i).getPets().get(j).getName();
								
								if(rooms[roomNumber-1].getPet()!=null){
									
									if(petName.equals(rooms[roomNumber-1].getPet().getName())){
										
										Date dateOut=new Date(dayOut, monthOut, yearOut);
										
										Record newRecord=rooms[roomNumber-1].getActualRecord();
										newRecord.setStatus(false);
										newRecord.setDateOut(dateOut);
										
										rooms[roomNumber-1].setActualRecord(null);
										rooms[roomNumber-1].setPet(null);
										
										owners.get(i).getPets().get(j).addRecords(newRecord);
										
										this.totalHospitalizationMoney+=newRecord.calculateHospitalizationCost();
										
										message="Son un total de $"+newRecord.calculateHospitalizationCost();
										
										run=false;
										
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		
		return message;
		
	}//R8*
	
	public String showOwnerDataPet(String name){
		
		String firstMessage="";
		String message="";
		
		int ownerSize=owners.size();
		
		for(int i=0; i<ownerSize; i++){
			
			int petSize=owners.get(i).getPets().size();
			
			for(int j=0; j<petSize; j++){
				
				String petName=owners.get(i).getPets().get(j).getName();
				
				if(petName.equals(name)){
					
					message+=owners.get(i).getPets().get(j).getRecords().get(0).showOwnerData();
					
				}
				
			}
			
		}
		if(message.equals(firstMessage)){
			
			message="No se encontro la mascota";
			
		}
		
		return message;
		
	}//R9*
	
	public String showOwnerDataOwner(String name){
		
		String firstMessage="";
		String message="";
		
		int ownerSize=owners.size();
		
		for(int i=0; i<ownerSize; i++){
			
			String ownerName=owners.get(i).getName();
			
			if(ownerName.equals(name)){
				
				message+=owners.get(i).getPets().get(0).getRecords().get(0).showOwnerData();;
				
			}
			
		}
		if(message.equals(firstMessage)){
			
			message="No se encontro al dueno";
			
		}
		
		return message;
		
	}//R10*
	
	public String showPetBmi(String id, String name){
		
		String message="No se encontro a la mascota";
		
		int ownerSize=owners.size();
		
		for(int i=0; i<ownerSize; i++){
			
			String ownerId=owners.get(i).getId();
			
			if(ownerId.equals(id)){
				
				int petSize=owners.get(i).getPets().size();
				
				for(int j=0; j<petSize;j++){
					
					String petName=owners.get(i).getPets().get(j).getName();
					
					if(petName.equals(name)){
						
						message="IMC de "+name+ ": "+owners.get(i).getPets().get(j).calculateBmi();
						
					}
					
				}
				
			}
			
		}
		
		return message;
		
	}//R12*
	
	public String changeOwnerData(String id, String address, int phone){
		
		String message="No se encontro al dueno";
		
		int ownerSize=owners.size();
		
		for(int i=0; i<ownerSize; i++){
			
			String ownerId=owners.get(i).getId();
			
			if(ownerId.equals(id)){
				
				owners.get(i).changeAddressAndPhone(address, phone);
				
				message="Se han cambiado los datos del cliente";
				
				int petSize=owners.get(i).getPets().size();
				
				for(int j=0; j<petSize;j++){
					
					owners.get(i).getPets().get(j).getRecords().get(0).changeAddressAndPhone(address, phone);
					
				}
				
			}
			
		}
		
		return message;
		
	}//R13*
	
	public String addMedicine(String name, String dose, double periodicity, double price, int roomNumber){
		
		String message="";
		
		if(rooms[roomNumber-1].getActualRecord()!=null){
			
			message=rooms[roomNumber-1].addMedicine(name, dose, periodicity, price);
			
		}
		else{
			
			message="No se pudo anadir la medicina, porque no existe la historia clinica";
			
		}
		
		return message;
		
		
	}//R14*
	
	public String addDiagnostic(String diagnostic, int roomNumber){
		
		String message="Se ha anadido un diagnostico a la historia clinica actual";
		
		if(rooms[roomNumber-1].getActualRecord()!=null){
			
			rooms[roomNumber-1].getActualRecord().addDiagnostic(diagnostic);
			
		}
		else{
			
			message="No se pudo anadir el diagnostico, porque no existe la historia clinica";
			
		}
		
		return message;
		
	}//R15*
	
	public String addSymptom(String symptom, int roomNumber){
		
		String message="Se ha anadido un sintoma a la historia clinica actual";
		
		if(rooms[roomNumber-1].getActualRecord()!=null){
			
			rooms[roomNumber-1].getActualRecord().addSymptom(symptom);
			
		}
		else{
			
			message="No se pudo anadir el sintoma, porque no existe la historia clinica";
			
		}
		
		return message;
		
	}//R16*
	
	public String registerService(String type, String ownerId, String petName, int day, int month, int year){
		
		String message="No se encontro a la mascota o al cliente";
		
		Date date=new Date(day, month, year);
		Service newService=null;
		int serviceCost=0;
		
		if(type.equals(Service.SERVICE_TYPES[0])){
			
			serviceCost=20000;
			
		}
		else if(type.equals(Service.SERVICE_TYPES[1])){
			
			serviceCost=30000;
			
		}
		else if(type.equals(Service.SERVICE_TYPES[2])){
			
			serviceCost=8000;
			
		}
		else if(type.equals(Service.SERVICE_TYPES[3])){
			
			serviceCost=12000;
			
		}
		else if(type.equals(Service.SERVICE_TYPES[4])){
			
			serviceCost=45000;
			
		}
		else {
			
			message="El servicio no existe";
			
		}
		
		
		int ownerSize=owners.size();
		
		for(int i=0; i<ownerSize; i++){
			
			if(ownerId.equals(owners.get(i).getId())){
				
				int petSize=owners.get(i).getPets().size();
				
				for(int j=0; j<petSize;j++){
					
					if(petName.equals(owners.get(i).getPets().get(j).getName())){
						
						String petId=owners.get(i).getPets().get(j).getId();
						newService=new Service(type, serviceCost, ownerId, petId, date);
						services.add(newService);
						
						message="Se ha registrado el servicio \nCosto del servicio: "+serviceCost;
						
					}
					
				}
				
			}
			
		}
		
		return message;
		
	}//RF17*
	
	public double calculateTotalServiceMoney(String type){
		
		double totalMoney=0;
		
		for(int i=0; i<services.size(); i++){
			
			if(type.equals( services.get(i).getType() )){
				
				totalMoney+=services.get(i).getPrice();
				
			}
			
		}
		
		return totalMoney;
		
	}//RF18*
	
	public double calculateServiceAverage(){
		
		double average=0;
		
		int servicesSize=services.size();
		for(int i=0; i<servicesSize; i++){
			
			average+=services.get(i).getPrice();
			
		}
		if(average!=0){
			
			average/=servicesSize;
			
		}
		
		return average;
		
	}//RF19*
	
	public double calculateWeekAverage(int day, int month, int year){
		
		double average=0;
		int counter=0;
		
		Date firstDate=new Date(day, month, year);
		
		for(int i=0; i<services.size(); i++){
			
			if(services.get(i).itsOnTheWeek(firstDate)){
				
				counter++;
				average+=services.get(i).getPrice();
				
			}
			
		}
		for(int j=0;j<owners.size();j++){

			for(int l=0;l<owners.get(j).getPets().size();l++){

				for(int k=1;k<owners.get(j).getPets().get(l).getRecords().size();k++){

					if(owners.get(j).getPets().get(l).getRecords().get(k).itsOnTheWeek(firstDate)){

						counter++;
						average+=owners.get(j).getPets().get(l).getRecords().get(k).calculateHospitalizationCost();

					}

				}

			}

		}
		if(counter!=0){
			
			average/=counter;
			
		}
		
		return average;
		
	}//RF20*
	
	public String ServiceTimeLapseReport(int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear){
		
		String reports="";
		
		Date startDate=new Date(startDay, startMonth, startYear);
		Date endDate=new Date(endDay, endMonth, endYear);
		
		for(int i=0; i<services.size(); i++){
			
			if(services.get(i).itsBetweenThisTimeLapse(startDate, endDate)){
				
				reports+=services.get(i).printReport();
				
			}
			
		}
		
		return reports;
		
	}//RF21*
	
	public double calculateTotalMoney(){
		
		double totalMoney=totalHospitalizationMoney;
		
		for(int i=0; i<services.size(); i++){
			
			totalMoney+=services.get(i).getPrice();
			
		}
		
		return totalMoney;
		
	}//RF22*
	
	//Gets
	public String getName(){
		
		return name;
		
	}
	
	public Room getRooms(int n){
		
		return rooms[n];
		
	}
	
	public ArrayList<Owner> getOwners(){
		
		return owners;
		
	}
	
	public double getTotalHospitalizationMoney(){
		
		return totalHospitalizationMoney;
		
	}//R11*
	
	public ArrayList<Service> getServices(){
		
		return services;
		
	}
	
	//Sets
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public void setRooms(int n, Room room){
		
		this.rooms[n]=room;
		
	}
	
	public void setOwners(ArrayList<Owner> owners){
		
		this.owners=owners;
		
	}
	
	public void setTotalHospitalizationMoney(double totalHospitalizationMoney){
		
		this.totalHospitalizationMoney=totalHospitalizationMoney;
		
	}
	
	public void setServices(ArrayList<Service> services){
		
		this.services=services;
		
	}
	
}