import java.util.LinkedList;
import java.util.Queue;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
 
public class GrupoHamburguesaEspecial{
	private Hamburguesa hamburguesas[] = new Hamburguesa[3];

	/**
	 * Constructor de la clase GrupoHamburguesaEspecial
	 * Construye un arreglo de hamburguesas especiales
	 */
	public GrupoHamburguesaEspecial(){
		hamburguesas[0] = new Hamburguesa(7, "Bacon Big Angus Burger", "Carne Black Angus asada a la parrilla, queso pepper jack, cebolla morada, lechuga, tomate, salsa Santa Fe y tocino. Acompañada de un refresco grande y papas fritas medianas", 155.0, true, false);
		hamburguesas[1] = new Hamburguesa(8, "Jalapeño Hot Chicken", "Hamburguesa de crujiente pechuga de pollo empanizada y sazonada con especias, Salsa Santa Fe, Chile Jalapeño, Queso Pepperjack, Cebolla Morada, Tomate y Lechuga. Acompañada de un refresco grande y papas fritas medianas", 150.0, true, false);
		hamburguesas[2] = new Hamburguesa(9, "best veggie burger", "La mejor hamburguesa vegetariana contiene una mezcla de quinoa, espinacas y zanahorias, queso vegano, salsa pesto vegana, pepinillos encurtidos, concentrado de manzana y albahaca", 160.0, true, true);

	}

	/**
	 * @return el grupo de hamburguesas
	 */
	public Hamburguesa[] getHamburguesas(){
		return hamburguesas;
	}

	/**
	 * @param hamburguesa el grupo de hamburguesas a establecer
	 */
	public void setHamburguesas(Hamburguesa[] hamburguesa){
		this.hamburguesas = hamburguesa;
	}

	/**
	 * @return el iterador de las hamburguesas especiales
	 */
	public Iterador getIterador(){
		return new IteradorArreglo();
	}


	private class IteradorArreglo implements Iterador{
		int indice;

		/**
		 * @return true si hay un siguiente elemento en el arreglo
		 */
		@Override
		public boolean hasNext(){
			if(indice < hamburguesas.length){
				return true;
			}
			return false;
		}

		/**
		 * @return el siguiente elemento en el arreglo
		 */
		@Override
		public Object next(){
			if(this.hasNext()){
				return hamburguesas[indice++];
			}
			return null;
		}


	}
	// Hashtable<String, HamburguesaEspecial> hamburguesashamburguesa;
	// Set<Integer> llaves;
	// Iterator<Integer> iterador;

	// public void llenar(){
	//     Hashtable<Integer, Hamburguesa> hamburguesa = new Hashtable();
	// 	Hamburguesa hamburguesa = new Hamburguesa(1, "Hamburguesa Especial", "Hamburguesa con queso, lechuga, tomate, cebolla, pepinillos, mayonesa y ketchup", 50.00, true, false);
	// 	Hamburguesa hamburguesa2 = new Hamburguesa(2, "Hamburguesa Especial", "Hamburguesa con queso, lechuga, tomate, cebolla, pepinillos, mayonesa y ketchup", 50.00, true, false);
	// 	Hamburguesa hamburguesa3 = new Hamburguesa(3, "Hamburguesa Especial", "Hamburguesa con queso, lechuga, tomate, cebolla, pepinillos, mayonesa y ketchup", 50.00, true, false);eciales = new Hashtable();
	// 	hamburguesa.put(hamburguesa.getId(), hamburguesa.getNombre());
	// 	hamburguesa.put(hamburguesa2.getId(), hamburguesa2.getNombre());
	// 	hamburguesa.put(hamburguesa3.getId(), hamburguesa3.getNombre());
	// 	Set<Integer> keys = hamburguesa.keySet();
	// Iterator<Integer> itr = keys.iterator();
	// hamburguesashamburguesa = hamburguesa;
	// }

	// private class IteradorArreglo implements Iterador{

	// 	@Override
	// 	public boolean hasNext(){

	// 	}

	// 	@Override
	// 	public Object next(){
	// 		hamburguesa.next();
	// 	}
	
	// }
	// public Iterador getIterator(){
	// 	return new IteradorArreglo();
	// }
}