public class ModoMovimiento implements EstadoRobot{

	Robot mecha;

	public ModoMovimiento(Robot mecha){
		this.mecha = mecha;
	}

<<<<<<< Updated upstream
	public void caminar(){
		if(!mecha.getUbicacionCorrecta()){
			mecha.reducirDistancia();
			System.out.println("***MODO MOVIMIENTO***\nMECHA COCIMECERO se esta acercando a su objetivo.");
		} else {
			System.out.println("***MODO MOVIMIENTO***\nMECHA COCIMECERO ha llegado al objetivo.");
		}
	}

	public void cocinar(){
		if(!mecha.getUbicacionCorrecta()){
			System.out.println("***MODO MOVIMIENTO***\nMECHA COCIMECERO no ha llegado a su objetivo aun.");
		} else {
			System.out.println("***MODO MOVIMIENTO***\nMECHA COCIMECERO pasara al MODO COCINAR.");
			mecha.asignarNuevoEstado(mecha.getEstadoCocinar());
		}
	}

	public void servir(){
		if(!mecha.getUbicacionCorrecta()){
			System.out.println("***MODO MOVIMIENTO***\nMECHA COCIMECERO no ha llegado a su objetivo aun.");
		} else {
			System.out.println("***MODO MOVIMIENTO***\nMECHA COCIMECERO pasara al MODO SERVIR.");
			mecha.asignarNuevoEstado(mecha.getEstadoServir());
		}
	}
	public void suspender(){
		System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO ya esta SUSPENDIDO.");
=======
	public void activar(){
		System.out.println("***MODO MOVIMIENTO***\nFRED ya esta activado.");
	}

	public void caminar(){
		System.out.println("***MODO MOVIMIENTO***\nFRED ya esta caminando hacia ti.");

	}


	public void atender(){
			System.out.println("***MODO MOVIMIENTO***\nFRED esta contigo, listo para atenderte");
			mecha.asignarNuevoEstado(mecha.getEstadoAtender());

	}

	public void cocinar(){
			System.out.println("***MODO MOVIMIENTO***\nFRED no puede cocinar si esta caminando.");
	}
	public void servir(){
		if(!mecha.getCocinado()){
			System.out.println("***MODO MOVIMIENTO***\nFRED no puede servir si no se ha preparado la comida.");
		}else{
			System.out.println("***MODO MOVIMIENTO***\nFRED esta contigo, listo para servirte.");
			mecha.asignarNuevoEstado(mecha.getEstadoServir());
		}
	}

	
	public void suspender(){
		System.out.println("***MODO MOVIMIENTO***\nFRED pasará a modo SUSPENDIDO.");
		mecha.asignarNuevoEstado(mecha.getEstadoSuspendido());
>>>>>>> Stashed changes
	}
}