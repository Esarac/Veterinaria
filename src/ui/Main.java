package ui;
import model.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[]args){
		
		Scanner s=new Scanner(System.in);
		Main m = new Main();
		
		Veterinary v=m.init();
		m.menu(v);
		
	}
	
	public void menu(Veterinary veterinary){
		
		Scanner s=new Scanner(System.in);
		
		int option1=0;
		
		String profileOwnerName;
		
		boolean run=true;
		
		while(run){
			
			System.out.print(veterinary.showMenu());
			
			option1 = s.nextInt();
			s.nextLine();
			
			switch(option1){
				
				case 1:
				
					//OwnerName
					System.out.print("\nDigita el nombre del cliente\n~");
					
					String ownerName=s.next();
					s.nextLine();
					
					//OwnerId
					System.out.print("\nDigita el Identificador del cliente\n~");
					
					String ownerId=s.next();
					s.nextLine();
					
					//OwnerAddress
					System.out.print("\nDigita la direccion del cliente\n~");
					
					String ownerAddress=s.next();
					s.nextLine();
					
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
					
					char petType=askPetType(s);
					
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
					
					//OwnerName
					System.out.print("\nDigita el nombre del cliente\n~");
					
					profileOwnerName=s.next();
					s.nextLine();
					
					//PetName
					System.out.print("\nDigita el nombre de la mascota del cliente\n~");
					
					String name=s.next();
					s.nextLine();
					
					//PetType
					System.out.print("\nElije el tipo de mascota:\n 1.Perro\n 2.Gato\n 3.Ave\n 4.Otro\n~");
					
					char type=askPetType(s);
					
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
					System.out.print(veterinary.createPet(profileOwnerName, name, type, age, weight, petDay, petMonth, petYear));
					
				break;
				
				case 3:
					
					//Hopitalizate
					//OwnerName
					System.out.print("\nDigita el nombre del cliente\n~");
					
					profileOwnerName=s.next();
					s.nextLine();
					
					//PetName
					System.out.print("\nDigita el nombre de su mascota\n~");
					
					String profilePetName=s.next();
					s.nextLine();
					
					//RoomNumber
					System.out.print(veterinary.showRoom(true));//Hacer un showRoomMenu
					
					int roomNumber=askRoom(s);
					//...
					
					//CreateRecord
					//Symptoms
					System.out.print("\nColoca los sintomas\n~");
					
					String symptom=s.next();
					s.nextLine();
					
					//Diagnostic
					System.out.print("\nColoca el diagnostico\n~");
					
					String diagnostic=s.next();
					s.nextLine();
					
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
					
					System.out.print(veterinary.hospitalizate(profileOwnerName, profilePetName, roomNumber));
					System.out.print(veterinary.createRecord(symptom, diagnostic, hospitalizationDay, hospitalizationMonth, hospitalizationYear, roomNumber));		
					
				break;
				
				case 4:
					
					
					
				break;
				
				case 5:
					
					
					
				break;
				
				case 6:
					
					
					
				break;
				
				case 7:
					
					
					
				break;
				
				case 8:
					
					
					
				break;
				
				case 9:
					
					
					
				break;
				
				case 10:
					
					
					
				break;
				
				case 11:
					
					System.out.print("\nHasta Luego!!!");
					run=false;
					
				break;
				
				default:
					
					System.out.print("digito invalido. Intentelo de nuevo");
					
				break;
				
			}
			
		}
		
	}
	
	public int askRoom(Scanner s){
		
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
	
	public char askPetType(Scanner s){
		
		boolean run=true;
		char petType='O';
		
		while(run){
			
			int option=s.nextInt();
			s.nextLine();
			
			switch(option){
				
				case 1:
					
					petType='D';
					run=false;
					
				break;	
				
				case 2:
					
					petType='C';
					run=false;
					
				break;
				
				case 3:
					
					petType='B';
					run=false;
					
				break;
				
				case 4:
					
					petType='O';
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
		
		//Dates
		Date actualDate=new Date(1, 1, 2019);
		
		//Veterinary
		Veterinary veterinary=new Veterinary("Johanios");
		
		//Rooms
		for(int i=0; i<8; i++) {
			
			Room room=new Room((i), actualDate);
			veterinary.setRoom(i,room);
			
		}
		
		return veterinary;
		
	}
	
}