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
			System.out.println("***MODO SUSPENDIDO***\nFRED no puede atender si esta SUSPENDIDO.");
	}

	public void cocinar(){
			System.out.println("***MODO SUSPENDIDO***\nFRED no puede cocinar si esta SUSPENDIDO.");
	}
	public void servir(){
			System.out.println("***MODO SUSPENDIDO***\nFRED no puede servir si esta SUSPENDIDO.");
	}
	
	public void suspender(){
		System.out.println("***MODO SUSPENDIDO***\nFRED ya esta SUSPENDIDO.");
	}
}