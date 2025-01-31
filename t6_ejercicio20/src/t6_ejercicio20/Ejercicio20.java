package t6_ejercicio20;
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio20 {

	static void menu() {
		System.out.println();
		System.out.println("--- Menu ---");
		System.out.println("1)  Añadir nuevo pais");
		System.out.println("2)  Borrar un pais");
		System.out.println("3)  Mostrar numero de habitantes de un pais");
		System.out.println("4)  Listar el nombre de los paises de la lista");
		System.out.println("5)  Mostrar cada pais con sus habitantes");
		System.out.println("6)  Eliminar todo");
		System.out.println("7)  Buscar pais con mas habitantes");
		System.out.println("8) Salir");
	}
	
	public static void main(String[] args) {
		HashMap<String,Integer> paises=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		int habitantesPais=0;
		String maxPais="";
		int opcion=0;
		
		paises.put("España", 48370000);
		paises.put("Francia", 68170000);
		paises.put("Japon", 124500000);
		paises.put("Alemania", 84480000);
		paises.put("Grecia", 10360000);
		paises.put("CoreaSur", 51710000);
		paises.put("Italia", 58760000);

		do {
			Ejercicio20.menu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.print("Introduce el nombre del país: ");
				String paisAnadir=sc.next();
				System.out.print("Introduce numero de habitantes: ");
				Integer habit=sc.nextInt();
				paises.put(paisAnadir, habit);
				break;
			
			case 2: 
				System.out.println("Escribe el nombre del país que deseas eliminar");
				System.out.println("Empieza por mayuscula, incluye las tildes");
				String paisEliminar=sc.next();
				paises.remove(paisEliminar);
				break;
				
			case 3: 
				System.out.println("introduce el nombre del pais");
				String paisNumHab=sc.next();
				System.out.println(paises.get(paisNumHab)+" habitantes");
				break;
				
			case 4: 
				System.out.println(paises.keySet());
				break;
				
			case 5: 
				System.out.println(paises);
				break;
				
			case 6:
				paises.clear();
				break;
			
			case 7:
				for(String nombre:paises.keySet()) {
					//paises.get(nombre);
					if(habitantesPais<paises.get(nombre)) {
						habitantesPais=paises.get(nombre);
						maxPais=nombre;
					}
				}
				System.out.println("el pais con mas habitantes es "+maxPais);
				break;
				
			case 8:
				System.out.println("SALIENDO DEL MENU... ... ...");
				break;
			}
		}while(opcion!=8);
	}
}
