import java.util.Scanner;
public class PrincipalLester{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		boolean salir = true;
		int opc;
		

		procedimiento seg = new procedimiento();


		while(salir){

			seg.menu();

			opc = leer.nextInt();

			switch(opc){

			case 1:
					seg.valores();
					seg.procedimiento1();
			break;
			case 2:
					seg.cantidad();
			break;
			case 3:
					System.out.println("Saliendo...");			
					salir = false;
			break;
				
			}



		}



	}

}