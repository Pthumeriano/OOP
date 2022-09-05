package atividade_formativa_2;

import java.util.Scanner;

public class Aluno {
	Scanner scan = new Scanner(System.in);
	  
	private String nome;
	private String matricula;
 
	private float av1;
	private float av2;
	private float nota_trabalho;
	
	Aluno(String nome, String matricula){
		setNome(this.nome);
		setMatricula(this.matricula);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public float getAv1() {
		return av1;
	}
	public void setAv1(float av1) {
		this.av1 = av1;
	}
	
	
	public float getAv2() {
		return av2;
	}
	public void setAv2(float av2) {
		this.av2 = av2;
	}
	
	
	public float getNota_trabalho() {
		return nota_trabalho;
	}
	public void setNota_trabalho(float nota_trabalho) {
		this.nota_trabalho = nota_trabalho;
	}
	
	public float media(float av1, float av2, float nota_trabalho) {
		return (float) (((av1*2.5) + (av2*2.5) + (nota_trabalho*2))/7);
	}
	
	public float quanto_precisa_para_final() {
		float media = media(av1, av2, nota_trabalho);
		return media >= 8 ? 0 : 8-media;
	}
	  
}
