package questoesAdcionais;

public class ParOrdenado {
	private int x = 0;
	private int y = 0;

//AUTO CONS

	public ParOrdenado(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return ("(" + x + "," + y + ")");
	}
//MÉTODOS GET/SET

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
