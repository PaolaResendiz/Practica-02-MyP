public class ModoSirviendo implements EstadoRobot{

	Robot mecha;

	/**
	 * Constructor de la clase
	 * @param mecha Robot
	 */
	public ModoSirviendo(Robot mecha){
		this.mecha = mecha;
	}

	/**
	 * Metodo que permite activarse al robot
	 */
	public void activar(){
		System.out.println("***MODO SIRVIENDO***\n FRED no puede caminar si esta SIRVIENDO.");
	}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void caminar(){
		System.out.println("***MODO SIRVIENDO***\n FRED no puede caminar si esta SIRVIENDO.");
	}

	/**
	 * Metodo que permite cocinar al robot
	 */
	public void atender(){
			System.out.println("***MODO SIRVIENDO***\nFRED no puede atender si esta SIRVIENDO.");
	}

	/**
	 * Metodo que permite cocinar al robot
	 */
	public void cocinar(){
			System.out.println("***MODO SIRVIENDO***\nFRED no puede cocinar si esta SIRVIENDO.");
	}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void servir(){
			System.out.println("***MODO SIRVIENDO***\nFRED te sirve tu comida. Provecho!");
			System.out.println("FRED pasará a estado suspendido.");
			mecha.setCocinado(false);
			mecha.setOpcion(0);
			mecha.setOpcionValida(false);
			mecha.asignarNuevoEstado(mecha.getEstadoSuspendido());
		
	}
	
	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void suspender(){
		System.out.println("***MODO SIRVIENDO***\nFRED no puede suspenderse si esta sirviendo.");
	}
}