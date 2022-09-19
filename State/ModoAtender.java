import java.util.Iterator;
import java.util.Scanner;
public class ModoAtender implements EstadoRobot{

	Robot mecha;

	public ModoAtender(Robot mecha){
		this.mecha = mecha;
	}

	public void activar(){
		System.out.println("***MODO DEMOLICION***\nFRED ya esta activado.");
	}

	public void caminar(){
		System.out.println("***MODO DEMOLICION***\nFRED no puede caminar mientras atiende.");	
	}

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

		/*
		*El Recepcionista no sabe el tipo de estructura de datos utilizado
		*pero puede acceder a los elementos.
		*
		*/
		System.out.println("Bienvenido Usuario, este es nuestro menu, ¿Que hamburguesa desea?");

		// Hamburguesa [] hamburguesas = new Hamburguesa[9];
		// int i = 0;
		while(iteradorHamburguesas.hasNext()){
			System.out.println(iteradorHamburguesas.next());
		}

		while(iteradorHamburguesasDia.hasNext()){
			System.out.println(iteradorHamburguesasDia.next());
		}

		while(iteradorHamburguesasEspecial.hasNext()){
			System.out.println(iteradorHamburguesasEspecial.next());
		}

	
		Scanner sc = new Scanner(System.in);
		int opcion;


						System.out.println( "\nPor favor elige el Id de la hamburguesa que deseas");
		do{

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
				}
				// switch(opcion){

				// 	case 1:
				// 		preparacion = new HamburguesaUno();
				// 		preparacion.preparacion(hamburguesas.getHamburguesas()[0]);
				// 		break;

				// 	case 2:
				// 		preparacion = new HamburguesaDos();
				// 		preparacion.preparacion(hamburguesas.getHamburguesas()[1]);
				// 		break;
					
				// 	case 3:
				// 		preparacion = new HamburguesaTres();
				// 		preparacion.preparacion(hamburguesas.getHamburguesas()[2]);
				// 		break;

				// 	case 4:
				// 		preparacion = new HamburguesaDiaUno();
				// 		preparacion.preparacion(hamburguesasDia.getHamburguesas().get(0));

				// 	case 5:
				// 		preparacion = new HamburguesaDiaDos();
				// 		preparacion.preparacion(hamburguesasDia.getHamburguesas().get(1));

				// 	case 6:
				// 		preparacion = new HamburguesaDiaTres();
				// 		preparacion.preparacion(hamburguesasDia.getHamburguesas().get(2));
					
				// 	case 7:
				// 		preparacion = new HamburguesaEspecialUno();
				// 		preparacion.preparacion(hamburguesasEspecial.getHamburguesas()[0]);
				// 		break;
				// 	case 8:
				// 		preparacion = new HamburguesaEspecialDos();
				// 		preparacion.preparacion(hamburguesasEspecial.getHamburguesas()[1]);
				// 		break;

				// 	case 9:
				// 		preparacion = new HamburguesaEspecialTres();
				// 		preparacion.preparacion(hamburguesasEspecial.getHamburguesas()[2]);
				// 		break;

				// 	case 0:
				// 		break;

				// 	default:
				// 		System.out.println("Ingresa un numero valido.");
				// 		break;

				// }

		}while(opcion <= 0 && opcion >= 10);

	}

	public void cocinar(){
		if(!mecha.getOpcionValida()){
			System.out.println("No has elegido un platillo valido, aun no se puede cocinar.");
		}else{
			System.out.println("FRED pasa a estado COCINAR");
		}
}
	public void servir(){
		System.out.println("***MODO SUSPENDIDO***\nFRED no puede servir si esta atendiendo.");
}

		public void suspender(){
		System.out.println("***MODO SUSPENDIDO***\nFRED no puede suspenderse si esta atendiendo.");
}
}