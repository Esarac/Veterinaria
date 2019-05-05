package ui;
import model.Veterinary;
import model.Room;
import model.Pet;
import model.Service;
import java.util.Scanner;

/**
*Description: The class Main in the package ui.<br>
*@author Esteban Ariza
*/
public class Main{

	//Atributes
	private Scanner scanner;
	private Veterinary veterinary;

	//Inicializer
	public static void main(String[]args){

		Main m = new Main();
		m.menu();

	}

	//Main menu
	/**
	*Description: This method show the ui menu.<br>
	*Pre: The veterinary or scanner can not be null.<br>
	*@throws NullPointerException if the veterinary or scanner are null.
	*/
	public void menu(){

		int option1=0;

		String profileOwnerId;
		String profilePetName;
		String serviceType;
		int roomNumber;

		boolean run=true;

		while(run){

			System.out.print(veterinary.showMenu());

			option1 = scanner.nextInt();
			scanner.nextLine();

			switch(option1){

				case 1:

					//OwnerName
					System.out.print("\nDigita el nombre del cliente\n~");

					String ownerName=scanner.nextLine();

					//OwnerId
					System.out.print("\nDigita el Identificador del cliente\n~");

					String ownerId=scanner.next();
					scanner.nextLine();

					//OwnerAddress
					System.out.print("\nDigita la direccion del cliente\n~");

					String ownerAddress=scanner.nextLine();

					//OwnerPhone
					System.out.print("\nDigita el telefono del cliente\n~");

					int ownerPhone=scanner.nextInt();
					scanner.nextLine();

					//PetName
					System.out.print("\nDigita el nombre de la mascota del cliente\n~");

					String petName=scanner.next();
					scanner.nextLine();

					//PetId
					System.out.print("\nDigita el id de la mascota del cliente\n~");

					String petId=scanner.next();
					scanner.nextLine();

					//PetType
					System.out.print("\nElije el tipo de mascota:\n 1.Perro\n 2.Gato\n 3.Ave\n 4.Otro\n~");

					char petType=askPetType();

					//PetAge
					System.out.print("\nDigita la edad en anos de la mascota\n~");

					int petAge=scanner.nextInt();
					scanner.nextLine();

					//PetWeight
					System.out.print("\nDigita el peso de la mascota\n~");

					double petWeight=scanner.nextDouble();
					scanner.nextLine();

					//PetHeight
					System.out.print("\nDigita la estatura de la mascota\n~");

					double petHeight=scanner.nextDouble();
					scanner.nextLine();

					//Date
					System.out.print("\nDigita el dia actual\n~");
					int day=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el mes actual\n~");
					int month=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el ano actual\n~");
					int year=scanner.nextInt();
					scanner.nextLine();

					//Create Owner Profile
					System.out.print(veterinary.createOwner(ownerName, ownerId, ownerAddress, ownerPhone, petName, petId, petType, petAge, petWeight, petHeight, day, month, year));

				break;

				case 2:

					//OwnerId
					System.out.print("\nDigita el Id del cliente\n~");

					profileOwnerId=scanner.next();
					scanner.nextLine();

					//PetName
					System.out.print("\nDigita el nombre de la mascota del cliente\n~");

					String name=scanner.next();
					scanner.nextLine();

					//PetId
					System.out.print("\nDigita el identificador de la mascota del cliente\n~");

					String id=scanner.next();
					scanner.nextLine();

					//PetType
					System.out.print("\nElije el tipo de mascota:\n 1.Perro\n 2.Gato\n 3.Ave\n 4.Otro\n~");

					char type=askPetType();

					//PetAge
					System.out.print("\nDigita la edad en anos de la mascota\n~");

					int age=scanner.nextInt();
					scanner.nextLine();

					//PetWeight
					System.out.print("\nDigita el peso de la mascota\n~");

					double weight=scanner.nextDouble();
					scanner.nextLine();

					//PetHeight
					System.out.print("\nDigita la estatura de la mascota\n~");

					double height=scanner.nextDouble();
					scanner.nextLine();

					//Date
					System.out.print("\nDigita el dia actual\n~");
					int petDay=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el mes actual\n~");
					int petMonth=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el ano actual\n~");
					int petYear=scanner.nextInt();
					scanner.nextLine();

					//Create Pet Profile
					System.out.print(veterinary.createPet(profileOwnerId, name, id, type, age, weight, height, petDay, petMonth, petYear));

				break;

				case 3:

					//Hopitalizate
					//OwnerId
					System.out.print("\nDigita el Id del cliente\n~");

					profileOwnerId=scanner.next();
					scanner.nextLine();

					//PetName
					System.out.print("\nDigita el nombre de su mascota\n~");

					profilePetName=scanner.next();
					scanner.nextLine();

					//RoomNumber
					System.out.print(veterinary.showRoomMenu(true));//Hacer un showRoomMenu

					roomNumber=askRoom();
					//...

					//CreateRecord
					//Symptoms
					System.out.print("\nColoca los sintomas\n~");

					String symptom=scanner.nextLine();

					//Diagnostic
					System.out.print("\nColoca el diagnostico\n~");

					String diagnostic=scanner.nextLine();

					//Date
					System.out.print("\nDigita el dia de hospitalizacion\n~");
					int hospitalizationDay=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el mes de hospitalizacion\n~");
					int hospitalizationMonth=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el ano de hospitalizacion\n~");
					int hospitalizationYear=scanner.nextInt();
					scanner.nextLine();
					//...

					//AddMedicines
					System.out.print("\nDigita cuantas medicinas deaseas resetar\n~");
					int medicineQuantity=scanner.nextInt();
					scanner.nextLine();

					System.out.print(veterinary.hospitalizate(profileOwnerId, profilePetName, roomNumber));
					System.out.print("\n"+veterinary.createRecord(symptom, diagnostic, hospitalizationDay, hospitalizationMonth, hospitalizationYear, roomNumber));

					for(int i=0; i<medicineQuantity; i++){

						System.out.print("\nDigita el nombre de la medicina #"+(i+1)+"\n~");
						String medicineName=scanner.nextLine();

						System.out.print("\nDigita la dosis resetada de la medicina #"+(i+1)+"\n~");
						String medicineDose=scanner.nextLine();

						System.out.print("\nDigita la frecuencia en horas de la medicina #"+(i+1)+"\n~");
						double medicinePeriodicity=scanner.nextDouble();
						scanner.nextLine();

						System.out.print("\nDigita el precio de la medicina #"+(i+1)+"\n~");
						double medicinePrice=scanner.nextDouble();
						scanner.nextLine();

						System.out.print(veterinary.addMedicine(medicineName, medicineDose, medicinePeriodicity, medicinePrice, roomNumber));

					}
					//...

				break;

				case 4:

					System.out.print(veterinary.showEmptyRooms());

				break;

				case 5:

					//PetName
					System.out.print("\nDigita el nombre de la mascota\n~");

					profilePetName=scanner.next();
					scanner.nextLine();

					System.out.print(veterinary.showPetRoomNumber(profilePetName));

				break;

				case 6:

					System.out.print(veterinary.showAllActualRecord());

				break;

				case 7:

					//OwnerId
					System.out.print("\nDigita el id del dueno de la mascota\n~");

					profileOwnerId=scanner.next();
					scanner.nextLine();

					//PetName
					System.out.print("\nDigita el nombre de la mascota\n~");

					profilePetName=scanner.next();
					scanner.nextLine();

					System.out.print(veterinary.showPetRecords(profileOwnerId, profilePetName));

				break;

				case 8:

					//Date
					System.out.print("\nDigita el dia actual\n~");
					int dayOut=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el mes actual\n~");
					int monthOut=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el ano actual\n~");
					int yearOut=scanner.nextInt();
					scanner.nextLine();
					//...

					//RoomNumber
					System.out.print(veterinary.showRoomMenu(false));

					roomNumber=askRoom();

					System.out.print(veterinary.dischargePet(roomNumber, dayOut, monthOut, yearOut));

				break;

				case 9:

					//PetName
					System.out.print("\nDigita el nombre de su mascota\n~");

					profilePetName=scanner.next();
					scanner.nextLine();

					System.out.print(veterinary.showOwnerDataPet(profilePetName));

				break;

				case 10:

					//OwnerId
					System.out.print("\nDigita el nombre del cliente\n~");

					String profileOwnerName=scanner.nextLine();

					System.out.print(veterinary.showOwnerDataOwner(profileOwnerName));

				break;

				case 11:

					System.out.print("El dinero total obtenido por hospitalizaciones es: $"+veterinary.getTotalHospitalizationMoney());

				break;

				case 12:

					//OwnerId
					System.out.print("\nDigita el id del dueno de la mascota\n~");

					profileOwnerId=scanner.next();
					scanner.nextLine();

					//PetName
					System.out.print("\nDigita el nombre de la mascota\n~");

					profilePetName=scanner.next();
					scanner.nextLine();

					System.out.print(veterinary.showPetBmi(profileOwnerId, profilePetName));

				break;

				case 13:

					//OwnerId
					System.out.print("\nDigita el id del cliente\n~");

					profileOwnerId=scanner.next();
					scanner.nextLine();

					//OwnerAddress
					System.out.print("\nDigita la nueva direccion del cliente (oprime enter si no desas cambiarlo)\n~");

					String address=scanner.nextLine();

					//OwnerPhone
					System.out.print("\nDigita el nuevo telefono del cliente (oprime 0 si no deseas cambiarlo)\n~");

					int phone=0+(scanner.nextInt());
					scanner.nextLine();

					System.out.print(veterinary.changeOwnerData(profileOwnerId, address, phone));

				break;

				case 14:

					//RoomNumber
					System.out.print(veterinary.showRoomMenu(false));

					roomNumber=askRoom();

					//MedicineName
					System.out.print("\nDigita el nombre de la medicina \n~");

					String medicineName=scanner.nextLine();

					//MedicineDose
					System.out.print("\nDigita la dosis resetada de la medicina \n~");

					String medicineDose=scanner.nextLine();

					//MedicinePeriodicity
					System.out.print("\nDigita la frecuencia en horas de la medicina \n~");

					double medicinePeriodicity=scanner.nextDouble();
					scanner.nextLine();

					//MedicinePrice
					System.out.print("\nDigita el precio de la medicina \n~");

					double medicinePrice=scanner.nextDouble();
					scanner.nextLine();

					System.out.print(veterinary.addMedicine(medicineName, medicineDose, medicinePeriodicity, medicinePrice, roomNumber));

				break;

				case 15:

					//RoomNumber
					System.out.print(veterinary.showRoomMenu(false));

					roomNumber=askRoom();

					//NewDiagnostic
					String newDiagnostic="";

					while(newDiagnostic.equals("")){

						System.out.print("\nDigita el nuevo diagnostico \n~");

						newDiagnostic=scanner.nextLine();

					}

					System.out.print(veterinary.addDiagnostic(newDiagnostic, roomNumber));

				break;

				case 16:

					//RoomNumber
					System.out.print(veterinary.showRoomMenu(false));

					roomNumber=askRoom();

					//NewSymptom
					String newSymptom="";

					while(newSymptom.equals("")){

						System.out.print("\nDigita el nuevo sintoma \n~");

						newSymptom=scanner.nextLine();

					}

					System.out.print(veterinary.addSymptom(newSymptom, roomNumber));

				break;

				case 17:

					//ServiceType
					System.out.print(veterinary.showServiceTypeMenu());

					serviceType=askServiceType();

					//OwnerId
					System.out.print("\nDigita el id del dueno de la mascota\n~");

					profileOwnerId=scanner.next();
					scanner.nextLine();

					//PetName
					System.out.print("\nDigita el nombre de la mascota\n~");

					profilePetName=scanner.next();
					scanner.nextLine();

					//Date
					System.out.print("\nDigita el dia actual\n~");
					int serviceDay=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el mes actual\n~");
					int serviceMonth=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el ano actual\n~");
					int serviceYear=scanner.nextInt();
					scanner.nextLine();

					System.out.print(veterinary.registerService(serviceType, profileOwnerId, profilePetName, serviceDay, serviceMonth, serviceYear));

				break;

				case 18:

					//ServiceType
					System.out.print(veterinary.showServiceTypeMenu());

					serviceType=askServiceType();

					System.out.print("Ganancia total del servicio: "+(veterinary.calculateTotalServiceMoney(serviceType)));

				break;

				case 19:

					System.out.print("Ganancia promedio de los servicios: "+(veterinary.calculateServiceAverage()));

				break;

				case 20:

					//Date
					System.out.print("\nDigita el dia en que comienza la semana\n~");
					int firstDay=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el mes en el que comienza la semana\n~");
					int firstMonth=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el ano en el que comienza la semana\n~");
					int firstYear=scanner.nextInt();
					scanner.nextLine();

					System.out.print("Ganancia promedio en la ultima semana: "+(veterinary.calculateWeekAverage(firstDay, firstMonth, firstYear)));

				break;

				case 21:

					//StartDate
					System.out.print("\nInicio del rango:");
					System.out.print("\nDigita el dia\n~");
					int startDay=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el mes\n~");
					int startMonth=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el ano\n~");
					int startYear=scanner.nextInt();
					scanner.nextLine();

					//EndDate
					System.out.print("\nFin del rango:");
					System.out.print("\nDigita el dia\n~");
					int endDay=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el mes\n~");
					int endMonth=scanner.nextInt();
					scanner.nextLine();

					System.out.print("\nDigita el ano\n~");
					int endYear=scanner.nextInt();
					scanner.nextLine();

					System.out.print(veterinary.serviceTimeLapseReport(startDay, startMonth, startYear, endDay, endMonth, endYear));

				break;

				case 22:

					System.out.print("Ganancia total de la veterinaria: "+(veterinary.calculateTotalMoney()));

				break;

				case 23:

					System.out.print("\nHasta Luego!!!");
					run=false;

				break;

				default:

					System.out.print("digito invalido. Intentelo de nuevo");

				break;

			}

		}

	}

