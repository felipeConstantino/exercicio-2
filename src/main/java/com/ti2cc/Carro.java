package main.java.com.ti2cc;

public class Carro {
	private String nome;
	private String montadora;
	private String tipo;
	private int codigo;
	
	
	
	public Carro(String nome, String montadora, String tipo, int codigo) {
		super();
		this.nome = nome;
		this.montadora = montadora;
		this.tipo = tipo;
		this.codigo = codigo;
	}
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getmontadora() {
		return montadora;
	}
	public void setmontadora(String montadora) {
		this.montadora = montadora;
	}
	public String gettipo() {
		return tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	public int getcodigo() {
		return codigo;
	}
	public void setcodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", montadora=" + montadora + ", tipo=" + tipo
				+ ", codigo=" + codigo + ", getnome()=" + getnome() + ", getmontadora()="
				+ getmontadora() + ", gettipo()=" + gettipo() + ", getcodigo()=" + getcodigo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}