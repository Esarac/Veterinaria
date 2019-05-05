package model;
import java.util.ArrayList;

/**
*Description: The class Veterinary in the package model.<br>
*@author Esteban Ariza
*/
public class Veterinary{

	//Constatants
	public static final int ROOM_QUANTITY=8;

	//Attributes
	private String name;
	private Room[] rooms;
	private double totalHospitalizationMoney;
	private ArrayList<Owner> owners;
	private ArrayList<Service> services;

	//Constructor
	/**
	*Description: the constructor of the class Veterinary.<br>
	*Post: All The attributes of the clase are initialize.<br>
	*@param name The name we want to set.
	*/
	public Veterinary(String name){

		this.name=name;
		this.totalHospitalizationMoney=0;

		this.rooms=new Room[ROOM_QUANTITY];

		this.owners=new ArrayList<Owner>();
		this.services=new ArrayList<Service>();

	}

	//Menu
	/**
	*Description: This method show a menu in text.<br>
	*@return A String that is the menu.
	*/
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

	/**
	*Description: This method show a room menu in text that shows the empty or the filled rooms.<br>
	*Pre: the elements of the array rooms could not be null.<br>
	*@param empty A boolean that define if shows the empty rooms or the filled rooms.
	*@return A String that is the menu.
	*@throws NullPointerException if the rooms elements are null.
	*/
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

	/**
	*Description: This method show a service type menu in text.<br>
	*@return A String that is the service type menu.
	*/
	public String showServiceTypeMenu(){

		String menu="\nElije el tipo de servicio:\n 1.Bano de mascotas en la veterinaria\n 2.Bano de mascotas a domicilio\n 3.Corte de Unas\n 4.Profilaxis dental \n 5.Aplicacion de vacunas\n~";

		return menu;

	}

	//Do
	/**
	*Description: This method analize if the room is empty.<br>
	*Pre: the elements of the array rooms could not be null.<br>
	*@param roomNumber The room index.
	*@return A boolean that represent if the room is empty or not.
	*@throws NullPointerException if the rooms elements are null.
	*@throws ArrayIndexOutOfBoundsException if the index is out of range.
	*/
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

	/**
	*Description: This method instanciate a owner and try to added to the array owners.<br>
	*@param ownerName The name of the owner.
	*@param ownerId The id of the owner.
	*@param ownerAddress The address of the owner.
	*@param ownerPhone The phone of the owner.
	*@param petName The name of the pet of the owner.
	*@param petId The id of the pet of the owner.
	*@param petType The type of the pet of the owner.
	*@param petAge The age of the pet of the owner.
	*@param petWeight The weight of the pet of the owner.
	*@param petHeight The height of the pet of the owner.
	*@param dayIn The day when the pet was created.
	*@param monthIn The month when the pet was created.
	*@param yearIn The year when the pet was created.
	*@return A String that informs if the owner was added.
	*/
	public String createOwner(String ownerName, String ownerId, String ownerAddress, int ownerPhone, String petName, String petId, char petType, int petAge, double petWeight, double petHeight, int dayIn, int monthIn, int yearIn){

		String message="Se a creado el usuario exitosamente";

		Date petDateIn=new Date(dayIn, monthIn, yearIn);

		Record petRecord=new Record(false, "", "", petDateIn, ownerName, ownerId, ownerAddress, ownerPhone, petName, petId, petType, petAge, petWeight, petHeight);
		Pet pet=new Pet(petName, petId, petType, petAge, petWeight, petHeight, petRecord);

		Owner profile=new Owner(ownerName, ownerId, ownerAddress, ownerPhone, pet);
		owners.add(profile);

		return message;

	}//R1*

	/**
	*Description: This method instanciate a pet and try to added to a owner.<br>
	*Pre: The elements of the ArrayList owners must not be null.<br>
	*@param ownerId The id of the owner we want to add the pet.
	*@param name The name of the pet.
	*@param id The id of the pet.
	*@param type The type of the pet.
	*@param age The age of the pet.
	*@param weight The weight of the pet.
	*@param height The height of the pet.
	*@param dayIn The day when the pet was created.
	*@param monthIn The month when the pet was created.
	*@param yearIn The year when the pet was created.
	*@return A String that informs if the pet was added. If the pet can not be added shows the reasons.
	*@throws NullPointerException if the owner elements are null.
	*/
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

