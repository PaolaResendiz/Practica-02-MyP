import java.util.LinkedList;
import java.util.Queue;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
 
public class GrupoHamburguesaEspecial{
	private Hamburguesa especiales[] = new Hamburguesa[3];

	public GrupoHamburguesaEspecial(){
		especiales[0] = new Hamburguesa(1, "Hamburguesa especial 1", "Hamburguesa especial 1", 100.0, true, false);
		especiales[1] = new Hamburguesa(2, "Hamburguesa especial 2", "Hamburguesa especial 2", 100.0, true, false);
		especiales[2] = new Hamburguesa(3, "Hamburguesa especial 3", "Hamburguesa especial 3", 100.0, true, false);

	}

	public Iterador getIterador(){
		return new IteradorArreglo();
	}

	private class IteradorArreglo implements Iterador{
		int indice;

		@Override
		public boolean hasNext(){
			if(indice < especiales.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next(){
			if(this.hasNext()){
				return especiales[indice++];
			}
			return null;
		}
	}
	// Hashtable<String, HamburguesaEspecial> hamburguesasEspeciales;
	// Set<Integer> llaves;
	// Iterator<Integer> iterador;

	// public void llenar(){
	//     Hashtable<Integer, Hamburguesa> especiales = new Hashtable();
	// 	Hamburguesa hamburguesa = new Hamburguesa(1, "Hamburguesa Especial", "Hamburguesa con queso, lechuga, tomate, cebolla, pepinillos, mayonesa y ketchup", 50.00, true, false);
	// 	Hamburguesa hamburguesa2 = new Hamburguesa(2, "Hamburguesa Especial", "Hamburguesa con queso, lechuga, tomate, cebolla, pepinillos, mayonesa y ketchup", 50.00, true, false);
	// 	Hamburguesa hamburguesa3 = new Hamburguesa(3, "Hamburguesa Especial", "Hamburguesa con queso, lechuga, tomate, cebolla, pepinillos, mayonesa y ketchup", 50.00, true, false);eciales = new Hashtable();
	// 	especiales.put(hamburguesa.getId(), hamburguesa.getNombre());
	// 	especiales.put(hamburguesa2.getId(), hamburguesa2.getNombre());
	// 	especiales.put(hamburguesa3.getId(), hamburguesa3.getNombre());
	// 	Set<Integer> keys = especiales.keySet();
	// Iterator<Integer> itr = keys.iterator();
	// hamburguesasEspeciales = especiales;
	// }

	// private class IteradorArreglo implements Iterador{

	// 	@Override
	// 	public boolean hasNext(){

	// 	}

	// 	@Override
	// 	public Object next(){
	// 		especiales.next();
	// 	}
	
	// }
	// public Iterador getIterator(){
	// 	return new IteradorArreglo();
	// }
}