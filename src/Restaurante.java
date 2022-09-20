import java.util.LinkedList;
import java.util.*;


public class Restaurante{

	public static void main(String[] args){
		Robot mechaCheems = new Robot();

		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("***BIENVENIDO CLIENTE SOY FRED TU ROBOt MESERO***"
						+ "\nPor favor elige la opcion que deseas que realize");

		do{
			System.out.println(
				"1.- Activar.\n" +
				"2.- Caminar.\n" + 
				"3.- Cocinar.\n" + 
				"4.- Servir\n" +
				"5.- Suspender.\n" +
				"6.- Atender.\n" +
				"0.- Terminar simulacion.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println(
							"1.- Activar.\n" +
							"2.- Caminar.\n" + 
							"3.- Cocinar.\n" + 
							"4.- Servir\n" +
							"5.- Suspender.\n" +
							"6.- Atender.\n" +
							"0.- Terminar simulacion.\n");
					}
				}

				switch(opcion){
					case 1:
						mechaCheems.activar();
						break;

					case 2:
						mechaCheems.caminar();
						break;

					case 3:
						mechaCheems.cocinar();
						break;

					case 4:
						mechaCheems.servir();
						break;

					case 5:
						mechaCheems.suspender();
						break;

					case 6:
						mechaCheems.atender();
						break;
						
					case 0:
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

		}while(opcion != 0);

	}
}
