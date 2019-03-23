package model;
import java.util.ArrayList;

public class Veterinary{
	
	//Constatants
	private final static int roomQuantity=8;
	
	//Atributes
	private String name;
	private Room[] room;//###
	private ArrayList<Owner> owner;//###
	
	//Constructor
	public Veterinary(String name){
		
		this.name=name;
		
		this.room=new Room[roomQuantity];//###
		
		this.owner=new ArrayList<Owner>();
		
	}
	//Menu
	public String showMenu(){
		
		String message="\n-----";
		message+="\nVeterinaria "+name;
		message+="\n-----";
		message+="\nBienvenido a la aplicacion SmartPet, Seleccione una opcion:";
		message+="\n 1.Registrar a un cliente";
		message+="\n 2.Registrar a una mascota";
		message+="\n 3.Hospitalizar una mascota";
		message+="\n 4.Consultar el numero de mini cuarto en el que se encuentra una mascota";
		message+="\n 5.Mostrar informe de las historias clinicas de los animales hospitalizados";
		message+="\n 6.Consultar el historial de historias clinicas de una mascota";
		message+="\n 7.Dar de alta a una mascota";
		message+="\n 8.Consultar datos del cliente a traves de la mascota";
		message+="\n 9.Consultar datos del cliente a traves del nombre del cliente";
		message+="\n 10.Total de ingresos por hospitalizaciones";
		message+="\n 11.Salir\n~";
		
		return message;
		
	}
	
	public String showRoom(boolean empty){
		
		String message="\nElegir el mini cuarto";
		
		if(empty){
			
			if(room[0].getPet()==null){
				
				message+="\n 1.Room 1";
				
			}
			if(room[1].getPet()==null){
				
				message+="\n 2.Room 2";
				
			}
			if(room[2].getPet()==null){
				
				message+="\n 3.Room 3";
				
			}
			if(room[3].getPet()==null){
				
				message+="\n 4.Room 4";
				
			}
			if(room[4].getPet()==null){
				
				message+="\n 5.Room 5";
				
			}
			if(room[5].getPet()==null){
				
				message+="\n 6.Room 6";
				
			}
			if(room[6].getPet()==null){
				
				message+="\n 7.Room 7";
				
			}
			if(room[7].getPet()==null){
				
				message+="\n 8.Room 8";
				
			}
			
		}
		else{
			
			if(room[0].getPet()!=null){
				
				message+="\n 1.Room 1 ("+room[0].getPet().getName()+")";
				
			}
			if(room[1].getPet()!=null){
				
				message+="\n 2.Room 2 ("+room[1].getPet().getName()+")";
				
			}
			if(room[2].getPet()!=null){
				
				message+="\n 3.Room 3 ("+room[2].getPet().getName()+")";
				
			}
			if(room[3].getPet()!=null){
				
				message+="\n 4.Room 4 ("+room[3].getPet().getName()+")";
				
			}
			if(room[4].getPet()!=null){
				
				message+="\n 5.Room 5 ("+room[4].getPet().getName()+")";
				
			}
			if(room[5].getPet()!=null){
				
				message+="\n 6.Room 6 ("+room[5].getPet().getName()+")";
				
			}
			if(room[6].getPet()!=null){
				
				message+="\n 7.Room 7 ("+room[6].getPet().getName()+")";
				
			}
			if(room[7].getPet()!=null){
				
				message+="\n 8.Room 8 ("+room[7].getPet().getName()+")";
				
			}
			
		}
		
		return message;
		
	}
	
	//Do
	public String createOwner(String ownerName, String ownerId, String ownerAddress, int ownerPhone, String petName, char petType, int petAge, double petWeight, int dayIn, int monthIn, int yearIn){
		
		String message="Se a creado el usuario exitosamente";
		
		Date petDateIn=new Date(dayIn, monthIn, yearIn);
		
		Record petRecord=new Record(false, "", "", petDateIn, ownerName, ownerId, ownerAddress, ownerPhone, petName, petType, petAge, petWeight);
		Pet pet=new Pet(petName, petType, petAge, petWeight, petRecord);
		
		Owner profile=new Owner(ownerName, ownerId, ownerAddress, ownerPhone, pet);
		owner.add(profile);
		
		return message;
		
	}
	
	public String createPet(String ownerName, String name, char type, int age, double weight, int dayIn, int monthIn, int yearIn){
		
		String message="No se encontro el usuario";
		
		Date dateIn=new Date(dayIn, monthIn, yearIn);
		
		int ownerSize=owner.size();
		
		for(int i=0; i<ownerSize; i++){
			
			String ownerNameI=owner.get(i).getName();
			
			if(ownerNameI.equals(ownerName)){
				
				Record record=new Record(false, "", "", dateIn, owner.get(i).getName(), owner.get(i).getId(), owner.get(i).getAddress(), owner.get(i).getPhone(), name, type, age, weight);
				
				Pet pet=new Pet(name, type, age, weight, record);
				
				message=owner.get(i).createPet(pet);
				
			}
			
		}
		
		return message;
		
	}
	
	public boolean emptyRoom(int roomNumber){
		
		boolean empty=false;
		
		if(room[roomNumber].getPet()==null){
			
			empty=true;
			
		}
		else{
			
			empty=false;
			
		}
		
		return empty;
		
	}
	
