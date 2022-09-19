public class ModoSirviendo implements EstadoRobot{

	Robot mecha;

	public ModoSirviendo(Robot mecha){
		this.mecha = mecha;
	}

	public void activar(){
		System.out.println("***MODO SIRVIENDO***\n FRED no puede caminar si esta SIRVIENDO.");
	}

	public void caminar(){
		System.out.println("***MODO SIRVIENDO***\n FRED no puede caminar si esta SIRVIENDO.");
	}

	public void atender(){
			System.out.println("***MODO SIRVIENDO***\nFRED no puede atender si esta SIRVIENDO.");
	}

	public void cocinar(){
			System.out.println("***MODO SIRVIENDO***\nFRED no puede cocinar si esta SIRVIENDO.");
	}
	public void servir(){
			System.out.println("***MODO SIRVIENDO***\nFRED te sirve tu comida. Provecho!");
			System.out.println("FRED pasará a estado suspendido.");
			mecha.asignarNuevoEstado(mecha.getEstadoSuspendido());
		
	}
	
	public void suspender(){
		System.out.println("***MODO SIRVIENDO***\nFRED no puede suspenderse si esta sirviendo.");
	}
}