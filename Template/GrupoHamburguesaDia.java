import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Iterator;

public class GrupoHamburguesaDia{
	private ArrayList<Hamburguesa> hamburguesas = new ArrayList<>();

	/**	
	 * Constructor de la clase GrupoHamburguesaDia
	 */
	public GrupoHamburguesaDia(){
		Hamburguesa h1 = new Hamburguesa(4, "Hamburguesa especial 1", "Hamburguesa especial 1", 100.0, true, false);
		Hamburguesa h2 = new Hamburguesa(5, "Hamburguesa especial 2", "Hamburguesa especial 2", 100.0, true, false);
		Hamburguesa h3 = new Hamburguesa(6, "Hamburguesa especial 3", "Hamburguesa especial 3", 100.0, true, false);

		hamburguesas.add(h1);
		hamburguesas.add(h2);
		hamburguesas.add(h3);
	}

	/**
	 * @return el grupo de hamburguesas
	 */
	public ArrayList<Hamburguesa>  getHamburguesas(){
		return hamburguesas;
	}

	/**
	 * @param hamburguesa el grupo de hamburguesas a establecer
	 */
	public void setHamburguesas(ArrayList<Hamburguesa> hamburguesa){
		this.hamburguesas = hamburguesa;
	}

	/**
	 * @return el iterador de las hamburguesas
	 */
	public Iterator getIterator(){
		return hamburguesas.iterator();
	}
}