import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Iterator;

public class GrupoHamburguesaDia{
	private ArrayList<Hamburguesa> Hamburguesas = new ArrayList<>();

	public GrupoHamburguesaDia(){
		Hamburguesa h1 = new Hamburguesa(1, "Hamburguesa especial 1", "Hamburguesa especial 1", 100.0, true, false);
		Hamburguesa h2 = new Hamburguesa(2, "Hamburguesa especial 2", "Hamburguesa especial 2", 100.0, true, false);
		Hamburguesa h3 = new Hamburguesa(3, "Hamburguesa especial 3", "Hamburguesa especial 3", 100.0, true, false);

		Hamburguesas.add(h1);
		Hamburguesas.add(h2);
		Hamburguesas.add(h3);
	}

	public Iterator getIterator(){
		return Hamburguesas.iterator();
	}
}