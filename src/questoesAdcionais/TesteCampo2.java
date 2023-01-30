package questoesAdcionais;

import java.util.Random;

import javax.swing.JOptionPane;

public class TesteCampo2 {

	public static void main(String[] args) {
		Random rng = new Random();
		ParOrdenado cantoSupEsq = new ParOrdenado(0, 0);

		// Input request da Altura, Largura do campo e o Raio da bola

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do campo: "));
		int largura = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura do campo: "));
		ParOrdenado poscentro = new ParOrdenado(largura / 2, altura / 2);
		int raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio da bola: "));

		// Gerando a velocidade da Bola de forma aleatoria com um raio de (5-10%) da
		// altura/largura

		int velocidadeH = 0;
		int velocidadeV = 0;
		while (velocidadeH < 5) {
			velocidadeH = rng.nextInt(11);
		}
		while (velocidadeV < 5) {
			velocidadeV = rng.nextInt(11);
		}
		velocidadeH = largura * velocidadeH / 100;
		velocidadeV = altura * velocidadeV / 100;

		Bola bola = new Bola(poscentro, velocidadeH, velocidadeV, raio);
		CampoRetangular campo = new CampoRetangular(bola, cantoSupEsq, largura, altura);

		// Looping para a o movimento da Bola

		for (int i = 0; i < 30; i++) {
			campo.movimentaBola();
			JOptionPane.showMessageDialog(null, "Posição da bola: " + poscentro.getX() + ", " + poscentro.getY()
					+ "\nVelocidade em X,Y: " + velocidadeH + ", " + velocidadeV);
		}
	}
}