	//Askers
	/**
	*Description: This method ask the room number to the user.<br>
	*@return An int that is the room number.
	*/
	public int askRoom(){

		boolean run=true;
		int room=1;

		while(run){

			int option=scanner.nextInt();
			scanner.nextLine();

			if(option>=1 && option<=8){

				room=option;
				run=false;

			}
			else{

				System.out.print("Digito invalido. Vuelva a intentarlo \n~");
				run=true;

			}

		}

		return room;

	}

	/**
	*Description: This method ask the pet type to the user.<br>
	*@return A char that is the pet type.
	*/
	public char askPetType(){

		boolean run=true;
		char petType='O';

		while(run){

			int option=scanner.nextInt();
			scanner.nextLine();

			switch(option){

				case 1:

					petType=Pet.DOG;
					run=false;

				break;

				case 2:

					petType=Pet.CAT;
					run=false;

				break;

				case 3:

					petType=Pet.BIRD;
					run=false;

				break;

				case 4:

					petType=Pet.OTHER;
					run=false;

				break;

				default:

					System.out.print("Digito invalido. Vuelva a intentarlo \n~");
					run=true;

				break;

			}

		}

		return petType;

	}

	/**
	*Description: This method ask the service type to the user.<br>
	*@return A String that is the service type.
	*/
	public String askServiceType(){

		boolean run=true;
		String type="";

		while(run){

			int option=scanner.nextInt();
			scanner.nextLine();

			switch(option){

				case 1:

					type=Service.SERVICE_TYPES[0];
					run=false;

				break;

				case 2:

					type=Service.SERVICE_TYPES[1];
					run=false;

				break;

				case 3:

					type=Service.SERVICE_TYPES[2];
					run=false;

				break;

				case 4:

					type=Service.SERVICE_TYPES[3];
					run=false;

				break;

				case 5:

					type=Service.SERVICE_TYPES[4];
					run=false;

				break;

				default:

					System.out.print("Digito invalido. Vuelva a intentarlo \n~");
					run=true;

				break;

			}

		}

		return type;

	}

