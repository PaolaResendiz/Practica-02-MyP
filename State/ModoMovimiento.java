public class ModoMovimiento implements EstadoRobot{

	Robot mecha;

	public ModoMovimiento(Robot mecha){
		this.mecha = mecha;
	}

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
	}
}