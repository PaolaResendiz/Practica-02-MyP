public class ModoSuspendido implements EstadoRobot{

	Robot mecha;

	/**
	 * Constructor de la clase
	 * @param mecha Robot
	 */
	public ModoSuspendido(Robot mecha){
		this.mecha = mecha;
	}

	/**
	 * Metodo que permite activarse al robot
	 */
	public void activar(){
		System.out.println("***MODO SUSPENDIDO***\n FRED esta CAMINANDO hacia ti, llegará contigo en un segundo.");
		mecha.asignarNuevoEstado(mecha.getEstadoCaminar());
	}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void caminar(){
		System.out.println("***MODO SUSPENDIDO***\n FRED no puede caminar si esta suspendido.");
	}

	/**
	 * Metodo que permite cocinar al robot
	 */
	public void atender(){
			System.out.println("***MODO SUSPENDIDO***\nFRED no puede atender si esta SUSPENDIDO.");
	}

	/**
	 * Metodo que permite cocinar al robot
	 */
	public void cocinar(){
			System.out.println("***MODO SUSPENDIDO***\nFRED no puede cocinar si esta SUSPENDIDO.");
	}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void servir(){
			System.out.println("***MODO SUSPENDIDO***\nFRED no puede servir si esta SUSPENDIDO.");
	}
	
	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void suspender(){
		System.out.println("***MODO SUSPENDIDO***\nFRED ya esta SUSPENDIDO.");
	}
}