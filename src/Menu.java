import java.util.Iterator;

public class Menu{
	private GrupoHamburguesaEspecial HamburguesasEspecial;
	private GrupoHamburguesaDia HamburguesasDia ;
	private GrupoHamburguesa Hamburguesas;

	/**
	 * Constructor de la clase Menu
	 */
	public Menu(){
		HamburguesasEspecial = new GrupoHamburguesaEspecial();
		HamburguesasDia = new GrupoHamburguesaDia();
		Hamburguesas = new GrupoHamburguesa();
	}

	/**
	 * @return el iterador de las hamburguesas especiales
	 */
	public Iterador getIteradorHamburguesasEspecial(){
		return HamburguesasEspecial.getIterador();
	}

	/**
	 * @return el iterador de las hamburguesas del dia
	 */
	public Iterator getIteradorHamburguesasDia(){
		return HamburguesasDia.getIterator();
	}

	/**
	 * @return el iterador de las hamburguesas
	 */
	public Iterador getIteradorHamburguesas(){
		return Hamburguesas.getIterador();
	}



}