	/**
	*Description: This method insert a existing pet into a specified room.<br>
	*Pre: The elements of the ArrayList owners must not be null. Also the pets of this owners can not be null.<br>
	*@param ownerId The id of the owner we want to take the pet.
	*@param petName The name of the pet we want to take.
	*@param roomNumber The number of the room we want to use. the index+1 of the room.
	*@return A String that informs if the pet was added to the room. If the pet can not be added shows the reasons.
	*@throws NullPointerException if the owner or pet elements are null.
	*@throws ArrayIndexOutOfBoundsException if the index is out of range.
	*/
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

	/**
	*Description: This method try to create a record to a hospitalizated pet.<br>
	*Pre: The elements of the array rooms could not be null.<br>
	*@param symptom The symptom of the record.
	*@param diagnostic The diagnostic of the record.
	*@param dayIn The day when the pet was hospitalizated.
	*@param monthIn The month when the pet was hospitalizated.
	*@param yearIn The year when the pet was hospitalizated.
	*@param roomNumber The number of the room we want to set the record. the index+1 of the room.
	*@return A String that informs if the record was added to the room. If the record can not be added shows the reasons.
	*@throws NullPointerException if the room element is null.
	*@throws ArrayIndexOutOfBoundsException if the index is out of range.
	*/
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

	/**
	*Description: This method show the empty rooms.<br>
	*@return A String that show a list of the empty rooms.
	*/
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

	/**
	*Description: This method try to create a record to a hospitalizated pet.<br>
	*Pre: The elements of the array rooms could not be null.<br>
	*@param petName The name of the pet that we want to search.
	*@return A String that the room number. If the pet is not found shows a message.
	*@throws NullPointerException if the room element is null.
	*/
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

	/**
	*Description: This method shows the actual records of the hospitalizated pets.<br>
	*Pre: The elements of the array rooms could not be null.<br>
	*@return A String that shows the actual records of the hospitalized pets. If there is an error shows the reasons.
	*@throws NullPointerException if the room element is null.
	*/
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

	/**
	*Description: This method shows the records of a pet<br>
	*Pre: The elements of the ArrayList owners, pets, records could not be null.<br>
	*@param id The id of the owner.
	*@param name The name of the pet.
	*@return A String that shows the records of the pet. If there is an error shows the reasons.
	*@throws NullPointerException if the owners, pets or records element are null.
	*/
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

	/**
	*Description: This method try to discharge a hospitalized pet.<br>
	*Pre: The elements of the ArrayList owners, pets, records  and array rooms could not be null.<br>
	*@param roomNumber The number of the room we want to discharge the pet. the index+1 of the room.
	*@param dayOut The day out of the actual record.
	*@param monthOut The month out of the actual record.
	*@param yearOut The year out of the actual record.
	*@return A String that informs if the pet was discharged. If the pet could not be discharged shows the reasons.
	*@throws NullPointerException if the room, owners, pets or records element are null.
	*@throws ArrayIndexOutOfBoundsException if the index is out of range.
	*/
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

	/**
	*Description: This method try to show the owner data by the pet name.<br>
	*Pre: The elements of the ArrayList owners, pets or the records(0) could not be null.<br>
	*@param name The name of the pet.
	*@return A String that shows the owner data. If the pet can not be found shows the reasons.
	*@throws NullPointerException if the owners, pets or records(0) element are null.
	*/
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

	/**
	*Description: This method try to show the owner data by the owner name.<br>
	*Pre: The elements of the ArrayList owners, pet(0) or records(0) could not be null.<br>
	*@param name The name of the owner.
	*@return A String that shows the owner data. If the owner can not be found shows the reasons.
	*@throws NullPointerException if the owners, pets(0) or records(0) element are null.
	*/
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

