import java.util.Iterator;
import java.util.Scanner;
public class ModoAtender implements EstadoRobot{

	Robot mecha;

	/**
	 * Constructor de la clase
	 * @param mecha Robot
	 */
	public ModoAtender(Robot mecha){
		this.mecha = mecha;
	}

	/**
	 * Metodo que permite activarse al robot
	 */
	public void activar(){
		System.out.println("***MODO ATENDER***\nFRED ya esta activado.");
	}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void caminar(){
		System.out.println("***MODO ATENDER***\nFRED no puede caminar mientras atiende.");	
	}

	/**
	 * Metodo que permite atender al robot
	 */
	public void atender(){
	
		Restaurante restaurante = new Restaurante();
		Preparacion preparacion;
			Menu menu = new Menu();

		Iterador iteradorHamburguesasEspecial = menu.getIteradorHamburguesasEspecial();
		Iterator iteradorHamburguesasDia = menu.getIteradorHamburguesasDia();
		Iterador iteradorHamburguesas = menu.getIteradorHamburguesas();
		GrupoHamburguesa hamburguesas = new GrupoHamburguesa();
		GrupoHamburguesaEspecial hamburguesasEspecial = new GrupoHamburguesaEspecial();
		GrupoHamburguesaDia hamburguesasDia = new GrupoHamburguesaDia();
		System.out.println("Bienvenido Usuario, este es nuestro menu, ¿Que hamburguesa desea?");

	
		Scanner sc = new Scanner(System.in);
		int opcion;


						System.out.println( "\nPor favor elige el Id de la hamburguesa que deseas");
		do{
			while(iteradorHamburguesas.hasNext()){
				System.out.println(iteradorHamburguesas.next());
			}
	
			while(iteradorHamburguesasDia.hasNext()){
				System.out.println(iteradorHamburguesasDia.next());
			}
	
			while(iteradorHamburguesasEspecial.hasNext()){
				System.out.println(iteradorHamburguesasEspecial.next());
			}
	
				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Ingresa un NUMERO valido.\n");
					}
				}

				if(opcion > 0 && opcion < 10){
					System.out.println("Has elegido la hamburguesa con ID: " + opcion);
					mecha.setOpcion(opcion);
					mecha.setOpcionValida(true);
					break;
				}else{
					System.out.println("El ID que ingresaste no esta en el menu, por favor leelo de nuevo y elige un numero valido\n");
					while(iteradorHamburguesas.hasNext()){
						System.out.println(iteradorHamburguesas.next());
					}
			
					while(iteradorHamburguesasDia.hasNext()){
						System.out.println(iteradorHamburguesasDia.next());
					}
			
					while(iteradorHamburguesasEspecial.hasNext()){
						System.out.println(iteradorHamburguesasEspecial.next());
					}
				}


		}while(opcion <= 0 || opcion >= 10);

	}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void cocinar(){
		if(!mecha.getOpcionValida()){
			System.out.println("No has elegido un platillo valido, aun no se puede cocinar.");
		}else{
			System.out.println("FRED pasa a estado COCINAR");
			mecha.asignarNuevoEstado(mecha.getEstadoCocinar());
		}
}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void servir(){
		System.out.println("***MODO SUSPENDIDO***\nFRED no puede servir si esta atendiendo.");
}

	/**
	 * Metodo que permite suspenderse al robot
	 */
		public void suspender(){
		System.out.println("***MODO SUSPENDIDO***\nFRED no puede suspenderse si esta atendiendo.");
}
}