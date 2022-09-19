import java.util.LinkedList;
import java.util.Queue;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
 
public class GrupoHamburguesa{
	private Hamburguesa hamburguesa[] = new Hamburguesa[3];

	public GrupoHamburguesa(){
		hamburguesa[0] = new Hamburguesa(1, "Hamburguesa especial 1", "Hamburguesa especial 1", 100.0, true, false);
		hamburguesa[1] = new Hamburguesa(2, "Hamburguesa especial 2", "Hamburguesa especial 2", 100.0, true, false);
		hamburguesa[2] = new Hamburguesa(3, "Hamburguesa especial 3", "Hamburguesa especial 3", 100.0, true, false);

	}

	public Iterador getIterador(){
		return new IteradorArreglo();
	}

	/**
	 * @return el grupo de hamburguesas
	 */
	public Hamburguesa[] getHamburguesas(){
		return hamburguesa;
	}

	/**
	 * @param hamburguesa el grupo de hamburguesas a establecer
	 */
	public void setHamburguesas(Hamburguesa[] hamburguesa){
		this.hamburguesa = hamburguesa;
	}

	private class IteradorArreglo implements Iterador{
		int indice;

		@Override
		public boolean hasNext(){
			if(indice < hamburguesa.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next(){
			if(this.hasNext()){
				return hamburguesa[indice++];
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