	/**
	*Description: This method try to show the body mass index of a pet.<br>
	*Pre: The elements of the ArrayList owners or pets could not be null.<br>
	*@param id The id of the owner.
	*@param name The name of the pet.
	*@return A String that shows the bmi of the pet. If the bmi can not be showed the reasons.
	*@throws NullPointerException if the owners or pets element are null.
	*/
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

	/**
	*Description: This method try to change the address and phone of a owner. Also try to change the report(0) ownerPhone and ownerAddress of all pets.<br>
	*Pre: The elements of the ArrayList owners, pets or records(0) could not be null.<br>
	*@param id The id of the owner.
	*@param address The new address of the client.
	*@param phone The new phone of the client.
	*@return A String that informs if the owner data was changed. If the data can not be changed, shows the reasons.
	*@throws NullPointerException if the owners, pets or records(0) element are null.
	*/
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

	/**
	*Description: This method try to add medicine to a record of a hospitalizated pet.<br>
	*Pre: The elements of the array rooms could not be null.<br>
	*@param name The name of the medicine.
	*@param dose The dose of the medicine.
	*@param periodicity The periodicity of the medicine.
	*@param price The price of the medicine.
	*@param roomNumber The number of the room we want to set the medicine. the index+1 of the room.
	*@return A String that informs if the medicine was added to the actual record. If the medicine can not be added shows the reasons.
	*@throws NullPointerException if the room element is null.
	*@throws ArrayIndexOutOfBoundsException if the index is out of range.
	*/
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

	/**
	*Description: This method try to add a diagnostic to a record of a hospitalizated pet.<br>
	*Pre: The elements of the array rooms could not be null.<br>
	*@param diagnostic The new diagnostic of the record.
	*@param roomNumber The number of the room we want to set the diagnostic. the index+1 of the room.
	*@return A String that informs if the diagnostic was added to the actual record. If the diagnostic can not be added shows the reasons.
	*@throws NullPointerException if the room element is null.
	*@throws ArrayIndexOutOfBoundsException if the index is out of range.
	*/
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

	/**
	*Description: This method try to add a symptom to a record of a hospitalizated pet.<br>
	*Pre: The elements of the array rooms could not be null.<br>
	*@param symptom The new symptom of the record.
	*@param roomNumber The number of the room we want to set the symptom. the index+1 of the room.
	*@return A String that informs if the symptom was added to the actual record. If the symptom can not be added shows the reasons.
	*@throws NullPointerException if the room element is null.
	*@throws ArrayIndexOutOfBoundsException if the index is out of range.
	*/
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

	/**
	*Description: This method try to create privided service.<br>
	*Pre: The elements of the ArrayList owners or pets could not be null.<br>
	*@param type The type of the service.
	*@param ownerId The owner id of the service.
	*@param petName The pet name of the service.
	*@param day The day of the service.
	*@param month The month of the service.
	*@param year The year of the service.
	*@return A String that informs if the service was created and added. If the service can not be added shows the reasons.
	*@throws NullPointerException if the owners or pets element is null.
	*/
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

	/**
	*Description: This method calculate the total money of a specific service type.<br>
	*Pre: The elements of the ArrayList service could not be null.<br>
	*@param type The type of the services.
	*@return A double that is the total money of the service type.
	*@throws NullPointerException if the service element is null.
	*/
	public double calculateTotalServiceMoney(String type){

		double totalMoney=0;

		for(int i=0; i<services.size(); i++){

			if(type.equals( services.get(i).getType() )){

				totalMoney+=services.get(i).getPrice();

			}

		}

		return totalMoney;

	}//RF18*

	/**
	*Description: This method calculate the service total money average.<br>
	*Pre: The elements of the ArrayList service could not be null.<br>
	*@return A double that is the total money average of the services.
	*@throws NullPointerException if the service element is null.
	*@throws ArithmeticException if the serviceSize is 0.
	*/
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

