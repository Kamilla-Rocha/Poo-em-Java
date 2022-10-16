package DesafioPoo;

import java.time.LocalDate;

public class DesafioPoo {
	

	public static void main(String[] args) {

		Curso curso1=new Curso();
		curso1.setTitulo(" Curso Java");
		curso1.setDescricao(" descricao curso java");
		curso1.setCargaHoraria(8);
		
		
		Curso curso2=new Curso();
		curso2.setTitulo(" Curso sistema para internet");
		curso2.setDescricao(" descricao do curso para sistema para internet");
		curso2.setCargaHoraria(10);
		
		
		
		
		Mentoria mentoria= new Mentoria();
		mentoria.setTitulo(" mentoria sobre java");
		mentoria.setDescricao(" descricao de mentoria em java");
		mentoria.setData(LocalDate.now());
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devRafael = new Dev();
		devRafael.setNome("Rafael");
		devRafael.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo Inscritos Rafael"+ devRafael.getConteudosInscritos());
		System.out.println("Conteudo Concluidos Rafael"+ devRafael.getConteudosConcluidos());
		
		devRafael.progredir();
		System.out.println("_");
		System.out.println("Conteudo Inscritos Rafael"+ devRafael.getConteudosInscritos());
		System.out.println("Conteudo Concluidos Rafael"+ devRafael.getConteudosConcluidos());
		System.out.println("XP:"+ devRafael.calcularTotalXp());
		
		
		Dev devJoao= new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo Inscritos Joao"+ devJoao.getConteudosInscritos());
		System.out.println("Conteudo Concluidos Joao"+ devJoao.getConteudosConcluidos());
		
		
		devRafael.progredir();
		System.out.println("_");
		System.out.println("Conteudo Inscritos Joao"+ devJoao.getConteudosInscritos());
		System.out.println("Conteudo Concluidos Joao"+ devJoao.getConteudosConcluidos());
		System.out.println("XP:"+ devJoao.calcularTotalXp());
	}
}
