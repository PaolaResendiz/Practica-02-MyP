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



	public void asignarNuevoEstado(EstadoRobot nuevoEstado){
		estadoActual = nuevoEstado;
	}

	public void activar(){
		estadoActual.activar();
	}

	public void caminar(){
		estadoActual.caminar();
	}

	public void servir(){
		estadoActual.servir();
	}

	public void atender(){
		estadoActual.atender();
	}

	public void cocinar(){
		estadoActual.cocinar();
	}

	public void suspender(){
		estadoActual.suspender();
	}

	public int getOpcion(){
		return opcion;
	}

	public void setOpcion(int opcion){
		this.opcion = opcion;
	}

	public boolean getOpcionValida(){
		return opcionValida;
	}

	public void setOpcionValida(boolean opcionValida){
		this.opcionValida = opcionValida;
	}

	public boolean getCocinado(){
		return cocinado;
	}

	public void setCocinado(boolean cocinado){
		this.cocinado = cocinado;
	}

	public boolean getServido(){
		return servido;
	}

	public void setServido(boolean servido){
		this.servido = servido;
	}

	public EstadoRobot getEstadoCocinar(){
		return modoCocinar;
	}

	public EstadoRobot getEstadoSuspendido(){
		return modoSuspendido;
	}

	public EstadoRobot getEstadoCaminar(){
		return modoMovimiento;
	}

	public EstadoRobot getEstadoServir(){
		return modoServir;
	}

	public EstadoRobot getEstadoMovimiento(){
		return modoMovimiento;
	}

	public EstadoRobot getEstadoAtender(){
		return modoAtender;
	}


}