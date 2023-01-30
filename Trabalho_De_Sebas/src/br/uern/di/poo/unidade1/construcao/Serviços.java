package br.uern.di.poo.unidade1.construcao;

public class Serviços {
	private final double ACRESCIMO_LUXO = 0.1;
	private final double CUSTO_SERVIÇO = 70;
	private final double SERVIÇO_PIVO = 250;

	public double instalacao(Porta porta) {
		double custo = 0;
		double custom2 = 0;
		custom2 = CUSTO_SERVIÇO * porta.getM2();
		custo = custom2;

		if (porta.isPivotante() == true) {
			custo = custo + SERVIÇO_PIVO;
		}
		if (porta.getPortasTipo() == portasTipo.LUXO) {
			custo = custo + (custo * ACRESCIMO_LUXO);
		}
		return custo;
	}
}
