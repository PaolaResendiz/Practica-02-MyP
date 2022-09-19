import java.util.LinkedList;
import java.util.Scanner;

public abstract class Preparacion{
	protected Hamburguesa hamburguesa;

	/**
	 * Método template para la preparación de la hamburguesa
	 * @param hamburguesa hamburguesa a preparar
	 */
	public void preparacion(Hamburguesa hamburguesa){
		this.hamburguesa = hamburguesa;
		bienvenida();
		AgregarPanMayonesaMostaza();
		prepararCarne();
		agregarCarne();
		agregarQueso();
		agregarVegetalesCatsupPan();
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

	/**
	 * Método para dar la bienvenida al usuario
	 */
	public void bienvenida(){
		System.out.println("\n**********************************"
						+ "\n**********Has elegido: "+ hamburguesa.getNombre()+ "**************"
						+ "\n*TU HAMBURGUESA SE ESTA PREPARANDO*"
						+ "\n**********************************" + "\n" +hamburguesa.getNombre()); 

	}

	/**
	 * Método para agregar pan, mayonesa y mostaza
	 */
	public void AgregarPanMayonesaMostaza(){
		System.out.println("Se preparan los panes en el horno y se pone el pan inferior" + "\n" + "Se agrega mayonesa" + "\n" + "Se agrega mostaza");
	}

	/**
	 * Método para preparar la carne
	 */
	public abstract void prepararCarne();

	/**
	 * Método para agregar la carne
	 */
	public void agregarCarne(){
		System.out.println("Se pone la carne en el pan");
	}
	
	/**
	 * Método para agregar el queso
	 */
	public void agregarQueso(){
		if(hamburguesa.isQueso()){
			System.out.println("Se agrega queso");
		}
	}

	/**
	 * Método para agregar los vegetales, catsup y pan
	 */
	public void agregarVegetalesCatsupPan(){
		System.out.println("Se agregan los vegetales"+ "\nSe agrega la catsup" + "\n" + "Se pone el pan encima");
	}

}