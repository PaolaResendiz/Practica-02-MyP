import java.util.LinkedList;
import java.util.*;


public class Restaurante{

	// private LinkedList<Alumno> llenarBDAlumnos(){
	// 	LinkedList<Alumno> alumnos = new LinkedList<Alumno>();
	// 	Alumno a1 = new Alumno(1111, "Fulano", "GKHT654312HBLPRA55", "Ciencias de la computacion", 9.1);
	// 	Alumno a2 = new Alumno(2222, "Mengana", "LAHF759275SMFJEE21", "Medicina", 9.8);
	// 	Alumno a3 = new Alumno(3333, "Zutano", "UUJH998745PEURHJ90", "Filosofia", 7.5);
	// 	Alumno a4 = new Alumno(4444, "Perengana", "PLOI907856TRFGHY86", "Relaciones internacionales", 9.6);
	// 	Alumno a5 = new Alumno(5555, "Policarpo", "QWER214365NMKJUH45", "Arquitectura", 8.2);
	// 	Alumno a6 = new Alumno (6666, "Cinzano", "RTGVCD758697UKMNHY06", "Ingenieria Mecatronica", 7.9);

	// 	alumnos.add(a1);
	// 	alumnos.add(a2);
	// 	alumnos.add(a3);
	// 	alumnos.add(a4);
	// 	alumnos.add(a5);
	// 	alumnos.add(a6);

	// 	return alumnos;
	// }
	public static void main(String[] args){
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

				switch(opcion){

					case 4:
						preparacion = new HamburguesaDiaUno();
						preparacion.preparacion(hamburguesasDia.getHamburguesas().get(0));

					case 5:
						preparacion = new HamburguesaDiaDos();
						preparacion.preparacion(hamburguesasDia.getHamburguesas().get(1));

					case 6:
						preparacion = new HamburguesaDiaTres();
						preparacion.preparacion(hamburguesasDia.getHamburguesas().get(2));
					
					case 7:
						preparacion = new HamburguesaEspecialUno();
						preparacion.preparacion(hamburguesasEspecial.getHamburguesas()[0]);
						break;
					case 8:
						preparacion = new HamburguesaEspecialDos();
						preparacion.preparacion(hamburguesasEspecial.getHamburguesas()[1]);
						break;

					case 9:
						preparacion = new HamburguesaEspecialTres();
						preparacion.preparacion(hamburguesasEspecial.getHamburguesas()[2]);
						break;

					case 0:
						break;

					default:
						System.out.println("Ingresa un numero valido.");
						break;

				}

		}while(opcion != 0);

	}
}