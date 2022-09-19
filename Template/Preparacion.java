import java.util.LinkedList;
import java.util.Scanner;

public abstract class Preparacion{
	protected Hamburguesa hamburguesa;

	//MetodoTemplate
	public void preparacion(Hamburguesa hamburguesa){
		this.hamburguesa = hamburguesa;
		mostrarFormaTitulacion();
	}

	// public void identificarse(LinkedList<Alumno> alumnos){
	// 	Scanner sc = new Scanner(System.in);
	// 	int noCuentaProcesada;

	// 	while (alumnoProcesado == null){
	// 		System.out.println("\n**********************************"
	// 						+ "\n**********IDENTIFICACION**********"
	// 						+ "\n**********************************");

	// 		System.out.println("\nPor favor ingresa tu numero de cuenta sin letras o espacios.");

	// 		while (true){
	// 			try {
	// 				String opcionUsuario = sc.nextLine();
	// 				noCuentaProcesada = Integer.parseInt(opcionUsuario);
	// 				break;
	// 			}catch (NumberFormatException ex){
	// 				System.out.println("\nPor favor ingresa tu numero de cuenta sin letras o espacios.");
	// 			}
	// 		}

	// 		for(Alumno a : alumnos){
	// 			if(a.getNoCuenta() == noCuentaProcesada)
	// 				alumnoProcesado = a;
	// 		}
	// 	}
    // }

	public abstract void mostrarFormaTitulacion();

	public void bienvenida(){
		System.out.println("\n**********************************"
						+ "\n*TU HAMBURGUESA SE ESTA PREPARANDO*"
						+ "\n**********************************" + "\n" +hamburguesa.getNombre()); 

	}

}