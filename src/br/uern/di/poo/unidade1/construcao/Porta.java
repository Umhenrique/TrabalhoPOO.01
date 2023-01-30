package br.uern.di.poo.unidade1.construcao;

public class Porta {
	private portasTipo PortasTipo;
	private double altura, largura;
	private boolean pivotante;
	private double m2;

	// atributo constante para portas pivotantes
	private final double ACRESCIMO_PIVOT = 350.00;

	// atributos constantes para largura e altura padrão
	private final double ALTURA_PADRAO = 1.8;
	private final double LARGURA_PADRAO = 0.7;

	// Construtor sem os parâmetros
	public Porta() {
		super();
		this.PortasTipo = PortasTipo.SIMPLES;
		this.altura = ALTURA_PADRAO;
		this.largura = LARGURA_PADRAO;
		this.pivotante = false;
		this.m2 = altura * largura;
	}

	// construtor com todos os parâmetros
	public Porta(portasTipo PortasTipo, double altura, double largura, boolean pivotante) {
		this.PortasTipo = PortasTipo;
		this.altura = altura;
		this.largura = largura;
		this.pivotante = pivotante;
		this.m2 = altura * largura;
	}

	// Método calculaPreco
	public double calculaPreco(Porta porta) {
		double custo = 0;
		custo += PortasTipo.getValorm2();
		custo = custo * m2;
		if (pivotante == true) {
			custo += ACRESCIMO_PIVOT;
		}
		return custo;
	}

	// Método exibePorta
	public String exibePorta(Porta Porta) {
		String dadosporta = ("A porta é " + PortasTipo.getTipo() + "\n tem " + altura + " metros de altura e " + largura
				+ " metros de largura.");
		if (pivotante == true) {
			String pivotagem = ("\n A porta é Pivotante");
			dadosporta += pivotagem;
		} else {
			String pivotagem = ("\n A porta não é Pivotante");
			dadosporta += pivotagem;
		}
		return dadosporta;
	}

	// Metodos Get/Set
	public portasTipo getPortasTipo() {
		return PortasTipo;
	}

	public void setPortasTipo(portasTipo portasTipo) {
		PortasTipo = portasTipo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public boolean isPivotante() {
		return pivotante;
	}

	public void setPivotante(boolean pivotante) {
		this.pivotante = pivotante;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

}
