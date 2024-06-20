package com.luiz.estruturadados.pilha;

import com.luiz.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica {
	
	public Pilha() {
		super();
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	
	public T topo() {
		if (this.estaVazia()) {
			return null;
		}
		return (T) this.elementos[tamanho-1];
	}
	
	public T desempilha() {
		if (this.estaVazia()) {
			return null;
		}
		/*T elemento = this.elementos[tamanho-1];
		tamanho--;
		
		return elemento;*/
		
		return (T) this.elementos[--tamanho];
		
	}
}
