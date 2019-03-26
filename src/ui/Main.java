package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[]args){
		
		Main m = new Main();
		
		Veterinary v=m.init();
		m.menu(v);
		
	}
	
	public void menu(Veterinary veterinary){
		
		Scanner s=new Scanner(System.in);
		
		int option1=0;
		
		String profileOwnerId;
		String profilePetName;
		int roomNumber;
		
		boolean run=true;
		
		while(run){
			
			System.out.print(veterinary.showMenu());
			
			option1 = s.nextInt();
			s.nextLine();
			
			switch(option1){
				
				case 1:
				
					//OwnerName
					System.out.print("\nDigita el nombre del cliente\n~");
					
					String ownerName=s.nextLine();
					
					//OwnerId
					System.out.print("\nDigita el Identificador del cliente\n~");
					
					String ownerId=s.next();
					s.nextLine();
					
					//OwnerAddress
					System.out.print("\nDigita la direccion del cliente\n~");
					
					String ownerAddress=s.nextLine();
					
					//OwnerPhone
					System.out.print("\nDigita el telefono del cliente\n~");
					
					int ownerPhone=s.nextInt();
					s.nextLine();
					
					//PetName
					System.out.print("\nDigita el nombre de la mascota del cliente\n~");
					
					String petName=s.next();
					s.nextLine();
					
					//PetType
					System.out.print("\nElije el tipo de mascota:\n 1.Perro\n 2.Gato\n 3.Ave\n 4.Otro\n~");
					
					char petType=askPetType();
					
					//PetAge
					System.out.print("\nDigita la edad en anos de la mascota\n~");
					
					int petAge=s.nextInt();
					s.nextLine();
					
					//PetWeight
					System.out.print("\nDigita el peso de la mascota\n~");
					
					double petWeight=s.nextDouble();
					s.nextLine();
					
					//Date
					System.out.print("\nDigita el dia actual\n~");
					int day=s.nextInt();
					s.nextLine();
					
					System.out.print("\nDigita el mes actual\n~");
					int month=s.nextInt();
					s.nextLine();
					
					System.out.print("\nDigita el ano actual\n~");
					int year=s.nextInt();
					s.nextLine();
					
					//Create Owner Profile
					System.out.print(veterinary.createOwner(ownerName, ownerId, ownerAddress, ownerPhone, petName, petType, petAge, petWeight, day, month, year));
					
				break;
				
				case 2:
					
					//OwnerId
					System.out.print("\nDigita el Id del cliente\n~");
					
					profileOwnerId=s.next();
					s.nextLine();
					
					//PetName
					System.out.print("\nDigita el nombre de la mascota del cliente\n~");
					
					String name=s.next();
					s.nextLine();
					
					//PetType
					System.out.print("\nElije el tipo de mascota:\n 1.Perro\n 2.Gato\n 3.Ave\n 4.Otro\n~");
					
					char type=askPetType();
					
					//PetAge
					System.out.print("\nDigita la edad en anos de la mascota\n~");
					
					int age=s.nextInt();
					s.nextLine();
					
					//PetWeight
					System.out.print("\nDigita el peso de la mascota\n~");
					
					double weight=s.nextDouble();
					s.nextLine();
					
					//Date
					System.out.print("\nDigita el dia actual\n~");
					int petDay=s.nextInt();
					s.nextLine();
					
					System.out.print("\nDigita el mes actual\n~");
					int petMonth=s.nextInt();
					s.nextLine();
					
					System.out.print("\nDigita el ano actual\n~");
					int petYear=s.nextInt();
					s.nextLine();
					
					//Create Pet Profile
					System.out.print(veterinary.createPet(profileOwnerId, name, type, age, weight, petDay, petMonth, petYear));
					
				break;
				
				case 3:
					
					//Hopitalizate
					//OwnerId
					System.out.print("\nDigita el Id del cliente\n~");
					
					profileOwnerId=s.next();
					s.nextLine();
					
					//PetName
					System.out.print("\nDigita el nombre de su mascota\n~");
					
					profilePetName=s.next();
					s.nextLine();
					
					//RoomNumber
					System.out.print(veterinary.showRoom(true));//Hacer un showRoomMenu
					
					roomNumber=askRoom();
					//...
					
					//CreateRecord
					//Symptoms
					System.out.print("\nColoca los sintomas\n~");
					
					String symptom=s.nextLine();
					
					//Diagnostic
					System.out.print("\nColoca el diagnostico\n~");
					
					String diagnostic=s.nextLine();
					
					//Date
					System.out.print("\nDigita el dia de hospitalizacion\n~");
					int hospitalizationDay=s.nextInt();
					s.nextLine();
					
					System.out.print("\nDigita el mes de hospitalizacion\n~");
					int hospitalizationMonth=s.nextInt();
					s.nextLine();
					
					System.out.print("\nDigita el ano de hospitalizacion\n~");
					int hospitalizationYear=s.nextInt();
					s.nextLine();
					//...
					
					//AddMedicines
					System.out.print("\nDigita cuantas medicinas deaseas resetar\n~");
					int medicineQuantity=s.nextInt();
					s.nextLine();
					
					System.out.print(veterinary.hospitalizate(profileOwnerId, profilePetName, roomNumber));
					System.out.print("\n"+veterinary.createRecord(symptom, diagnostic, hospitalizationDay, hospitalizationMonth, hospitalizationYear, roomNumber));
					
					for(int i=0; i<medicineQuantity; i++){
						
						System.out.print("\nDigita el nombre de la medicina #"+(i+1)+"\n~");
						String medicineName=s.nextLine();
						
						System.out.print("\nDigita la dosis resetada de la medicina #"+(i+1)+"\n~");
						String medicineDose=s.nextLine();
						
						System.out.print("\nDigita la frecuencia en horas de la medicina #"+(i+1)+"\n~");
						double medicinePeriodicity=s.nextDouble();
						s.nextLine();
						
						System.out.print("\nDigita el precio de la medicina #"+(i+1)+"\n~");
						double medicinePrice=s.nextDouble();
						s.nextLine();
						
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
					
					profilePetName=s.next();
					s.nextLine();
					
					System.out.print(veterinary.showPetRoomNumber(profilePetName));
					
				break;
				
				case 6:
					
					System.out.print(veterinary.showAllActualRecord());
					
				break;
				
				case 7:
					
					//OwnerId
					System.out.print("\nDigita el id del dueno de la mascota\n~");
					
					profileOwnerId=s.next();
					s.nextLine();
					
					//PetName
					System.out.print("\nDigita el nombre de la mascota\n~");
					
					profilePetName=s.next();
					s.nextLine();
					
					System.out.print(veterinary.showPetRecords(profileOwnerId, profilePetName));
					
				break;
				
				case 8:
					
					//Date
					System.out.print("\nDigita el dia actual\n~");
					int dayOut=s.nextInt();
					s.nextLine();
					
					System.out.print("\nDigita el mes actual\n~");
					int monthOut=s.nextInt();
					s.nextLine();
					
					System.out.print("\nDigita el ano actual\n~");
					int yearOut=s.nextInt();
					s.nextLine();
					//...
					
					//RoomNumber
					System.out.print(veterinary.showRoom(false));//Hacer un showRoomMenu
					
					roomNumber=askRoom();
					
					System.out.print(veterinary.dischargePet(roomNumber, dayOut, monthOut, yearOut));
					
				break;
				
				case 9:
					
					//PetName
					System.out.print("\nDigita el nombre de su mascota\n~");
					
					profilePetName=s.next();
					s.nextLine();
					
					System.out.print(veterinary.showOwnerDataPet(profilePetName));
					
				break;
				
				case 10:
					
					//OwnerId
					System.out.print("\nDigita el nombre del cliente\n~");
					
					String profileOwnerName=s.nextLine();
					
					System.out.print(veterinary.showOwnerDataOwner(profileOwnerName));
					
				break;
				
				case 11:
					
					System.out.print("El dinero total obtenido por hospitalizaciones es: $"+veterinary.getTotalMoney());
					
				break;
				
				case 12:
					
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
	public int askRoom(){
		
		Scanner s=new Scanner(System.in);
		
		boolean run=true;
		int room=1;
		
		while(run){
			
			int option=s.nextInt();
			s.nextLine();
			
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
	
	public char askPetType(){
		
		Scanner s=new Scanner(System.in);
		
		boolean run=true;
		char petType='O';
		
		while(run){
			
			int option=s.nextInt();
			s.nextLine();
			
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
	
	public Veterinary init(){
		
		//Veterinary
		Veterinary veterinary=new Veterinary("Johanio's");
		
		//Rooms
		for(int i=0; i<8; i++) {
			
			Room room=new Room((i+1));
			veterinary.setRoom(i,room);
			
		}
		
		//Additional Instantiation (Object Diagram)
		//Owners+Pet(Bruno & Zelda)
		veterinary.createOwner("Esteban Ariza", "A111", "Calle 15 #121-25", 4847803, "Bruno", Pet.DOG, 4, 12.5, 20, 1, 2019);
		veterinary.createOwner("Mateo Valdez", "A112", "Carrera 2a #13-40", 3338031, "Zelda", Pet.CAT, 2, 4.8, 20, 1, 2019);
		//Pet(Rocky)
		veterinary.createPet("A111", "Rocky", Pet.OTHER, 1, 0.4, 20, 1, 2019);
		//Hospitalizate(Zelda)
		veterinary.hospitalizate("A112", "Zelda", 1);
		veterinary.createRecord("Hemorragia en una pata", "Herida superficial", 21, 2, 2019, 1);
		veterinary.addMedicine("Naproxeno", "0.5", 2, 2000, 1);
		veterinary.dischargePet(1, 23, 2, 2019);
		//Hospitalizate(Bruno)
		veterinary.hospitalizate("A111", "Bruno", 5);
		veterinary.createRecord("Diarrea y vomito", "Parvovirus Canino", 15, 3, 2019, 5);
		veterinary.addMedicine("Dolex", "0.5", 12, 1000, 5);
		veterinary.addMedicine("Smecta", "1", 48, 10000, 5);
		//...
		
		return veterinary;
		
	}
	
}