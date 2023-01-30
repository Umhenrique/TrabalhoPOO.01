package questoesAdcionais;

public class Bola {
	private ParOrdenado centro ;
	private int vHorizontal, vVertical;
	private final int raioBola;
	// AUTO CONS

	public Bola(ParOrdenado centro, int vHorizontal, int vVertical, int raioBola) {
		super();
		this.centro = centro;
		this.vHorizontal = vHorizontal;
		this.vVertical = vVertical;
		this.raioBola = raioBola;
	}
// Metodo moviment -- atualizar a posição da bola
	public void movimenta() {
		centro.setX(centro.getX() + vHorizontal);
		centro.setY(centro.getY() + vVertical);
	}
// Metodo toString 
	public String toString() {
		return "A bola está na posição (" + centro.getX() + ", " + centro.getY() + ") se movendo a uma velocidade (" + vHorizontal + ", " + vVertical
				+ ") pixels por movimento.";
	}

	// MÉTODOS GET/SER

	public int getvHorizontal() {
		return vHorizontal;
	}

	public void setvHorizontal(int vHorizontal) {
		this.vHorizontal = vHorizontal;
	}

	public int getvVertical() {
		return vVertical;
	}

	public void setvVertical(int vVertical) {
		this.vVertical = vVertical;
	}

	public int getRaioBola() {
		return raioBola;
	}
	public ParOrdenado getCentro() {
		return centro;
	}


}
