import java.util.Scanner;
import src.*;

public class Principal {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		EjecucionMenu ejeMenu = new EjecucionMenu();
		
		boolean seguir = true;
		int opcion = 0;

		while(seguir) {
			System.out.println("\n------------- OPCIONES -------------");
			System.out.println("\n 1. Mostrar Pokemones 			  ");
			System.out.println(" 2. Iniciar batalla        		      ");
			System.out.println(" 3. Registro de partidas  			  ");
			System.out.println(" 4. Pokemones mas y menos utilizados  ");
			System.out.println(" 5. Salir                             ");

			opcion = leer.nextInt();
				
			switch(opcion) {
				case 1:
					// Mostrar Pokemones
					ejeMenu.mPokemones();
				break;
				case 2:
					// Batalla
					ejeMenu.iniciarBatalla();
				break;
				case 3:
					// Registro de partidas
					ejeMenu.mostrarRegistroPartidas();
				break;
				case 4:
					// Pokemones mas y menos elegidos
					ejeMenu.pokemonHistorial();
				break;
				case 5:
					System.exit(0);
					System.out.println("Vuelva Pronto.!");
				break;	
			}
		}
	}
}