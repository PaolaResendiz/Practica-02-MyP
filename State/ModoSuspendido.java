public class ModoSuspendido implements EstadoRobot{

	Robot mecha;

	public ModoSuspender(Robot mecha){
		this.mecha = mecha;
	}

	public void caminar(){
		if(mecha.getOrdenRecibida() && mecha.getUbicacionCorrecta() 
			&& mecha.getAtencionAcabada() && mecha.getCocinandoAlimentos()){
			System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO ha terminado su trabajo por hoy.");
		} else {
			System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO no puede caminar si esta SUSPENDIDO.");
		}
	}

	public void atender(){
		if(mecha.getOrdenRecibida() && mecha.getUbicacionCorrecta() 
			&& mecha.getAtendiendoAcabada() && mecha.getCocinandoAlimentos()){
			System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO ha terminado su trabajo por hoy.");
		} else {
			System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO no puede demoler si esta SUSPENDIDO.");
		}
	}

	public void cocinar(){
		if(mecha.getOrdenRecibida() && mecha.getUbicacionCorrecta() 
			&& mecha.getAtencionAcabada() && mecha.getCocinandoAlimentos()){
			System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO ha terminado su trabajo por hoy.");
		} else {
			System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO no puede recolectar escombros si esta SUSPENDIDO.");
		}
	}
	public void servir(){
		if(mecha.getOrdenRecibida() && mecha.getUbicacionCorrecta() 
			&& mecha.getAtencionAcabada() && mecha.getCocinandoAlimentos()){
			System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO ha terminado su trabajo por hoy.");
		} else {
			System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO no puede recolectar escombros si esta SUSPENDIDO.");
		}
	}
	
	public void suspender(){
		System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO ya esta SUSPENDIDO.");
	}
}