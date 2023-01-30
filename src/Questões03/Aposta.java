package Questões03;

public class Aposta {
	private Evento Evento;
	private Resultado Resultado;
	private double ValorApostado;

	public Aposta(Questões03.Evento evento, Questões03.Resultado resultado, double valorApostado) {
		super();
		Evento = evento;
		Resultado = resultado;
		ValorApostado = valorApostado;
	}
	
	//Metodos Get/Set
	
	public Resultado getResultado() {
		return Resultado;
	}

	public void setResultado(Resultado resultado) {
		Resultado = resultado;
	}

	public double getValorApostado() {
		return ValorApostado;
	}

	public void setValorApostado(double ValorApostado) {
		ValorApostado = ValorApostado;
	}
	
	//Metodo calculaLucro
	
	public double calculaLucro(Evento evento) {
		double lucro = 0;
		if (this.getResultado() == evento.getResultado()) {
			if (this.getResultado() == Questões03.Resultado.TIME1)
				lucro = this.ValorApostado * evento.getEquipe1w();
			else if (getResultado() == Questões03.Resultado.TIME2)
				lucro = this.ValorApostado * evento.getEquipe2w();
			else
				lucro = this.ValorApostado * evento.getEmpate();
		} else
			lucro = this.ValorApostado;

		return lucro;
	}

}
