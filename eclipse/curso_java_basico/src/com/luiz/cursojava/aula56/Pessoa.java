package com.luiz.cursojava.aula56;

public class Pessoa {
	private TipoDocumento tipoDocumento;
	private String numero;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(TipoDocumento tipoDocumento, String numero) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numero = numero;
	}
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Pessoa [tipoDocumento=" + tipoDocumento + ", numero=" + numero + "]";
	}
}
