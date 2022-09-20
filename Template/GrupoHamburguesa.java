
public class GrupoHamburguesa{
	private Hamburguesa hamburguesa[] = new Hamburguesa[3];

	/**
	 * Constructor de la clase GrupoHamburguesa
	 * 	* Construye un arreglo de hamburguesas
	 */
	public GrupoHamburguesa(){
		hamburguesa[0] = new Hamburguesa(1, "Big Chicken", "Hamburguesa con una crujiente pieza de pollo empanizada y sazonada con las mejores especias del campo para darle un mejor sabor, con lechuga, tomates frescos, mayonesa y catsup. Acompañada de un refresco mediano y papas fritas chicas", 105.0, false, false);
		hamburguesa[1] = new Hamburguesa(2, "Famous Star with Cheese", "Hamburguesa con deliciosa carne de res asada a la parrilla, salsa especial, queso americano, mayonesa, lechuga, cebolla, tomate y pepinillos. Acompañada de un refresco mediano y papas fritas chicas", 112.0, true, false);
		hamburguesa[2] = new Hamburguesa(3, "Hamburguesa not to meat", "Hamburguesa con deliciosa mezcla de cereales y tepeh fresco, salsa de soja, alga kombu, zanahoria, cebolla, orégano. Acompañada de un refresco mediano y papas fritas chicas", 115.0, false, true);

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