	public String hospitalizate(String ownerName, String petName, int roomNumber){
		
		String message="No se encontro al dueno o a la mascota digitada";
		
		int ownerSize=owner.size();
		
		Pet profile=null;
		
		for(int i=0; i<ownerSize; i++){
			
			String ownerNameI=owner.get(i).getName();
			
			if(ownerNameI.equals(ownerName)){
				
				int petSize=owner.get(i).getPet().size();
				
				for(int j=0; j<petSize; j++){
					
					String petNameJ=owner.get(i).getPet().get(j).getName();
					
					if(petNameJ.equals(petName)){
						
						profile=owner.get(i).getPet().get(j);
						message="Se ha hospitalizado la mascota";
						
					}
					
				}
				
			}
			
		}
		
		if(emptyRoom(roomNumber-1)){
			
			room[roomNumber-1].setPet(profile);
			
		}
		else{
			
			message="El cuarto esta ocupado";
			
		}
		
		return message;
		
	}//R1
	
	public String createRecord(String symptom, String diagnostic, int dayIn, int monthIn, int yearIn, int roomNumber){
		
		String message="Se ha creado la historia clinica exitosamente";
		
		Date dateIn=new Date(dayIn, monthIn, yearIn);
		
		if(!emptyRoom(roomNumber-1)){
			
			String ownerName=room[roomNumber-1].getPet().getRecord().get(0).getOwnerName();
			String ownerId=room[roomNumber-1].getPet().getRecord().get(0).getOwnerId();
			String ownerAddress=room[roomNumber-1].getPet().getRecord().get(0).getOwnerAddress();
			int ownerPhone=room[roomNumber-1].getPet().getRecord().get(0).getOwnerPhone();
			
			String petName=room[roomNumber-1].getPet().getRecord().get(0).getPetName();
			char petType=room[roomNumber-1].getPet().getRecord().get(0).getPetType();
			int petAge=room[roomNumber-1].getPet().getRecord().get(0).getPetAge();
			double petWeight=room[roomNumber-1].getPet().getRecord().get(0).getPetWeight();
			
			Record record=new Record(true, symptom, diagnostic, dateIn, ownerName, ownerId, ownerAddress, ownerPhone, petName, petType, petAge, petWeight);
			
			room[roomNumber-1].setActualRecord(record);
			
		}
		else{
			
			message="No se pudo crear la historia clinica, porque no hay un animal en el cuarto";
			
		}
		
		return message;
		
	}//R1
	
	public String addMedicine(String name, String dose, double periodicity, double price, int roomNumber){
		
		String message="Se ha anadido una medicina a la historia clinica actual";
		
		if(room[roomNumber-1].getActualRecord()!=null){
			
			ArrayList<Medicine> newMedicine=room[roomNumber-1].getActualRecord().getMedicine();
			Medicine medicine=new Medicine(name, dose, periodicity, price);
			newMedicine.add(medicine);
		
			Record newRecord=room[roomNumber-1].getActualRecord();
			newRecord.setMedicine(newMedicine);
			
			room[roomNumber-1].setActualRecord(newRecord);
			
		}
		else{
			
			message="No se pudo anadir la medicina, porque no existe la historia clinica";
			
		}
		
		return message;
		
		
	}//R1
	
	public String dischargePet(int roomNumber){
		
		String message="No se encontro a al dueno o a la mascota";
		
		if(!emptyRoom(roomNumber-1)){
			
			int ownerSize=owner.size();
			
			for(int i=0; i<ownerSize; i++){
				
				String ownerName=owner.get(i).getName();
				
				if(ownerName.equals(room[roomNumber-1].getActualRecord().getOwnerName())){
					
					int petSize=owner.get(i).getPet().size();
					
					for(int j=0; j<petSize;j++){
						
						String petName=owner.get(i).getPet().get(j).getName();
						
						if(petName.equals(room[roomNumber-1].getActualRecord().getPetName())){
							
							ArrayList<Record> newRecords=owner.get(i).getPet().get(j).getRecord();
							
							Record newRecord=room[roomNumber-1].getActualRecord();
							newRecord.setStatus(false);
							newRecords.add(newRecord);
							
							room[roomNumber-1].setActualRecord(null);
							room[roomNumber-1].setPet(null);
							
							owner.get(i).getPet().get(j).setRecord(newRecords);
							
							message="Se ha dado de alta a la mascota";
							
						}
						
					}
					
				}
				
			}
			
		}
		
		return message;
		
	}
	
	public String showAllActualRecord(){
		
		String message="Historias medicas de las mascotas hopitalizadas";
		
		for(int i=0; i<roomQuantity; i++){
			
			if(room[i].getActualRecord()!=null){
				
				message+=room[i].getActualRecord().printRecord();
				
			}
			
		}
		
		return message;
		
	}
	
	public String showPetRoomNumber(String petName){
		
		String message="The room number";
		
		for(int i=0; i<roomQuantity; i++){
			
			String petNameI=room[i].getPet().getName();
			
			if(petNameI.equals(petName)){
				
				message+=" "+room[i].getNumber();
				
			}
			
		}
		
		return message;
		
	}
	
	//Gets
	public String getName(){
		
		return name;
		
	}
	
	public Room getRoom(int n){
		
		return room[n];
		
	}
	
	public ArrayList<Owner> getOwner(){
		
		return owner;
		
	}
	
	//Sets
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public void setRoom(int n, Room room){
		
		this.room[n]=room;
		
	}
	
	public void setOwner(ArrayList<Owner> owner){
		
		this.owner=owner;
		
	}
	
}