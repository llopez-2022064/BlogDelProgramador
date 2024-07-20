import java.util.Scanner;


public class procedimiento{
	Scanner leer = new Scanner(System.in);
	public int a;
	public int b;

	public void menu(){
		System.out.println("---------- MENU ----------");
		System.out.println("1. Mostar una tabla especifica");
		System.out.println("2. Cantidad de tablas de multiplicar");
		System.out.println("3. Salir");
	}

	public void valores(){
		System.out.println("Ingrese la tabla de multiplicar que desea:  ");
		a = leer.nextInt();
		System.out.println("Hasta que numero desea: ");
		b = leer.nextInt();
	}

	public void cantidad(){
		System.out.println("Hasta que tabla desea ver: ");
		a = leer.nextInt();
	}

	public void procedimiento1(){
		for (int i=0;i<=b;i++){
			System.out.println(a + " * " + i + " = " + b*i);
		}
	}

	public void procedimiento2(){
		for(int i=0;i<=a;i++);
		
	}
}