	/**
	*Description: This method calculate the service and hospitalization money average in a specific week.<br>
	*Pre: The elements of the ArrayList service, owners, pets, records could not be null.<br>
	*@param day The day where the week starts.
	*@param month The month where the week starts.
	*@param year The year where the week starts.
	*@return A double that is the money average of the services and hospitalization in a specific week.
	*@throws NullPointerException if the service, owners, pets or service element is null.
	*/
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

	/**
	*Description: This method try to show the privided services reports between a time lapse.<br>
	*Pre: The elements of the ArrayList service could not be null.<br>
	*@param startDay The day which the time lapse starts.
	*@param startMonth The month which the time lapse starts.
	*@param startYear The year which the time lapse starts.
	*@param endDay The day which the time lapse ends.
	*@param endMonth The month which the time lapse ends.
	*@param endYear The year which the time lapse ends.
	*@return A String that shows the services reports privided in that time lapse. If the service report can not be shown, show nothing.
	*@throws NullPointerException if the service element is null.
	*/
	public String serviceTimeLapseReport(int startDay, int startMonth, int startYear, int endDay, int endMonth, int endYear){

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

	/**
	*Description: This show the total veterinary money.<br>
	*Pre: The elements of the ArrayList service could not be null.<br>
	*@return A double that calculate the total veterinary money.
	*@throws NullPointerException if the service element is null.
	*/
	public double calculateTotalMoney(){

		double totalMoney=totalHospitalizationMoney;

		for(int i=0; i<services.size(); i++){

			totalMoney+=services.get(i).getPrice();

		}

		return totalMoney;

	}//RF22*

	//Gets
	/**
	*Description: return the name of the veterinary.<br>
	*@return A String that is the name of the veterinary.
	*/
	public String getName(){

		return name;

	}

	/**
	*Description: return a room of the veterinary.<br>
	*@param n The index of the room.
	*@return A Room that is the room of the veterinary.
	*@throws ArrayIndexOutOfBoundsException if the index is out of range.
	*/
	public Room getRooms(int n){

		return rooms[n];

	}

	/**
	*Description: return the owners of the veterinary.<br>
	*@return An ArrayList that is the owners of the veterinary.
	*/
	public ArrayList<Owner> getOwners(){

		return owners;

	}

	/**
	*Description: return the total hospitalization money of the veterinary.<br>
	*@return A double that is the total hospitalization money of the veterinary.
	*/
	public double getTotalHospitalizationMoney(){

		return totalHospitalizationMoney;

	}//R11*

	/**
	*Description: return the services of the veterinary.<br>
	*@return A ArrayList that is the services of the veterinary.
	*/
	public ArrayList<Service> getServices(){

		return services;

	}

	//Sets
	/**
	*Description: modified the name of the veterinary.<br>
	*Post: The name was modified.<br>
	*@param name The name we want to set.
	*/
	public void setName(String name){

		this.name=name;

	}

	/**
	*Description: modified the room of the veterinary.<br>
	*Post: The room was modified.<br>
	*@param n The index of the room.
	*@param room The room we want to set.
	*@throws ArrayIndexOutOfBoundsException if the index is out of range.
	*/
	public void setRooms(int n, Room room){

		this.rooms[n]=room;

	}

	/**
	*Description: modified the owners of the veterinary.<br>
	*Post: The owners was modified.<br>
	*@param owners The ArrayList of owners we want to set.
	*/
	public void setOwners(ArrayList<Owner> owners){

		this.owners=owners;

	}

	/**
	*Description: modified the total hospitalization money of the veterinary.<br>
	*Post: The total hospitalization money was modified.<br>
	*@param totalHospitalizationMoney The total hospitalization money we want to set.
	*/
	public void setTotalHospitalizationMoney(double totalHospitalizationMoney){

		this.totalHospitalizationMoney=totalHospitalizationMoney;

	}

	/**
	*Description: modified the services of the veterinary.<br>
	*Post: The services was modified.<br>
	*@param services The ArrayList of services we want to set.
	*/
	public void setServices(ArrayList<Service> services){

		this.services=services;

	}

}
