import java.util.Scanner;
import src.*;

public class EjecucionMenu {

	// Instancias
	Scanner leer = new Scanner(System.in);
	Pokemon pokemon = new Pokemon();
	Bulbasaur bulbasaur = new Bulbasaur();
	Chikorita chikorita = new Chikorita();
	Pikachu pikachu = new Pikachu();
	Snorlax snorlax = new Snorlax();
	Squirtle squirtle = new Squirtle();
	Umbreon umbreon = new Umbreon();


	// Mostrar Pokemones
	public void mPokemones() {
		bulbasaur.mBulbasaur();
		chikorita.mChikorita();
		pikachu.mPikachu();
		snorlax.mSnorlax();
		squirtle.mSquirtle();
		umbreon.mUmbreon();
	}

	// Variables
	String nombre1, nombre2;	// Nombres de los Jugadores


	// Batalla
	public void iniciarBatalla() {
		int poke1Jugador1, poke2Jugador1;	// Pokemones Jugador 1
		int poke1Jugador2, poke2Jugador2;	// Pokemones Jugador 2

		System.out.println("\nIngrese el nombre del jugador 1:   ");
			nombre1 = leer.nextLine();
		System.out.println("Ingrese el nombre del jugador 2:   ");
			nombre2 = leer.nextLine();

		// Lista de Pokemones a elegir
		System.out.println("\n----- Pokemones -----\n");
		System.out.println("  > 1. Bulbasaur ");
		System.out.println("  > 2. Chikorita ");
		System.out.println("  > 3. Pikachu   ");
		System.out.println("  > 4. Snorlax   ");
		System.out.println("  > 5. Squirtle  ");
		System.out.println("  > 6. Umbreon   \n");

		// Pokemones a elegir por el Jugador1
		do {
			System.out.println(nombre1 + " seleccione el pokemon No.1 que desea: ");
				poke1Jugador1 = leer.nextInt();
				eleccionUsuario(poke1Jugador1);	
		} while(poke1Jugador1 < 1 || poke1Jugador1 > 6);

		do {
			System.out.println(nombre1 + " seleccione el pokemon No.2 que desea: ");
				poke2Jugador1 = leer.nextInt();
				eleccionUsuario(poke2Jugador1);
		} while(poke2Jugador1 < 1 || poke2Jugador1 > 6);

		// Lista de Pokemones a elegir
		System.out.println("\n----- Pokemones -----\n");
		System.out.println("  > 1. Bulbasaur ");
		System.out.println("  > 2. Chikorita ");
		System.out.println("  > 3. Pikachu   ");
		System.out.println("  > 4. Snorlax   ");
		System.out.println("  > 5. Squirtle  ");
		System.out.println("  > 6. Umbreon   \n");

		// Pokemones a elegir por el Jugador2
		do {
			System.out.println(nombre2 + " seleccione el pokemon No.1 que desea: ");
				poke1Jugador2 = leer.nextInt();
				eleccionUsuario(poke1Jugador2);
		} while(poke1Jugador2 < 1 || poke1Jugador2 > 6);

		do {
			System.out.println(nombre2 + " seleccione el pokemon No.2 que desea:");
				poke2Jugador2 = leer.nextInt();
				eleccionUsuario(poke2Jugador2);
		} while(poke2Jugador2 < 1 || poke2Jugador2 > 6);

		registroPartidas(nombre1, nombre2);
		leer.nextLine();
	}


	// Registro de Partidas

	// Variables
	String numPartidas = "", union = "", union2 = "";
	int x = 0;

	public void registroPartidas(String nombre1, String nombre2) {
		numPartidas = " Partida No." + ++x;
		union = numPartidas + ": " + nombre1 + " vs " + nombre2;	// Une el numero de la partida con los nombres de los dos jugadores
		union2 = union2 + union + "\n";
	}

	public void mostrarRegistroPartidas() {
		System.out.println("\n------ Registro de Partidas ------\n");
		System.out.println(union2);
	}


	// Pokemones Mas y Menos Utilizados

	// Variables para los contadores de los Pokemon
	int countBulbasaur = 0, countChikorita = 0, countPikachu = 0, countSnorlax = 0, countSquirtle = 0, countUmbreon = 0;

	public void eleccionUsuario(int pokemonElegido) {
		switch(pokemonElegido) {
			case 1:
				// Bulbasaur
				countBulbasaur = countBulbasaur + 1;
			break;
			case 2:
				// Chikorita
				countChikorita = countChikorita + 1;
			break;
			case 3:
				// Pikachu
				countPikachu = countPikachu + 1;
			break;
			case 4:
				// Snorlax
				countSnorlax = countSnorlax + 1;
			break;
			case 5:
				// Squirtle
				countSquirtle = countSquirtle + 1;
			break;
			case 6:
				// Umbreon
				countUmbreon = countUmbreon + 1;
			break;
		}
	}

	public void pokemonHistorial() {
		System.out.println("\n----- Pokemones mas y menos utilizados -----\n");
		System.out.println("- 1. Bulbasaur: " + countBulbasaur);
		System.out.println("- 2. Chikorita: " + countChikorita);
		System.out.println("- 3. Pikachu  : " + countPikachu  );
		System.out.println("- 4. Snorlax  : " + countSnorlax  );
		System.out.println("- 5. Squirtle : " + countSquirtle );
		System.out.println("- 6. Umbreon  : " + countUmbreon  );
	}
}
      