package control;

public class elevador {

	private int pisoActual = 0;
	private String estadoElevador = "cerrado";
	
	public elevador(int pisoActual, String estadoElevador) {
		super();
		this.pisoActual = pisoActual;
		this.estadoElevador = estadoElevador;
	}

	public int getPisoActual() {
		return pisoActual;
	}

	public void setPisoActual(int pisoActual) {
		this.pisoActual = pisoActual;
	}

	public String getEstadoElevador() {
		return estadoElevador;
	}

	public void setEstadoElevador(String estadoElevador) {
		this.estadoElevador = estadoElevador;
	}
	
	public int subir(){
		this.setPisoActual(pisoActual+1);
		return pisoActual;
	}
	
	public int bajar(){
		this.setPisoActual(pisoActual-1);
		return pisoActual;
	}
	
	public String cerrarPuerta(){
		this.setEstadoElevador("cerrado");
		return estadoElevador;
	}
	
	public String abrirPuerta(){
		this.setEstadoElevador("abierto");
		return estadoElevador;
	}
	
	
}
