public interface Iterador{
	
	/**
	 * @return true si hay un siguiente elemento
	 */
	public boolean hasNext();

	/**
	 * @return el siguiente elemento
	 */
	public Object next();
}