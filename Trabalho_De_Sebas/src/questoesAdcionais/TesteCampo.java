package questoesAdcionais;

import javax.swing.JOptionPane;

public class TesteCampo {

	public static void main(String[] args) {
		// Posição Inicial da BOLA

		String posicao = JOptionPane.showInputDialog("Informe a posição inicial da bola (x,y): ");
		String[] pos = posicao.split(",");
		int x = Integer.parseInt(pos[0]);
		int y = Integer.parseInt(pos[1]);
		ParOrdenado poscentro = new ParOrdenado(x, y);

		// Posição do Canto Superior Esquerdo

		String canto = JOptionPane.showInputDialog("Informe a posição do canto superior esquerdo da tela (x,y): ");
		String[] can = posicao.split(",");
		int a = Integer.parseInt(pos[0]);
		int b = Integer.parseInt(pos[1]);
		ParOrdenado cantoSupEsq = new ParOrdenado(a, b);

		// Input request da Altura, Largura, Raio, Velocidade Horizontal e Vertical

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do campo: "));
		int largura = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura do campo: "));
		int raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio da bola: "));
		int velocidadeH = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade Horizontal da bola: "));
		int velocidadeV = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade Vertical da bola: "));
		Bola bola = new Bola(poscentro, velocidadeH, velocidadeV, raio);
		CampoRetangular campo = new CampoRetangular(bola, cantoSupEsq, largura, altura);

		// Looping para a o movimento da Bola

		for (int i = 0; i < 30; i++) {
			campo.movimentaBola();
			JOptionPane.showMessageDialog(null, "Posição da bola: " + poscentro.getX() + ", " + poscentro.getY());
		}
	}
}