	//Constructor
	/**
	*Description: the constructor of the class Main.<br>
	*/
	public Main(){

		init();

	}

	/**
	*Description: This method initialize the scanner, the veterrinary and some elemnts in side the veterinary.<br>
	*/
	public void init(){

		//Scanner
		scanner=new Scanner(System.in);

		//Veterinary
		veterinary=new Veterinary("Johanio's");

		//Rooms
		for(int i=0; i<8; i++) {

			Room room=new Room((i+1));
			veterinary.setRooms(i,room);

		}

		//Additional Instantiation (Object Diagram)
		//Owners+Pet(Bruno & Zelda)
		veterinary.createOwner("Esteban Ariza", "1007678665", "Calle 15 #121-25", 4847803, "Bruno", "0001", Pet.DOG, 4, 12.5, 0.3, 20, 1, 2019);
		veterinary.createOwner("Mateo Valdez", "1144041425", "Carrera 2a #13-40", 3338031, "Zelda", "0002",Pet.CAT, 2, 4.8, 0.2, 20, 1, 2019);
		//Pet(Rocky)
		veterinary.createPet("1007678665", "Rocky", "0003", Pet.OTHER, 1, 0.4, 0.06, 20, 1, 2019);
		veterinary.createPet("1144041425", "Impa", "0004", Pet.BIRD, 2, 2, 0.1, 20, 1, 2019);
		//Services(Rocky & Impa)
		veterinary.registerService(Service.SERVICE_TYPES[1], "1144041425", "Impa", 8, 3, 2019);
		veterinary.registerService(Service.SERVICE_TYPES[4], "1007678665", "Rocky", 28, 4, 2019);
		veterinary.registerService(Service.SERVICE_TYPES[3], "1144041425", "Impa", 1, 5, 2019);
		//Hospitalizate(Zelda)
		veterinary.hospitalizate("1144041425", "Zelda", 1);
		veterinary.createRecord("Hemorragia en una pata", "Herida superficial", 21, 2, 2019, 1);
		veterinary.addMedicine("Naproxeno", "0.5", 2, 2000, 1);
		veterinary.dischargePet(1, 23, 2, 2019);
		//Hospitalizate(Bruno)
		veterinary.hospitalizate("1007678665", "Bruno", 4);
		veterinary.createRecord("Chillido intenso", "Gastritis", 27, 2, 2019, 4);
		veterinary.dischargePet(4, 1, 3, 2019);
		//...
		veterinary.hospitalizate("1007678665", "Bruno", 5);
		veterinary.createRecord("Diarrea y vomito", "Parvovirus Canino", 15, 3, 2019, 5);
		veterinary.addMedicine("Dolex", "0.5", 12, 1000, 5);
		veterinary.addMedicine("Smecta", "1", 48, 10000, 5);
		//...

	}

}
