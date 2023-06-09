package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	public Mentoria() {
	}
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		super();
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "\nTitulo da Mentoria: " 
				+ getTitulo() 
				+ " \nDescrição da mentoria: " 
				+ getDescricao() 
				+ " \nData da Mentoria: " 
				+ data;
	}
	

}
