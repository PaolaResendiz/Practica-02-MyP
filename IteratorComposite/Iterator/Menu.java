import java.util.Iterator;

public class Menu{
	private GrupoHamburguesaEspecial HamburguesasEspecial;
	private GrupoHamburguesaDia HamburguesasDia ;

	public Menu(){
		HamburguesasEspecial = new GrupoHamburguesaEspecial();
		HamburguesasDia = new GrupoHamburguesaDia();
	}

	public Iterador getIteradorHamburguesasEspecial(){
		return HamburguesasEspecial.getIterador();
	}

	public Iterator getIteradorHamburguesasDia(){
		return HamburguesasDia.getIterator();
	}

}