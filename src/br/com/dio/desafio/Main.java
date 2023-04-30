package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Java");
		curso1.setDescricao("Java Begginner");
		curso1.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Mentoria para Java");
		mentoria.setData(LocalDate.now());
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("SQL");
		curso2.setDescricao("SQL Database");
		curso2.setCargaHoraria(12);
		
		Mentoria mentoria2 = new Mentoria();
		mentoria.setTitulo("Mentoria SQL");
		mentoria.setDescricao("Mentoria para SQL");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		bootcamp.getConteudos().add(mentoria2);
		
		Dev dev1 = new Dev();
		dev1.setNome("Alexsander");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de " + dev1.getNome() + dev1.getConteudosInscritos());
		
		dev1.progredir();
		dev1.progredir();
		System.out.println(" - ");
		System.out.println("Conteúdos Inscritos de " + dev1.getNome() + dev1.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos de " + dev1.getNome() + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println("------ // ------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Bruna");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de " + dev2.getNome() + dev2.getConteudosInscritos());
		
		dev2.progredir();
		System.out.println(" - ");
		System.out.println("Conteúdos Inscritos de " + dev2.getNome() + dev2.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos de " + dev2.getNome() + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());

	}

}
