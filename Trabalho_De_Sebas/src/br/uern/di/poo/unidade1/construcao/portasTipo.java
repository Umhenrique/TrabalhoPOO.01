package br.uern.di.poo.unidade1.construcao;

public enum portasTipo {
	SIMPLES("feita  de madeira compensada, com fechadura simples", 50.0),
	PADRÃO("feita de madeira andiroba, com fechadura de encaixe", 140.0),
	LUXO("feita de madeira ipê, com fechadura do tipo tetra", 350.0);

	private String tipo;
	private double valorm2;

	// AUTO CONST
	private portasTipo(String tipo, double valorm2) {
		this.tipo = tipo;
		this.valorm2 = valorm2;
	}

	// Metodos Get/Set
	public String getTipo() {
		return tipo;
	}

	public double getValorm2() {
		return valorm2;
	}


}
