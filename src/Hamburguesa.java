public class Hamburguesa{
	private int id;
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean queso;
	private boolean vegetariano;
	/**
	 * Constructor de la clase HamburguesaEspecial
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param queso
	 * @param vegetariano
	 */
	public Hamburguesa(int id, String nombre, String descripcion, double precio, boolean queso, boolean vegetariano){
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.queso = queso;
		this.vegetariano = vegetariano;
	}
		
	/**
	 * @return el id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id el id a poner
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return el nombre de la hamburguesa
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a poner de la hamburguesa
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return la descripcion de la hamburguesa
	 */
	 
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion la descripcion a poner de la hamburguesa
	 */
	 
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return el precio de la hamburguesa
	 */
	 
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio el precio a poner de la hamburguesa
	 */
	 
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return boolean que dice si la hamburguesa usa queso
	 */
	public boolean isQueso() {
		return queso;
	}

	/**
	 * @param queso boolean que dice si la hamburguesa usa queso
	 */
	public void setQueso(boolean queso) {
		this.queso = queso;
	}

	/**
	 * @return boolean que dice si la hamburguesa es vegetariana
	 */
	public boolean isVegetariano() {
		return vegetariano;
	}

	/**
	 * @param vegetariano boolean que dice si la hamburguesa es vegetariana
	 */
	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	public String toString(){
		String queso;
		String vegetariano;
		if(this.queso){
			queso = "Tiene queso";
		}else{
			queso = "Sin queso";
		}
		if(this.vegetariano){
			vegetariano = "Es vegetariana";
		}else{
			vegetariano = "No es vegetariana";
		}
		return "Platillo: " + nombre + "\nID: " + id + "\n" + descripcion + "\n" + "Precio: " + precio + "\n" + queso + ". " + vegetariano + "\n";
	}
}