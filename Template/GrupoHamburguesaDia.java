
import java.util.ArrayList;
import java.util.Iterator;

public class GrupoHamburguesaDia{
	private ArrayList<Hamburguesa> hamburguesas = new ArrayList<>();

	/**	
	 * Constructor de la clase GrupoHamburguesaDia
	 * Construye un arralist de hamburguesas del dia
	 */
	public GrupoHamburguesaDia(){
		Hamburguesa h1 = new Hamburguesa(4, "Double Western", "Hamburguesa rica con dos piezas de carne de res asada a la parrilla, salsa BBQ, rebanadas de tocino, queso americano y aros de cebolla empanizados. Acompañada de un refresco mediano y papas fritas chicas (Esta hamburguesa solo estará disponible los días Lunes, Miércoles y viernes)", 117.0, true, false);
		Hamburguesa h2 = new Hamburguesa(5, "Swiss Big Chicken", "Hamburguesa con crujiente pechuga de pollo empanizada y sazonada con especias, 2 piezas de tocino, queso suizo, lechuga, tomate y aderezo ranch. Acompañada de un refresco mediano y papas fritas chicas (Esta hamburguesa solo estará disponible los días Martes y Jueves)", 120.0, true, false);
		Hamburguesa h3 = new Hamburguesa(6, "long live the vegetables", "Hamburguesa con deliciosa mezcla de lentejas cocidas y tofu, cebolla, mostaza de Dijon, orégano, pimentón dulce y aceite de oliva. Acompañada de un refresco mediano y papas fritas chicas (Esta hamburguesa solo estará disponible los días Sábado y Domingo)", 119.0, false, true);

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