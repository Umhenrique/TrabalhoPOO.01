package questoesAdcionais;

public class CampoRetangular {
	Bola bola;
	ParOrdenado cantoSupEsq;
	private int comprimento, altura;

	// VerificarBordas
	public boolean bolaTocaBordaDireita() {
		if ((bola.getCentro().getX() + bola.getRaioBola()) >= comprimento) {
			return true;
		}
		return false;
	}

	public boolean bolaTocaBordaEsquerda() {
		if ((bola.getCentro().getX() - bola.getRaioBola()) <= 0) {
			return true;
		}
		return false;
	}

	public boolean bolaTocaBordaSuperior() {
		if ((bola.getCentro().getY() - bola.getRaioBola()) <= 0) {
			return true;
		}
		return false;
	}

	public boolean bolaTocaBordaInferior() {
		if ((bola.getCentro().getY() + bola.getRaioBola()) >= altura) {
			return true;
		}
		return false;
	}

	//
	public void movimentaBola() {
		if (bolaTocaBordaInferior()) {
			bola.setvVertical(-bola.getvVertical());
			System.out.println("A bola bateu na borda Inferior");
		}
		if (bolaTocaBordaSuperior()) {
			bola.setvVertical(-bola.getvVertical());
			System.out.println("A bola bateu na borda Superior");
		}
		if (bolaTocaBordaDireita()) {
			bola.setvHorizontal(-bola.getvHorizontal());
			System.out.println("A bola bateu na borda Direita");
		}
		if (bolaTocaBordaEsquerda()) {
			bola.setvHorizontal(-bola.getvHorizontal());
			System.out.println("A bola bateu na borda Esquerda");
		}
		bola.movimenta();
		return;
	}

	// CONTRUTORES
	public CampoRetangular(Bola bola,ParOrdenado cantoSupEsq, int comprimento, int altura) {
		super();
		this.bola = bola;
		this.comprimento = comprimento;
		this.altura = altura;
		this.cantoSupEsq = cantoSupEsq;
	}

	// METODOS GET
	public Bola getBola() {
		return bola;
	}

	public ParOrdenado getCantoSupEsq() {
		return cantoSupEsq;
	}

	public int getComprimento() {
		return comprimento;
	}

	public int getAltura() {
		return altura;
	}

}
