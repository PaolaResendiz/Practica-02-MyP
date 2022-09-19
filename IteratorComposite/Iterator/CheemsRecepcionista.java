import java.util.Iterator;

public class CheemsRecepcionista{
	public static void main(String[] args){
		Menu menu = new Menu();

		Iterador iteradorHamburguesasEspecial = menu.getIteradorHamburguesasEspecial();
		Iterator iteradorHamburguesasDia = menu.getIteradorHamburguesasDia();

		/*
		*El Recepcionista no sabe el tipo de estructura de datos utilizado
		*pero puede acceder a los elementos.
		*
		*/

		while(iteradorHamburguesasEspecial.hasNext()){
			System.out.println(iteradorHamburguesasEspecial.next());
	}
	
		while(iteradorHamburguesasDia.hasNext()){
			System.out.println(iteradorHamburguesasDia.next());
		}
	}
}