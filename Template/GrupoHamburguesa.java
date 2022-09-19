
public class GrupoHamburguesa{
	private Hamburguesa hamburguesa[] = new Hamburguesa[3];

	/**
	 * Constructor de la clase GrupoHamburguesa
	 * 	* Construye un arreglo de hamburguesas
	 */
	public GrupoHamburguesa(){
		hamburguesa[0] = new Hamburguesa(1, "Hamburguesa especial 1", "Hamburguesa especial 1", 100.0, true, false);
		hamburguesa[1] = new Hamburguesa(2, "Hamburguesa especial 2", "Hamburguesa especial 2", 100.0, true, false);
		hamburguesa[2] = new Hamburguesa(3, "Hamburguesa especial 3", "Hamburguesa especial 3", 100.0, true, false);

	}

	/**
	 * @return el el iterador para las hamburguesas del menu normal
	 */
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

		/**
		 * @return true si hay un siguiente elemento en el arreglo
		 */
		@Override
		public boolean hasNext(){
			if(indice < hamburguesa.length){
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
				return hamburguesa[indice++];
			}
			return null;
		}
	}

}