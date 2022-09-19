public class ModoCocinar implements EstadoRobot{

	Robot mecha;

	/**
	 * Constructor de la clase
	 * @param mecha Robot
	 */
	public ModoCocinar(Robot mecha){
		this.mecha = mecha;
	}

	/**
	 * Metodo que permite activarse al robot
	 */
	public void activar(){
		System.out.println("***MODO COCINADO***\n FRED ya esta activado.");
	}

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void caminar(){
		if(mecha.getCocinado() == false){
			System.out.println("***MODO COCINADO***\nFRED no puede servir si esta cocinando.");
		}else{
			System.out.println("***MODO COCINADO***\nFRED esta caminando haci ti. Estará contigo en un momento");
			mecha.asignarNuevoEstado(mecha.getEstadoMovimiento());
		}
	}

	/**
	 * Metodo que permite cocinar al robot
	 */
	public void atender(){
			System.out.println("***MODO COCINADO***\nFRED no puede atender si esta cocinando.");
	}

	/**
	 * Metodo que permite cocinar al robot
	 */
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
						System.out.println("1");
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

	/**
	 * Metodo que permite suspenderse al robot
	 */
	public void servir(){
		if(mecha.getCocinado() == true){
			System.out.println("***MODO COCINADO***\nFRED no ha caminado hacia ti, no puede servirte.");
		}else{
			System.out.println("***MODO COCINADO***\nFRED no puede servir si no ha cocinado.");
		}
	}
	

	/**
	 * Metodo que permite apagarse al robot
	 */
	public void suspender(){
		System.out.println("***MODO COCINADO***\nFRED no puede pasar a estado SUSPENDIDO si esta cocinando.");
	}
}