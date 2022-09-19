public class ModoCocinar implements EstadoRobot{

	Robot mecha;

	public ModoCocinar(Robot mecha){
		this.mecha = mecha;
	}

	public void activar(){
		System.out.println("***MODO COCINADO***\n FRED ya esta activado.");
	}

	public void caminar(){
		if(mecha.getCocinado() == false){
			System.out.println("***MODO COCINADO***\nFRED no puede servir si esta cocinando.");
		}else{
			System.out.println("***MODO COCINADO***\nFRED pasa a modo MOVIMIENTO para servir la Hamburguesa.");
			mecha.asignarNuevoEstado(mecha.getEstadoMovimiento());
		}
	}

	public void atender(){
			System.out.println("***MODO COCINADO***\nFRED no puede atender si esta cocinando.");
	}

	public void cocinar(){
		if(mecha.getCocinado() == false){
		Preparacion preparacion;
		GrupoHamburguesa hamburguesas = new GrupoHamburguesa();
		GrupoHamburguesaEspecial hamburguesasEspecial = new GrupoHamburguesaEspecial();
		GrupoHamburguesaDia hamburguesasDia = new GrupoHamburguesaDia();

		switch(mecha.getOpcion()){

					case 1:
						preparacion = new HamburguesaUno();
						preparacion.preparacion(hamburguesas.getHamburguesas()[0]);
						break;

					case 2:
						preparacion = new HamburguesaDos();
						preparacion.preparacion(hamburguesas.getHamburguesas()[1]);
						break;
					
					case 3:
						preparacion = new HamburguesaTres();
						preparacion.preparacion(hamburguesas.getHamburguesas()[2]);
						break;

					case 4:
						preparacion = new HamburguesaDiaUno();
						preparacion.preparacion(hamburguesasDia.getHamburguesas().get(0));

					case 5:
						preparacion = new HamburguesaDiaDos();
						preparacion.preparacion(hamburguesasDia.getHamburguesas().get(1));

					case 6:
						preparacion = new HamburguesaDiaTres();
						preparacion.preparacion(hamburguesasDia.getHamburguesas().get(2));
					
					case 7:
						preparacion = new HamburguesaEspecialUno();
						preparacion.preparacion(hamburguesasEspecial.getHamburguesas()[0]);
						break;
					case 8:
						preparacion = new HamburguesaEspecialDos();
						preparacion.preparacion(hamburguesasEspecial.getHamburguesas()[1]);
						break;

					case 9:
						preparacion = new HamburguesaEspecialTres();
						preparacion.preparacion(hamburguesasEspecial.getHamburguesas()[2]);
						break;


				}

		mecha.setCocinado(true);
			}else{
				System.out.println("***MODO COCINADO***\nYa se ha cocinado la hamburguesa.");
			}
	}
	public void servir(){
		if(mecha.getCocinado() == true){
			System.out.println("***MODO COCINADO***\nFRED no ha caminado hacia ti, no puede servirte.");
		}else{
			System.out.println("***MODO COCINADO***\nFRED no puede servir si no ha cocinado.");
		}
	}
	
	public void suspender(){
		System.out.println("***MODO COCINADO***\nFRED ya esta SUSPENDIDO.");
	}
}