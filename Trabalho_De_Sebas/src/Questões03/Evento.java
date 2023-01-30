package Questões03;

public class Evento {
	private String titulo, equipe1, equipe2;
	private double equipe1w, equipe2w, empate;
	private Resultado Resultado;

	public Evento(String titulo, String equipe1, String equipe2, double equipe1w, double equipe2w, double empate) {
		super();
		this.titulo = titulo;
		this.equipe1 = equipe1;
		this.equipe2 = equipe2;
		this.equipe1w = equipe1w;
		this.equipe2w = equipe2w;
		this.empate = empate;

	}

	public Resultado getResultado() {
		return Resultado;
	}

	public void setResultado(Resultado resultado) {
		Resultado = resultado;
	}

	public double getEquipe1w() {
		return equipe1w;
	}

	public void setEquipe1w(double equipe1w) {
		this.equipe1w = equipe1w;
	}

	public double getEquipe2w() {
		return equipe2w;
	}

	public void setEquipe2w(double equipe2w) {
		this.equipe2w = equipe2w;
	}

	public double getEmpate() {
		return empate;
	}

	public void setEmpate(double empate) {
		this.empate = empate;
	}

}
