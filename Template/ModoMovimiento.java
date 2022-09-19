public class ModoMovimiento implements EstadoRobot{

	Robot mecha;

	public ModoMovimiento(Robot mecha){
		this.mecha = mecha;
	}

	public void activar(){
		System.out.println("***MODO MOVIMIENTO***\nFRED ya esta activado.");
	}

	public void caminar(){
		System.out.println("***MODO MOVIMIENTO***\nFRED ya esta caminando hacia ti.");

	}


	public void atender(){
			System.out.println("***MODO MOVIMIENTO***\nFRED esta contigo, pasa a modo ATENDER para atenderte");
			mecha.asignarNuevoEstado(mecha.getEstadoAtender());

	}

	public void cocinar(){
			System.out.println("***MODO MOVIMIENTO***\nFRED no puede cocinar si esta caminando.");
	}
	public void servir(){
		if(!mecha.getCocinado()){
			System.out.println("***MODO MOVIMIENTO***\nFRED no puede servir si se esta moviemdo.");
		}else{
			System.out.println("***MODO MOVIMIENTO***\nFRED esta contigo, listo para servirte.");
			mecha.asignarNuevoEstado(mecha.getEstadoServir());
		}
	}

	
	public void suspender(){
		System.out.println("***MODO MOVIMIENTO***\nFRED pasará a modo SUSPENDIDO.");
		mecha.asignarNuevoEstado(mecha.getEstadoSuspendido());
	}
}