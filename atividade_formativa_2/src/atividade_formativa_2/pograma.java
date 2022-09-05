package atividade_formativa_2;

import java.util.Scanner;

public class pograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kyb = new Scanner(System.in);

		Aluno helder = new Aluno("Helder Andrade","2218025");
		System.out.println("Digite a primeira nota");
		helder.setAv1(kyb.nextFloat());
		helder.setAv2(9);
		helder.setNota_trabalho(9);
		
		System.out.println(helder.media(helder.getAv1(), helder.getAv2(), helder.getNota_trabalho()));
		System.out.println(helder.quanto_precisa_para_final());
		
	}

}
