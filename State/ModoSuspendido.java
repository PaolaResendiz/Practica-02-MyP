public class ModoSuspendido implements EstadoRobot{

	Robot mecha;

	public ModoSuspendido(Robot mecha){
		this.mecha = mecha;
	}

	public void activar(){
		System.out.println("***MODO SUSPENDIDO***\n FRED llegará contigo en un segundo.");
		mecha.asignarNuevoEstado(mecha.getEstadoCaminar());
	}

	public void caminar(){
		System.out.println("***MODO SUSPENDIDO***\n FRED no puede caminar si esta suspendido.");
	}

	public void atender(){
<<<<<<< Updated upstream
		if(mecha.getOrdenRecibida() && mecha.getUbicacionCorrecta() 
			&& mecha.getAtendiendoAcabada() && mecha.getCocinandoAlimentos()){
			System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO ha terminado su trabajo por hoy.");
		} else {
			System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO no puede demoler si esta SUSPENDIDO.");
		}
=======
			System.out.println("***MODO SUSPENDIDO***\nFRED no puede demoler si esta SUSPENDIDO.");
>>>>>>> Stashed changes
	}

	public void cocinar(){
			System.out.println("***MODO SUSPENDIDO***\nFRED no puede recolectar escombros si esta SUSPENDIDO.");
	}
	public void servir(){
			System.out.println("***MODO SUSPENDIDO***\nFRED no puede recolectar escombros si esta SUSPENDIDO.");
	}
	
	public void suspender(){
		System.out.println("***MODO SUSPENDIDO***\nFRED ya esta SUSPENDIDO.");
	}
}