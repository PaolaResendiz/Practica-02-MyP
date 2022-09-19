public class ModoMovimiento implements EstadoRobot{

	Robot mecha;

	/**
	 * Constructor de la clase
	 * @param mecha Robot
	 */
	public ModoMovimiento(Robot mecha){
		this.mecha = mecha;
	}

	/**
	 * Metodo que permite activarse al robot
	 */
	public void activar(){
		System.out.println("***MODO MOVIMIENTO***\nFRED ya esta activado.");
	}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void caminar(){
		System.out.println("***MODO MOVIMIENTO***\nFRED ya esta caminando hacia ti.");

	}


	/**
	 * Metodo que permite cocinar al robot
	 */
	public void atender(){
			System.out.println("***MODO MOVIMIENTO***\nFRED esta contigo, pasa a modo ATENDER para atenderte");
			mecha.asignarNuevoEstado(mecha.getEstadoAtender());

	}

	/**
	 * Metodo que permite cocinar al robot
	 */
	public void cocinar(){
			System.out.println("***MODO MOVIMIENTO***\nFRED no puede cocinar si esta caminando.");
	}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void servir(){
		if(!mecha.getCocinado()){
			System.out.println("***MODO MOVIMIENTO***\nFRED no puede servir si se esta moviemdo.");
		}else{
			System.out.println("***MODO MOVIMIENTO***\nFRED esta contigo, listo para servirte.");
			mecha.asignarNuevoEstado(mecha.getEstadoServir());
		}
	}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void suspender(){
		System.out.println("***MODO MOVIMIENTO***\nFRED pasará a modo SUSPENDIDO.");
		mecha.asignarNuevoEstado(mecha.getEstadoSuspendido());
	}
}