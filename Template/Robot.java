import java.util.Scanner;

public class Robot{
	private boolean opcionValida;
	private int opcion;
	private boolean cocinado;
	private boolean servido;

	private EstadoRobot estadoActual;

	private EstadoRobot modoAtender;
	private EstadoRobot modoSuspendido;
	private EstadoRobot modoMovimiento;
	private EstadoRobot modoServir;
	private EstadoRobot modoCocinar;

	/**
	 * Constructor de la clase Robot
	 */
	public Robot(){
		servido = false;
		cocinado = false;
		opcion = 0;
		opcionValida = false;
		modoAtender = new ModoAtender(this);
		modoSuspendido = new ModoSuspendido(this);
		modoMovimiento = new ModoMovimiento(this);
		modoServir = new ModoSirviendo(this);
		modoCocinar = new ModoCocinar(this);

		estadoActual = modoSuspendido;
	}


	/**
	 * Metodo que permite asignar un nuevo estado al robot
	 * @param nuevoEstado nuevo estado del robot
	 */
	public void asignarNuevoEstado(EstadoRobot nuevoEstado){
		estadoActual = nuevoEstado;
	}

	/**
	 * Metodo que permite activar al robot
	 */
	public void activar(){
		estadoActual.activar();
	}

	/**
	 * Metodo que permite caminar al robot
	 */
	public void caminar(){
		estadoActual.caminar();
	}

	/**
	 * Metodo que permite atender al robot
	 */
	public void servir(){
		estadoActual.servir();
	}

	/**
	 * Metodo que permite cocinar al robot
	 */
	public void atender(){
		estadoActual.atender();
	}

	/**
	 * Metodo que permite cocinar al robot
	 */
	public void cocinar(){
		estadoActual.cocinar();
	}

	/**
	 * Metodo que permite suspender al robot
	 */
	public void suspender(){
		estadoActual.suspender();
	}

	/**
	 * Metodo que permite obtener el estado actual del robot
	 * @return estadoActual estado actual del robot
	 */
	public int getOpcion(){
		return opcion;
	}

	/**
	 * Metodo que permite setear el estado actual del robot
	 * @param opcion estado actual del robot
	 */
	public void setOpcion(int opcion){
		this.opcion = opcion;
	}

	/**
	 * Metodo que permite obtener si la copcion de platillo actual del robot es valida
	 * @return boolean que indica si la opcion es valida
	 */
	public boolean getOpcionValida(){
		return opcionValida;
	}

	/**
	 * Metodo que permite setear si la opcion de platillo actual del robot es valida
	 * @param opcionValida boolean que indica si la opcion es valida
	 */
	public void setOpcionValida(boolean opcionValida){
		this.opcionValida = opcionValida;
	}

	/**
	 * Metodo que permite obtener si el platillo esta cocinado
	 * @return boolean que indica si el platillo esta cocinado
	 */
	public boolean getCocinado(){
		return cocinado;
	}

	/**
	 * Metodo que permite setear si el platillo esta cocinado
	 * @param cocinado boolean que indica si el platillo esta cocinado
	 */
	public void setCocinado(boolean cocinado){
		this.cocinado = cocinado;
	}

	/**
	 * Metodo que permite obtener si el platillo esta servido
	 * @return boolean que dice si el platillo esta servido
	 */
	public boolean getServido(){
		return servido;
	}

	/**
	 * Metodo que permite setear si el platillo esta servido
	 * @param servido boolean que indica si el platillo esta servido
	 */
	public void setServido(boolean servido){
		this.servido = servido;
	}

	/**
	 * Metodo que permite obtener el estado de cocinar del robot
	 * @return estadoActual estado actual del robot
	 */
	public EstadoRobot getEstadoCocinar(){
		return modoCocinar;
	}

	/**
	 * Metodo que permite obtener el estado de suspender del robot
	 * @return estadoActual estado actual del robot
	 */
	public EstadoRobot getEstadoSuspendido(){
		return modoSuspendido;
	}

	/**
	 * Metodo que permite obtener el estado de caminar del robot
	 * @return estadoActual estado actual del robot
	 */
	public EstadoRobot getEstadoCaminar(){
		return modoMovimiento;
	}

	/**
	 * Metodo que permite obtener el estado de servir del robot
	 * @return estadoActual estado actual del robot
	 */
	public EstadoRobot getEstadoServir(){
		return modoServir;
	}

	/**
	 * Metodo que permite obtener el estado de mover del robot
	 * @return estadoActual estado actual del robot
	 */
	public EstadoRobot getEstadoMovimiento(){
		return modoMovimiento;
	}

	/**
	 * Metodo que permite obtener el estado de atender del robot
	 * @return estadoActual estado actual del robot
	 */
	public EstadoRobot getEstadoAtender(){
		return modoAtender;
	}


}