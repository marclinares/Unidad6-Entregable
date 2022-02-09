package com.dam.nba;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Jugador LeBron_James = new Jugador("LeBron James", 23, 37, 41.18, 2.06, Jugador.estado_disponible, Jugador.posicion_alero);
		Jugador Stephen_Curry = new Jugador("Stephen Curry", 30, 33, 45.47, 1.88, Jugador.estado_disponible, Jugador.posicion_base);
		Jugador Chris_Paul = new Jugador("Chris Paul", 3, 36, 38.51, 1.83, Jugador.estado_disponible, Jugador.posicion_base);
		Jugador Ja_Morant = new Jugador("Ja Morant", 12, 22, 9.60, 1.91, Jugador.estado_disponible, Jugador.posicion_base);
		Jugador Luka_Doncic = new Jugador("Luka Doncic", 77, 22, 35.70, 2.01, Jugador.estado_disponible, Jugador.posicion_base);
		Jugador Jordan_Clarkson = new Jugador("Jordan Clarkson", 00, 29, 11.5, 1.93, Jugador.estado_lesionado, Jugador.posicion_base);
		Jugador Nikola_Jokic = new Jugador("Nikola Jokic", 15, 26, 28.54, 2.11, Jugador.estado_lesionado, Jugador.posicion_pivot);
		Jugador Malik_Beasley = new Jugador("Malik Beasley", 5, 25, 13.33, 1.93, Jugador.estado_disponible, Jugador.posicion_escolta);
		Jugador Kawhi_Leonard = new Jugador("Kawhi Leonard", 2, 30, 39.34, 2.01, Jugador.estado_lesionado, Jugador.posicion_alero);
		Jugador Zion_Williamson = new Jugador("Zion Williamson", 1, 21, 10.73, 1.98, Jugador.estado_disponible, Jugador.posicion_ala_pivot);
		Jugador Damian_Lillard = new Jugador("Damian Lillard", 0, 31, 29.8, 1.88, Jugador.estado_disponible, Jugador.posicion_base);
		Jugador Devin_Vassell = new Jugador("Devin Vassell", 24, 21, 4.2, 1.96, Jugador.estado_disponible, Jugador.posicion_escolta);
		Jugador Terence_Davis = new Jugador("Terence Davis", 3, 24, 4.0, 1.93, Jugador.estado_disponible, Jugador.posicion_escolta);
		Jugador Mike_Muscala = new Jugador("Mike Muscala", 33, 30, 3.5, 2.08, Jugador.estado_lesionado, Jugador.posicion_ala_pivot);
		Jugador Jalen_Green = new Jugador("Jalen Green", 0, 19, 9.44, 1.93, Jugador.estado_disponible, Jugador.posicion_escolta);
		
		Jugador[] arrayJugadores = new Jugador[15];
		arrayJugadores[0] = LeBron_James;
		arrayJugadores[1] = Stephen_Curry;
		arrayJugadores[2] = Chris_Paul;
		arrayJugadores[3] = Ja_Morant;
		arrayJugadores[4] = Luka_Doncic;
		arrayJugadores[5] = Jordan_Clarkson;
		arrayJugadores[6] = Nikola_Jokic;
		arrayJugadores[7] = Malik_Beasley;
		arrayJugadores[8] = Kawhi_Leonard;
		arrayJugadores[9] = Zion_Williamson;
		arrayJugadores[10] = Damian_Lillard;
		arrayJugadores[11] = Devin_Vassell;
		arrayJugadores[12] = Terence_Davis;
		arrayJugadores[13] = Mike_Muscala;
		arrayJugadores[14] = Jalen_Green;
		
		Equipo Phoenix_Suns = new Equipo("Phoenix Suns", 1, 1, 42, 10, 5861, 5458, arrayJugadores);
		Equipo Golden_State_Warriors = new Equipo("Golden State Warriors", 2, 2, 40, 13, 5880, 5442, arrayJugadores);
		Equipo Memphis_Grizzlies = new Equipo("Memphis Grizzlies", 3, 3, 37, 18, 6196, 5971, arrayJugadores);
		Equipo Utah_Jazz = new Equipo("Utah Jazz", 4, 4, 32, 21, 6023, 5704, arrayJugadores);
		Equipo Dallas_Mavericks = new Equipo("Dallas Mavericks", 5, 5, 31, 23, 5735, 5587, arrayJugadores);
		Equipo Denver_Nuggets = new Equipo("Denver Nuggets", 6, 6, 29, 24, 5791, 5693, arrayJugadores);
		Equipo Minnesota_Timberwolves = new Equipo("Minnesota Timberwolves", 7, 7, 28, 25, 5956, 5868, arrayJugadores);
		Equipo L_A_Clippers = new Equipo("L.A. Clippers", 8, 8, 27, 28, 5848, 5907, arrayJugadores);
		Equipo L_A_Lakers = new Equipo("L.A. Lakers", 9, 9, 26, 28, 5991, 6062, arrayJugadores);
		Equipo New_Orleans_Pelicans = new Equipo("New Orleans Pelicans", 10, 10, 21, 32, 5606, 5794, arrayJugadores);
		Equipo Portland_Trail_Blazers = new Equipo("Portland Trail Blazers", 11, 11, 21, 33, 5823, 6063, arrayJugadores);
		Equipo San_Antonio_Spurs = new Equipo("San Antonio Spurs", 12, 12, 20, 34, 6021, 6022, arrayJugadores);
		Equipo Sacramento_Kings = new Equipo("Sacramento Kings", 13, 13, 20, 35, 6020, 6295, arrayJugadores);
		Equipo Oklahoma_City_Thunder = new Equipo("Oklahoma City Thunder", 14, 14, 17, 35, 5253, 5585, arrayJugadores);
		Equipo Houston_Rockets = new Equipo("Houston Rockets", 15, 15, 15, 38, 5742, 6202, arrayJugadores);
		
		Equipo[] arrayEquipos = {Phoenix_Suns, Golden_State_Warriors, Memphis_Grizzlies, Utah_Jazz, Dallas_Mavericks, Denver_Nuggets, Minnesota_Timberwolves, L_A_Clippers, L_A_Lakers, New_Orleans_Pelicans, Portland_Trail_Blazers, San_Antonio_Spurs, Sacramento_Kings, Oklahoma_City_Thunder, Houston_Rockets};
		

		
		Scanner scanner = new Scanner(System.in);
		boolean check= false;
		do {
			System.out.println("Elige la opción que desea realizar: ");
			System.out.println("1. Ver que equipo va lider en la NBA");
			System.out.println("2. Ver el salario medio de los jugadores");
			System.out.println("3. Ver los jugadores que juegan en cada posición:");
			System.out.println("4. Transferir jugador");
			System.out.println("5. Salir");
			int option = scanner.nextInt();
			
			
			switch(option) {
				case 1:
					equipoLider(arrayEquipos);
				break;
				
				case 2:
					salarioMedio(arrayJugadores);
				break;
				
				case 3:
					posicionJugadores(arrayJugadores);
				break;
				
				case 4:
					transferirJugador(arrayEquipos);
				break;
				
				case 5:
					check= true;
				break;
				
				default:
					System.out.println("Número introducido incorrecto!!");
				break;
			}
		} while(check == false);
		
	}


	public static void equipoLider(Equipo[] arrayEquipos) {
		int lider = 1;
		for (int i = 0; i < arrayEquipos.length; i++) {
			
			if(arrayEquipos[i].getPosicion() == lider) {
				System.out.println("El lider de la NBA es el " + arrayEquipos[i].getNombre() + ", con " + arrayEquipos[i].getVictorias() + " victorias y " + arrayEquipos[i].getDerrotas() + " derrotas.");
			}
		}
	}
	
	public static void salarioMedio(Jugador[] arrayJugadores) {
		double salariototal = 0;
		for (int i = 0; i < arrayJugadores.length; i++) {
			salariototal += arrayJugadores[i].getSalario();
		}
		
		System.out.println("El sueldo medio de los jugadores de la NBA son " + (salariototal / arrayJugadores.length) + " millones de USD.");
	}
	
	public static void posicionJugadores(Jugador[] arrayJugadores) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleccionar posición: ");
		System.out.println("1. Base");
		System.out.println("2. Escolta");
		System.out.println("3. Alero");
		System.out.println("4. Ala Pivot");
		System.out.println("5. Pivot");
		int posicion = scanner.nextInt();
		
		switch(posicion) {
			case 1: 
				System.out.println("Jugadores que juegan en la posición de base:");
				for (int i = 0; i < arrayJugadores.length; i++) {
					if(arrayJugadores[i].getPosicion() == Jugador.posicion_base) {
						System.out.println(arrayJugadores[i].getNombre());
					}
				}
			break;
			case 2: 
				System.out.println("Jugadores que juegan en la posición de escolta:");
				for (int i = 0; i < arrayJugadores.length; i++) {
					if(arrayJugadores[i].getPosicion() == Jugador.posicion_escolta) {
						System.out.println(arrayJugadores[i].getNombre());
					}
				}
			break;
			case 3: 
				System.out.println("Jugadores que juegan en la posición de alero:");
				for (int i = 0; i < arrayJugadores.length; i++) {
					if(arrayJugadores[i].getPosicion() == Jugador.posicion_alero) {
						System.out.println(arrayJugadores[i].getNombre());
					}
				}
			break;
			case 4: 
				System.out.println("Jugadores que juegan en la posición de ala pivot:");
				for (int i = 0; i < arrayJugadores.length; i++) {
					if(arrayJugadores[i].getPosicion() == Jugador.posicion_ala_pivot) {
						System.out.println(arrayJugadores[i].getNombre());
					}
				}
			break;
			case 5: 
				System.out.println("Jugadores que juegan en la posición de pivot:");
				for (int i = 0; i < arrayJugadores.length; i++) {
					if(arrayJugadores[i].getPosicion() == Jugador.posicion_pivot) {
						System.out.println(arrayJugadores[i].getNombre());
					}
				}
			break;
			default:
				System.out.println("Número introducido incorrecto");
			break;
		}
	}
	
	private static void transferirJugador(Equipo[] arrayEquipos) {
		Scanner scanner = new Scanner(System.in);
		
		//Seleccionamos el equipo en el que esta el jugador que queremos transferir
		System.out.println("De que equipo quieres transferir el jugador");
		for (int i = 0; i < arrayEquipos.length; i++) {
			System.out.println(i+1 + " - " + arrayEquipos[i].getNombre());
		}
		int equipo = scanner.nextInt();
		equipo -= 1;
		
		//Metemos en un array todos los jugadores del equipo que hemos seleccionado arriba
		Jugador[] misJugadores = arrayEquipos[equipo].getJugadores();
		
		//Nos mostrará todos los jugadores del equipo que hemos seleccionado
		System.out.println("Que jugador quieres tranferir?");
		for (int i = 0; i < misJugadores.length; i++) {
			System.out.println((i+1) + " - " + misJugadores[i].getNombre());
		}
		int jugador = scanner.nextInt();
		jugador -= 1;
		
		
		//Le decimos a que equivo va a ser trsnferido el jugador que hemos seleccionado justo arriba
		System.out.println("A que equipo desea transferir al jugador");
		for (int i = 0; i < arrayEquipos.length; i++) {
			System.out.println(i+1 + " - " + arrayEquipos[i].getNombre());
		}
		int nuevoequipo = scanner.nextInt();
		nuevoequipo -= 1;
		
		
		
	}

}
