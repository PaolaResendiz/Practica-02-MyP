public class ModoAtendiendo implements EstadoRobot{

	Robot mecha;

	public ModoAtendiendo(Robot mecha){
		this.mecha = mecha;
	}

	public void caminar(){
		System.out.println("***MODO ATENDIENDO***\nMECHA COCIMECERO no puede caminar mientras atiende.");	
	}

	public void atender(){
		if(!mecha.getAtendiendoAcabada()){
			mecha.reducirHP();
			System.out.println("***MODO ATENDIENDO***\nMECHA COCIMECERO esta atendiendo su objetivo.");
		} else {
			System.out.println("***MODO ATENDIENDO***\nMECHA COCIMECERO ha atendido a su objetivo.");
		}
	}

	public void cocinar(){
		if(!mecha.getAtendiendoAcabada()){
			System.out.println("***MODO ATENDIENDO***\nMECHA COCIMECERO no ha terminado de atender.");
		} else {
			System.out.println("***MODO ATENDIENDO***\nMECHA COCIMECERO pasara al MODO COCINANDO");
			mecha.asignarNuevoEstado(mecha.getEstadoCocinando());
		}
	}

	public void servir(){
		if(!mecha.getAtendiendoAcabada()){
			System.out.println("***MODO ATENDIENDO***\nMECHA COCIMECERO no ha terminado de atender.");
		} else {
			System.out.println("***MODO ATENDIENDO***\nMECHA COCIMECERO pasara al MODO SIRVIENDO");
			mecha.asignarNuevoEstado(mecha.getEstadoSirviendo());
		}
	}

	public void suspender(){
		System.out.println("***MODO SUSPENDIDO***\nMECHA COCIMESERO ya esta SUSPENDIDO.");
	}
}